/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEventoEnunciadoLogistica;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *  Esta clase conecta es la encargada de la obtencio especifica para la tabla 
 * ImplementacionEventoEnunciadoLogisticaDAO
 * @author liuts
 */
public class ImplementacionEventoEnunciadoLogisticaDAO extends BaseDAO{
    /**
     * Contructor de la clase ImplementacionEventoEnunciadoLogisticaDAO
     */
    public ImplementacionEventoEnunciadoLogisticaDAO(){
        super();
        super.entityClass = ImplementacionEventoEnunciadoLogistica.class;
    }
    /**
     * Metodo para la obtencion de la calificacion de la logistica de los 
     * cursos realizados opteniendo una id del este mismo
     * @param eventoProgra
     * @return 
     */
    public List<Object> buscarEncuestaPorEvento(ImplementacionEvento eventoProgra) {
        List<Object> ts = null;
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("implementacionCurso", eventoProgra)).list();
            HibernateUtil.commitTransaction();
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
}
