/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.vista.Comunicador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Alerta;

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
    
}// class
