/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import mx.edu.cobach.persistencia.entidades.Encuesta;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 * DAO especifico utilizado para metodos especificos de la entidad Encuesta.
 */
public class EncuestaDAO extends BaseDAO {
    
    /**
     * Contructor donde se asigna la clase entidad de respuesta.
     */
    public EncuestaDAO(){
        this.entityClass = Encuesta.class;
    }
    
    /**
     * Busqueda encuest con el identificador de la pagina de JotForm.
     * @param jotformId Identificador de JotForm
     * @return Encuesta con el identificador JotForm
     */
    public Encuesta buscarPorJotformId(long jotformId){
        Encuesta ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = (Encuesta) HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.or(
                            Restrictions.eq("jotformIdAntes", jotformId),
                            Restrictions.eq("jotformIdDespues", jotformId)))
                    .uniqueResult();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por jotformid::Encuesta");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
}
