package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persitencia.ServiceLocator;
import mx.edu.cobach.vista.controlador.BaseControlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fernando
 */
public class CursoFACADE{

    public List<Object> findTipoCurso(int id) {
        return ServiceLocator.getCurso().findTipoCurso(id);
    }
}
