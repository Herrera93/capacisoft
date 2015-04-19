/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persitencia.ServiceLocator;

/**
 * Clase fachada generica con metodos comunes entre los catalogos
 * @author Alex
 */
public class BaseFACADE {

    /**
     * Metodo para guardado o actualizacion de un registro en la base de datos
     * @param obj Objeto que se guardara
     * @param clazz Clase de objeto para convertir nuestro DAO
     */
    public void saveOrUpdate(Object obj, Class clazz) {
        ServiceLocator.getInstance().setEntity(clazz);
        ServiceLocator.getInstance().saveOrUpdate(obj);
    }

    /**
     * Metodo para buscar un registro especifico con un identificador
     * @param id Identificador de registro
     * @param clazz Clase que nos indica que entidad debe buscar
     * @return Regresa el registro encontrado o un objeto nulo si no lo encontro
     */
    public Object find(int id, Class clazz) {
        ServiceLocator.getInstance().setEntity(clazz);
        return ServiceLocator.getInstance().find(id);
    }

    /**
     * Metodo para encontrar todos los registros de una determinada entidad
     * @param clazz Clase de la entidad a buscar
     * @return Regresa un lista de todos los objetos de la entidad
     */
    public List<Object> findAll(Class clazz) {
        ServiceLocator.getInstance().setEntity(clazz);
        return ServiceLocator.getInstance().findAll();
    }

    /**
     * Metodo para la eliminacion de un registro de un determinada entidad
     * @param obj Objeto de un registro a eliminar
     * @param clazz Clase de la entidad que se eliminara
     */
    public void delete(Object obj, Class clazz) {
        ServiceLocator.getInstance().setEntity(clazz);
        ServiceLocator.getInstance().delete(obj);
    }
    
}
