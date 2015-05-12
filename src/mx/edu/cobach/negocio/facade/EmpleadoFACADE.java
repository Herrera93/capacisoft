/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;

/**
 *
 * @author Alex
 */
public class EmpleadoFACADE extends BaseFACADE {
    
    public EmpleadoFACADE(){
    }
    
    public List<Object> findByNombre(String nombre){
        return ServiceLocator.getEmpleado().findByNombre(nombre);
    }
    
    public List<Object> findByAdscripcion(Adscripcion a){
        return ServiceLocator.getEmpleado().findByAdscripcion(a);
    }
    
    public List<Object> findByDepartamento(Departamento departamento) {
        return ServiceLocator.getEmpleado().findByDepartamento(departamento);
    }
    public List<Object> findByPuesto(Puesto puesto) {
        return ServiceLocator.getEmpleado().findByPuesto(puesto);
    }
    public List<Object> findByPlantel(Plantel plantel) {
        return ServiceLocator.getEmpleado().findByPlantel(plantel);
    }
    
}
