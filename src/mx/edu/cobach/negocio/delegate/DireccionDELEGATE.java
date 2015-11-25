
package mx.edu.cobach.negocio.delegate;

import java.util.List;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;

public class DireccionDELEGATE {
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre de direccion a buscar
     * @return lista de objetos con la información de puesto
    */
    public List<Object> find(String nombre) {
        return ServiceLocatorFACADE.getDireccion().find(nombre);
    }
}
