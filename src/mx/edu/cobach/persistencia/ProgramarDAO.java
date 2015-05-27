/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionCurso;
import mx.edu.cobach.persistencia.entidades.Plantel;
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
                    add(Restrictions.eq("curso", evento)).list();
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
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.between("fechaInicial", de, hasta)).list();
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
    
    public List<Object> buscarPorDepartamento(Departamento departamento){
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            Criteria criteria = HibernateUtil.getSession().createCriteria(entityClass, "implementacion");
            Criteria critEmpleados = criteria.createCriteria("empleados");
            critEmpleados.add(Restrictions.eq("departamento", departamento));
            ts = criteria.list(); 
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    public List<Object> buscarPorPlantel(Plantel plantel){
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            Criteria criteria = HibernateUtil.getSession().createCriteria(entityClass, "implementacion");
            Criteria critEmpleados = criteria.createCriteria("empleados");
            critEmpleados.add(Restrictions.eq("plantel", plantel));
            ts = criteria.list(); 
            HibernateUtil.commitTransaction();
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
     * @param evento Curso especifico 
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
                crit.add(Restrictions.eq("curso", evento));
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
    
//    public List<Object> buscarEnunciados(){
//        List<Object> ts = null;
//        try{
//            HibernateUtil.openSession();
//            HibernateUtil.beginTransaction();
//            Criteria criteria = HibernateUtil.getSession().createCriteria(entityClass, "implementacion");
//            Criteria critEmpleados = criteria.createCriteria("empleados");
//            critEmpleados.add(Restrictions.eq("plantel", plantel));
//            ts = criteria.list(); 
//            HibernateUtil.commitTransaction();
//        }catch(HibernateException e){
//            HibernateUtil.rollbackTransaction();
//        }finally{
//            HibernateUtil.closeSession();
//        }
//        return ts;
//    }
}

