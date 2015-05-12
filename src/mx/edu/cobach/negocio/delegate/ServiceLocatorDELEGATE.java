/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

/**
 * Clase para localizacion de servicios DELEGATE
 * @author Alex
 */
public class ServiceLocatorDELEGATE {
    
    //DELEGATE generico
    private static BaseDELEGATE delegate;
    //DELEGATE especificos
    private static PuestoDELEGATE puestoDelegate;
    private static CursoDELEGATE cursoDelegate;
    private static EmpleadoDELEGATE empleadoDelegate;
    private static UsuarioDELEGATE usuarioDelegate;
    private static AspectoDELEGATE aspectoDelegate;
    
    /**
     * Obtiene el DELEGATE generico, si este no ha sido inicilizado se instanciara.
     * Este metodo utiliza el aptron de diseno Singleton.
     * @return Regresa DELEGATE generico
     */
    public static BaseDELEGATE getInstance(){
        if(delegate == null){
            delegate = new BaseDELEGATE();
        }        
        return delegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Usuario, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Usuario
     */
    public static UsuarioDELEGATE getUsuario(){
        if(usuarioDelegate == null){
            usuarioDelegate = new UsuarioDELEGATE();
        }
        return usuarioDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Empleado, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Empleado
     */
    public static EmpleadoDELEGATE getEmpleado(){
        if(empleadoDelegate == null){
            empleadoDelegate = new EmpleadoDELEGATE();
        }
        return empleadoDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Puesto, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Puesto
     */
    public static PuestoDELEGATE getPuesto(){
        if(puestoDelegate == null){
            puestoDelegate = new PuestoDELEGATE();
        }        
        return puestoDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad curso, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Curso
     */
    public static CursoDELEGATE getCurso(){
        if(cursoDelegate == null){
            cursoDelegate = new CursoDELEGATE();
        }
        return cursoDelegate;
    }
    
    /**
     * Obtiene el DELEGATE especifico de la entidad Aspecto, si este no ha sido
     * inicializado se instanciara. Este metodo utiliza el patron de diseno
     * Singleton.
     * @return Regresa el DELEGATE de Aspecto
     */
    public static AspectoDELEGATE getAspecto(){
        if(aspectoDelegate == null){
            aspectoDelegate = new AspectoDELEGATE();
        }
        return aspectoDelegate;
    } 
}
