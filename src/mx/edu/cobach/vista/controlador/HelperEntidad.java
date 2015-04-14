/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Puesto;

/**
 *
 */
public class HelperEntidad {
    
    public static Puesto getPuesto(List<String> atributos){
        return new Puesto(atributos.get(0));        
    }
    
    public static String[][] descomponerObjeto(Object obj){
        if(obj instanceof Puesto){
            return descomponerPuesto((Puesto) obj);
        }else{
            return null;
        }
    }
    
    public static String[][] descomponerObjetos(List<Object> objs){
        if(objs.get(0) instanceof Puesto){
            List<Puesto> ps = new ArrayList<Puesto>();
            for(int i = 0; i < objs.size(); i++){
                ps.add((Puesto) objs.get(i));
            }
            return descomponerPuestos(ps);
        }
        return null;
    }
    
    private static String[][] descomponerPuesto(Puesto p){
        String[][] info = new String[1][1];
        info[0][0] = p.getNombre();
        return info;
    }
    
    private static String[][] descomponerPuestos(List<Puesto> ps){
        String[][] info = new String[ps.size()][1];
        for(int i = 0; i < ps.size(); i++){
            Puesto p = ps.get(i);
            info[i][0] = p.getNombre();
        }
        return info;
    }
}
