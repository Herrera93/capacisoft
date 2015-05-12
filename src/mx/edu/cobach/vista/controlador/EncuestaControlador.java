/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Aspecto;
import mx.edu.cobach.persistencia.entidades.Competencia;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author Alex
 */
public class EncuestaControlador extends BaseControlador {
    
    public EncuestaControlador(Comunicador comunicador){
        super(comunicador, Aspecto.class);
    }
        
    /**
     * El metodo es utilizado para obtener aquellos aspectos que pertenecezcan
     * a una competencia dada, posterior a obtenerlos los envia a la tabla
     * de la interfaz grafica por medio del comunicador.
     * @param competencia Competencia utilizada para obtener los aspectos
     * relacionados con esta
     */
    public void buscarPorCompetencia(Object competencia){
        setClass(Aspecto.class);
        List<Object> aspectos = ServiceLocatorDELEGATE.getAspecto()
                .buscarPorCompetencia((Competencia) competencia);
        com.setTabla(HelperEntidad.descomponerObjetos(aspectos));
    }
}
