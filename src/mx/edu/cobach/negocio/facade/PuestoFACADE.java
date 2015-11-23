/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Puesto;

/**
 *
 * @author liuts
 */
public class PuestoFACADE extends BaseFACADE{
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del puesto a buscar
     * @return lista de objetos con la información de puesto
    */
    public List<Object> find(String nombre) {
        ServiceLocator.getPuesto().setEntity(Puesto.class);
        return ServiceLocator.getPuesto().find(nombre);
    }

}
