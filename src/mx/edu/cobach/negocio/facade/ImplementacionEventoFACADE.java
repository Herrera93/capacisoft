/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Plantel;

/**
 * Esta clase de ImplementacionEventoFacade es utilizada para la tabla
 * ImplementacionEvento,con la finalidad de ser de comunicacion la base de datos
 *
 * @author liuts
 */
public class ImplementacionEventoFACADE extends BaseFACADE {

    /**
     * * Obtiene todas las implementaciones relacionadas de un evento dado.
     *
     * @param evento
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorEvento(Evento evento) {
        return ServiceLocator.getImplementacionEvento().buscarPorEvento(evento);
    }

    /**
     * Obtiene todas las implementaciones de un evento especifico en un rango de
     * fechas dado. Si las fechas no estan inicializadas no se tomaran en
     * cuenta, solo se tomaran las fechas inicializadas, esto significa que se
     * puede dar la fecha 'de' sin dar 'hasta'.
     *
     * @param evento Evento especifico
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarEventoPorFechas(Evento evento, Date de,
            Date hasta) {
        return ServiceLocator.getImplementacionEvento()
                .buscarEventoPorFechas(evento, de, hasta);
    }

    /**
     * Guarda un evento realizado y regresa un id del evento.
     *
     * @param impleEvento
     * @param clazz
     * @return
     */
    public Object guardarEvento(Object impleEvento, Class clazz) {
        return ServiceLocator.getImplementacionEvento().
                guardarEvento(impleEvento);
    }
    /**
     * Este metodo busca todos los eventos de capacitacion que se hagan
     * realido a los empleados de tal departamento
     * @param departamento
     * @return 
     */
    public List<Object> buscarEventosPorDepartamento(Departamento departamento) {
        return ServiceLocator.getImplementacionEvento().
                buscarPorDepartamento(departamento);
    }
    /**
     * Este metodo busca todos los eventos de capacitacion que se hagan
     * realido a los empleados de tal plantel
     * @param plantel
     * @return 
     */
    public List<Object> buscarEventosPorPlantel(Plantel plantel) {
        return ServiceLocator.getImplementacionEvento().
                buscarPorPlantel(plantel);
    }
    
}
