/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;

public class ProveedorDELEGATE {
    public ProveedorDELEGATE(){
        super();
    }
    
    public List<Object> findByNombre(String nombre){
        return ServiceLocatorFACADE.getProveedor().findByNombre(nombre);
    }
}
