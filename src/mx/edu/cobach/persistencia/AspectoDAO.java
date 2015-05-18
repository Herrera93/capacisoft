/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Aspecto;
import mx.edu.cobach.persistencia.entidades.Competencia;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alex
 */
public class AspectoDAO extends BaseDAO {
    
    public AspectoDAO(){
        setEntity(Aspecto.class);
    }
    
    /**
     * Busqueda de aspecto por competencia, recibe un tipo de competencia
     * crea un criterio de busqueda conforme al objeto para obtener una lista
     * de objetos con los aspectos correspondientes en la base de datos.
     * @param competencia Competencia para buscar aspectos
     * @return Lista de objetos con los aspectos encontrados
     */
    public List<Object> buscarPorCompetencia(Competencia competencia){
        List<Object> listaAspectos = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            listaAspectos = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("competencia", competencia)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();   
        }
        return listaAspectos;
    }
}
