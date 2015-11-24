/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Adscripcion;

/**
 *
 * @author Alex
 */
public class EmpleadoDELEGATE {
  
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del empleado a buscar
     * @return devuelve lista de objetos a los empleados que coinciden con el nombre
    */
    public List<Object> buscarPorNombre(String nombre){
        return ServiceLocatorFACADE.getEmpleado().buscarPorNombre(nombre);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param adscripcion Adscripcion  del empleado a buscar
     * @return devuelve lista de objetos a los empleados que coinciden con la 
     * adscripcion
    */
    public List<Object> buscarPorAdscripcion(Adscripcion adscripcion){
        return ServiceLocatorFACADE.getEmpleado().buscarPorAdscripcion(adscripcion);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de su numero de empleado
     * @param numero numero del empleado a validar
     * @return devuelve lista de objetos a los empleados que coinciden con el número
     * de empleado
    */
    public List<Object> validarPorNumero(int numero){
        return ServiceLocatorFACADE.getEmpleado().validarPorNumero(numero);
    }
}
