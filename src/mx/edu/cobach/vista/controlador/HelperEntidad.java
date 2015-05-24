 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Aspecto;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Encuesta;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.TipoCuenta;
import mx.edu.cobach.persistencia.entidades.TipoEvento;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.persistencia.entidades.Zona;
import mx.edu.cobach.persistencia.entidades.Enfoque;
import mx.edu.cobach.persistencia.entidades.EnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.ImplementacionCurso;
import mx.edu.cobach.persistencia.entidades.ImplementacionCursoEnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.Municipio;
import mx.edu.cobach.persistencia.entidades.Proveedor;
import mx.edu.cobach.persistencia.entidades.Sede;
import org.hibernate.Hibernate;

/**
 *
 */
public class HelperEntidad {
    
    //Obtencion de entidades
    
    public static ImplementacionCursoEnunciadoLogistica getEnunciado
        (List<Object> atributos){
        ImplementacionCursoEnunciadoLogistica enunciado
                = new ImplementacionCursoEnunciadoLogistica();
        enunciado.setEnunciadoLogistica((EnunciadoLogistica) atributos.get(0));
        enunciado.setCalificacion((int) atributos.get(1));
        enunciado.setImplementacionCurso((ImplementacionCurso) atributos.get(2));
        return enunciado;
    }
    
    
    public static Departamento getDepartamento(List<Object> atributos){
        Enfoque enfoque = new Enfoque();
        enfoque.setId((Integer)atributos.get(0));
        Departamento depto = new Departamento();
        depto.setEnfoque(enfoque);
        depto.setNombre((String)atributos.get(1));
        if(atributos.size()>2){
            depto.setId((Integer) atributos.get(2));
        }
        return depto;
    }
    
