/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.dto.DataTable;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.vista.Comunicador;
import persistencia.Enlace;

/**
 *
 * @author fernando
 */
public class DepartamentoControlador extends BaseControlador {

    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     *   
     */
    public DepartamentoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }

    /**
     * Metódo, Utilizado para realizar una búsqueda por nombre de un departamento, 
     * para realizar una consulta o una validación en caso de que el departamento
     * ya esta registrado, los cuales recibe a tráves de sus parametros 
     *
     * @param nombre
     * @param a
     */
    public void buscarPorNombre(String nombre, int a) {
        if (a == 1) {
            HashMap<String, Object> condicion = new HashMap<>();
            condicion.put("nombre LIKE", "%" + nombre + "%");
            
            DataTable departamentos = DataHelper.buscar("departamento", null,
                    null, condicion);
            
            com.setTabla(DataHelper.descomponerRegistros(nombre, departamentos));
        } else {
            HashMap<String, Object> condicion = new HashMap<>();
            condicion.put("nombre LIKE", "%" + nombre + "%");
            
            DataTable departamentos = DataHelper.buscar("departamento", null,
                    null, condicion);
            
            if (departamentos != null && !departamentos.isEmpty()) {
                com.setMensaje("Este departamento ya esta registrado");
            }
        }
    }
    
    /**
     * Metódo, Utilizado para realizar una búsqueda por id de departamento, 
     * para verificar que el departamento a eliminar no tiene asignados empleados 
     * adscrito. 
     * @param id Contiene el id de un departamento
     * @return Booleano que indica si existe un departamento
     */
    public boolean buscarEmpleadosByDepartamento(int id) {
        DataTable empleados = null;
        try {
            empleados = Enlace.getPersistencia()
                    .getEmpleadosByDepartamento(id);
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(DepartamentoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (empleados != null && !empleados.isEmpty());
    }
}
