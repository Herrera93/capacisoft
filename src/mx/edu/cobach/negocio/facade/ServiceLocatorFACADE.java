/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import mx.edu.cobach.persistencia.entidades.ImplementacionCursoEnunciadoLogistica;

/**
 * Clase para localizacion de servicios FACADE
 * @author Alex
 */
public class ServiceLocatorFACADE {
    
    //FACADE generico
    private static BaseFACADE facade;
    //FACADE especificos
    private static PuestoFACADE puestoFacade;
    private static CursoFACADE cursoFacade;
    private static EmpleadoFACADE empleadoFacade;
    private static UsuarioFACADE usuarioFacade;
    private static AspectoFACADE aspectoFacade;
    private static DepartamentoFACADE departamentoFacade;
    private static SedeFACADE sedeFacade;
    private static ProgramarFACADE programaFacade;
    private static ImplementacionCursoEnunciadoLogisticaFACADE calificacionFacade;
    
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
     * Obtiene el FACADE especifico de la entidad Curso, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el FACADE de Curso
     */
    public static CursoFACADE getCurso(){
        if(cursoFacade == null){
            cursoFacade = new CursoFACADE();
        }
        return cursoFacade;
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
    
    public static SedeFACADE getSede(){
        if(sedeFacade==null){
            sedeFacade = new SedeFACADE();
        }
        return sedeFacade;
    }
    
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
    public static ProgramarFACADE getPrograma(){
        if(programaFacade == null){
            programaFacade = new ProgramarFACADE();
        }
        return programaFacade;
    }
    /**
     * Obtiene el FACADE especifico de la entidad denada
     * 
     * ImplementacionCursoEnunciadoLogistica, si este no ha sido inicializado se
     * instanciara. 
     * @return Regresa el facade de ImplementacionCursoEnunciadoLogistica
     */
    public static ImplementacionCursoEnunciadoLogisticaFACADE getEnunciadoCali(){
        if(calificacionFacade == null){
            calificacionFacade = new ImplementacionCursoEnunciadoLogisticaFACADE();
        }
        return calificacionFacade;
    }
}
