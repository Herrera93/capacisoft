/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fernando
 */
public class EventoDAO extends BaseDAO{
    
    public EventoDAO(){
        setEntity(Evento.class);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves del id del tipo de evento
     * @param id
     * @return lista de objectos con el evento que coinciden con nombre
    */
    public List<Object> buscarPorTipoEvento(int id) {
        List<Object> o = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            o = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("tipoEvento.id", id)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            e.printStackTrace();
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();   
        }
        return o;
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del puesto a buscar
     * @return lista de objectos con los eventos que coinciden con nombre
    */
    public List<Object> buscarPorNombre(String nombre) {
        List<Object> o = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            o = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("nombre", nombre)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();   
        }
        return o;
    }
}
