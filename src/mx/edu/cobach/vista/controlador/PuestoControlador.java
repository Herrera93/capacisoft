/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.io.InputStream;
import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.vista.Comunicador;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 * @author Liuts
 */
public class PuestoControlador extends BaseControlador{
    
    public PuestoControlador(Comunicador com,Class clazz){
        super(com, clazz);
    } 
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre
    */
    public void buscar(String nombre) {
        List<Object> o = ServiceLocatorDELEGATE.getPuesto().find(nombre);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }   
    public void buscarMod(int id) {
        Object o = ServiceLocatorDELEGATE.getInstance().find(id, clazz);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }   
}
