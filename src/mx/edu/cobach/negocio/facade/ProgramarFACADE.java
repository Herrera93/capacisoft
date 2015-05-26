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
     * Obtiene todas las implementaciones de un curso especifico en un rango
     * de fechas dado. Si las fechas no estan inicializadas no se tomaran en 
     * cuenta, solo se tomaran las fechas inicializadas, esto significa que 
     * se puede dar la fecha 'de' sin dar 'hasta'.
     * @param curso Curso especifico 
     * @param de Fecha inicio de rango
     * @param hasta Fecha final de rango
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarCursoPorFechas(Curso curso, Date de, Date hasta){
        return ServiceLocator.getPrograma().buscarCursoPorFechas(curso, de, hasta);
    }
}

