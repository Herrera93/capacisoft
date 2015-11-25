
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;


public class DireccionDAO<T> extends BaseDAO{
        
    public DireccionDAO(){
        
    }
    
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
