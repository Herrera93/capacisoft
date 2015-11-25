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
 * @author Fernando
 */
public class PuestoDELEGATE {
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del puesto a buscar
     * @return lista de objetos con la información de puesto
    */
    public List<Object> find(String nombre) {
        return ServiceLocatorFACADE.getPuesto().find(nombre);
    }
}
