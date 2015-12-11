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
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.Comunicador;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import persistencia.Enlace;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 * @author Liuts
 */
public class PuestoControlador extends BaseControlador{
    
    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     * @param com
     */
    public PuestoControlador(Comunicador com){
        super(com, Puesto.class);
    }
    
    /**
     * Metódo para realizar la búsqueda de un empleado para verificar si existe
     * tiene el puesto que se va a eliminar.
     * @param id Puesto que se encuentra en la tabla de empleados
     * @return booleano que indica si puesto es utilizado o no
    */
    public boolean buscarEmpleadosByPuesto(int id) {
        DataTable empleados = null;
        
        try {
            HashMap<String, Object> condicion = new HashMap<>();
            condicion.put("puesto_id", id);
            
            empleados = Enlace.getPersistencia().get("empleado", null, null,
                    condicion);
            
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(PuestoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (empleados != null && !empleados.isEmpty());
    }
}
