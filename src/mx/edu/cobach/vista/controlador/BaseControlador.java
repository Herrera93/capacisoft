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
 * Clase con los metodos comunes en la entidades y realiza los cambios en la
 * interfaz grafica a traves de la interfaz de comunicacion Comunicador
 * @author Alex
 */
public class BaseControlador{

    //Comunicador con la interfaz grafica
    protected final Comunicador com;
    //Clase con la que estara trabajando la base de datos
    protected Class clazz;
    
    /**
     * Inicializa el controlador y asigna los atributos
     * @param com Comunicador con la interfaz grafica
     * @param clazz Clase con la que estara trabajando la base de datos
     */
    public BaseControlador(Comunicador com, Class clazz){
        this.com = com;
        this.clazz = clazz;
    }
    
    /**
     * Metodo para dar de alta un objeto de un registro
     * @param obj Objeto del registro a dar de alta
     */
    public void alta(Object obj) {
        ServiceLocatorDELEGATE.getInstance().saveOrUpdate(obj, clazz);
        com.setMensaje("Se ha guardado existosamente");
    }

    /**
     * Metodo para dar de baja un objeto de un registro
     * @param id Indentificador del objeto que se eliminara
     */
    public void baja(int id) {
        ServiceLocatorDELEGATE.getInstance().delete(id, clazz);
        com.setMensaje("Se ha eliminado exitosamente");
    }

    /**
     * Metodo para actualizar un objeto de un registro
     * @param obj Objeto del registro a actualizar
     */
    public void modificacion(Object obj) {
        ServiceLocatorDELEGATE.getInstance().saveOrUpdate(obj, clazz);
        com.setMensaje("Se ha modificado existosamente");
    }

    /**
     * Metodo para buscar un registro especifico a traves de un identificador
     * @param id Identificador de registro
     */
    public void buscar(int id) {
        Object o = ServiceLocatorDELEGATE.getInstance().find(id, clazz);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }

    /**
     * Metodo para buscar todos los registros y escribirlos en la tabla de 
     * Comunicador
     */
    public void buscarTodos() {
        List<Object> ls = ServiceLocatorDELEGATE.getInstance().findAll(clazz);
        com.setTabla(HelperEntidad.descomponerObjetos(ls));
    }
    
    /**
     * Metodo para buscar todos los registros y escribirlos en la lista de 
     * Comunicador
     * @param lista Numero de identificador de lista donde se escribiran los
     * registros
     */
    public void buscarTodosLista(int lista){
        List<Object> ls = ServiceLocatorDELEGATE.getInstance().findAll(clazz);
        com.setLista(ls, lista);
    }
    
    public void setClass(Class clazz){
        this.clazz = clazz;
    }
        
}
