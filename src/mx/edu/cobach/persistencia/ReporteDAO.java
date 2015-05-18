package mx.edu.cobach.persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author fernando
 */
public class ReporteDAO extends BaseDAO{
    
    public ReporteDAO(){
        super();
        super.entityClass = Empleado.class;
    }
    
    public List<Object> buscarPorNombre(String nombre){        
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
    
    public List<Object> buscarPorNumero(int numero){        
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.like("numero", numero)))
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
}
