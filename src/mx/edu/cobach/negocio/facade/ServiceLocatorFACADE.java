/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import mx.edu.cobach.persistencia.entidades.ImplementacionEventoEnunciadoLogistica;

/**
 * Clase para localizacion de servicios FACADE
 * @author Alex
 */
public class ServiceLocatorFACADE {
    
    //FACADE generico
    private static BaseFACADE facade;
    //FACADE especificos
    private static PuestoFACADE puestoFacade;
    private static EventoFACADE eventoFacade;
    private static EmpleadoFACADE empleadoFacade;
    private static UsuarioFACADE usuarioFacade;
    private static AspectoFACADE aspectoFacade;
    private static DepartamentoFACADE departamentoFacade;
    private static SedeFACADE sedeFacade;
    private static EncuestaFACADE encuestaFacade;
    private static RespuestaFACADE respuestaFacade;
    private static ImplementacionEventoFACADE implementacionEventoFacade;
    private static ImplementacionEventoEnunciadoLogisticaFACADE calificacionFacade;
    private static ProveedorFACADE proveedorFacade;
    private static PlantelFACADE plantelFacade;
    private static AlertaFACADE alertaFacade;
    private static DireccionFACADE direccionFacade;
    
    /**
     * Obtiene el FACADE generico, si este no ha sido inicilizado se instanciara.
     * Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa FACADE generico
     */
    public static BaseFACADE getInstance(){
        if(facade == null){
            facade = new BaseFACADE();
        }
        return facade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Empleado, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Empleado
     */
    public static EmpleadoFACADE getEmpleado(){
        if(empleadoFacade == null){
            empleadoFacade = new EmpleadoFACADE();
        }
        return empleadoFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Puesto, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Puesto
     */
    public static PuestoFACADE getPuesto(){
        if(puestoFacade == null){
            puestoFacade = new PuestoFACADE();
        }
        return puestoFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Direccion, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Direccion
     */
    public static DireccionFACADE getDireccion(){
        if(direccionFacade == null){
            direccionFacade = new DireccionFACADE();
        }
        return direccionFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Proveedor, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Proveedor
     */
    public static ProveedorFACADE getProveedor(){
        if(proveedorFacade==null){
            proveedorFacade = new ProveedorFACADE();
        }
        return proveedorFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Plantel, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Plantel
     */
    public static PlantelFACADE getPlantel(){
        if(plantelFacade==null){
            plantelFacade = new PlantelFACADE();
        }
        return plantelFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Evento, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Evento
     */
    public static EventoFACADE getEvento(){
        if(eventoFacade == null){
            eventoFacade = new EventoFACADE();
        }
        return eventoFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Usuario, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Usuario
     */
    public static UsuarioFACADE getUsuario(){
        if(usuarioFacade == null){
            usuarioFacade = new UsuarioFACADE();
        }
        return usuarioFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Aspecto, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Aspecto
     */
    public static AspectoFACADE getAspecto(){
        if(aspectoFacade == null){
            aspectoFacade = new AspectoFACADE();
        }
        return aspectoFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Sede, 
     * si este no ha sido inicializado se instanciara. 
     * Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el FACADE de Sede
     */
    public static SedeFACADE getSede(){
        if(sedeFacade==null){
            sedeFacade = new SedeFACADE();
        }
        return sedeFacade;
    }
    
     /**
     * Obtiene el FACADE especifico de la entidad Departamento, 
     * si este no ha sido inicializado se instanciara. 
     * Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el FACADE de Departamento
     */
    public static DepartamentoFACADE getDepartamento(){
        if(departamentoFacade == null){
            departamentoFacade = new DepartamentoFACADE();
        }
        return departamentoFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad ImplementacionCurso, 
     * si este no ha sido inicializado se instanciara. 
     * Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el FACADE de Implementacion
     */
    public static ImplementacionEventoFACADE getImplementacionEvento(){
        if(implementacionEventoFacade == null){
            implementacionEventoFacade = new ImplementacionEventoFACADE();
        }
        return implementacionEventoFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Encuesta, 
     * si este no ha sido inicializado se instanciara. 
     * Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el FACADE de Encuesta
     */
    public static EncuestaFACADE getEncuesta(){
        if(encuestaFacade == null){
            encuestaFacade = new EncuestaFACADE();
        }
        return encuestaFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad Encuesta, 
     * si este no ha sido inicializado se instanciara. 
     * Este metodo utiliza el patron de diseno Singleton.
     * @return Regresa el FACADE de Encuesta
     */
    public static RespuestaFACADE getRespuesta(){
        if(respuestaFacade == null){
            respuestaFacade = new RespuestaFACADE();
        }
        return respuestaFacade;
    }
    
    /**
     * Obtiene el FACADE especifico de la entidad denada
     * 
     * ImplementacionCursoEnunciadoLogistica, si este no ha sido inicializado se
     * instanciara. 
     * @return Regresa el facade de ImplementacionCursoEnunciadoLogistica
     */
    public static ImplementacionEventoEnunciadoLogisticaFACADE getEnunciadoCali(){
        if(calificacionFacade == null){
            calificacionFacade = new ImplementacionEventoEnunciadoLogisticaFACADE();
        }
        return calificacionFacade;
    }
    
    public static AlertaFACADE getAlerta(){
        if(alertaFacade == null){
            alertaFacade = new AlertaFACADE();
        }
        return alertaFacade;
    }
}
