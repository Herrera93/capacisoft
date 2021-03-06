/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.persistencia.entidades.EnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.
        ImplementacionEventoEnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.Comunicador;

/**
 * Esta clase sirve para controlar la informacion de los eventos utilizando
 * metodos para la obtencion de la informacion necesario y descomponerla en
 * listas y matrices para enviarlas a los pnl
 *
 * @author liuts
 */
public class ImplementarEventoControlador extends BaseControlador {

    /**
     * Controlador de la clase ImplementarEventoControlador
     *
     * @param com
     * @param clazz
     */
    public ImplementarEventoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }

    /**
     * Este método sirve para dar de alta varias implementaciones de evento y 
     * mostrar un sólo mensaje.
     * 
     * @param obj Vector de objetos a dar de alta.
     */
    public void alta(Object[] obj){//method
        for(int i = 0; i < obj.length; i++){//for
            ServiceLocatorDELEGATE.getInstance().saveOrUpdate(obj[i], clazz);
        }//for
        
        com.setMensaje("Se ha guardado existosamente");
    }//method
    
    /**
     * Este metodo sirve para buscar el evento implementado a modificar
     *
     * @param id
     */
    public void buscarMod(int id) {
        Object o = ServiceLocatorDELEGATE.getInstance().find(id, clazz);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }

    /**
     * Sirve para buscar un evento especifico para agregarlo a los evento a
     * implementar
     *
     * @param id
     * @param eventoClase
     */
    public void buscarCurId(Integer id, Class<Evento> eventoClase) {
        Object o = ServiceLocatorDELEGATE.getImplementarEvento().find(id,
                eventoClase);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }

    /**
     * Sirve para buscar todos los eventos que puedan implementarse implementar
     *
     * @param evento Evento a buscar
     */
    public void buscarPorEvento(Evento evento) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarPorEvento(evento);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }
    
    /**
     * Este metodo sirve para buscar la coincidencia del nombree de los
     * empleados para la lista de asistencia
     *
     * @param clave
     */
    public void buscarEmpN(String clave) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmPorNombre(clave);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 
            //3 tablas se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1";
            com.setTabla(matriz);
        }
    }

    /**
     * Este metodo sirve para buscar la encuesta para del evento finalizado
     */
    public void buscarEncuesta() {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                findAll(EnunciadoLogistica.class);
        System.out.println(o.size());
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        //se agrega un string para hubicar a que direccion de las 3
        //tablas se dirigira
        matriz[0][0] = matriz[0][0] + "TLE3"; 
        com.setTabla(matriz);
    }

    /**
     * Este metodo sirve para buscar la coincidencia del departamento de los
     * empleados para la lista de asistencia
     *
     * @param departamento
     */
    public void buscarEmpD(Departamento departamento) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmPorDepartamento(departamento);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 3
            //tablas se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1"; 
            com.setTabla(matriz);
        }
    }

    /**
     * Este metodo sirve para buscar la coincidencia del Planteles de los
     * empleados para la lista de asistencia
     *
     * @param plantel Plantel a buscar
     */
    public void buscarEmpPl(Plantel plantel) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmPorPlantel(plantel);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            //se agrega un string para hubicar a que direccion de las 3 tablas
            //se dirigira
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            matriz[0][0] = matriz[0][0] + "TLE1"; com.setTabla(matriz);
        }
    }

    /**
     * Este metodo sirve para buscar la coincidencia del puesto de los empleados
     * para la lista de asistencia
     *
     * @param puesto
     */
    public void buscarEmpPu(Puesto puesto) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmPorPuesto(puesto);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 3 tablas
            //se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1"; 
            com.setTabla(matriz);
        }
    }

    /**
     * Este método sirve para buscar todos los eventos implementados.
     * 
     * @return Lista de objetos que contiene todas las implementaciones de
     * eventos.
     */
    public List<Object> buscarTodosLista(){
        return ServiceLocatorDELEGATE.getInstance().findAll(clazz);
    }
    
    /**
     * Este metodo sirve para buscar la coincidencia de los eventos
     * implementados
     *
     * @param de
     * @param hasta
     */
    public void buscarImplementacion(Date de, Date hasta) {
        List<Object> implementaciones = ServiceLocatorDELEGATE.
                getImplementarEvento()
                .buscarEventoPorFechas(null, de, hasta);
        com.setTabla(HelperEntidad.descomponerObjetos(implementaciones));
    }

    /**
     * Este metodo sirve para guardar o modificar la informacion de un evento
     * implementado
     *
     * @param impleEvento
     * @param listaCalificacion
     * @param envio
     */
    public void guardarOModificarEventoImplementado(Object impleEvento,
            List listaCalificacion, String envio) {
        Object object;
        if (envio.equals("Guardar")) {
            object = ServiceLocatorDELEGATE.getImplementarEvento().
                    guardarEvento(impleEvento, clazz);
            for (int x = 0; x < listaCalificacion.size(); x++) {
                ImplementacionEventoEnunciadoLogistica infoCalificacion
                        = new ImplementacionEventoEnunciadoLogistica();
                ImplementacionEvento implementacionEvento =
                        new ImplementacionEvento();
                implementacionEvento.
                        setId(Integer.parseInt(object.toString()));

                infoCalificacion 
                        = (ImplementacionEventoEnunciadoLogistica)
                        listaCalificacion.get(x);
                infoCalificacion.setImplementacionEvento(implementacionEvento);
                ServiceLocatorDELEGATE.getInstance().
                        saveOrUpdate(infoCalificacion, clazz);
            }
        } else {
            ServiceLocatorDELEGATE.getInstance().
                    saveOrUpdate(impleEvento, clazz);
            for (int x = 0; x < listaCalificacion.size(); x++) {
                ImplementacionEventoEnunciadoLogistica infoCalificacion
                        = new ImplementacionEventoEnunciadoLogistica();
                infoCalificacion = (ImplementacionEventoEnunciadoLogistica)
                        listaCalificacion.get(x);
                ServiceLocatorDELEGATE.getInstance().
                        saveOrUpdate(infoCalificacion, clazz);
            }
        }
        com.setMensaje("Se ha guardado existosamente");
    }

    /**
     * Este metodo sirve para obtener una lista de la calificacion de logistica
     * implementada
     *
     * @param impleEvento
     */
    public void bucarCalificacionMod(ImplementacionEvento impleEvento) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarPorEncuesta(impleEvento);
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        //se agrega un string para hubicar a que direccion de las 3
        //tablas se dirigira
        if(matriz != null){
            matriz[0][0] = matriz[0][0] + "TLE4"; 
        }
        com.setTabla(matriz);
    }

    /**
     * Este metodoexiste para la busqueda del empleado con su nombre y con el
     * departamento
     *
     * @param departamento
     * @param text
     */
    public void buscarEmpPorDepartamentoNEmpleado
        (Departamento departamento, String text) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmpPorDepartamentoNEmpleado(departamento, text);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 
            //3 tablas se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1";
            com.setTabla(matriz);
        }
    }

    /**
     * Este metodoexiste para la busqueda del empleado con su nombre y con su
     * plantel
     *
     * @param plantel
     * @param text
     */
    public void buscarEmpPorPlantelNEmpleado(Plantel plantel, String text) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmpPorPlantelNEmpleado(plantel, text);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 
            //3 tablas se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1";
            com.setTabla(matriz);
        }
    }

    /**
     * Este metodo existe para la busqueda del empleado con su nombre y con su
     * direccion
     *
     * @param puesto
     * @param text
     */
    public void buscarEmpPorPuestoNEmpleado(Puesto puesto, String text) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmpPorPuestoNEmpleado(puesto, text);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 
            //3 tablas se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1";
            com.setTabla(matriz);
        }
    }

    /**
     * Se buscan las implementacion de un evento que se encuentren en un rango
     * de fechas dado. Cualquiera de estos elementos puede ser nulo, y se
     * consideraran los elementos que no los sean, en caso de todos ser nulos se
     * regresan todas las implementaciones. Se obtienen las implementacion que
     * no cuenten con encuesta
     *
     * @param evento Objeto de evento a buscar
     * @param de Fecha de inicio de rango
     * @param hasta Fecha de terminacion de rango
     */
    public void buscarImplementacion(Evento evento, Date de, Date hasta) {
        
        List<Object> implementaciones = ServiceLocatorDELEGATE.
                getImplementarEvento()
                .buscarImplementaciones(evento, de, hasta);
        if (implementaciones == null || implementaciones.size() == 0) {
            com.setMensaje("No se encontro eventos de capacitacion");
        }else{
            com.setTabla(HelperEntidad.descomponerObjetos(implementaciones));
        }
        
    }

    /**
     * Este metodoexiste para la busqueda del empleado con su nombre y con el
     * departamento
     *
     * @param direccion
     * @param text
     */
    public void buscarEmpPorDireccionEmpleado(Direccion direccion,
            String text) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmpPorDireccionNEmpleado(direccion, text);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 
            //3 tablas se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1";
            com.setTabla(matriz);
        }
    }

    /**
     * Este metodo sirve para buscar la coincidencia del puesto de los empleados
     * para la lista de asistencia
     *
     * @param direccion
     */
    public void buscarEmpDi(Direccion direccion) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().
                buscarEmPorDireccion(direccion);
        if (o.size() == 0) {
            com.setMensaje("No se encontro el empleado");
        } else {
            String matriz[][] = HelperEntidad.descomponerObjetos(o);
            //se agrega un string para hubicar a que direccion de las 3
            //tablas se dirigira
            matriz[0][0] = matriz[0][0] + "TLE1"; 
            com.setTabla(matriz);
        }
    }

    /**
     * Se buscan las implementacion de un evento que se encuentren en un rango
     * de fechas dado. Se obtienen las implementacion que no cuenten con 
     * encuesta.
     *
     * @param evento Objeto de evento a buscar
     * @return Lista de objetos con las implementaciones del evento.
     */
    public List<Object> buscarPorEventoLista(Evento evento) {//method
        return ServiceLocatorDELEGATE.getImplementarEvento().
                buscarPorEvento(evento);
    }//method

    /**
     * Se verifica si la implementacion ya tiene una encuesta asignada
     * @param id Identificacion de la implementacion
     * @return Regresa verdadero si cuenta con encuesta y falso en caso contrario
     */
    public boolean buscarEncuesta(int id) {
        ImplementacionEvento ie = (ImplementacionEvento) ServiceLocatorDELEGATE
            .getInstance().find(id, clazz);
        return !ie.getEncuestas().isEmpty();
    }
    
}
