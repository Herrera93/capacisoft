/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.persistencia.entidades.ImplementacionCurso;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author liuts
 */
public class ProgramarDAO<T> extends BaseDAO{
    public ProgramarDAO(){
        super();
        super.entityClass = ImplementacionCurso.class;
    }
    
    public List<Object> findByCurso(Curso curso){        
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("curso", curso)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    public List<Object> findBySede(Sede sede){        
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
     * Obtiene todas las implementaciones en un rango de fechas dado.
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorFechas(Date de, Date hasta){   
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            Criteria crit = HibernateUtil.getSession().createCriteria(entityClass);;
            if(de != null)
                crit.add(Restrictions.ge("fechaInicial", de));
            if(hasta != null)
                crit.add(Restrictions.lt("fechaInicial", hasta));
            ts = crit.list();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;        
    }
    
    /**
     * Obtiene todas las implementaciones de un curso especifico en un rango
     * de fechas dado. Si las fechas no estan inicializadas no se tomaran en 
     * cuenta, solo se tomaran las fechas inicializadas, esto significa que 
     * se puede dar la fecha 'de' sin dar 'hasta'.
     * @param curso Curso especifico 
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarCursoPorFechas(Curso curso, Date de, Date hasta){
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            Criteria crit = HibernateUtil.getSession().createCriteria(entityClass);
            if(curso != null)
                crit.add(Restrictions.eq("curso", curso));
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

