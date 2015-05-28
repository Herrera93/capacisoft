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
  
    public List<Object> buscarPorNombre(String nombre){
        return ServiceLocatorFACADE.getEmpleado().buscarPorNombre(nombre);
    }
    
    public List<Object> buscarPorAdscripcion(Adscripcion adscripcion){
        return ServiceLocatorFACADE.getEmpleado().buscarPorAdscripcion(adscripcion);
    }
    
    public List<Object> validarPorNumero(int numero){
        return ServiceLocatorFACADE.getEmpleado().validarPorNumero(numero);
    }
}
