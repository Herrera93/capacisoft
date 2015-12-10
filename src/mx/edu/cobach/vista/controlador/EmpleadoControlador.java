/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dto.DataTable;
import mx.edu.cobach.vista.Comunicador;
import persistencia.Enlace;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 * @author Fernando
 */
public class EmpleadoControlador extends BaseControlador {

    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     * @param com
     * @param clazz
     */
    public EmpleadoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de su numero de empleado
     * @param numero numero del empleado a validar
    */
    public void validarPorNumero(String numero) {
        
        HashMap<String, Object> condicion = new HashMap<>();
        condicion.put("numero", numero);
        
        DataTable empleado = DataHelper.buscar("empleado", new String[]{"numero"},
                new String[]{null}, condicion);
        
        if (empleado != null && !empleado.isEmpty()) {
            com.setMensaje("El numero de empleado ya existe");
        }
    }

    /**
     * Metodo para validar si el empleado se encuentra asignado a alguna
     * lista de asistencia de una implementacion de evento
     * @param id Numero de empleado
     * @return REgresa el valor de la validacion
     */
    public boolean buscarImplementaciones(String id) {
        DataTable implementaciones = null;
        
        try {
            //Buscar implementaciones del empleado...
            implementaciones = Enlace.getPersistencia()
                    .getImplementacionesByEmpleado(id);
            
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(EmpleadoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (implementaciones != null && !implementaciones.isEmpty());
    }
    
    
}
