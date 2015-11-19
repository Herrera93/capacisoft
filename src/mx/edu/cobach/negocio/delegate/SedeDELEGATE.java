/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

/**
 *
 * @author SALB
 */
import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;

public class SedeDELEGATE {
    public SedeDELEGATE(){
        super();
    }
    
    public List<Object> findByNombre(String nombre){
        return ServiceLocatorFACADE.getSede().findByNombre(nombre);
    }
    
    public List<Object> buscarImplementaciones(int id){
        return ServiceLocatorFACADE.getSede().buscarImplementaciones(id);
    }
    
}
