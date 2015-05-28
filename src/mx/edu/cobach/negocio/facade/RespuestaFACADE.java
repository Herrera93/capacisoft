/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Encuesta;
import mx.edu.cobach.persistencia.entidades.Respuesta;

/**
 * Clase de FACADE perteneciente a la tabla Respuesta de la base datos
 */
public class RespuestaFACADE {
    
    /**
     * Metodo para busqueda de una lista de respuesta de un empleado y encuesta.
     * @param empleado Empleado para buscar sus respuestas
     * @param encuesta Encuesta para buscar las respuestas
     * @return Lista de los objetos de las respuestas
     */
    public List<Respuesta> buscarPorEmpleadoEncuesta(Empleado empleado, Encuesta encuesta){
        return ServiceLocator.getRespuesta().buscarPorEmpleadoEncuesta(empleado, encuesta);
    }
}
