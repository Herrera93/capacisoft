/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Aspecto;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Encuesta;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.Comunicador;
import org.json.JSONObject;

/**
 * Clase controlador que nos permite la interaccion de la visa con las capas 
 * bajas del sistema
 */
public class EncuestaControlador extends BaseControlador {
    
    /**
     * Se llama el contructor de la super clase y se manda el comunicador
     * @param comunicador Comunicador entre el controlador y la vista
     */
    public EncuestaControlador(Comunicador comunicador){
        super(comunicador, Aspecto.class);
    }
    
    /**
     * Se realiza una busqueda de empleado por coincidencia del nombre. Se llama
     * el DELEGATE de Programar Evento, ya que este cuenta con dicho metodo. La
     * lista obtenida es asignada a la  tabla por medio del comunicador
     * @param nombre Cade con el nombre a buscar
     */    
    public void buscarPorNombre(String nombre){
        List<Object> empleados = ServiceLocatorDELEGATE.getImplementarEvento()
                .buscarEmPorNombre(nombre);
        com.setTabla(HelperEntidad.descomponerObjetos(empleados));
    }
    
    /**
     * Se realiza una busqueda de empleado por medio del puesto. Se llama
     * el DELEGATE de Programar Evento, ya que este cuenta con dicho metodo. La
     * lista obtenida es asignada a la  tabla por medio del comunicador
     * @param puesto Objeto del puesto para buscar coincidencias
     */
    public void buscarPorPuesto(Object puesto){
        List<Object> empleados = ServiceLocatorDELEGATE.getImplementarEvento()
                .buscarEmPorPuesto((Puesto) puesto);
        com.setTabla(HelperEntidad.descomponerObjetos(empleados));
    }
    
    /**
     * Se realiza una busqueda de empleado por medio del departamento. Se llama
     * el DELEGATE de Programar Evento, ya que este cuenta con dicho metodo. La
     * lista obtenida es asignada a la  tabla por medio del comunicador
     * @param departamento Objeto del departamento para buscar coincidencias
     */
    public void buscarPorDepartamento(Object departamento){
        List<Object> empleados = ServiceLocatorDELEGATE.getImplementarEvento()
                .buscarEmPorDepartamento((Departamento) departamento);
        com.setTabla(HelperEntidad.descomponerObjetos(empleados));
    }
    
    /**
     * Se realiza una busqueda de empleado por medio del plantel. Se llama
     * el DELEGATE de Programar Evento, ya que este cuenta con dicho metodo. La
     * lista obtenida es asignada a la  tabla por medio del comunicador
     * @param plantel Objeto del plantel para buscar coincidencias
     */
    public void buscarPorPlantel(Object plantel){
        List<Object> empleados = ServiceLocatorDELEGATE.getImplementarEvento()
                .buscarEmPorPlantel((Plantel) plantel);
        com.setTabla(HelperEntidad.descomponerObjetos(empleados));
    }
        
    /**
     * El metodo es utilizado para obtener aquellos aspectos que pertenecezcan
     * a una competencia dada, posterior a obtenerlos los envia a la tabla
     * de la interfaz grafica por medio del comunicador.
     * @param competencia Competencia utilizada para obtener los aspectos
     * relacionados con esta
     */
    public void buscarPorCompetencia(Object competencia){
        setClass(Aspecto.class);
        List<Object> aspectos = ServiceLocatorDELEGATE.getEncuesta()
                .buscarAspectosPorCompetencia(competencia);
        com.setTabla(HelperEntidad.descomponerObjetos(aspectos));
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
     */
    public void buscarImplementacion(Object evento, Date de, Date hasta){
        List<Object> implementaciones = ServiceLocatorDELEGATE.getEncuesta()
                .buscarImplementaciones((Evento) evento, de, hasta);
        com.setTabla(HelperEntidad.descomponerObjetos(implementaciones));
    }
    
    /**
     * Metodo para la creacion y envio de encuesta, a partir de los aspectos y 
     * se envia a lo empleados dados. Primero se crea la encuesta con los aspectos
     * y posteriormente se envian a los empleados.
     * @param aspectosIds Lista de identificadores de aspectos
     * @param empleadosIds Lista de identificadores de empleados
     * @param evento Arreglo con la informacion de empleados
     * @return Regresa una confirmacion de la creacion de la encuesta
     */
    public boolean enviarEncuesta(List<Integer> aspectosIds, List<Integer> empleadosIds,
            String[] evento){
        JSONObject encuesta = ServiceLocatorDELEGATE.getEncuesta()
                .crearEncuesta(aspectosIds, evento[0], evento[2], evento[1]);
        ServiceLocatorDELEGATE.getEncuesta().enviarEncuesta(encuesta, empleadosIds);
        return encuesta.has("id");
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
     */
    public void buscarImplementacionResultado(Object evento, Date de, Date hasta) {
        List<Object> implementaciones = ServiceLocatorDELEGATE.getEncuesta()
                .buscarImplementacionesResultado((Evento) evento, de, hasta);
        com.setTabla(HelperEntidad.descomponerObjetos(implementaciones));
    }

    /**
     * Metodo para la obtencion de empleados de una implementacion.
     * @param idImplementacion Identificador de la implementacion
     */
    public void buscarEmpleados(int idImplementacion) {
        ImplementacionEvento implementacion =  (ImplementacionEvento) ServiceLocatorDELEGATE
            .getInstance().find(idImplementacion, ImplementacionEvento.class);
        List<Object> empleados = new ArrayList(implementacion.getEmpleados());
        com.setTabla(HelperEntidad.descomponerObjetos(empleados));
    }

    /**
     * Metodo para obtencion de respuestas de un empleado en una implementacion
     * determinada.
     * @param idEmpleado Identificador de empleado
     * @param idImplementacion Identificador de implementacion
     * @return Regresa una lista de objeto de respuestas.
     */
    public List<Object> resultados(int idEmpleado, int idImplementacion) {
        List<Object> respuestas = ServiceLocatorDELEGATE.getEncuesta()
                .getResultados(idEmpleado, idImplementacion);
        return respuestas;
    }
    
    public void guardarResultados(){
        List<Object> encuestas = ServiceLocatorDELEGATE.getInstance()
                .findAll(Encuesta.class);
                
        for(int i = 0; i < encuestas.size(); i++){
            Encuesta encuesta = (Encuesta) encuestas.get(i);
            ServiceLocatorDELEGATE.getEncuesta()
                    .guardarRespuestas(encuesta.getJotformIdAntes());
            ServiceLocatorDELEGATE.getEncuesta()
                    .guardarRespuestas(encuesta.getJotformIdDespues());
        }
    }
}
