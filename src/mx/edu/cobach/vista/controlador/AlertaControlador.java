/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.Date;
import mx.edu.cobach.vista.Comunicador;

import java.util.List;
import java.util.Set;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Alerta;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;

/**
 * Clase controlador que permite consultar y resolver alertas, actualizar
 * periodos.
 * @author Melissa
 */
public class AlertaControlador extends BaseControlador{// class

    /**
     * Método que envía al controlador padre la interfaz de comunicación y la
     * entidad.
     * 
     * @param com Interfaz de comunicación
     * @param clazz Entidades
     */
    public AlertaControlador(Comunicador com, Class clazz) {// method
        super(com, clazz);
    }// method
    
    /**
     * Método que permite buscar una alerta específica y retorna la alerta.
     * 
     * @param id Id de la alerta a consultar.
     * @return Objeto de tipo Alerta consultado.
     */
    public Object buscarAlerta(int id){// method
        return ServiceLocatorDELEGATE.getAlerta().buscarAlerta(id);
    }// method
    
    /**
     * Método que consulta todas las alertas y las envía a la vista mediante la
     * interfaz de comunicación.
     * 
     * @opcion Al ser 1, indica que la consulta se realiza para la actualización
     * de periodos.
     */
    public void buscarTodasLista(int opcion){// method
        List<Object> ls = ServiceLocatorDELEGATE.getInstance().findAll(clazz);
        com.setLista(ls, opcion);
    }// method
    
    /**
     * Método que modifica las alertas enviadas por parámetro.
     * 
     * @param alertas Lista de objetos que contiene las alertas a modificar.
     */
    public void modificar(List<Object> alertas){//method
        for(Object obj : alertas){//for
            ServiceLocatorDELEGATE.getInstance().saveOrUpdate(obj, clazz);
        }//for
        com.setMensaje("Se han modificado existosamente los periodos.");
    }//method
    
    /**
     * Método que consulta todas las alertas y las retorna mediante una lista.
     * 
     * @return Lista de objetos con todas las alertas consultadas.
     */
    public List<Object> buscarTodas(){//method
        return ServiceLocatorDELEGATE.getInstance().findAll(clazz);
    }//method

    /**
     * Método que relaciona una implementación de evento a un tipo de alerta.
     * 
     * @param idImplementacion Id de la implementación que se relacionará a la 
     * alerta.
     * @param idAlerta Id del tipo de alerta a la que se relacionará la
     * implementación.
     */
    public void añadirAlerta(int idImplementacion, int idAlerta) {
        ImplementacionEvento ie;
        Alerta alerta = (Alerta) ServiceLocatorDELEGATE.getAlerta()
            .buscarAlerta(idAlerta);
        if(idImplementacion == -1){
            List lista = ServiceLocatorDELEGATE.getImplementarEvento()
                .findAll(ImplementacionEvento.class);
            ie = (ImplementacionEvento) lista.get(lista.size() - 1);
        }else{
            ie = (ImplementacionEvento) ServiceLocatorDELEGATE
                    .getImplementarEvento().find(idImplementacion,
                    ImplementacionEvento.class);
        }
        
        Set<ImplementacionEvento> implementaciones = alerta
                .getImplementacionEventos();
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

    /**
     * Método que elimina una alerta de una implementación.
     * 
     * @param idImplementacion Id de la implementación de la cuál se eliminará 
     * la alerta.
     * @param idAlerta Id de la alerta que se eliminará.
     */
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
