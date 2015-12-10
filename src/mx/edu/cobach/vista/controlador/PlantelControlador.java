/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dto.DataTable;
import mx.edu.cobach.vista.Comunicador;
import persistencia.Enlace;

public class PlantelControlador extends BaseControlador{
    public PlantelControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }
    
    public boolean buscarEmpleadosByPlantel(int id) {
        DataTable empleados = null;
        
        try {
            //Buscar empleados del plantel...
            empleados = Enlace.getPersistencia().getEmpleadosByPlantel(id);
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(PlantelControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (empleados != null && !empleados.isEmpty());
    }
}