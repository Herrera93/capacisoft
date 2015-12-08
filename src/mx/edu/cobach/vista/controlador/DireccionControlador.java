
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.vista.Comunicador;

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
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre de la direccion a buscar
    */
    public void buscar(String nombre) {
        List<Object> o = ServiceLocatorDELEGATE.getDireccion().find(nombre);
        com.setTabla(DataHelper.descomponerRegistros(o));
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un id entero
     * @param id de dirección
    */
    public void buscarMod(int id) {
        Object o = ServiceLocatorDELEGATE.getInstance().find(id, clazz);
        com.setInfo(DataHelper.descomponerRegistro(o));
    }
    
    /**
     * Metódo para realizar la búsqueda de un empleado para verificar si existe
     * la direccion que se va a eliminar.
     * @param id Direccion que se encuentra en la tabla de empleados
     * @return booleano que indica si direccion es utilizado o no
    */
    public boolean buscarEmpleados(int id){
        List<String> atr = new ArrayList();
        atr.add(String.valueOf(id));
        atr.add("");
        return ServiceLocatorDELEGATE.getImplementarEvento()
            .buscarEmPorDireccion(DataHelper.getDireccion(atr, "")).size() > 0;
    }
}
