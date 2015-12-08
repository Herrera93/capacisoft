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

public class PlantelControlador extends BaseControlador{
    public PlantelControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }
    
    public void buscarPorNombre(String nombre){
        List<Object> list = ServiceLocatorDELEGATE.getPlantelDelegate().buscarPorNombre(nombre);
       com.setTabla(DataHelper.descomponerRegistros(list));
    }
    
    public boolean buscarEmpleados(int id){
        List<String> atr = new ArrayList();
        for(int i = 0; i < 4; i++){
            atr.add("");
        }
        atr.add("0");
        atr.add(String.valueOf(id));
        //return ServiceLocatorDELEGATE.getImplementarEvento()
        //    .buscarEmPorPlantel(HelperEntidad.getPlantel(atr)).size() > 0;
        return false;
    }
}
