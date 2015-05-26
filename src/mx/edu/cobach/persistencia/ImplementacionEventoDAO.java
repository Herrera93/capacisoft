/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author liuts
 */
public class ImplementacionEventoDAO<T> extends BaseDAO{
    public ImplementacionEventoDAO(){
        super.entityClass = ImplementacionEvento.class;
    }
    /**
     * * Obtiene todas las implementaciones relacionadas de un evento dado.
     * @param evento
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorEvento(Evento evento){        
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("evento", evento)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    /**
     * Obtiene todas las implementaciones relacionadas de una sede dado.
     * @param sede
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorSede(Sede sede){        
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("sede", sede)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    /**
     * Metodo para el guardado y actualizacion de los cursos realizados
     * opteniendo una id del este mismo
     * @param t Objeto a gurdar
     * @return 
     */
    public Object guardarEvento(T t) {
        Object objeto = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            objeto = HibernateUtil.getSession().save(t);
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return objeto;
    }
    
    /**
     * Obtiene todas las implementaciones de un evento especifico en un rango
     * de fechas dado. Si las fechas no estan inicializadas no se tomaran en 
     * cuenta, solo se tomaran las fechas inicializadas, esto significa que 
     * se puede dar la fecha 'de' sin dar 'hasta'.
     * @param evento Evento especifico 
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarEventoPorFechas(Evento evento, Date de, Date hasta){
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            Criteria crit = HibernateUtil.getSession().createCriteria(entityClass);
            if(evento != null)
                crit.add(Restrictions.eq("evento", evento));
            if(de != null)
                crit.add(Restrictions.ge("fechaInicial", de));
            if(hasta != null)
                crit.add(Restrictions.lt("fechaInicial", hasta));
            ts = crit.list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;        
    }
}

