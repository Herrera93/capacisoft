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
    private static PuestoDELEGATE puestoDelegate;
    
    public static BaseDELEGATE getInstance(){
        if(delegate == null){
            delegate = new BaseDELEGATE();
        }        
        return delegate;
    }
    
    public static PuestoDELEGATE getPuesto(){
        if(puestoDelegate == null){
            puestoDelegate = new PuestoDELEGATE();
        }        
        return puestoDelegate;
    }
}
