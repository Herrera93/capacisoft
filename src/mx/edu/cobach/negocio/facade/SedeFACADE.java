/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

/**
 *
 * @author SALB
 */
import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;

public class SedeFACADE extends BaseFACADE{
    public SedeFACADE(){
    }
    public List<Object> findByNombre(String nombre){
        return ServiceLocator.getSede().findByNombre(nombre);
    }
    public List<Object> buscarImplementaciones(int id){
        return ServiceLocator.getSede().buscarImplementaciones(id);
    }
}
