/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

/**
 *
 * @author Alex
 */
public class ServiceLocatorFACADE {
    
    private static BaseFACADE facade;
    
    public static BaseFACADE getInstance(){
        int x = 10;
        if(facade == null){
            facade = new BaseFACADE();
        }
        return facade;
    }
}
