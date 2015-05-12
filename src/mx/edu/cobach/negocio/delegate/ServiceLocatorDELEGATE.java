/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import mx.edu.cobach.negocio.facade.CursoFACADE;

/**
 *
 * @author Alex
 */
public class ServiceLocatorDELEGATE {
    
    private static BaseDELEGATE delegate;
    private static PuestoDELEGATE puestoDelegate;
    private static CursoDELEGATE cursoDelegate;
    private static EmpleadoDELEGATE empleadoDelegate;
    private static UsuarioDELEGATE usuarioDelegate;
    private static DepartamentoDELEGATE departamentoDelegate;
    private static SedeDELEGATE sedeDelegate;
    
    public static BaseDELEGATE getInstance(){
        if(delegate == null){
            delegate = new BaseDELEGATE();
        }        
        return delegate;
    }
    
    public static UsuarioDELEGATE getUsuarioDelegate(){
        if(usuarioDelegate == null){
            usuarioDelegate = new UsuarioDELEGATE();
        }
        return usuarioDelegate;
    }
    
    public static SedeDELEGATE getSedeDelegate(){
        if(sedeDelegate == null){
            sedeDelegate = new SedeDELEGATE();
        }
        return sedeDelegate;
    }
    
    public static EmpleadoDELEGATE getEmpleadoDelegate(){
        if(empleadoDelegate == null){
            empleadoDelegate = new EmpleadoDELEGATE();
        }
        return empleadoDelegate;
    }
    
    public static PuestoDELEGATE getPuesto(){
        if(puestoDelegate == null){
            puestoDelegate = new PuestoDELEGATE();
        }        
        return puestoDelegate;
    }
    public static CursoDELEGATE getCurso(){
        if(cursoDelegate == null){
            cursoDelegate = new CursoDELEGATE();
        }
        return cursoDelegate;
    }
    public static DepartamentoDELEGATE getDepartamento(){
        if(departamentoDelegate == null){
            departamentoDelegate = new DepartamentoDELEGATE();
        }
        return departamentoDelegate;
    }
}
