/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.vista.Comunicador;
/**
 *
 * @author fernando
 */
public class ReporteControlador extends BaseControlador{
    
    public ReporteControlador(Comunicador com, Class clazz){
        super(com, clazz);
    }
    
    public void buscarPorNombre(String nombre){
        List<Object> list = ServiceLocatorDELEGATE.getReporteDelegate()
                .buscarPorNombre(nombre);
        com.setTabla(HelperEntidad.descomponerObjetos(list, 1));
    }
    
    public void buscarPorNumero(int numero){
        List<Object> list = ServiceLocatorDELEGATE.getReporteDelegate()
                .buscarPorNumero(numero);
        com.setTabla(HelperEntidad.descomponerObjetos(list, 1));
    }
}
