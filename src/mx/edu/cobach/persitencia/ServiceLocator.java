/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.cobach.persitencia;

import mx.edu.cobach.persistencia.EmpleadoDAO;
import mx.edu.cobach.persistencia.UsuarioDAO;

/**
 * Clase para localizar los servicios de DAOs
 * @author Alex
 */
public class ServiceLocator {
    
    //DAO generico
    private static BaseDAO baseDAO;    
    private static PuestoDAO puestoDAO;
    private static CursoDAO cursoDAO;
    private static EmpleadoDAO empleadoDAO;
    private static UsuarioDAO usuarioDAO;
    private static DepartamentoDAO departamentoDAO;
    private static SedeDAO sedeDAO;
    
    /**
     * Obtiene el DAO generico, si este no ha sido inicializado se instanciara
     * @return Regresa DAO generico
     */
    public static BaseDAO getInstance(){
        if(baseDAO == null){
            baseDAO = new BaseDAO();
        }
        return baseDAO;
    }
    
    public static EmpleadoDAO getEmpleado(){
        if(empleadoDAO == null){
            empleadoDAO = new EmpleadoDAO();
        }
        return empleadoDAO;
    }
    
    public static PuestoDAO getPuesto(){
        if(puestoDAO == null){
            puestoDAO = new PuestoDAO();
        }
        return puestoDAO;
    }
    public static CursoDAO getCurso(){
        if(cursoDAO == null){
            cursoDAO = new CursoDAO();
        }
        return cursoDAO;
    }
    
    public static UsuarioDAO getUsuario(){
        if(usuarioDAO == null){
            usuarioDAO = new UsuarioDAO();
        }
        return usuarioDAO;
    }
    public static DepartamentoDAO getDepartamento(){
        if(departamentoDAO == null){
            departamentoDAO = new DepartamentoDAO();
        }
        return departamentoDAO;
    }
    
    public static SedeDAO getSede(){
        if(sedeDAO == null){
            sedeDAO = new SedeDAO();
        }
        return sedeDAO;
    }
}
