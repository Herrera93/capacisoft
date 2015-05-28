/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import mx.edu.cobach.persistencia.entidades.Alerta;

import org.hibernate.HibernateException;

import java.util.List;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Melissa
 */
public class AlertaDAO<T> extends BaseDAO{// class
    
    /**
     * 
     */
    public AlertaDAO(){// method
        super();
        super.entityClass = Alerta.class;
    }// method
    
    /**
     * 
     * @param id
     * @return 
     */
    public Object buscarAlerta(int id){// method
        Object obj = null;
        try{// try
           HibernateUtil.openSession();
           HibernateUtil.beginTransaction();
           obj = HibernateUtil.getSession().get(entityClass, id);
        }// try
        catch(HibernateException e){// catch
           HibernateUtil.rollbackTransaction();
        }// catch
        finally{// finally
            HibernateUtil.closeSession();
        }// finally
       return obj;
    }// method
    
    /**
     * 
     * @param t 
     */
    public void modificarAlerta(T t){// method
        try{// try
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().saveOrUpdate(t);
            HibernateUtil.commitTransaction();
        }// try
        catch(HibernateException e){// catch
            HibernateUtil.rollbackTransaction();
        }// catch
        finally{// finally
            HibernateUtil.closeSession();
        }// finally
    }// method
    
    /**
     * 
     * @param alerta
     * @return 
     */
    public List<Object> buscarImplementacion(Alerta alerta){// method
        List<Object> lista = null;
        try{// try
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            lista = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.eq("Alerta", alerta)).list();
        }// try
        catch(HibernateException e){// catch
            HibernateUtil.rollbackTransaction();
        }// catch
        finally{// finally
            HibernateUtil.closeSession();
        }// finally
        return lista;
    }// method
    
}// class
