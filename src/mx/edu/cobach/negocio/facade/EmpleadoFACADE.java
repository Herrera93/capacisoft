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
    /**
     * Obtiene todos los empleados que estan relacionados a tal departamento
     * @param departamento
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarPorDepartamento(Departamento departamento) {
        return ServiceLocator.getEmpleado().buscarPorDepartamento(departamento);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal Puesto
     * @param departamento
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarPorPuesto(Puesto puesto) {
        return ServiceLocator.getEmpleado().buscarPorPuesto(puesto);
    }
    /**
     * Obtiene todos los empleados que estan relacionados a tal Plantel
     * @param departamento
     * @return Regresa la lista de los empleados
     */
    public List<Object> buscarPorPlantel(Plantel plantel) {
        return ServiceLocator.getEmpleado().buscarPorPlantel(plantel);
    }
    
}
