/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia;

import java.util.List;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alex
 */
public class EmpleadoDAO extends BaseDAO {

    public EmpleadoDAO() {
        super();
        super.entityClass = Empleado.class;
    }

    public List<Object> buscarPorNombre(String nombre) {
        List<Object> ts = null;
        try {
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
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }

    public List<Object> buscarPorAdscripcion(Adscripcion adscripcion) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("adscripcion", adscripcion)).list();
            HibernateUtil.commitTransaction();
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }

    /**
     * Obtiene todas las implementaciones relacionadas de un departamento dado.
     *
     * @param departamento
     * @return
     */
    public List<Object> buscarPorDepartamento(Departamento departamento) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("departamento", departamento)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Departamento");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }

    /**
     * Obtiene todas las implementaciones relacionadas de un puesto dado.
     *
     * @param puesto
     * @return
     */
    public List<Object> buscarPorPuesto(Puesto puesto) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("puesto", puesto)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Puesto");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }

    /**
     * Obtiene todas las implementaciones relacionadas con una direccion dada.
     * @param direccion
     * @return 
     */
    public List<Object> buscarPorDireccion(Direccion direccion){        
        List<Object> ts = null;        
        try{
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("direccion", direccion)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Direccion");
        }catch(HibernateException e){
            HibernateUtil.rollbackTransaction();
        }finally{
            HibernateUtil.closeSession();
        }
        return ts;
    }
    /**
     * Obtiene todas las implementaciones relacionadas de un plantel dado.
     *
     * @param plantel
     * @return
     */
    public List<Object> buscarPorPlantel(Plantel plantel) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("plantel", plantel)).list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Empleado");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }

    public Object buscarJefeInmediato(Empleado empleado) {
        Object jefe = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            Criteria criteria = HibernateUtil.getSession().createCriteria(entityClass);
            criteria.createAlias("puesto", "p");
            if (empleado.getDepartamento() != null) {
                criteria.add(Restrictions.eq("departamento", empleado.getDepartamento()));
                criteria.add(Restrictions.like("p.nombre", "Jefe%"));
            } else {
                criteria.add(Restrictions.eq("plantel", empleado.getPlantel()));
                criteria.add(Restrictions.like("p.nombre", "Director%"));
            }
            jefe = criteria.uniqueResult();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar Jefe::Empleado");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return jefe;
    }

    public List<Object> validarPorNumero(int numero) {
        List<Object> ts = null;
        String num = numero + "";
        System.out.println(num);
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("numero", num)).list();
            HibernateUtil.commitTransaction();
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }

    /**
     * Metodo que sirve para conectarse con la tabla de empleado y obtener la
     * informacion de los empleados con su nombre y el departamento que se
     * encuentran
     *
     * @param departamento
     * @param nombre
     * @return
     */
    public List<Object> buscarPorDepartamentoNEmpleado(Departamento departamento, String nombre) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("departamento", departamento)).add(Restrictions.or(
                                    Restrictions.like("primerNombre", nombre + "%"),
                                    Restrictions.like("segundoNombre", nombre + "%"),
                                    Restrictions.like("apellidoPaterno", nombre + "%"),
                                    Restrictions.like("apellidoMaterno", nombre + "%")))
                    .list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Departamento/Nombre");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }
    /**
     * Metodo que sirve para conectarse con la tabla de empleado y obtener la
     * informacion de los empleados con su nombre y el puesto que se
     * encuentran
     *
     * @param puesto
     * @param nombre
     * @return 
     */
    public List<Object> buscarPorPuestoNEmpleado(Puesto puesto, String nombre) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("puesto", puesto)).add(Restrictions.or(
                                    Restrictions.like("primerNombre", nombre + "%"),
                                    Restrictions.like("segundoNombre", nombre + "%"),
                                    Restrictions.like("apellidoPaterno", nombre + "%"),
                                    Restrictions.like("apellidoMaterno", nombre + "%")))
                    .list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Puesto/Nombre");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }
    /**
     * Metodo que sirve para conectarse con la tabla de empleado y obtener la
     * informacion de los empleados con su nombre y el plantel que se
     * encuentran
     *
     * @param plantel
     * @param nombre
     * @return 
     */
    public List<Object> buscarPorPlantelNEmpleado(Plantel plantel, String nombre) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("plantel", plantel)).add(Restrictions.or(
                                    Restrictions.like("primerNombre", nombre + "%"),
                                    Restrictions.like("segundoNombre", nombre + "%"),
                                    Restrictions.like("apellidoPaterno", nombre + "%"),
                                    Restrictions.like("apellidoMaterno", nombre + "%")))
                    .list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Plantel/Nombre");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }
    
    /**
     * Metodo que sirve para conectarse con la tabla de empleado y obtener la
     * informacion de los empleados con su nombre y el plantel que se
     * encuentran
     *
     * @param direccion
     * @param nombre
     * @return 
     */
    public List<Object> buscarPorDireccionNEmpleado(Direccion direccion, String nombre) {
        List<Object> ts = null;
        try {
            HibernateUtil.openSession();
            HibernateUtil.beginTransaction();
            ts = HibernateUtil.getSession().createCriteria(entityClass).
                    add(Restrictions.eq("direccion", direccion)).add(Restrictions.or(
                                    Restrictions.like("primerNombre", nombre + "%"),
                                    Restrictions.like("segundoNombre", nombre + "%"),
                                    Restrictions.like("apellidoPaterno", nombre + "%"),
                                    Restrictions.like("apellidoMaterno", nombre + "%")))
                    .list();
            HibernateUtil.commitTransaction();
            System.out.println("Buscar por nombre::Plantel/Nombre");
        } catch (HibernateException e) {
            HibernateUtil.rollbackTransaction();
        } finally {
            HibernateUtil.closeSession();
        }
        return ts;
    }
}
