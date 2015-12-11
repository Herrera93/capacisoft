 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.HashMap;
import modelo.dto.DataTable;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.vista.Comunicador;

/**
 * Clase con los metodos de busqueda especifica en la entidades 
 * y realiza los cambios en la interfaz grafica a traves de la interfaz de 
 * comunicacion Comunicador
 * @author Fernando
 */
public class EventoControlador extends BaseControlador{
   
    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     * @param com
     */
    public EventoControlador(Comunicador com){
        super(com, Evento.class);
    }
    
//    public void buscarEventoPorTipo(int id) {
//        List<Object> o = ServiceLocatorDELEGATE.getEvento().buscarPorTipoEvento(id);
//        com.setTabla(DataHelper.descomponerDataTable(o));
//    }
    
    /**
     * Metodo para buscar un registro especifico a traves de un nombre para validar
     * si existe un curso ya en la base de datos
     * @param nombre Nombre del puesto a buscar
    */
//    public void buscarPorNombre(String nombre){
//        List<Object> list = ServiceLocatorDELEGATE.getEvento().buscarPorNombre(nombre);
//        com.setTabla(DataHelper.descomponerDataTable(list));
//    }
    
    public boolean buscarImplementaciones(int id) {
        System.out.println("Buscando implementaciones de evento!!");
        
        HashMap<String, Object> condicion = new HashMap<>();
        condicion.put("evento_id", id);
        
        DataTable dt = DataHelper.buscar("implementacion_evento", null, null,
                condicion, "id");
        
        return dt != null && dt.getRowCount() > 0;
    }
}
