/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author liuts
 */
public class PuestoDAO<T> extends BaseDAO{
    
    
    
    public PuestoDAO(){
        
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del puesto a buscar
     * @return lista de objetos con la información de puesto
    */
    public List<T> find(String nombre) {
        List<T> t = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            t = (List<T>) HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.like("nombre", "%"+nombre+"%")).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscando Object");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();   
        }
        return t;
    }
 
}
