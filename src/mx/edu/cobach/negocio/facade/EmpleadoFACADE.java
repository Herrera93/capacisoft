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
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;

/**
 *
 * @author Alex
 */
public class EmpleadoFACADE{
    
    public List<Object> buscarPorNombre(String nombre){
        return ServiceLocator.getEmpleado().buscarPorNombre(nombre);
    }
    
    public List<Object> buscarPorAdscripcion(Adscripcion a){
        return ServiceLocator.getEmpleado().buscarPorAdscripcion(a);
    }
    
    public List<Object> validarPorNumero(int numero){
        return ServiceLocator.getEmpleado().validarPorNumero(numero);
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
    
    /**
     * Obtiene todos los empleados que estan relacionados a tal Direccion
     * @param direccion
     * @return Regresa la lista de los empleados
     *//*
    public List<Object> buscarPorDireccion(Direccion direccion) {
        return ServiceLocator.getEmpleado().buscarPorDireccion(direccion);
    }*/
    
    
    /**
     * Busqueda del jefe de inmeadiato de un empleado dado
     * @param empleado Objeto de empleado a buscar
     * @return Regresa un objeto de un empleado perteneciente al jefe del empleado
     */
    public Object buscarJefeInmediato(Empleado empleado){
        return ServiceLocator.getEmpleado().buscarJefeInmediato(empleado);
    }
    /**
     * Metodo que sirve para conectarse con el dao de empleado y obtener la 
     * informacion de los empleados con su nombre y el departamento que se 
     * encuentran
     * @param departamento
     * @param text
     * @return 
     */
    public List<Object> buscarPorDepartamentoNEmpleado(Departamento departamento, String text) {
        return ServiceLocator.getEmpleado().buscarPorDepartamentoNEmpleado(departamento,text);
    }
    /**
     * Metodo que sirve para conectarse con el dao de empleado y obtener la 
     * informacion de los empleados con su nombre y el plantel que se 
     * encuentran
     * @param plantel
     * @param text
     * @return 
     */
    public List<Object> buscarPorPlantelNEmpleado(Plantel plantel, String text) {
        return ServiceLocator.getEmpleado().buscarPorPlantelNEmpleado(plantel,text);
    }
    /**
     * Metodo que sirve para conectarse con el dao de empleado y obtener la 
     * informacion de los empleados con su nombre y el puesto que se 
     * encuentran
     * @param puesto
     * @param text
     * @return 
     */
    public List<Object> buscarPorPuestoNEmpleado(Puesto puesto, String text) {
        return ServiceLocator.getEmpleado().buscarPorPuestoNEmpleado(puesto,text);
    }
    /**
     * Metodo que sirve para conectarse con el dao de empleado y obtener la 
     * informacion de los empleados con su nombre y el puesto que se 
     * encuentran
     * @param direccion
     * @param text
     * @return 
     *//*
    public List<Object> buscarPorDireccionNEmpleado(Direccion direccion, String text) {
        return ServiceLocator.getEmpleado().buscarPorPuestoNEmpleado(direccion,text);
    }*/
}
