/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persitencia;

import java.util.List;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fernando
 */
public class CursoDAO<T> extends BaseDAO{
    
    public List<T> findTipoCurso(int id) {
        List<T> t = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            t = (List<T>) HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.like("tipo_curso_id", id)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscando Object");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();   
        }
        return t;
    }
    
    public List<T> findId(int id){
        
        return null;
    }
 
}
