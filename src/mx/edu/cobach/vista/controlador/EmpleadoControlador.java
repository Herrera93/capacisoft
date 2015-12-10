/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import modelo.dto.DataTable;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.vista.Comunicador;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 * @author Fernando
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
     * Metodo para la eliminacion de un empleado, este esta separado de los
     * demas debido a que tiene un llave primaria de cadena.
     * @param id Id de empleado a eliminar
     */
    public void baja(String id){
        String mensaje = ServiceLocatorDELEGATE.getEmpleado().baja(id);
        com.setMensaje(mensaje);
    }
    
    /**
     * Metodo para buscar un empleado especifico a traves de un identificador,
     * este metodo es separado del generico debido a que Empleado tiene una
     * llave primaria de tipo cadena.
     * @param id Identificador del empleado
     */
    public void buscar(String id){
//        Object empleado = ServiceLocatorDELEGATE.getEmpleado().buscar(id);
//        com.setInfo(DataHelper.descomponerRegistro(empleado));
        HashMap<String, Object> condicion = new HashMap<>();
        condicion.put("numero", id);

        DataTable empleado = DataHelper.buscar("empleado", null, null, condicion);
        List<Object> info = new ArrayList();
        empleado.next();
      
        info.add(empleado.getString("numero"));
        info.add(empleado.getString("primer_nombre"));
        info.add(empleado.getString("segundo_nombre"));
        info.add(empleado.getString("apellido_paterno"));
        info.add(empleado.getString("apellido_materno"));
        
        condicion.clear();
        condicion.put("id", empleado.getInt("puesto_id"));
        DataTable auxiliar = DataHelper.buscar("puesto", null, null, condicion);
        info.add(DataHelper.descomponerRegistrosAObjetos("puesto", auxiliar).get(0));
        
        info.add(empleado.getString("correo"));
        
        if(empleado.getObject("plantel_id") != null){
            condicion.clear();
            condicion.put("id", empleado.getInt("plantel_id"));
            auxiliar = DataHelper.buscar("plantel", null, null, condicion);
            info.add(DataHelper.descomponerRegistrosAObjetos("plantel", auxiliar).get(0));
        }else
            info.add(null);
        
        condicion.clear();
        condicion.put("id", empleado.getInt("adscripcion_id"));
        auxiliar = DataHelper.buscar("adscripcion", null, null, condicion);
        info.add(DataHelper.descomponerRegistrosAObjetos("adscripcion", auxiliar).get(0));
        
        if(empleado.getObject("departamento_id") != null){
            condicion.clear();
            condicion.put("id", empleado.getInt("departamento_id"));
            auxiliar = DataHelper.buscar("departamento", null, null, condicion);
            info.add(DataHelper.descomponerRegistrosAObjetos("departamento", auxiliar).get(0));
        }else
            info.add(null);
        
        if(empleado.getObject("direccion_id") != null){
            condicion.clear();
            condicion.put("id", empleado.getInt("direccion_id"));
            auxiliar = DataHelper.buscar("direccion", null, null, condicion);
            info.add(DataHelper.descomponerRegistrosAObjetos("direccion", auxiliar).get(0));
        }else
            info.add(null);
        
        com.setInfo(info);
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param nombre Nombre del empleado a buscar
    */
    public void buscarPorNombre (String nombre){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado()
                .buscarPorNombre(nombre);
        com.setTabla(DataHelper.descomponerRegistros(list));
    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre
     * @param adscripcion Adscripcion  del empleado a buscar
    */
    public void buscarPorAdscripcion (Adscripcion adscripcion){
        List<Object> list = ServiceLocatorDELEGATE.getEmpleado().buscarPorAdscripcion(adscripcion);
        com.setTabla(DataHelper.descomponerRegistros(list));
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

    /**
     * Metodo para validar si el empleado se encuentra asignado a alguna
     * lista de asistencia de una implementacion de evento
     * @param id Numero de empleado
     * @return REgresa el valor de la validacion
     */
    public boolean buscarImplementaciones(String id) {
        return ServiceLocatorDELEGATE.getEmpleado()
                .buscarImplementaciones(id).size() > 0;
    }
    
    
}
