/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persitencia.PuestoDAO;
import mx.edu.cobach.persitencia.ServiceLocator;

/**
 *
 * @author liuts
 */
public class PuestoFACADE extends PuestoDAO{
    public PuestoFACADE(){
        super();
    }
    
    public List<Object> find(String nombre, Class clazz) {
        ServiceLocator.getPuesto().setEntity(clazz);
        return ServiceLocator.getPuesto().find(nombre);
    }

}
