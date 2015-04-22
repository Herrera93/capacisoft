/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.TipoCurso;

/**
 *
 */
public class HelperEntidad {
    
    public static Puesto getPuesto(List<String> atributos){
        Puesto puesto = new Puesto();
        puesto.setId(Integer.parseInt(atributos.get(0)));
        puesto.setNombre(atributos.get(1)+"");
        return puesto;        
    }
    public static Puesto getPuesto(String atributo){
        return new Puesto(atributo);
    }
    
    public static Curso getCurso(List<String> atributos){
        TipoCurso tc = new TipoCurso();
        tc.setId(Integer.parseInt(atributos.get(0)));
        return new Curso(tc,atributos.get(1),atributos.get(2));
    }
    public static Curso getCurso(List<String> atributos, int id){
        TipoCurso tc = new TipoCurso();
        tc.setId(Integer.parseInt(atributos.get(0)));
        Curso c = new Curso(tc,atributos.get(1),atributos.get(2));
        c.setId(id);
        return c;
    }
    
    public static String[][] descomponerObjeto(Object obj){
        if(obj instanceof Puesto){
            return descomponerPuesto((Puesto) obj);
        }else if(obj instanceof Curso){
            return descomponerCurso((Curso) obj);
        }
        else{
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
        }else if(objs.get(0) instanceof Curso){
            List<Curso> cr = new ArrayList<Curso>();
            for(int i = 0; i < objs.size(); i++){
                cr.add((Curso) objs.get(i));
            }
            return descomponerCursos(cr);
        }else{
            return null;
        }
    }
    
    private static String[][] descomponerPuesto(Puesto p){
        String[][] info = new String[2][1];
        info[0][0] = p.getNombre();
        info[1][0] = p.getId() + "";        
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
    private static String[][] descomponerCurso(Curso curso) {
        String[][] info = new String[5][1];
            info[0][0] = curso.getId() + "";
            info[1][0] = curso.getNombre();
            info[2][0]= curso.getDescripcion();
            info[3][0] = curso.getTipoCurso().toString();
        return info;
    }

    private static String[][] descomponerCursos(List<Curso> cr) {
        String[][] info = new String[cr.size()][2];
        for(int i = 0; i < cr.size(); i++){
            Curso c = cr.get(i);
            info[i][0] = c.getNombre();
            info[i][1] = c.getTipoCurso().toString();
        }
        return info;
    }
}
