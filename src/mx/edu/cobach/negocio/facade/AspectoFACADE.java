/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Competencia;

/**
 * Clase fachada especifica para la entidad Aspecto con metodos de busquedas
 * especificas de la entidad.
 */
public class AspectoFACADE {
    
    public AspectoFACADE(){        
    }
    
    /**
     * Metodo para la busqueda de aspectos con una competencia respectiva.
     * @param competencia Competencia utilizada para identificar los aspectos
     * @return Regresa una lista de objetos con los aspectos encontrados
     */
    public List<Object> buscarPorCompetencia(Competencia competencia){
        List<Object> aspectos;
        aspectos = ServiceLocator.getAspecto().buscarPorCompetencia(competencia);
        return aspectos;
    }
}
