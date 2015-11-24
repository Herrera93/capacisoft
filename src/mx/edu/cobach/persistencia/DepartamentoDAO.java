/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

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
    
     /**
     * Constructor, incializa el constructor de BaseDao a tráves de super, asigna
     * la calse entidad para realizar los querys.
     * @param com Comunicador con la interfaz grafica
     * @param clazz Clase con la que estara trabajando la base de datos
     */
    DepartamentoDAO(){
        super();
        super.entityClass = Departamento.class;
    }
    
    /**
     * Metódo, Utilizado para realizar una búsqueda por nombre de un departamento,
     * a tráves del mapeado xml, donde devulve la busqueda en forma de objeto como entidad
     * departamento.
     * @param nombre
     * @return una lista de objetos de entidad departamentos.
     */
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
            System.out.println("Buscar por nombre::Departamento");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
}
