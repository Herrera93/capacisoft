/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Alerta;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;

/**
 *
 * @author Melissa
 */
public class AlertaFACADE {// class
    
    /**
     * 
     * @param id
     * @return 
     */
    public Object buscarAlerta(int id){// method
        return ServiceLocator.getAlerta().buscarAlerta(id);
    }// method
    
    /**
     * 
     * @param alerta
     * @param clazz 
     */
    public void modificarAlerta(Object alerta, Class clazz){// method
        ServiceLocator.getAlerta().modificarAlerta(alerta);
    }// method
    
    public List<Object> buscarImplementacion(Alerta alerta, Class clazz){// method
        return ServiceLocator.getAlerta().buscarImplementacion(alerta);
    }// method
    
}// class
