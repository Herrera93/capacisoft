/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
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
                .findByNombre(nombre);
        com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
    public void buscarPorAdscripcion (Adscripcion adscripcion){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado().
                findByAdscripcion(adscripcion);
        com.setTabla(HelperEntidad.descomponerObjetos(list));
    }    
    
    public void buscarPorNumero(int numero){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado().
                buscarPorNumero(numero);
        com.setMensaje("El numero de Empleado ya Existe");
    }
}
