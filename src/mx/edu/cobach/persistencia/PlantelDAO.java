/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import mx.edu.cobach.persistencia.entidades.Plantel;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

public class PlantelDAO extends BaseDAO{
    public PlantelDAO(){
        super();
        super.entityClass = Plantel.class;
    }
    
    public List<Object> findByNombre(String nombre){
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.like("nombre", "%" + nombre + "%")))
                    .list();
            HibernateUtil.commitTransaction();            
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();            
        }
        return ts;
    }
    
}
