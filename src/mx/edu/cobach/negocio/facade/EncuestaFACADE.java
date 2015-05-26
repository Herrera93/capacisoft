/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.Encuesta;

/**
 * Clase de FACADE perteneciente a la tabla Encuesta de la base datos
 */
public class EncuestaFACADE {
    
    /**
     * Buscar una encuesta que cuente con un identificador de la encuesta de
     * la pagina JotForm.
     * @param jotformId Identificador de encuesta de la pagina JotForm
     * @return Regresa el objeto de la Encuesta
     */
    public Encuesta burcarPorJotformId(long jotformId){
        return ServiceLocator.getEncuesta().buscarPorJotformId(jotformId);
    }
}
