/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Aspecto;
import mx.edu.cobach.persistencia.entidades.Competencia;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Encuesta;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Respuesta;
import mx.edu.cobach.persistencia.util.GmailUtil;
import mx.edu.cobach.persistencia.util.JotFormUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Clase DELEGATE especifico con metodos para el caso de uso "Realizar Encuesta"
 */
public class EncuestaDELEGATE {
    
    //Correo con el que se enviaran las encuestas
    private final String CORREO = "herrera.luis@uabc.edu.mx";
    
    //Mensaje que se agregara a los correos
    private final String MENSAJE_CORREO =
            "Estimado %s,\n" +
            "Me dirijo a usted con el fin de solicitar la respuesta de la encuesta "
            + "proporcionada en el enlace %s, esta encuesta esta relacionada "
            + "con el evento %s y tiene el fin de obtener información sobre el desempeño "
            + "actual del empleado %s.\n"
            + "A la espera de su respuesta, lo saluda atentamente,\n\n"
            + "Departamento de Calidad y Mejora Continua/Programa de Capacitación";
    
    //Descripcion que se agregara como cabecera de la encuesta
    private final String DESCRIPCION  = 
        "INSTRUCCIONES: Con el propósito de contar con información "
        + "sobre el desempeño del empleado, solicitamos su cooperación para el "
        + "llenado de la siguiente encuesta. Elija un número de la escala para "
        + "identificar la posición del desempeño en los distintos aspectos.";
            
    
    /**
     * Metodo utilizado para la creacion de encuestas, evaluando los aspectos
     * recbidos.
     * @param aspectosIds Lista de los identificadores de los Aspectos a evaluar
     * @param nombreEvento Nombre del evento asociado a la encuesta
     * @param fechaEvento Fecha del evento asociado.
     * @return Regresa el numero de ID generado
     */
    public JSONObject crearEncuesta(List<Integer> aspectosIds, String idEvento,
            String nombreEvento, String fechaEvento){
        JSONObject encuestaAntes = null;
        int tamano = aspectosIds.size();
        //Se obtienen los aspectos
        List<Aspecto> aspectos = new ArrayList<>();
        for(int i = 0; i < tamano; i++){
            aspectos.add((Aspecto) ServiceLocatorFACADE.getInstance()
                    .find(aspectosIds.get(i), Aspecto.class));
        }
        
        //Se crea la estructura de la encuesta
        HashMap<String, HashMap> encuesta = new HashMap();
        
        HashMap<String, String> propiedades = new HashMap();        
        propiedades.put("title", nombreEvento + "-" + fechaEvento);

        HashMap<String, HashMap<String, String>> cuestionario = new HashMap();
        
        //Se asgianara una pregunta escondidad con el identificador del empleado
        HashMap<String, String> asignado = new HashMap();
        asignado.put("type", "control_hidden");
        asignado.put("text", "idEmpleado");
        asignado.put("defaultValue", "-1");
        asignado.put("order", String.valueOf(0));
        asignado.put("name", "asignado");
        cuestionario.put(String.valueOf(0), asignado);
        
        //Encabezado de la encuesta
        HashMap<String, String> encabezado = new HashMap();
        encabezado.put("type", "control_head");
        encabezado.put("text", nombreEvento + " - " + fechaEvento);
        encabezado.put("order", String.valueOf(1));
        encabezado.put("name", "encabezado");
        encabezado.put("subHeader", DESCRIPCION);
        cuestionario.put(String.valueOf(1), encabezado);
        
        //Se agregan las preguntas por cada aspecto
        for(int i = 0; i < tamano; i++){
            HashMap<String, String> pregunta = new HashMap();
            pregunta.put("type", "control_scale");
            String texto = "De la escala del 1 al 5 ¿Cómo considera al "
                    + "empleado en el siguiente aspecto: " + aspectos.get(i) + "?";
            pregunta.put("text", texto);
            pregunta.put("order", String.valueOf(i + 2));
            pregunta.put("name", aspectos.get(i).getAspecto());
            pregunta.put("labelAlign", "Top");
            pregunta.put("fromText", "Deficiente");
            pregunta.put("toText", "Excelente");
            pregunta.put("required", "Yes");
            cuestionario.put(String.valueOf(i + 2), pregunta);
        }
        
        //Se agrega el boton de envio al completar la encuesta
        HashMap<String, String> boton = new HashMap();
        boton.put("type", "control_button");
        boton.put("text", "Enviar");
        boton.put("order", String.valueOf(tamano + 3));
        boton.put("name", "submit");
        boton.put("buttonAlign", "Center");
        cuestionario.put(String.valueOf(tamano + 3), boton);
        
        encuesta.put("properties", propiedades);
        encuesta.put("questions", cuestionario);
        //Se crea la encuesta por medio del API de JotForm
        encuestaAntes = JotFormUtil.crearEncuesta(encuesta);
        
        if(encuestaAntes != null){        
            try {
                //Se crea una copia de encuesta para realizarse posterior al evento
                JSONObject encuestaDespues = JotFormUtil.copiarEncuesta(encuestaAntes.getLong("id"));
                //Se guarda la encuesta en la base de datos
                Encuesta encuestaGuardar = new Encuesta((ImplementacionEvento) ServiceLocatorFACADE.getInstance()
                    .find(Integer.parseInt(idEvento), ImplementacionEvento.class), 
                    encuestaAntes.getLong("id"), encuestaDespues.getLong("id"), false);
                encuestaGuardar.setAspectos(new HashSet<>(aspectos));
                ServiceLocatorFACADE.getInstance().saveOrUpdate(encuestaGuardar, Encuesta.class);
            } catch (JSONException ex) {
                Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return encuestaAntes;
    }
    
    /**
     * Se envian las encuestas de la implementacion de determinado evento a los
     * empleados identificados en la lista.
     * @param encuesta Objeto JSON con la estructura de la encuesta, debe contener
     * un atributo 'id', 'title' y 'url'.
     * @param idsEmpleados Lista con identificadores de empleados
     */
    public void enviarEncuesta(JSONObject encuesta, List<String> idsEmpleados){
        try{
            //Se obtiene el identificador de la pregunta escondidad
            int idAsignado = JotFormUtil.getIdPregunta(encuesta.getLong("id"), "asignado");
            for(int i = 0; i < idsEmpleados.size(); i++){
                //Se obtiene el empleado y su jefe
                Empleado empleado = (Empleado) ServiceLocatorFACADE.getEmpleado()
                    .find(idsEmpleados.get(i));
                Empleado jefe = (Empleado) ServiceLocatorFACADE.getEmpleado()
                        .buscarJefeInmediato(empleado);
                if(jefe == null)
                    continue;
                
                //Se actualiza las preguntas por cada empleado
                JotFormUtil.actualizarPregunta(encuesta.getLong("id"), idAsignado, 
                        "defaultValue", 
                        String.valueOf(empleado.getNumero()));
                
                String nombreEncuesta = encuesta.getString("title");
                String asunto = "Encuesta: " + nombreEncuesta;
                String mensaje = String.format(MENSAJE_CORREO, jefe.toString(),
                        encuesta.getString("url"), nombreEncuesta.split("-")[0],
                        empleado.toString());
                
                
                try {
                    //Se crea el correo por medio del API de Gmail
                    MimeMessage correo = GmailUtil.crearEmail(jefe.getCorreo(),
                            CORREO, asunto, mensaje);
                    //Se envia el correo por medio del API de Gmail
                    GmailUtil.enviarMensaje(GmailUtil.getServicioGmail(), CORREO, correo);
                } catch (MessagingException | IOException ex) {
                    Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }catch(JSONException ex){
            ex.printStackTrace();
        }
    }
    
    /**
     * El metodo guarda las respuestas nuevas de la encuesta en la base de datos.
     * @param idEncuesta Identificador de la encuesta donde se obtendra encuestas
     */
    public void guardarRespuestas(long idEncuesta){
        //Se obtiene un Arreglo de JSON con las respuestas  de una encuesta
        JSONArray respuestas = JotFormUtil.getRespuestas(idEncuesta);
        try {
            if(respuestas.getJSONObject(0).getString("id").equalsIgnoreCase("#SampleSubmissionID"))
                return;
        } catch (JSONException ex) {
            Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
        }
        int idAsignado = JotFormUtil.getIdPregunta(idEncuesta, "asignado");
        
        Encuesta encuesta = ServiceLocatorFACADE.getEncuesta()
                .burcarPorJotformId(idEncuesta);        
        Set<Aspecto> aspectos = encuesta.getAspectos();
        
        //Se crea un HashMap con los identificadores y su aspecto correspondiente
        JSONObject preguntas = JotFormUtil.getPreguntas(idEncuesta);
        Iterator<Aspecto> itrAspectos = aspectos.iterator();
        HashMap<String, Aspecto> preguntasId = new HashMap();
        
        while(itrAspectos.hasNext()){
            Aspecto aspecto = itrAspectos.next();
            Iterator itrPreguntas = preguntas.keys();
            while(itrPreguntas.hasNext()){
                String llave = (String) itrPreguntas.next();
                String nombrePregunta;
                try {
                    nombrePregunta = preguntas.getJSONObject(llave).getString("name");
                    if(aspecto.getAspecto().equalsIgnoreCase(nombrePregunta))
                        preguntasId.put(llave, aspecto);
                } catch (JSONException ex) {
                    Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        for(int i = 0; i < respuestas.length(); i++){
            try {
                JSONObject respuestaJson = (JSONObject) respuestas.get(i);
                
                respuestaJson = respuestaJson.getJSONObject("answers");
                
                String asignado = respuestaJson.getJSONObject(String.valueOf(idAsignado))
                    .getString("answer");
                
                Empleado empleado = (Empleado) ServiceLocatorFACADE.getEmpleado()
                    .find(asignado);
                
                //Se verifica si las respuestas de este empleado ya han sido registradas
                List<Respuesta> respuestaVerificacion = ServiceLocatorFACADE.getRespuesta()
                    .buscarPorEmpleadoEncuesta(empleado, encuesta);
                if(respuestaVerificacion.size() > 0)
                    continue;
                
                //Se guarda cada respuesta en la base  de datos
                for(String idPregunta : preguntasId.keySet()){
                    Respuesta respuesta = new Respuesta();
                    respuesta.setEmpleado(empleado);
                    respuesta.setEncuesta(encuesta);
                    respuesta.setAspecto(preguntasId.get(idPregunta));
                    respuesta.setAntesCurso(respuestaJson.getJSONObject(idPregunta)
                        .getInt("answer"));
                    ServiceLocatorFACADE.getInstance().saveOrUpdate(respuesta, Respuesta.class);
                }
                
            } catch (JSONException ex) {
                Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void guardarRespuestasDespues(long idEncuesta){
        //Se obtiene un Arreglo de JSON con las respuestas  de una encuesta
        JSONArray respuestas = JotFormUtil.getRespuestas(idEncuesta);
        try {
            if(respuestas.getJSONObject(0).getString("id").equalsIgnoreCase("#SampleSubmissionID"))
                return;
        } catch (JSONException ex) {
            Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
        }
        int idAsignado = JotFormUtil.getIdPregunta(idEncuesta, "asignado");
        
        Encuesta encuesta = ServiceLocatorFACADE.getEncuesta()
                .burcarPorJotformId(idEncuesta);        
        Set<Aspecto> aspectos = encuesta.getAspectos();
        
        //Se crea un HashMap con los identificadores y su aspecto correspondiente
        JSONObject preguntas = JotFormUtil.getPreguntas(idEncuesta);
        Iterator<Aspecto> itrAspectos = aspectos.iterator();
        HashMap<String, Aspecto> preguntasId = new HashMap();
        
        while(itrAspectos.hasNext()){
            Aspecto aspecto = itrAspectos.next();
            Iterator itrPreguntas = preguntas.keys();
            while(itrPreguntas.hasNext()){
                String llave = (String) itrPreguntas.next();
                String nombrePregunta;
                try {
                    nombrePregunta = preguntas.getJSONObject(llave).getString("name");
                    if(aspecto.getAspecto().equalsIgnoreCase(nombrePregunta))
                        preguntasId.put(llave, aspecto);
                } catch (JSONException ex) {
                    Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        for(int i = 0; i < respuestas.length(); i++){
            try {
                JSONObject respuestaJson = (JSONObject) respuestas.get(i);
                
                respuestaJson = respuestaJson.getJSONObject("answers");
                
                String asignado = respuestaJson.getJSONObject(String.valueOf(idAsignado))
                    .getString("answer");
                
                Empleado empleado = (Empleado) ServiceLocatorFACADE.getEmpleado()
                    .find(asignado);
                
                //Se verifica si las respuestas de este empleado ya han sido registradas
                List<Respuesta> respuestaVerificacion = ServiceLocatorFACADE.getRespuesta()
                    .buscarPorEmpleadoEncuesta(empleado, encuesta);
                
                //Se guarda cada respuesta en la base  de datos
                for(String idPregunta : preguntasId.keySet()){
                    Respuesta respuesta = new Respuesta();
                    for(Respuesta resp: respuestaVerificacion){
                        if(resp.getAspecto().getAspecto()
                            .equalsIgnoreCase(preguntasId.get(idPregunta).getAspecto())){
                            respuesta = resp;
                        }
                    }
                    
                    respuesta.setDespuesCurso(respuestaJson.getJSONObject(idPregunta)
                        .getInt("answer"));
                    ServiceLocatorFACADE.getInstance().saveOrUpdate(respuesta, Respuesta.class);
                }
                
            } catch (JSONException ex) {
                Logger.getLogger(EncuestaDELEGATE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * Metodo para la busqueda de aspectos de alguna competencia.
     * @param competencia Objeto de la competencia
     * @return Regresa una lista de objetos de los aspectos
     */
    public List<Object> buscarAspectosPorCompetencia(Object competencia){
        return ServiceLocatorFACADE.getAspecto()
                .buscarPorCompetencia((Competencia) competencia);
    }
    
    /**
     * Se buscan las implementacion de un evento que se encuentren en un rango
     * de fechas dado. Cualquiera de estos elementos puede ser nulo, y se consideraran
     * los elementos  que no los sean, en caso de todos ser nulos se regresan
     * todas las implementaciones. Se obtienen las implementacion que no cuenten
     * con encuesta
     * @param evento Objeto de evento a buscar
     * @param de Fecha de inicio de rango
     * @param hasta Fecha de terminacion de rango
     * @return Regresa una lista de objeto de implementaciones
     */
    public List<Object> buscarImplementaciones(Object evento, Date de, Date hasta){
        //Se obtienen las implementacion con los parametros
        List<Object> implementaciones = ServiceLocatorFACADE.getImplementacionEvento()
            .buscarEventoPorFechas((Evento) evento, de, hasta);
        //Se filtran las implementaciones que ya cuentan con encuesta
        List<Object> implementacionesSinEncuesta = new ArrayList();
        if(implementaciones != null){
            for(int i = 0; i < implementaciones.size(); i++){
                ImplementacionEvento implementacion = (ImplementacionEvento) implementaciones.get(i);
                if(implementacion.getEncuestas().isEmpty())
                    implementacionesSinEncuesta.add(implementacion);
            }
        }
        return implementacionesSinEncuesta;
    }

    /**
     * Se buscan las implementacion de un evento que se encuentren en un rango
     * de fechas dado. Cualquiera de estos elementos puede ser nulo, y se consideraran
     * los elementos  que no los sean, en caso de todos ser nulos se regresan
     * todas las implementaciones. Se obtienen las implementacion que si cuenten
     * con encuesta
     * @param evento Objeto de evento a buscar
     * @param de Fecha de inicio de rango
     * @param hasta Fecha de terminacion de rango
     * @return Regresa una lista de objeto de implementaciones
     */
    public List<Object> buscarImplementacionesResultado(Object evento, Date de, Date hasta) {
        //Se obtienen las implementacion con los parametros
        List<Object> implementaciones = ServiceLocatorFACADE.getImplementacionEvento()
            .buscarEventoPorFechas((Evento) evento, de, hasta);
        //Se filtran las implementaciones que ya cuentan con encuesta
        List<Object> implementacionesConEncuesta = new ArrayList();
        if(implementaciones != null){
            for(int i = 0; i < implementaciones.size(); i++){
                ImplementacionEvento implementacion = (ImplementacionEvento) implementaciones.get(i);
                if(!implementacion.getEncuestas().isEmpty())
                    implementacionesConEncuesta.add(implementacion);
            }
        }
        return implementacionesConEncuesta;
    }

    /**
     * Metodo para obtencion de respuestas de un empleado en una implementacion
     * determinada.
     * @param idEmpleado Identificador de empleado
     * @param idImplementacion Identificador de implementacion
     * @return Regresa una lista de objeto de respuestas.
     */
    public List<Object> getResultados(String idEmpleado, int idImplementacion) {
        Empleado empleado = (Empleado) ServiceLocatorFACADE.getEmpleado().find(idEmpleado);
        ImplementacionEvento implementacion = (ImplementacionEvento) ServiceLocatorFACADE
            .getInstance().find(idImplementacion, ImplementacionEvento.class);
        
        List<Respuesta> respuestas = ServiceLocatorFACADE.getRespuesta()
            .buscarPorEmpleadoEncuesta(empleado, (Encuesta) implementacion
            .getEncuestas().toArray()[0]);
        
        List<Object> resultado = new ArrayList();
        for(Respuesta respuesta : respuestas){
            resultado.add(respuesta.getAspecto().getAspecto());
            resultado.add(respuesta.getAntesCurso());
            resultado.add(respuesta.getDespuesCurso());
        }
        
        return resultado;
    }

    public boolean enviarEncuestaDespues(int idImplementacion, List<String> empledosIds) {
        ImplementacionEvento implementacion = (ImplementacionEvento) ServiceLocatorFACADE
            .getInstance().find(idImplementacion, ImplementacionEvento.class);
        
        Encuesta encuesta = (Encuesta) implementacion.getEncuestas().toArray()[0];
        if(encuesta == null)
            return false;
        JSONObject encuestaJson = JotFormUtil.getEncuesta(encuesta.getJotformIdDespues());
        enviarEncuesta(encuestaJson, empledosIds);
        encuesta.setDespuesEnviada(true);
        ServiceLocatorFACADE.getInstance().saveOrUpdate(encuesta, Encuesta.class);
        return true;
    }
    
    public boolean segundaEncuestaEnviada(int idImplementacion){
        ImplementacionEvento implementacion = (ImplementacionEvento) ServiceLocatorFACADE
            .getInstance().find(idImplementacion, ImplementacionEvento.class);
        
        Encuesta encuesta = (Encuesta) implementacion.getEncuestas().toArray()[0];
        return encuesta.isDespuesEnviada();
    }
}
