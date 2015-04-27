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
public class CursoControlador {
    //Comunicador con la interfaz grafica
    private final Comunicador com;
    //Clase con la que estara trabajando la base de datos
    private Class clazz;
    
    public CursoControlador(Comunicador com, Class clazz){
        this.clazz=clazz;
        this.com=com;
    }
    
    public void buscarTipoCurso(int id) {
        List<Object> o = ServiceLocatorDELEGATE.getCurso().findTipoCurso(id, clazz);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }
    
    public void buscarId(int id) {
        Object l = ServiceLocatorDELEGATE.getCurso().findId(id, clazz);
        System.out.println(l.toString() + "vete mucho a la !#$!#$$%%#%#");
        com.setInfo(HelperEntidad.descomponerObjeto(l));
    }
    
}
