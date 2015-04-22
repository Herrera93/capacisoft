/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

/**
 *
 * @author Alex
 */
public class ServiceLocatorDELEGATE {
    
    private static BaseDELEGATE delegate;
    private static EmpleadoDELEGATE empleadoDelegate;
    
    public static BaseDELEGATE getInstance(){
        if(delegate == null){
            delegate = new BaseDELEGATE();
        }        
        return delegate;
    }
    
    public static EmpleadoDELEGATE getEmpleadoDelegate(){
        if(empleadoDelegate == null){
            empleadoDelegate = new EmpleadoDELEGATE();
        }
        return empleadoDelegate;
    }
}
