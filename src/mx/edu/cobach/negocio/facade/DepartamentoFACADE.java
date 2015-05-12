/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persitencia.ServiceLocator;

/**
 *
 * @author fernando
 */
public class DepartamentoFACADE{
    public List<Object> find(String nombre) {
        return ServiceLocator.getDepartamento().findByNombre(nombre);
    }
}
