/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.Sede;

/**
 *
 * @author liuts
 */
public class ImplementarEventoDELEGATE extends BaseDELEGATE{
    /**
     * Obtiene todos los empleados que estan relacionados por el nombre
     * @param nombre
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorNombre(String nombre) {
        return ServiceLocatorFACADE.getEmpleado().findByNombre(nombre);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal departamento
     * @param departamento
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorDepartamento(Departamento departamento) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorDepartamento(departamento);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal puesto
     * @param puesto
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorPuesto(Puesto puesto) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorPuesto(puesto);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal plantel
     * @param plantel
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarEmPorPlantel(Plantel plantel) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorPlantel(plantel);
    }
    /**
     * Obtiene todas las encuestas de la logistica para el evento.
     * @param eventoProgra
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarPorEncuesta(ImplementacionEvento eventoProgra) {
        return ServiceLocatorFACADE.getEnunciadoCali().buscarEncuestaPorEvento(eventoProgra);
    }
    /**
     * Obtiene todas las implementaciones relacionadas de un evento dado.
     * @param evento
     * @return Regresa la lista de las encuestas
     */
    public List<Object> buscarPorEvento(Evento evento) {
        return ServiceLocatorFACADE.getImplementacionEvento().buscarPorEvento(evento);
    }
    /**
     * Obtiene todas las implementaciones relacionadas en una sede dada.
     * @param sede
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorSede(Sede sede) {
        return ServiceLocatorFACADE.getImplementacionEvento().buscarPorSede(sede);
    }
    
    /**
     * Obtiene todas las implementaciones de un evento especifico en un rango
     * de fechas dado. Si las fechas no estan inicializadas no se tomaran en 
     * cuenta, solo se tomaran las fechas inicializadas, esto significa que 
     * se puede dar la fecha 'de' sin dar 'hasta'.
     * @param evento Evento especifico 
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarEventoPorFechas(Evento evento, Date de, Date hasta){
        return ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventoPorFechas(evento, de, hasta);
    }
    
    /**
     * Guarda un evento realizado y regresa un id del evento.
     * @param impleEvento
     * @param clazz
     * @return 
     */
    public Object guardarEvento(Object impleEvento, Class clazz) {
        return ServiceLocatorFACADE.getImplementacionEvento().guardarEvento(impleEvento, clazz);
    }
}
