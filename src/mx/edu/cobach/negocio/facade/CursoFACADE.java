package mx.edu.cobach.negocio.facade;

import java.util.List;
import mx.edu.cobach.persitencia.ServiceLocator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fernando
 */
public class CursoFACADE {
    public CursoFACADE(){
        
    }
    
    public List<Object> findTipoCurso(int id, Class clazz) {
        ServiceLocator.getCurso().setEntity(clazz);
        return ServiceLocator.getCurso().findTipoCurso(id);
    }
    
    public List<Object> findNombre(String nombre, Class clazz){
        ServiceLocator.getCurso().setEntity(clazz);
        return ServiceLocator.getCurso().findNombre(nombre);
    }
}
