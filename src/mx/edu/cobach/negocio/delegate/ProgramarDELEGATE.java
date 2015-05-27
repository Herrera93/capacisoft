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
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.Sede;

/**
 *
 * @author liuts
 */
public class ProgramarDELEGATE extends BaseDELEGATE{
    /**
     * Obtiene todos los empleados que estan relacionados por el nombre
     * @param nombre
     * @return Regresa la lista de los empleados
     */
    public List<Object> findByNombre(String nombre) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorNombre(nombre);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal departamento
     * @param departamento
     * @return Regresa la lista de los empleados
     */
    public List<Object> findByDepartamento(Departamento departamento) {
        return ServiceLocatorFACADE.getEmpleado().buscaPorDepartamento(departamento);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal puesto
     * @param puesto
     * @return Regresa la lista de los empleados
     */
    public List<Object> findByPuesto(Puesto puesto) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorPuesto(puesto);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal plantel
     * @param plantel
     * @return Regresa la lista de los empleados
     */
    public List<Object> findByPlantel(Plantel plantel) {
        return ServiceLocatorFACADE.getEmpleado().buscarPorPlantel(plantel);
    }
    /**
     * Obtiene todas las encuestas de la logistica para el evento.
     * @param encuesta
     * @return Regresa la lista de los empleados
     */
    public List<Object> findEncuesta(Class encuesta) {
        return ServiceLocatorFACADE.getInstance().findAll(encuesta);
    }
    /**
     * Obtiene todas las implementaciones relacionadas de un evento dado.
     * @param evento
     * @return Regresa la lista de las encuestas
     */
    public List<Object> findByEvento(Evento evento) {
        return ServiceLocatorFACADE.getPrograma().buscarPorEvento(evento);
    }
    /**
     * Obtiene todas las implementaciones relacionadas en una sede dada.
     * @param sede
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> findBySede(Sede sede) {
        return ServiceLocatorFACADE.getPrograma().buscarPorSede(sede);
    }
    
    /**
     * Obtiene todas las implementaciones en un rango de fechas dado.
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorFechas(Date de, Date hasta){
        return ServiceLocatorFACADE.getPrograma().buscarPorFechas(de, hasta);
    }
}
