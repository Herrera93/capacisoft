/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;

/**
 *
 * @author fernando
 */
public class CursoDELEGATE{

    public List<Object> findTipoCurso(int id) {
        return ServiceLocatorFACADE.getCurso().findTipoCurso(id);
    }   
    
    public List<Object> buscarPorNombre(String nombre){
        return ServiceLocatorFACADE.getCurso().buscarPorNombre(nombre);
    }
}
