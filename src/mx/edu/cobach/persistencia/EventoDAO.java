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
    
    public List<Object> buscarEvento(int id) {
        List<Object> o = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            o = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("tipoCurso.id", 1)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();   
        }
        return o;
    }
}