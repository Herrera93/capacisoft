/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author fernando
 */
public class EventoControlador extends BaseControlador{
    
    public EventoControlador(Comunicador com){
        super(com, Evento.class);
    }
    
    public void buscarTipoEvento(int id) {
        List<Object> o = ServiceLocatorDELEGATE.getEvento().buscarEvento(id);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }   
}
