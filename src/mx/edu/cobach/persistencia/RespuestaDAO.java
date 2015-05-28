/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Encuesta;
import mx.edu.cobach.persistencia.entidades.Respuesta;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 * DAO especifico utilizado para metodos especificos de la entidad Respuesta.
 */
public class RespuestaDAO extends BaseDAO {
    
    /**
     * Contructor donde se asigna la clase entidad de respuesta.
     */
    public RespuestaDAO(){
        this.entityClass = Respuesta.class;
    }
    
    /**
     * Metodo para la busqueda de respuestas por medio de un empleado y una 
     * encuesta.
     * @param empleado Objeto de Empleado a buscar
     * @param encuesta Objeto de Encuesta a buscar
     * @return Regresa una lista de respuestas
     */
    public List<Respuesta> buscarPorEmpleadoEncuesta(Empleado empleado, Encuesta encuesta){
        List<Respuesta> respuestas = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            respuestas = HibernateUtil.getSession().createCriteria(entityClass)
                    .add(Restrictions.and(
                            Restrictions.eq("empleado", empleado),
                            Restrictions.eq("encuesta", encuesta)))
                    .list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por jotformid::Encuesta");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return respuestas;
    }  
    
}
