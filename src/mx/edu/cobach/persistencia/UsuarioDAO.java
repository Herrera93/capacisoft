/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author SALB
 */
public class UsuarioDAO extends BaseDAO{
    
    public UsuarioDAO(){
        super();
        super.entityClass = Usuario.class;
    }
    
    public List<Object> findByUsuario(String usuario){
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();            
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.eq("usuario", usuario))
                    .list();
            HibernateUtil.commitTransaction();            
        }catch(HibernateException e){
            e.printStackTrace();
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
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
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();            
        }
        return ts;
    }
    
}
