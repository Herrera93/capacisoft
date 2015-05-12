/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

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
}

