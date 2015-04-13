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
    
    public static BaseDELEGATE getInstance(){
        if(delegate == null){
            delegate = new BaseDELEGATE();
        }        
        return delegate;
    }
}
