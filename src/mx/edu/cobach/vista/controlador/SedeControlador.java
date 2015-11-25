/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author SALB
 */
public class SedeControlador extends BaseControlador{
    public SedeControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }
    
    public void buscarPorNombre(String nombre){
        List<Object> list = ServiceLocatorDELEGATE.getSede().findByNombre(nombre);
       com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
    public boolean buscarImplementaciones(int id){
        Sede o = (Sede) ServiceLocatorDELEGATE.getInstance().find(id, clazz);
        return ServiceLocatorDELEGATE.getImplementarEvento()
            .buscarEventosPorSede(o).size() > 0;
    }
}
