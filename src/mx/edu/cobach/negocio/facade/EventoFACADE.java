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
    
    public List<Object> buscarPorTipoEvento(int id) {
        return ServiceLocator.getEvento().buscarPorTipoEvento(id);
    }
}
public class EventoFACADE{

    public List<Object> buscarEvento(int id) {
        return ServiceLocator.getEvento().buscarEvento(id);
    }
    
    public List<Object> buscarPorNombre(String nombre){
        return ServiceLocator.getEvento().buscarPorNombre(nombre);
    }
}
