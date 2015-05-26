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
public class EventoDELEGATE extends BaseDELEGATE{

    public EventoDELEGATE() {
        super();
    }
    
    public List<Object> buscarPorTipoCurso(int id) {
        return ServiceLocatorFACADE.getEvento().buscarPorTipoEvento(id);
    }   
}
