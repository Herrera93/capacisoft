/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Proveedor;
import mx.edu.cobach.vista.Comunicador;

public class ProveedorControlador extends BaseControlador{
    public ProveedorControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }
    
    public void buscarPorNombre(String nombre){
       List<Object> list = ServiceLocatorDELEGATE.getProveedorDelegate().findByNombre(nombre);
       com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
    public void altaTelefonos(Object obj){
        ServiceLocatorDELEGATE.getInstance().saveOrUpdate(obj, clazz);
    }
    
    public boolean buscarImplementaciones(int id){
        Proveedor o = (Proveedor) ServiceLocatorDELEGATE.getInstance().find(id, clazz);
        return ServiceLocatorDELEGATE.getImplementarEvento()
            .buscarPorProveedor(o).size() > 0;
    }
}
