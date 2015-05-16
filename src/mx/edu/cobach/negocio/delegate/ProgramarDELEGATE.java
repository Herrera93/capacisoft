/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.Sede;

/**
 *
 * @author liuts
 */
public class ProgramarDELEGATE extends BaseDELEGATE{
    
    public List<Object> findByNombre(String nombre) {
        return ServiceLocatorFACADE.getEmpleado().findByNombre(nombre);
    }
    public List<Object> findByDepartamento(Departamento departamento) {
        return ServiceLocatorFACADE.getEmpleado().findByDepartamento(departamento);
    }
    public List<Object> findByPuesto(Puesto puesto) {
        return ServiceLocatorFACADE.getEmpleado().findByPuesto(puesto);
    }
    public List<Object> findByPlantel(Plantel plantel) {
        return ServiceLocatorFACADE.getEmpleado().findByPlantel(plantel);
    }
    public List<Object> findEncuesta(Class encuesta) {
        return ServiceLocatorFACADE.getInstance().findAll(encuesta);
    }
    public List<Object> findByCurso(Curso curso) {
        return ServiceLocatorFACADE.getPrograma().findByCurso(curso);
    }
    public List<Object> findBySede(Sede sede) {
        return ServiceLocatorFACADE.getPrograma().findBySede(sede);
    }
}
