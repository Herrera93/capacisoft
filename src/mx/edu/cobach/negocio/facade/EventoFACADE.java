package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fernando
 */
public class EventoFACADE extends BaseFACADE{
    
    public EventoFACADE(){
        super();
    }
    
    /**
     * Metodo para buscar un registro especifico a traves del id del tipo de evento
     * @param id
     * @return lista de objectos con el evento que coinciden con nombre
    */
    public List<Object> buscarPorTipoEvento(int id) {
        return ServiceLocator.getEvento().buscarPorTipoEvento(id);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de su id
     * @param id con el numer del evento
     * @return lista de objectos con el evento que coinciden con nombre
    */
    public List<Object> buscarEvento(int id) {
        return ServiceLocator.getEvento().buscarEvento(id);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del puesto a buscar
     * @return lista de objectos con los eventos que coinciden con nombre
    */
    public List<Object> buscarPorNombre(String nombre){
        return ServiceLocator.getEvento().buscarPorNombre(nombre);
    }
}
