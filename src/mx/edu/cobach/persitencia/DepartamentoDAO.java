/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persitencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fernando
 */
public class DepartamentoDAO extends BaseDAO{
    
    DepartamentoDAO(){
        super();
        super.entityClass = Departamento.class;
    }
    
    public List<Object> findByNombre(String nombre){        
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.like("nombre", nombre )))
                    .list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Departamento");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
}
