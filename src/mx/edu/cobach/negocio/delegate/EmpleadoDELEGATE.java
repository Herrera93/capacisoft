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
public class EmpleadoDELEGATE extends BaseDELEGATE {
        
    public EmpleadoDELEGATE(){
        super();
    }    
    
    public List<Object> findByNombre(String nombre){
        return ServiceLocatorFACADE.getEmpleadoFacade().findByNombre(nombre);
    }
    
    public List<Object> findByAdscripcion(Adscripcion adscripcion){
        return ServiceLocatorFACADE.getEmpleadoFacade().
                findByAdscripcion(adscripcion);
    }
}
