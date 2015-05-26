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
 *
 * @author liuts
 */
public class ImplementacionCursoEnunciadoLogisticaFACADE{
    public List<Object> buscarEncuestaPorEvento(ImplementacionEvento eventoProgra) {
        return ServiceLocator.getEnunciadoCali().buscarEncuestaPorEvento(eventoProgra);
    }
}
