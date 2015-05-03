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
import mx.edu.cobach.persistencia.entidades.TipoCuenta;
import mx.edu.cobach.persistencia.entidades.TipoCurso;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.persistencia.entidades.Zona;
import mx.edu.cobach.persistencia.entidades.Enfoque;
import org.hibernate.Hibernate;

/**
 *
 */
public class HelperEntidad {
    
    public static Departamento getDepartamento(List<Object> atributos){
        Enfoque enfoque = new Enfoque();
        enfoque.setId((Integer)atributos.get(0));
        return new Departamento(enfoque, (String)atributos.get(1));
    }
    
    public static Plantel getPlantel(List<Object> atributos){
        Zona zona = new Zona();
        zona.setId((Integer) atributos.get(0));
        Plantel plantel = new Plantel(zona, (String)atributos.get(1), (String)atributos.get(2), 
                (String)atributos.get(3), (String)atributos.get(4));
        return plantel;
    }
    
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
    
    public static Usuario getUsuario(List<String> atributos){
        TipoCuenta t =new TipoCuenta();
        Usuario u= new Usuario();
        
        u.setPrimerNombre(atributos.get(0));
        u.setSegundoNombre(atributos.get(1));
        u.setApellidoPaterno(atributos.get(2));
        u.setApellidoMaterno(atributos.get(3));
        u.setUsuario(atributos.get(4));
            t.setId(Integer.parseInt(atributos.get(5)));
        u.setTipoCuenta(t);
        u.setContrasena(atributos.get(6));
        if(atributos.size() > 7)
            u.setId(Integer.parseInt(atributos.get(7)));
        return u;
    }
    
    public static Object getCurso(List<Object> atributos){
        TipoCurso tc = new TipoCurso();
        tc.setId((Integer) atributos.get(0));
        Curso c = new Curso();
        c.setTipoCurso(tc);
        c.setNombre((String)atributos.get(1));
        c.setDescripcion((String)atributos.get(2));
        if(atributos.size()>3){
            c.setId((Integer) atributos.get(3));
        }
        return  c;
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
            if(obj instanceof Usuario){
              return descomponerUsuario((Usuario)obj);
            }else return null;
        }
    }
    
    public static String[][] descomponerLogin(List<Object> objs){
        if(objs != null && objs.size() > 0){
            if(objs.get(0) instanceof Usuario){
                List<Usuario> us = new ArrayList<>();
                for(int i = 0; i < objs.size(); i++){
                    us.add((Usuario) objs.get(i));
                }
                return descomponerLogins(us);
            }
      
        }  
        return null;
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
                if(objs.get(0) instanceof Usuario){
           // System.out.println("descomponer Objetos 1");
            List<Usuario> us = new ArrayList<Usuario>();
            for(int i = 0; i < objs.size(); i++){
                us.add((Usuario) objs.get(i));
            }
            //System.out.println("Descomponer Objetos 2");
            return descomponerUsuarios(us);
            }else
                return null;
            }
        }
        return null;
    }
    
    private static List<Object> descomponerPuesto(Puesto puesto){
        List<Object> info = new ArrayList<>();
        Hibernate.initialize(puesto);
        info.add(puesto.getNombre());
        info.add(puesto.getId());
        return info;
    }
    
    private static String[][] descomponerPuestos(List<Puesto> ps){
        String[][] info = new String[ps.size()][2];
        for(int i = 0; i < ps.size(); i++){
            Puesto p = ps.get(i);
            info[i][0] = p.getId()+"";
            info[i][1] = p.getNombre();
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
        info.add(empleado.getPuesto());
        info.add(empleado.getCorreo());
        info.add(empleado.getPlantel());
        info.add(empleado.getAdscripcion());
        info.add(empleado.getDepartamento());
        return info;
    }
    
    private static List<Object> descomponerUsuario(Usuario usuario){
        //String[][] info = new String[1][7];
        
        List<Object> info = new ArrayList<>();
        Hibernate.initialize(usuario);
        
        TipoCuenta t;
        info.add(usuario.getPrimerNombre());
        info.add(usuario.getSegundoNombre());
        info.add(usuario.getApellidoPaterno());
        info.add(usuario.getApellidoMaterno());
        t=usuario.getTipoCuenta();
        info.add(usuario.getUsuario());
        info.add(t.getDescripcion());
        
        info.add(usuario.getContrasena());
        System.out.println("descomponer Usuario 2");
        return info;
    }
    
    private static String[][] descomponerUsuarios(List<Usuario> us){
        String[][] info = new String[us.size()][3];
        for(int i = 0; i < us.size(); i++){
            Usuario u = us.get(i);
            TipoCuenta t;
                t=u.getTipoCuenta();
                info[i][0]= String.valueOf(u.getId());
            info[i][1] = u.getUsuario();
            info[i][2] = u.getPrimerNombre();
            if(u.getSegundoNombre()!=null && u.getSegundoNombre().equals("")==false){
                info[i][2] +=" "+ u.getSegundoNombre();}
            info[i][2] +=" "+u.getApellidoPaterno()+" "+u.getApellidoMaterno();
            
            //info[i][2]= "false";
            /*/System.out.println(t.getDescripcion());
            
            info[i][5] = t.getDescripcion();
            info[i][6] = u.getContrasena();*/
        }
        return info;
    }
    
    private static String[][] descomponerLogins(List<Usuario> us){
        String[][] info = new String[us.size()][3];
        for(int i = 0; i < us.size(); i++){
            Usuario u = us.get(i);
            TipoCuenta t;
                t=u.getTipoCuenta();
              //  System.out.println(t.getDescripcion());
            info[i][0] = u.getUsuario();
            info[i][1] = u.getContrasena();
            info[i][2] = t.getDescripcion();
            
            /*/System.out.println(t.getDescripcion());
            
            info[i][5] = t.getDescripcion();
            info[i][6] = u.getContrasena();*/
        }
        return info;
    }

}
