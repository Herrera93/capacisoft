/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.cobach.persistencia;



/**
 * Clase para localizar los servicios de DAOs.
 * @author Alex
 */
public class ServiceLocator {
    
    //DAO generico
    private static BaseDAO baseDAO;    
    //DAOS especificos
    private static PuestoDAO puestoDAO;
    private static EventoDAO eventoDAO;
    private static EmpleadoDAO empleadoDAO;
    private static UsuarioDAO usuarioDAO;
    private static AspectoDAO aspectoDAO;
    private static DepartamentoDAO departamentoDAO;
    private static SedeDAO sedeDAO;
    private static EncuestaDAO encuestaDAO;
    private static RespuestaDAO respuestaDAO;
    private static ImplementacionEventoDAO implementarDAO;
    private static ImplementacionEventoEnunciadoLogisticaDAO calificacionDAO;
    private static ProveedorDAO proveedorDAO;
    private static PlantelDAO plantelDAO;
    private static AlertaDAO alertaDAO;
    private static DireccionDAO direccionDAO;
    
    /**
     * Obtiene el DAO generico, si este no ha sido inicializado se instanciara.
     * Este metodo utiliza el patro de diseño Singleton.
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
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de Empleados
     */
    public static EmpleadoDAO getEmpleado(){
        if(empleadoDAO == null){
            empleadoDAO = new EmpleadoDAO();
        }
        return empleadoDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Proveedor, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de Proveedor
     */
    public static ProveedorDAO getProveedor(){
        if(proveedorDAO == null){
            proveedorDAO = new ProveedorDAO();
        }
        return proveedorDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Plantel, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de Plantel
     */
    public static PlantelDAO getPlantel(){
        if(plantelDAO == null){
            plantelDAO = new PlantelDAO();
        }
        return plantelDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Puesto, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de Puesto
     */
    public static PuestoDAO getPuesto(){
        if(puestoDAO == null){
            puestoDAO = new PuestoDAO();
        }
        return puestoDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Direccion, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de Direccion
     */
    public static DireccionDAO getDireccion(){
        if(direccionDAO == null){
            direccionDAO = new DireccionDAO();
        }
        return direccionDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Evento, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de Evento
     */
    public static EventoDAO getEvento(){
        if(eventoDAO == null){
            eventoDAO = new EventoDAO();
        }
        return eventoDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Usuarios, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
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
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de aspectos
     */
    public static AspectoDAO getAspecto(){
        if(aspectoDAO == null){
            aspectoDAO = new AspectoDAO();
        }
        return aspectoDAO;
    }
    /**
     * Obtiene el DAO especifico para Departamento, si este no ha sido 
     * inicializado se instanciara. Este metodo utiliza el patron de 
     * diseño Singleton.
     * @return Regresa el DAO de departamento
     */
    public static DepartamentoDAO getDepartamento(){
        if(departamentoDAO == null){
            departamentoDAO = new DepartamentoDAO();
        }
        return departamentoDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Sede, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de Sede
     */
    public static SedeDAO getSede(){
        if(sedeDAO == null){
            sedeDAO = new SedeDAO();
        }
        return sedeDAO;
    }
    
    /**
     * Obtiene el DAO especifico para ImplementacionCursoEvento, si este no ha 
     * sido inicializado se instanciara.
     * Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el DAO de ImplementacionEvento 
     */
    public static ImplementacionEventoDAO getImplementacionEvento(){
        if(implementarDAO == null){
            implementarDAO = new ImplementacionEventoDAO();
        }
        return implementarDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Encuesta, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de Encuesta
     */
    public static EncuestaDAO getEncuesta(){
        if(encuestaDAO == null){
            encuestaDAO = new EncuestaDAO();
        }
        return encuestaDAO;
    }
    
    /**
     * Obtiene el DAO especifico para Respuesta, si este no ha sido inicializado
     * se instanciara. Este metodo utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de Respuesta
     */
    public static RespuestaDAO getRespuesta(){
        if(respuestaDAO == null){
            respuestaDAO = new RespuestaDAO();
        }
        return respuestaDAO;
    }
    
    /**
     * Obtiene el DAO específico para Respuesta, si este no ha sido inicializado
     * se instanciará. Este método utiliza el patron de diseño Singleton.
     * @return Regresa el DAO de EnunciadoLogistica
     */
    public static ImplementacionEventoEnunciadoLogisticaDAO getEnunciadoCali(){
        if(calificacionDAO == null){
            calificacionDAO = new ImplementacionEventoEnunciadoLogisticaDAO();
        }
        return calificacionDAO;
    }
    
    /**
     * Obtiene el DAO específico para Alerta, si este no ha sido inicializado
     * se instanciará. Este método utiliza el patrón de diseño Sigleton.
     * @return Regresa el DAO de Alerta
     */
    public static AlertaDAO getAlerta(){
        if(alertaDAO == null){
            alertaDAO = new AlertaDAO();
        }
        return alertaDAO;
    }
}
