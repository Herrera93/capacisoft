/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;

/**
 * Esta clase de ImplementacionEventoEnunciadoLogisticaFacade 
 * es utilizada para la tabla ImplementacionEventoEnunciadoLogistica,
 * con la finalidad de ser de comunicacion la base de datos
 * @author liuts
 */
public class ImplementacionEventoEnunciadoLogisticaFACADE{
    /**
     * Metodo que busca la calificacion de un evento especifico
     * @param eventoProgra
     * @return 
     */
    public List<Object> buscarEncuestaPorEvento(ImplementacionEvento eventoProgra) {
        return ServiceLocator.getEnunciadoCali().buscarEncuestaPorEvento(eventoProgra);
    }
}
