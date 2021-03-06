/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import mx.edu.cobach.persistencia.entidades.Proveedor;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

public class ProveedorDAO extends BaseDAO{
    public ProveedorDAO(){
        super();
        super.entityClass = Proveedor.class;
    }
    
    public List<Object> findByNombre(String nombre){
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.like("primerNombre","%" + nombre + "%"),
                            Restrictions.like("segundoNombre", "%" + nombre + "%"),
                            Restrictions.like("apellidoPaterno", "%" + nombre + "%"),
                            Restrictions.like("apellidoMaterno", "%" + nombre + "%")))
                    .list();
            HibernateUtil.commitTransaction();            
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();            
        }
        return ts;
    }
    
    public List<Object> buscarImplementaciones(int id){
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(ImplementacionEvento.class)
                    .add(Restrictions.eq("proveedor_id", id))
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
