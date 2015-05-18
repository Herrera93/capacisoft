/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.cobach.persitencia;

import java.util.List;
import mx.edu.cobach.persistencia.InterfaceDAO;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;

/**
 * DAO generico utilizado para aquellas entidades que no requieran de mas 
 * funcionalidad que no sean las operacion CRUD.
 * @author Alex
 * @param <T> Generalidad para la clase que se utilizara
 */
public class BaseDAO<T> implements InterfaceDAO<T> {
    
    //Clase utilizada para la busqueda de objetos
    protected Class<T> entityClass;
    
    /**
     * Contructor vacio
     */
    public BaseDAO(){
    }
    
    /**
     * Asigna el tipo Class se le da entidad que utilizara este DAO
     * @param entityClass La clase que se utilizara en el DAO
     */
    @Override
    public void setEntity(Class<T> entityClass){
        this.entityClass = entityClass;
    }
    
    /**
     * Metodo para el guardado y actualizacion de una entidad
     * @param t Objeto a gurdar o actualizar
     */
    @Override
    public void saveOrUpdate(T t) {
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().saveOrUpdate(t);
            HibernateUtil.commitTransaction();
            System.out.println("Guardado exitoso");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
    }

    /**
     * Metodo para la busqueda de un registro especifico de la tabla de la 
     * entidad
     * @param id Identificador del registro
   * @return Regresa el objeto encontrado, en caso de no encontrarlo regresara
     * null
     */
    @Override
    public T find(int id) {
        T t = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            t = (T) HibernateUtil.getSession().get(entityClass, id);
            HibernateUtil.commitTransaction();
            System.out.println("Buscando Object");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return t;
    }

    /**
     * Metodo para buscar todos los registros de una entidad
     * @return Regresa una lista con los registros
     */
    @Override
    public List<Object> findAll() {
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession()
                    .createCriteria(entityClass).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar todos");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }

    /**
     * Metodo para la eliminacion de un registro en la entidad
     * @param t Objeto para identificar el registro que se borrara
     */
    @Override
    public void delete(T t) { 
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().delete(t);
            HibernateUtil.commitTransaction();
            System.out.println("Elimar registro");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
    }
    
}
