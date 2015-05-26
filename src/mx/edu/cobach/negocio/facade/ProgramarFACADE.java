/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.persistencia.ServiceLocator;

/**
 *
 * @author liuts
 */
public class ProgramarFACADE extends BaseFACADE{
    public List<Object> findByCurso(Curso curso) {
        return ServiceLocator.getPrograma().findByCurso(curso);
    }
    public List<Object> findBySede(Sede sede) {
        return ServiceLocator.getPrograma().findBySede(sede);
    }
    
    /**
     * Obtiene todas las implementaciones en un rango de fechas dado.
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorFechas(Date de, Date hasta){
        return ServiceLocator.getPrograma().buscarPorFechas(de, hasta);
    }
}

