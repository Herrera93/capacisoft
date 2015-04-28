/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.List;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.TipoCurso;
import org.hibernate.Hibernate;

/**
 *
 */
public class HelperEntidad {
    
    public static Puesto getPuesto(List<String> atributos,String direccion){
        if(direccion.equals("Guardar")){
            Puesto puesto = new Puesto();
            puesto.setNombre(atributos.get(0)+"");
            return puesto;
        }
        else{
            Puesto puesto = new Puesto();
            puesto.setId(Integer.parseInt(atributos.get(0)));
            puesto.setNombre(atributos.get(1)+"");
            return puesto;  
        }
    }
    
    public static Object getEmpleado(List<Object> atributos) {
        Empleado e = new Empleado();
        e.setNumero((String) atributos.get(0));
        e.setPrimerNombre((String) atributos.get(1));
        if(!((String) atributos.get(2)).isEmpty())
            e.setSegundoNombre((String) atributos.get(2));
        e.setApellidoPaterno((String) atributos.get(3));
        e.setApellidoMaterno((String) atributos.get(4));
        e.setPuesto((Puesto) atributos.get(5));
        e.setCorreo((String) atributos.get(6));
        e.setAdscripcion((Adscripcion) atributos.get(7));
        e.setPlantel((Plantel) atributos.get(8));
        e.setDepartamento((Departamento) atributos.get(9));
        if(atributos.size() > 10)
            e.setId((int) atributos.get(10));
        return e;
    }
    
    public static Object getCurso(List<String> atributos){
        TipoCurso tc = new TipoCurso();
        tc.setId(Integer.parseInt(atributos.get(0)));
        return new Curso(tc,atributos.get(1),atributos.get(2));
    }
    
    public static Object getCurso(List<String> atributos, int id){
        TipoCurso tc = new TipoCurso();
        tc.setId(Integer.parseInt(atributos.get(0)));
        Curso c = new Curso(tc,atributos.get(1),atributos.get(2));
        c.setId(id);
        return c;
    }
    
    public static List<Object> descomponerObjeto(Object obj){
        if(obj instanceof Puesto){
            return descomponerPuesto((Puesto) obj);
        }else if(obj instanceof Curso){
            return descomponerCurso((Curso) obj);
        }else if(obj instanceof Empleado){
            return descomponerEmpleado((Empleado) obj);
        }
        else{
            return null;
        }
    }
    
    public static String[][] descomponerObjetos(List<Object> objs){
        if(objs.size() > 0){
            if(objs.get(0) instanceof Puesto){
                List<Puesto> ps = new ArrayList<>();
                for(int i = 0; i < objs.size(); i++){
                    ps.add((Puesto) objs.get(i));
                }
                return descomponerPuestos(ps);
            }else if(objs.get(0) instanceof Empleado){
                List<Empleado> emps = new ArrayList();
                for(int i = 0; i <objs.size(); i++){
                    emps.add((Empleado) objs.get(i));
                }
                return descomponerEmpleados(emps);
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
        return null;
    }
    
    private static List<Object> descomponerPuesto(Puesto p){
        List<Object> info = new ArrayList<>();
        info.add(p.getNombre());
        info.add(p.getId());
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

    private static List<Object> descomponerCurso(Curso curso) {
        List<Object> info = new ArrayList<>();
        info.add(curso.getId());
        info.add(curso.getNombre());
        info.add(curso.getDescripcion());
        info.add(curso.getTipoCurso().toString());
        return info;
    }

    private static String[][] descomponerCursos(List<Curso> cr) {
        String[][] info = new String[cr.size()][3];
        for(int i = 0; i < cr.size(); i++){
            Curso c = cr.get(i);
            info[i][0] = c.getId().toString();
            info[i][1] = c.getNombre();
            info[i][2] = c.getTipoCurso().toString();
        }
        return info;
    }

    private static String[][] descomponerEmpleados(List<Empleado> emps) {
        String[][] info = new String[emps.size()][3];
        for(int i = 0; i < emps.size(); i++){
            Empleado e = emps.get(i);
            info[i][0] = e.getId().toString();
            info[i][1] = e.getNumero();
            info[i][2] = e.getPrimerNombre() + " " + e.getSegundoNombre() + " "
                    + e.getApellidoPaterno() + " " + e.getApellidoMaterno();
        }
        return info;
    }

    private static List<Object> descomponerEmpleado(Empleado empleado) {
        List<Object> info = new ArrayList<>();
        Hibernate.initialize(empleado);
        info.add(empleado.getId());
        info.add(empleado.getNumero());
        info.add(empleado.getPrimerNombre());
        info.add(empleado.getSegundoNombre());
        info.add(empleado.getApellidoPaterno());
        info.add(empleado.getApellidoMaterno());
        info.add(empleado.getCorreo());
        info.add(empleado.getPuesto());
        info.add(empleado.getPlantel());
        info.add(empleado.getAdscripcion());
        info.add(empleado.getDepartamento());
        return info;
    }

}
