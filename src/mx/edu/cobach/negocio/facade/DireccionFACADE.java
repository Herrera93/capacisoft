/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Direccion;

/**
 *
 * @author Fernando
 */
public class DireccionFACADE extends BaseFACADE{
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre de la dirección a buscar
     * @return lista de objetos con la información de direccion
    */
    public List<Object> find(String nombre) {
        ServiceLocator.getDireccion().setEntity(Direccion.class);
        return ServiceLocator.getDireccion().find(nombre);
    }

}