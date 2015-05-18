/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author fernando
 */
public class CursoControlador extends BaseControlador{
    
    public CursoControlador(Comunicador com){
        super(com, Curso.class);
    }
    
    public void buscarTipoCurso(int id) {
        List<Object> o = ServiceLocatorDELEGATE.getCurso().findTipoCurso(id);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }
    
    public void buscarPorNombre(String nombre){
        List<Object> o = ServiceLocatorDELEGATE.getCurso().buscarPorNombre(nombre);
        if(!o.isEmpty()){
            com.setMensaje("El Nombre del Curso ya Existe");
        }
    }
}
