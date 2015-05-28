/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author Alex
 */
public class EmpleadoControlador extends BaseControlador {

    public EmpleadoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }    
    
    public void buscarPorNombre (String nombre){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado()
                .buscarPorNombre(nombre);
        com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
    public void buscarPorAdscripcion (Adscripcion adscripcion){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado().buscarPorAdscripcion(adscripcion);
        com.setTabla(HelperEntidad.descomponerObjetos(list));
    }    
    
    public void validarPorNumero(int numero) {
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado().
                validarPorNumero(numero);
        if (!list.isEmpty()) {
            com.setMensaje("El numero de empleado ya existe");
        }
    }
}
