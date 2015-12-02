/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import mx.edu.cobach.vista.Comunicador;

import java.util.List;
import java.util.Set;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Alerta;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;

/**
 *
 * @author Melissa
 */
public class AlertaControlador extends BaseControlador{// class

    /**
     * 
     * @param com
     * @param clazz 
     */
    public AlertaControlador(Comunicador com, Class clazz) {// method
        super(com, clazz);
    }// method
    
    /**
     * 
     * @param id
     * @return 
     */
    public Object buscarAlerta(int id){// method
        return ServiceLocatorDELEGATE.getAlerta().buscarAlerta(id);
    }// method
    
    /**
     * 
     * @param alerta
     * @return 
     */
    public List<Object> buscarImplementacionEvento(Alerta alerta){// method
        return ServiceLocatorDELEGATE.getAlerta().buscarImplementacion(alerta, clazz);
    }// method
    
    /**
     * 
     */
    public void buscarTodasLista(int opcion){// method
        List<Object> ls = ServiceLocatorDELEGATE.getInstance().findAll(clazz);
        com.setLista(ls, opcion);
    }// method
    
    /**
     * 
     */
    public List<Object> buscarTodas(){//method
        return ServiceLocatorDELEGATE.getInstance().findAll(clazz);
    }//method

    public void anadirAlerta(int idImplementacion, int idAlerta) {
        ImplementacionEvento ie;
        Alerta alerta = (Alerta) ServiceLocatorDELEGATE.getAlerta()
            .buscarAlerta(idAlerta);
        if(idImplementacion == -1){
            List lista = ServiceLocatorDELEGATE.getImplementarEvento()
                .findAll(ImplementacionEvento.class);
            ie = (ImplementacionEvento) lista.get(lista.size() - 1);
        }else{
            ie = (ImplementacionEvento) ServiceLocatorDELEGATE.getImplementarEvento()
                .find(idImplementacion, ImplementacionEvento.class);
        }
        
        Set<ImplementacionEvento> implementaciones = alerta.getImplementacionEventos();
        implementaciones.add(ie);
        alerta.setImplementacionEventos(implementaciones);
        
        ServiceLocatorDELEGATE.getInstance().saveOrUpdate(alerta, Alerta.class);
    }

    /**
     * Método que verifica si un evento ya se ha realizado, cambiando su estado
     * de activo a no activo.
     */
    public void verificarImplementaciones() {
        List<Object> lista = ServiceLocatorDELEGATE.getImplementarEvento()
                .findAll(ImplementacionEvento.class);
        Alerta alerta = (Alerta) ServiceLocatorDELEGATE.getAlerta()
            .buscarAlerta(3);
        for(Object obj : lista) {
            ImplementacionEvento ie = (ImplementacionEvento) obj;
            if(ie.getActivo() && ie.getFechaFinal().before(new Date())){
                if(ie.getAlertas().contains(alerta)){
                    ie.getAlertas().remove(alerta);
                }
                ie.setActivo(false);
                ServiceLocatorDELEGATE.getInstance().saveOrUpdate(ie,
                    ImplementacionEvento.class);
            }
        }
    }

    public void eliminarAlerta(int idImplementacion, int idAlerta) {
        ImplementacionEvento ie = (ImplementacionEvento) ServiceLocatorDELEGATE
            .getInstance().find(idImplementacion, ImplementacionEvento.class);
        Alerta alerta = (Alerta) ServiceLocatorDELEGATE.getAlerta()
            .buscarAlerta(idAlerta);
        if(ie.getAlertas().contains(alerta)){
            ie.getAlertas().remove(alerta);
            ServiceLocatorDELEGATE.getInstance().saveOrUpdate(ie,
                ImplementacionEvento.class);
        }
    }
    
}// class
