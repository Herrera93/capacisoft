/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author fernando
 */
public class DepartamentoControlador extends BaseControlador {

    /**
     * Constructor, inicializa un controlador super de la clase BaseControlador
     *   
     */
    public DepartamentoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }

    /**
     * Metódo, Utilizado para realizar una búsqueda por nombre de un departamento, 
     * para realizar una consulta o una validación en caso de que el departamento
     * ya esta registrado, los cuales recibe a tráves de sus parametros 
     *
     * @param nombre
     * @param a
     */
    public void buscarPorNombre(String nombre, int a) {
        if (a == 1) {
            List<Object> o = ServiceLocatorDELEGATE.getDepartamento().find(nombre);
            com.setTabla(DataHelper.descomponerRegistros(o));
        } else {
            List<Object> o = ServiceLocatorDELEGATE.getDepartamento().find(nombre);
            if (!o.isEmpty()) {
                com.setMensaje("Este departamento ya esta registrado");
            }
        }
    }
    
    /**
     * Metódo, Utilizado para realizar una búsqueda por id de departamento, 
     * para verificar que el departamento a eliminar no tiene asignados empleados 
     * adscrito. 
     * @param id Contiene el id de un departamento
     * @return Booleano que indica si existe un departamento
     */
    public boolean buscarEmpleados(int id) {
//        List<Object> atr = new ArrayList();
//        atr.add("");
//        atr.add(id);
//        return ServiceLocatorDELEGATE.getImplementarEvento()
//            .buscarEmPorDepartamento(HelperEntidad.getDepartamento(atr)).size() > 0;
        return false;
    }
}
