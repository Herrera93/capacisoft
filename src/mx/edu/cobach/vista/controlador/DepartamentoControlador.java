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

    public DepartamentoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }

    public void buscarPorNombre(String nombre, int a) {
        if (a == 1) {
            List<Object> o = ServiceLocatorDELEGATE.getDepartamento().find(nombre);
            com.setTabla(HelperEntidad.descomponerObjetos(o));
        } else {
            List<Object> o = ServiceLocatorDELEGATE.getDepartamento().find(nombre);
            if(!o.isEmpty()){
                com.setMensaje("Este departamento ya esta registrado");
            }
        }
    }
    
    public boolean buscarEmpleados(int id){
        List<Object> atr = new ArrayList();
        atr.add("");
        atr.add(id);
        return ServiceLocatorDELEGATE.getImplementarEvento()
            .buscarEmPorDepartamento(HelperEntidad.getDepartamento(atr)) != null;
    }
}
