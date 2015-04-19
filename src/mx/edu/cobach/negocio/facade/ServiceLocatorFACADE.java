/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

/**
 * Clase para localizacion de servicios FACADE
 * @author Alex
 */
public class ServiceLocatorFACADE {
    
    //FACADE generico
    private static BaseFACADE facade;
    
    /**
     * Obtiene el FACADE generico, si este no ha sido inicilizado se instanciara
     * @return Regresa FACADE generico
     */
    public static BaseFACADE getInstance(){
        if(facade == null){
            facade = new BaseFACADE();
        }
        return facade;
    }
}
