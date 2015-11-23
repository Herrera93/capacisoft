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

    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     * @param com
     * @param clazz
     */
    public EmpleadoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }    
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del empleado a buscar
    */
    public void buscarPorNombre (String nombre){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado()
                .buscarPorNombre(nombre);
        com.setTabla(HelperEntidad.descomponerObjetos(list));
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param adscripcion Adscripcion  del empleado a buscar
    */
    public void buscarPorAdscripcion (Adscripcion adscripcion){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado().buscarPorAdscripcion(adscripcion);
        com.setTabla(HelperEntidad.descomponerObjetos(list));
    }    
    
    /**
     * Metodo para buscar un registro especifico a traves de su numero de empleado
     * @param numero numero del empleado a validar
    */
    public void validarPorNumero(int numero) {
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado().
                validarPorNumero(numero);
        if (!list.isEmpty()) {
            com.setMensaje("El numero de empleado ya existe");
        }
    }
}
