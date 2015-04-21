/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.vista.Comunicador;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 * @author Liuts
 */
public class PuestoControlador{
   
    private Comunicador com;
    
    private Class clazz;
    
    public PuestoControlador(Comunicador com,Class clazz){
        this.com = com;
        this.clazz = clazz;
    } 
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param id Identificador de registro
    */
    public void buscar(String nombre) {
        List<Object> o = ServiceLocatorDELEGATE.getPuesto().find(nombre, clazz);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }   
    public void buscarMod(String nombre) {
        List<Object> l = ServiceLocatorDELEGATE.getPuesto().find(nombre, clazz);
        Object o = l.get(0);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }   
}
