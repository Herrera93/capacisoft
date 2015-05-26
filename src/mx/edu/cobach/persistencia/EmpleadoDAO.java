/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.Arrays;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alex
 */
public class EmpleadoDAO extends BaseDAO{
    
    public EmpleadoDAO(){
        super();
        super.entityClass = Empleado.class;
    }
    
    public List<Object> findByNombre(String nombre){        
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.like("primerNombre", nombre + "%"),
                            Restrictions.like("segundoNombre", nombre + "%"),
                            Restrictions.like("apellidoPaterno", nombre + "%"),
                            Restrictions.like("apellidoMaterno", nombre + "%")))
                    .list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Empleado");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    public List<Object> findByAdscripcion(Adscripcion adscripcion){
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("adscripcion", adscripcion)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    public List<Object> findByDepartamento(Departamento departamento){        
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("departamento", departamento)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Departamento");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    public List<Object> findByPuesto(Puesto puesto){        
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("puesto", puesto)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Puesto");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    public List<Object> findByPlantel(Plantel plantel){        
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("plantel", plantel)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Empleado");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    public Object buscarJefeInmediato(Empleado empleado){
        Object jefe = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            Criteria criteria = HibernateUtil.getSession().createCriteria(entityClass);
            criteria.createAlias("puesto", "p");
            if(empleado.getDepartamento() != null){
                criteria.add(Restrictions.eq("departamento", empleado.getDepartamento()));
                criteria.add(Restrictions.like("p.nombre", "Jefe%"));
            }else{
                criteria.add(Restrictions.eq("plantel", empleado.getPlantel()));
                criteria.add(Restrictions.like("p.nombre", "Director%"));
            }
            jefe = criteria.uniqueResult();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar Jefe::Empleado");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return jefe;
    }
}
