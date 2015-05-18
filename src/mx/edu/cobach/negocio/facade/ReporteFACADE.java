/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;


/**
 *
 * @author fernando
 */
public class ReporteFACADE{
    
    public List<Object> buscarPorNombre(String nombre){
        return ServiceLocator.getReporte().buscarPorNombre(nombre);
    }
    
    public List<Object> buscarPorNumero(int numero){
        return ServiceLocator.getReporte().buscarPorNumero(numero);
    }
     
     
     
}
