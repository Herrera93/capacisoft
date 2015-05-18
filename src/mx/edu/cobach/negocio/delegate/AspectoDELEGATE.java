/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Competencia;

/**
 *
 * @author Alex
 */
public class AspectoDELEGATE {
    
    public AspectoDELEGATE(){        
    }
    
    public List<Object> buscarPorCompetencia(Competencia competencia){
        List<Object> aspectos;
        aspectos = ServiceLocatorFACADE.getAspecto().
                buscarPorCompetencia(competencia);
        return aspectos;
    }
}
