/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;

public class ProveedorFACADE extends BaseFACADE{
    public ProveedorFACADE(){
    }
    public List<Object> findByNombre(String nombre){
        return ServiceLocator.getProveedor().findByNombre(nombre);
    }
    public List<Object> buscarImplementaciones(int id){
        return ServiceLocator.getProveedor().buscarImplementaciones(id);
    }
}
