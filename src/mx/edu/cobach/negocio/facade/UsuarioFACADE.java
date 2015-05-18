/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

/**
 *
 * @author SALB
 */
import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;

public class UsuarioFACADE{
    
    public List<Object> findByUsuario(String usuario){
        return ServiceLocator.getUsuario().findByUsuario(usuario);
    }
    
    public List<Object> findByNombre(String nombre){
        return ServiceLocator.getUsuario().findByNombre(nombre);
    }
}
