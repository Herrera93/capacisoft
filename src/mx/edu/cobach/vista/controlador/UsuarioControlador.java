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
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.vista.Comunicador;


public class UsuarioControlador extends BaseControlador{
    
    public UsuarioControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    } 
    
    public void buscarPorUsuario (String usuario){
        //System.out.println("buscar Usuario > controlador");
        List<Object> list = ServiceLocatorDELEGATE.getUsuarioDelegate()
                .findByUsuario(usuario);
        //System.out.println("service locator delegate");
        com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
    public void buscarPorNombre(String nombre){
        //System.out.println("buscar Usuario > controlador");
        List<Object> list = ServiceLocatorDELEGATE.getUsuarioDelegate().findByNombre(nombre);
        //System.out.println("service locator delegate");
       com.setLogin( HelperEntidad.descomponerLogin(list));
       // System.out.println("Nombre de la busqueda: "+usu[0][0]);
        //com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
}
