/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;

/**
 * Clase DELEGATE generico con metodos comunes entre las entidades
 */
public class BaseDELEGATE {

    /**
     * Metodo para el guardado o actualizacion de un registro de una determinada
     * entidad
     * @param obj Objeto del registro a guardar o actualizar
     * @param clazz Clase de la entidad a guardar o actualizar
     */
    public void saveOrUpdate(Object obj, Class clazz) {
        ServiceLocatorFACADE.getInstance().saveOrUpdate(obj, clazz);
        System.out.println("Alerta");
    }

    /**
     * Metodo para la busqueda de un registro especifico a traves de un
     * identificador
     * @param id Identificador de registro
     * @param clazz Clase de la entidad a buscar
     * @return Regresa el objeto encontrado, en caso de no encontrarlo regresa
     * un objeto nulo
     */
    public Object find(int id, Class clazz) {
        return ServiceLocatorFACADE.getInstance().find(id, clazz);
    }

    /**
     * Metodo para la busqueda de todos los registros de un entidad
     * @param clazz Clase de la entidad a buscar registros
     * @return Regresa una lista con los objetos de la entidad
     */
    public List<Object> findAll(Class clazz) {
        return ServiceLocatorFACADE.getInstance().findAll(clazz);
    }

    /**
     * Metodo para la eliminacion de un registro de una entidad determinada
     * @param obj Objeto del registro a elimnar
     * @param clazz Clase de la entidad a eliminar
     */
    public void delete(Object obj, Class clazz) {
        ServiceLocatorFACADE.getInstance().delete(find((int) obj, clazz), clazz);
    }  
    
}
