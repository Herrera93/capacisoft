/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.cobach.persistencia;
/**
 * Clase para localizar los servicios de DAOs
 * @author Alex
 */
public class ServiceLocator {
    
    //DAO generico
    private static BaseDAO baseDAO;    
    //DAOS especificos
    private static PuestoDAO puestoDAO;
    private static CursoDAO cursoDAO;
    private static EmpleadoDAO empleadoDAO;
    private static UsuarioDAO usuarioDAO;
    private static AspectoDAO aspectoDAO;
    
    /**
     * Obtiene el DAO generico, si este no ha sido inicializado se instanciara.
     * Este metodo utiliza el patro de diseno Singleton.
     * @return Regresa DAO generico
     */
    public static BaseDAO getInstance(){
        if(baseDAO == null){
            baseDAO = new BaseDAO();
        }
        return baseDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Empleados, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de Empleados
     */
    public static EmpleadoDAO getEmpleado(){
        if(empleadoDAO == null){
            empleadoDAO = new EmpleadoDAO();
        }
        return empleadoDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Puesto, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de Puesto
     */
    public static PuestoDAO getPuesto(){
        if(puestoDAO == null){
            puestoDAO = new PuestoDAO();
        }
        return puestoDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Curso, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de Curso
     */
    public static CursoDAO getCurso(){
        if(cursoDAO == null){
            cursoDAO = new CursoDAO();
        }
        return cursoDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Usuarios, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de Usuarios
     */
    public static UsuarioDAO getUsuario(){
        if(usuarioDAO == null){
            usuarioDAO = new UsuarioDAO();
        }
        return usuarioDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Aspectos, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de aspectos
     */
    public static AspectoDAO getAspecto(){
        if(aspectoDAO == null){
            aspectoDAO = new AspectoDAO();
        }
        return aspectoDAO;
    }
    
}
