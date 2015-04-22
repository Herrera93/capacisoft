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
 * @author liuts
 */
public class PuestoDELEGATE {
    public List<Object> find(String nombre, Class clazz) {
        return ServiceLocatorFACADE.getPuesto().find(nombre, clazz);
    }
}
