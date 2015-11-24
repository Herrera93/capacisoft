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
public class EventoDELEGATE {

    public EventoDELEGATE() {
    }

    public List<Object> buscarPorTipoEvento(int id) {
        return ServiceLocatorFACADE.getEvento().buscarPorTipoEvento(id);
    }
    public List<Object> buscarPorNombre(String nombre) {
        return ServiceLocatorFACADE.getEvento().buscarPorNombre(nombre);
    }
}
