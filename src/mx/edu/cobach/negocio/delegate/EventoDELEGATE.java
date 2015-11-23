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

     /**
     * Metodo para buscar un registro especifico a traves del id del tipo de evento
     * @param id
     * @return lista de objectos con el evento que coinciden con nombre
    */
    public List<Object> buscarPorTipoCurso(int id) {
        return ServiceLocatorFACADE.getEvento().buscarPorTipoEvento(id);
    }

    /**
     * Metodo para buscar un registro especifico a traves de su id
     * @param id con el numer del evento
     * @return lista de objectos con el evento que coinciden con nombre
    */
    public List<Object> buscarEvento(int id) {
        return ServiceLocatorFACADE.getEvento().buscarEvento(id);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del puesto a buscar
     * @return lista de objectos con los eventos que coinciden con nombre
    */
    public List<Object> buscarPorNombre(String nombre) {
        return ServiceLocatorFACADE.getEvento().buscarPorNombre(nombre);
    }
}
