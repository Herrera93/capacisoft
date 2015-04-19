/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.cobach.persitencia;
/**
 * Clase para localizar los servicios de DAOs
 * @author Alex
 */
public class ServiceLocator {
    
    //DAO generico
    private static BaseDAO baseDAO;    
    
    /**
     * Obtiene el DAO generico, si este no ha sido inicializado se instanciara
     * @return Regresa DAO generico
     */
    public static BaseDAO getInstance(){
        if(baseDAO == null){
            baseDAO = new BaseDAO();
        }
        return baseDAO;
    }
    
}
