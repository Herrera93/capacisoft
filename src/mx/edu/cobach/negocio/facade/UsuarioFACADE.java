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
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persitencia.ServiceLocator;

public class UsuarioFACADE extends BaseFACADE{
    public UsuarioFACADE(){
    }
    
    public List<Object> findByUsuario(String usuario){
        System.out.println("find by usuario facvade");
        return ServiceLocator.getUsuario().findByUsuario(usuario);
    }
    
    public List<Object> findByNombre(String nombre){
        System.out.println("find by usuario facvade");
        return ServiceLocator.getUsuario().findByNombre(nombre);
    }
}
