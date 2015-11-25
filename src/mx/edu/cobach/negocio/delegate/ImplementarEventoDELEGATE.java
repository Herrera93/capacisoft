/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.Sede;

/**
 * Esta clase de ImplementacionEventoDelegate es utilizada para el caso de uso
 * ImplementacionEvento, con la finalidad de ser de comunicacion la base de
 * datos
 *
 * @author liuts
 */
public class ImplementarEventoDELEGATE extends BaseDELEGATE {

    /**
     * Obtiene todos los empleados que estan relacionados por el nombre
     *
     * @param nombre
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorNombre(String nombre) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorNombre(nombre);
    }

    /**
     * Obtiene todos los empleados que estan relacionados a tal departamento
     *
     * @param departamento
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorDepartamento(Departamento departamento) {
        return ServiceLocatorFACADE.getEmpleado().
                buscarPorDepartamento(departamento);
    }

    /**
     * Obtiene todos los empleados que estan relacionados a tal puesto
     *
     * @param puesto
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorPuesto(Puesto puesto) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorPuesto(puesto);
    }

    /**
     * Obtiene todos los empleados que estan relacionados a tal plantel
     *
     * @param plantel
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorPlantel(Plantel plantel) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorPlantel(plantel);
    }

    /**
     * Obtiene todos los empleados que estan relacionados a tal plantel
     *
     * @param direccion
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorDireccion(Direccion direccion) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorDireccion(direccion);
    }

    /**
     * Obtiene todas las encuestas de la logistica para el evento.
     *
     * @param eventoProgra
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarPorEncuesta(ImplementacionEvento eventoProgra) {
        return ServiceLocatorFACADE.getEnunciadoCali().
                buscarEncuestaPorEvento(eventoProgra);
    }

    /**
     * Obtiene todas las implementaciones relacionadas de un evento dado.
     *
     * @param evento
     * @return Regresa la lista de las encuestas
     */
    public List<Object> buscarPorEvento(Evento evento) {
        return ServiceLocatorFACADE.getImplementacionEvento().
                buscarPorEvento(evento);
    }

    /**
     * Obtiene todas las implementaciones de un evento especifico en un rango de
     * fechas dado. Si las fechas no estan inicializadas no se tomaran en
     * cuenta, solo se tomaran las fechas inicializadas, esto significa que se
     * puede dar la fecha 'de' sin dar 'hasta'.
     *
     * @param evento Evento especifico
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarEventoPorFechas(Evento evento, Date de, 
            Date hasta) {
        return ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventoPorFechas(evento, de, hasta);
    }

    /**
     * Guarda un evento realizado y regresa un id del evento.
     *
     * @param impleEvento
     * @param clazz
     * @return
     */
    public Object guardarEvento(Object impleEvento, Class clazz) {
        return ServiceLocatorFACADE.getImplementacionEvento().
                guardarEvento(impleEvento, clazz);
    }

    /**
     * Metodo que sirve para conectarse con el facade de empleado y obtener la
     * informacion de los empleados con su nombre y el departamento que se
     * encuentran
     *
     * @param departamento
     * @param text
     * @return
     */
    public List<Object> buscarEmpPorDepartamentoNEmpleado(Departamento departamento,
            String text) {
        return ServiceLocatorFACADE.getEmpleado().
                buscarPorDepartamentoNEmpleado(departamento, text);
    }

    /**
     * Metodo que sirve para conectarse con el facade de empleado y obtener la
     * informacion de los empleados con su nombre y el plantel que se encuentran
     *
     * @param plantel
     * @param text
     * @return
     */
    public List<Object> buscarEmpPorPlantelNEmpleado(Plantel plantel,
            String text) {
        return ServiceLocatorFACADE.getEmpleado().
                buscarPorPlantelNEmpleado(plantel, text);
    }

    /**
     * Metodo que sirve para conectarse con el facade de empleado y obtener la
     * informacion de los empleados con su nombre y el puesto que se encuentran
     *
     * @param puesto
     * @param text
     * @return
     */
    public List<Object> buscarEmpPorPuestoNEmpleado(Puesto puesto,
            String text) {
        return ServiceLocatorFACADE.getEmpleado().
                buscarPorPuestoNEmpleado(puesto, text);
    }

    /**
     * Metodo que sirve para conectarse con el facade de empleado y obtener la
     * informacion de los empleados con su nombre y el puesto que se encuentran
     *
     * @param direccion
     * @param text
     * @return
     */
    public List<Object> buscarEmpPorDireccionNEmpleado(Direccion direccion,
            String text) {
        return ServiceLocatorFACADE.getEmpleado().
                buscarPorDireccionNEmpleado(direccion, text);
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
     * @return Regresa una lista de objeto de implementaciones
     */
    public List<Object> buscarImplementaciones(Object evento, Date de,
            Date hasta) {
        //Se obtienen las implementacion con los parametros
        return ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventoPorFechas((Evento) evento, de, hasta);

    }
    
    /**
     * Este metodo busca en la base de datos, todos los eventos de capacitacion
     * que se realizaron en una sede especifica.
     * @param sede objeto de tipo entidad sede
     * @return lista de objeto que retorna los eventos coincidentes con la direccion
     */
    public List<Object> buscarEventosPorSede(Sede sede) {
        return ServiceLocatorFACADE.getImplementacionEvento().
            buscarEventosPorSede(sede);    
    }

}
