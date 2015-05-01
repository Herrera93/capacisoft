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
import mx.edu.cobach.persistencia.entidades.Adscripcion;

public class UsuarioDELEGATE extends BaseDELEGATE{
    public UsuarioDELEGATE(){
        super();
    }    
    
    public List<Object> findByUsuario(String usuario){
        System.out.println("find by usuario usuario delgate");
        return ServiceLocatorFACADE.getUsuario().findByUsuario(usuario);
    }
    
    public List<Object> findByNombre(String nombre){
        System.out.println("find by usuario usuario delgate");
        return ServiceLocatorFACADE.getUsuario().findByNombre(nombre);
    } 
    
}
