/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.facade;

import java.util.Date;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.persistencia.ServiceLocator;
import mx.edu.cobach.persistencia.entidades.ImplementacionCurso;

/**
 *
 * @author liuts
 */
public class ProgramarFACADE extends BaseFACADE{
    
    /**
     * * Obtiene todas las implementaciones relacionadas de un evento dado.
     * @param evento
     * @return Regresa la lista con las implementaciones
     */
    
    public List<Object> buscarPorEvento(Evento evento) {
        return ServiceLocator.getPrograma().buscarPorEvento(evento);
    }
    /**
     * * Obtiene todas las implementaciones relacionadas de una sede dado.
     * @param sede
     * @return Regresa la lista con las implementaciones
     */
    public List<Object> buscarPorSede(Sede sede) {
        return ServiceLocator.getPrograma().buscarPorSede(sede);
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
    /**
     * Guarda un curso realizado y regresa un id del curso.
     * @param impleEvento
     * @param clazz
     * @return 
     */
    public Object guardarEvento(Object impleEvento, Class clazz) {
        return ServiceLocator.getPrograma().guardarEvento(impleEvento);
    }

    
}

