/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persitencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.persistencia.entidades.TipoCuenta;
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
        //System.out.println("find by usuario dao");
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
          //  System.out.println("usuario dao inicio sesion");
            HibernateUtil.beginTransaction();
            //System.out.println("usuario dao inicio transiccion");
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.like("primerNombre", usuario + "%"),
                            Restrictions.like("segundoNombre", usuario + "%"),
                            Restrictions.like("apellidoPaterno", usuario + "%"),
                            Restrictions.like("apellidoMaterno", usuario + "%")))
                    .list();
           // System.out.println("usuario dao restricciones");
            HibernateUtil.commitTransaction();
           // System.out.println("usuario dao comit transiccion");
            
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
           // System.out.println("error hibernate");
        }finally{
            //System.out.println("amntes de cerrar sesion");
            HibernateUtil.closeSession();
            //System.out.println("despues de cerrar secion");
            
        }
        //System.out.println("fin find by usuario dao");
        return ts;
    }
    
    public List<Object> findByNombre(String nombre){
        //System.out.println("find by usuario dao");
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
          //  System.out.println("usuario dao inicio sesion");
            HibernateUtil.beginTransaction();
            //System.out.println("usuario dao inicio transiccion");
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.like("usuario", nombre + "%")))
                    .list();
           // System.out.println("usuario dao restricciones");
            HibernateUtil.commitTransaction();
           // System.out.println("usuario dao comit transiccion");
            
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
           // System.out.println("error hibernate");
        }finally{
            //System.out.println("amntes de cerrar sesion");
            HibernateUtil.closeSession();
            //System.out.println("despues de cerrar secion");
            
        }
        //System.out.println("fin find by usuario dao");
        return ts;
    }
    
}