    public static ImplementacionCurso getProgramar(List<Object> atributos,
            String direccion) {
        ImplementacionCurso implementaCurso = new ImplementacionCurso();
        if (direccion.equals("Guardar")) {
            implementaCurso.setCurso((Evento) atributos.get(0));
            implementaCurso.setFechaInicial((Date) atributos.get(1));
            implementaCurso.setFechaFinal((Date) atributos.get(2));
            implementaCurso.setActivo((boolean) atributos.get(3));
            implementaCurso.setSede((Sede) atributos.get(4));
            implementaCurso.setProveedor((Proveedor) atributos.get(5));
            implementaCurso.setEmpleados((Set<Empleado>) atributos.get(6));
            return implementaCurso;
        } else if (direccion.equals("Modificar")) {
            implementaCurso.setId(Integer.parseInt(atributos.get(0).toString()));
            implementaCurso.setCurso((Evento) atributos.get(1));
            implementaCurso.setFechaInicial((Date) atributos.get(2));
            implementaCurso.setFechaFinal((Date) atributos.get(3));
            implementaCurso.setActivo((boolean) atributos.get(4));
            implementaCurso.setSede((Sede) atributos.get(5));
            implementaCurso.setProveedor((Proveedor) atributos.get(6));
            implementaCurso.setEmpleados((Set<Empleado>) atributos.get(7));
            return implementaCurso;
        }
        return null;
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
    
    public static Sede getSede(List<String> atributos){
        Sede s= new Sede();
        Municipio m =new Municipio();  
        s.setNombre(atributos.get(0));
        m.setId(Integer.parseInt(atributos.get(1)));
        s.setMunicipio(m);
        s.setColonia(atributos.get(2));
        s.setCalle(atributos.get(3));
        s.setNumeroDireccion(atributos.get(4));
        s.setCapacidad(Integer.parseInt(atributos.get(5)));
        
        if(atributos.size() >6)
            s.setId(Integer.parseInt(atributos.get(6)));
        return s;
    }
    
    public static Object getCurso(List<Object> atributos){
        TipoEvento tc = new TipoEvento();
        tc.setId((Integer) atributos.get(0));
        Evento c = new Evento();
        c.setTipoCurso(tc);
        c.setNombre((String)atributos.get(1));
        c.setDescripcion((String)atributos.get(2));
        if(atributos.size()>3){
            c.setId((Integer) atributos.get(3));
        }
        return  c;
    }
    
    //Descomposicion de un solo objeto
        
    public static List<Object> descomponerObjeto(Object obj){
        if(obj instanceof Puesto){
            return descomponerPuesto((Puesto) obj);
        }else if(obj instanceof Evento){
            return descomponerCurso((Evento) obj);
        }else if(obj instanceof Empleado){
            return descomponerEmpleado((Empleado) obj);
        }else if(obj instanceof Usuario){
              return descomponerUsuario((Usuario)obj);
        }else if(obj instanceof Departamento){
              return descomponerDepartamento((Departamento)obj);
        }else if(obj instanceof Sede){
              return descomponerSede((Sede)obj);
        }else if(obj instanceof ImplementacionCurso){
              return descomponerProCurso((ImplementacionCurso)obj);
        }
        else{
            return null;
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
    
    private static List<Object> descomponerDepartamento
        (Departamento departamento){
            List<Object> info = new ArrayList<>();
            info.add(departamento.getId());
            info.add(departamento.getNombre());
            info.add(departamento.getEnfoque().toString());
            return info;
        }
    private static List<Object> descomponerPuesto(Puesto puesto){
        List<Object> info = new ArrayList<>();
        info.add(puesto.getNombre());
        info.add(puesto.getId());
        return info;
    }
    
    private static List<Object> descomponerCurso(Evento curso) {
        List<Object> info = new ArrayList<>();
        info.add(curso.getId());
        info.add(curso.getNombre());
        info.add(curso.getDescripcion());
        info.add(curso.getTipoCurso().toString());
        return info;
    }
    
    private static List<Object> descomponerEmpleado(Empleado empleado) {
        List<Object> info = new ArrayList<>();
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
        List<Object> info = new ArrayList<>();
        TipoCuenta t;
        info.add(usuario.getPrimerNombre());
        info.add(usuario.getSegundoNombre());
        info.add(usuario.getApellidoPaterno());
        info.add(usuario.getApellidoMaterno());
        t=usuario.getTipoCuenta();
        info.add(usuario.getUsuario());
        info.add(t.getDescripcion());        
        info.add(usuario.getContrasena());
        return info;
    }
    
    private static List<Object> descomponerProCurso(ImplementacionCurso cu) {
        List<Object> info = new ArrayList<>();
        Evento curso = cu.getCurso();
        TipoEvento tipocurso = curso.getTipoCurso();
        info.add(cu.getId());
        info.add(cu.getCurso());
        info.add(curso.getNombre());
        info.add(curso.getDescripcion());
        info.add(tipocurso.toString());
        info.add(cu.getFechaInicial());
        info.add(cu.getFechaFinal());
        info.add(cu.getSede());
        info.add(cu.getProveedor());
        info.add(cu.getEmpleados());
        return info;
    }
    
    //Descomposicion de lista de objetos
    
    public static String[][] descomponerObjetos(List<Object> objetos){
        if(objetos.size() > 0){
            if(objetos.get(0) instanceof Puesto){
                List<Puesto> ps = new ArrayList<>();
                for(int i = 0; i < objetos.size(); i++){
                    ps.add((Puesto) objetos.get(i));
                }
                return descomponerPuestos(ps);
            }else if(objetos.get(0) instanceof Empleado){
                List<Empleado> emps = new ArrayList();
                for(int i = 0; i <objetos.size(); i++){
                    emps.add((Empleado) objetos.get(i));
                }
                return descomponerEmpleados(emps);
            }else if(objetos.get(0) instanceof Evento){
                List<Evento> cr = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    cr.add((Evento) objetos.get(i));
                }
                return descomponerCursos(cr);
            }else if(objetos.get(0) instanceof Usuario){
                List<Usuario> us = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    us.add((Usuario) objetos.get(i));
                }
                return descomponerUsuarios(us);
            }else if(objetos.get(0) instanceof Departamento){
                List<Departamento> dp = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                dp.add((Departamento) objetos.get(i));
                }   
                return descomponerDepartamentos(dp);
            }else if(objetos.get(0) instanceof Sede){
                List<Sede> se = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    se.add((Sede) objetos.get(i));
                }
                return descomponerSedes(se);
            }else if(objetos.get(0) instanceof Aspecto){
                List<Aspecto> aspectos = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    aspectos.add((Aspecto) objetos.get(i));
                }
                return descomponerAspectos(aspectos);
            }else if(objetos.get(0) instanceof EnunciadoLogistica){
                List<EnunciadoLogistica> enunciado = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    enunciado.add((EnunciadoLogistica) objetos.get(i));
                }
                return descomponerEnunciados(enunciado);
            }else if(objetos.get(0) instanceof ImplementacionCurso){
                List<ImplementacionCurso> programar = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    programar.add((ImplementacionCurso) objetos.get(i));
                }
                return descomponerProEventos(programar);
            }else if(objetos.get(0) instanceof ImplementacionCursoEnunciadoLogistica){
                List<ImplementacionCursoEnunciadoLogistica> calificacion = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    calificacion.add((ImplementacionCursoEnunciadoLogistica) objetos.get(i));
                }
                return descomponerCalificacion(calificacion);
            }
        }
        return null;
    }
    
    private static String[][] descomponerDepartamentos(List<Departamento> dp){
        String[][] info = new String[dp.size()][3];
        for(int i = 0; i < dp.size(); i++){
            Departamento d = dp.get(i);
            info[i][0] = d.getId() + "";
            info[i][1] = d.getNombre();
            info[i][2] = d.getEnfoque().toString();
        }
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
    
    private static String[][] descomponerCursos(List<Evento> cr) {
        String[][] info = new String[cr.size()][3];
        for(int i = 0; i < cr.size(); i++){
            Evento c = cr.get(i);
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
    
    
    private static String[][] descomponerUsuarios(List<Usuario> us){
        String[][] info = new String[us.size()][3];
        for(int i = 0; i < us.size(); i++){
            Usuario u = us.get(i);
            TipoCuenta t;
            t = u.getTipoCuenta();
            info[i][0] = String.valueOf(u.getId());
            info[i][1] = u.getUsuario();
            info[i][2] = u.getPrimerNombre();
            if(u.getSegundoNombre() != null && 
                    u.getSegundoNombre().equals("") == false){
                info[i][2] += " " + u.getSegundoNombre();
            }
            info[i][2] += " " + u.getApellidoPaterno() + " " + u.getApellidoMaterno();
        }
        return info;
    }
    
     private static List<Object> descomponerSede(Sede sede){
        List<Object> info = new ArrayList<>();        
        Municipio m;
        info.add(sede.getNombre());
        m=sede.getMunicipio();
        info.add(m.getNombre());
        info.add(sede.getColonia());
        info.add(sede.getCalle());
        info.add(sede.getNumeroDireccion());
        info.add(sede.getCapacidad());
        return info;
    }
    
    private static String[][] descomponerSedes(List<Sede> se){
        String[][] info = new String[se.size()][2];
        for(int i = 0; i < se.size(); i++){
            Sede s = se.get(i);
            info[i][0] = String.valueOf(s.getId());
            info[i][1] = s.getNombre();
        }
        return info;
        
    }
    
    private static String[][] descomponerLogins(List<Usuario> us){
        String[][] info = new String[us.size()][3];
        for(int i = 0; i < us.size(); i++){
            Usuario u = us.get(i);
            TipoCuenta t;
            t=u.getTipoCuenta();
            info[i][0] = u.getUsuario();
            info[i][1] = u.getContrasena();
            info[i][2] = t.getDescripcion();
        }
        return info;
    }

    private static String[][] descomponerAspectos(List<Aspecto> aspectos){
        String[][] info = new String[aspectos.size()][2];
        for(int i = 0; i < aspectos.size(); i++){
            Aspecto aspecto = aspectos.get(i);
            info[i][0] = String.valueOf(aspecto.getId());
            info[i][1] = aspecto.getAspecto();
        }
        return info;
    }
    
    private static String[][] descomponerProEventos
        (List<ImplementacionCurso> eventoImplementado) {
        String[][] info = new String[eventoImplementado.size()][4];
        for (int i = 0; i < eventoImplementado.size(); i++) {
            ImplementacionCurso eventoImp = eventoImplementado.get(i);
            info[i][0] = eventoImp.getId().toString();
            info[i][1] = eventoImp.getFechaInicial().toString();
            info[i][2] = eventoImp.getCurso().toString();
            if(eventoImp.isActivo()==true){
                info[i][3] = "Activo";
            }else{
                info[i][3] = "Finalizado";
            }       
        }
        return info;
    }
    
    
    
    private static String[][] descomponerEnunciados
        (List<EnunciadoLogistica> enunciado) {
        String[][] info = new String[enunciado.size()][3];
        for (int i = 0; i < enunciado.size(); i++) {
            EnunciadoLogistica enunciadoLogistica = enunciado.get(i);
            info[i][0] = enunciadoLogistica.getId().toString();
            info[i][1] = enunciadoLogistica.getDescripcion();
            info[i][2] = enunciadoLogistica.getTipoEnunciado().toString();
        }
        return info;
    }
    private static String[][] descomponerCalificacion
        (List<ImplementacionCursoEnunciadoLogistica> enunciado) {
        String[][] info = new String[enunciado.size()][4];
        for (int i = 0; i < enunciado.size(); i++) {
            ImplementacionCursoEnunciadoLogistica calificacionEvento = enunciado.get(i);
            
            info[i][0] = calificacionEvento.getId().toString();
            info[i][3] = calificacionEvento.getCalificacion()+"";

        }
        return info;
    }
}
