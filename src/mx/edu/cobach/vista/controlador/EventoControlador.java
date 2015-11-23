 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.vista.Comunicador;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 * @author Fernando
 */
public class EventoControlador extends BaseControlador{
   
    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     * @param com
     */
    public EventoControlador(Comunicador com){
        super(com, Evento.class);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de su id
     * @param id
    */
    public void buscarEvento(int id) {
        List<Object> o = ServiceLocatorDELEGATE.getEvento().buscarEvento(id);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre para validar
     * si existe un curso ya en la base de datos
     * @param nombre Nombre del puesto a buscar
    */
    public void buscarPorNombre(String nombre){
        List<Object> o = ServiceLocatorDELEGATE.getEvento().buscarPorNombre(nombre);
    if(!o.isEmpty()){
        com.setMensaje("El Nombre del Curso ya Existe");
    }
    }
}
