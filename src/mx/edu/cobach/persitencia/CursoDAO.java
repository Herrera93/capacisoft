/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persitencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fernando
 */
public class CursoDAO extends BaseDAO{
    
    public CursoDAO(){
        setEntity(Curso.class);
    }
    
    public List<Object> findTipoCurso(int id) {
        List<Object> o = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            o = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("tipoCurso.id", 1)).list();
            HibernateUtil.commitTransaction();
            System.out.println(o.size());
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();   
        }
        return o;
    }
}
