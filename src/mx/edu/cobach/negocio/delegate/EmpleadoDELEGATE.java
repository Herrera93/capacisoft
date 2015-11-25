/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.ArrayList;
import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Empleado;

/**
 *
 * @author Fernando
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
    
    /**
     * Metodo para la eliminacion de un empleado, este esta separado de los
     * demas debido a que tiene un llave primaria de cadena.
     * @param id Id de empleado a eliminar
     */
    public String baja(String id){
        return ServiceLocatorFACADE.getEmpleado().delete(id);
    }
    
    /**
     * Metodo para buscar un empleado especifico a traves de un identificador,
     * este metodo es separado del generico debido a que Empleado tiene una
     * llave primaria de tipo cadena.
     * @param id Identificador del empleado
     * @return Regresa el objeto del empleado encontrado o un nulo en caso
     * de algun problema
     */
    public Object buscar(String id){
        return ServiceLocatorFACADE.getEmpleado().find(id);
    }

    /**
     * Metodo para buscar las implementaciones de evento de un empleado
     * @param id Numero de empleado
     * @return REgresa una lista de implementaiciones
     */
    public List<Object> buscarImplementaciones(String id) {
        List<Object> lista = new ArrayList();
        Empleado e = (Empleado) buscar(id);
        lista.addAll(e.getImplementacionEventos());
        return lista;
    }
}
