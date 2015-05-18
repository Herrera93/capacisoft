/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

/**
 *
 * @author SALB
 */

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.vista.Comunicador;


public class UsuarioControlador extends BaseControlador{
    
    public UsuarioControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    } 
    
    public void buscarPorUsuario (String usuario){
        List<Object> list = ServiceLocatorDELEGATE.getUsuario()
                .findByUsuario(usuario);
        com.setTabla(HelperEntidad.descomponerLogin(list));
    }
    
    public void buscarPorNombre(String nombre){
        List<Object> list = ServiceLocatorDELEGATE.getUsuario().findByNombre(nombre);
       com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
}
