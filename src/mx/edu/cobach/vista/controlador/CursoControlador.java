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
    
    public void buscar(int id) {
        List<Object> o = ServiceLocatorDELEGATE.getCurso().findTipoCurso(id, clazz);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }
    public void buscarNombre(String nombre) {
        List<Object> l = ServiceLocatorDELEGATE.getCurso().findNombre(nombre, clazz);
        Object o = l.get(0);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }
    
}
