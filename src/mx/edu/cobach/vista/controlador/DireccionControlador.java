
package mx.edu.cobach.vista.controlador;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dto.DataTable;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.vista.Comunicador;
import persistencia.Enlace;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 */
public class DireccionControlador extends BaseControlador{
    
    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     * @param com
     */
    public DireccionControlador(Comunicador com){
        super(com, Direccion.class);
    }
    
    /**
     * Metódo para realizar la búsqueda de un empleado para verificar si existe
     * la direccion que se va a eliminar.
     * @param id Direccion que se encuentra en la tabla de empleados
     * @return booleano que indica si direccion es utilizado o no
    */
    public boolean buscarEmpleadosByDireccion(int id){
        DataTable empleados = null;
        
        try {
            HashMap<String, Object> condicion = new HashMap<>();
            condicion.put("direccion_id", id);
            
            empleados = Enlace.getPersistencia().get("empleado", null, null,
            condicion);
            
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(DireccionControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (empleados != null && !empleados.isEmpty());
    }
}
