 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Aspecto;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.TipoCuenta;
import mx.edu.cobach.persistencia.entidades.TipoEvento;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.persistencia.entidades.Zona;
import mx.edu.cobach.persistencia.entidades.EnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEventoEnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.Municipio;
import mx.edu.cobach.persistencia.entidades.Proveedor;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.persistencia.entidades.TipoProveedor;
import mx.edu.cobach.persistencia.entidades.Alerta;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.persistencia.entidades.Puesto;

/**
 *
 */
public class HelperEntidad {
    
    //Obtencion de entidades
    
    public static ImplementacionEventoEnunciadoLogistica getEnunciado
        (List<Object> atributos){
        ImplementacionEventoEnunciadoLogistica enunciado
                = new ImplementacionEventoEnunciadoLogistica();
        enunciado.setEnunciadoLogistica((EnunciadoLogistica) atributos.get(0));
        enunciado.setCalificacion((int) atributos.get(1));
        enunciado.setImplementacionEvento((ImplementacionEvento) atributos.get(2));
        return enunciado;
    }
    
    
    public static Departamento getDepartamento(List<Object> atributos){
        Departamento depto = new Departamento();
        depto.setNombre((String) atributos.get(0));
        if (atributos.size() > 1) {
            depto.setId((Integer) atributos.get(1));
        }
        return depto;
    }
    
    /**
     * getPlantel
     * @param List<String> atributos
     * @return Plantel
     */
    public static Plantel getPlantel(List<String> atributos){
        Plantel plantel= new Plantel();
        Zona z =new Zona();
        plantel.setNombre(atributos.get(0));
        plantel.setCalle(atributos.get(1));
        plantel.setColonia(atributos.get(2));
        plantel.setNumeroDireccion(atributos.get(3));
        z.setId(Integer.parseInt(atributos.get(4)));
        plantel.setZona(z);
        if(atributos.size() >5)
            plantel.setId(Integer.parseInt(atributos.get(5)));
        return plantel;
    }
    
    /**
     * getProveedor
     * @param List<String> atributos
     * @return Proveedor
     */
    public static Proveedor getProveedor(List<Object> atributos){
        Proveedor p= new Proveedor();
        TipoProveedor t =new TipoProveedor();
        p.setPrimerNombre(atributos.get(0).toString());
        p.setSegundoNombre(atributos.get(1).toString());
        p.setApellidoPaterno(atributos.get(2).toString());
        p.setApellidoMaterno(atributos.get(3).toString());
        p.setCorreoElectronico(atributos.get(4).toString());
        p.setTelefono(atributos.get(5).toString());
        t.setId(Integer.parseInt(atributos.get(6).toString()));
        p.setTipoProveedor(t);
        p.setEventos((Set<Evento>)atributos.get(7));
        if(atributos.size() >8)
            p.setId(Integer.parseInt(atributos.get(8).toString()));
        return p;
    }
    
    public static ImplementacionEvento getImplementarEvento(List<Object> atributos,
            String direccion) {
        ImplementacionEvento implementaEvento = new ImplementacionEvento();
        if (direccion.equals("Guardar")) {
            implementaEvento.setEvento((Evento) atributos.get(0));
            implementaEvento.setFechaInicial((Date) atributos.get(1));
            implementaEvento.setFechaFinal((Date) atributos.get(2));
            implementaEvento.setActivo((boolean) atributos.get(3));
            implementaEvento.setSede((Sede) atributos.get(4));
            implementaEvento.setProveedor((Proveedor) atributos.get(5));
            implementaEvento.setEmpleados((Set<Empleado>) atributos.get(6));
            return implementaEvento;
        } else if (direccion.equals("Modificar")) {
            implementaEvento.setId(Integer.parseInt(atributos.get(0).toString()));
            implementaEvento.setEvento((Evento) atributos.get(1));
            implementaEvento.setFechaInicial((Date) atributos.get(2));
            implementaEvento.setFechaFinal((Date) atributos.get(3));
            implementaEvento.setActivo((boolean) atributos.get(4));
            implementaEvento.setSede((Sede) atributos.get(5));
            implementaEvento.setProveedor((Proveedor) atributos.get(6));
            implementaEvento.setEmpleados((Set<Empleado>) atributos.get(7));
            return implementaEvento;
        }
        return null;
    }

    public static Puesto getPuesto(List<String> atributos, String direccion) {
        if (direccion.equals("Guardar")) {
            Puesto puesto = new Puesto();
            puesto.setNombre(atributos.get(0) + "");
            return puesto;
        } else {
            Puesto puesto = new Puesto();
            puesto.setId(Integer.parseInt(atributos.get(0)));
            puesto.setNombre(atributos.get(1) + "");
            return puesto;
        }
    }
    
    public static Direccion getDireccion(List<String> atributos, String opcion) {
        if (opcion.equals("Guardar")) {
            Direccion direccion = new Direccion();
            direccion.setNombre(atributos.get(0) + "");
            return direccion;
        } else {
            Direccion direccion = new Direccion();
            direccion.setId(Integer.parseInt(atributos.get(0)));
            direccion.setNombre(atributos.get(1) + "");
            return direccion;
        }
    }

    public static Object getEmpleado(List<Object> atributos) {
        Empleado e = new Empleado();
        e.setNumero((String) atributos.get(0));
        e.setPrimerNombre((String) atributos.get(1));
        if (!((String) atributos.get(2)).isEmpty()) {
            e.setSegundoNombre((String) atributos.get(2));
        }
        e.setApellidoPaterno((String) atributos.get(3));
        e.setApellidoMaterno((String) atributos.get(4));
        e.setPuesto((Puesto) atributos.get(5));
        e.setCorreo((String) atributos.get(6));
        e.setAdscripcion((Adscripcion) atributos.get(7));
        Adscripcion ads = ((Adscripcion) atributos.get(7)); 
        System.out.println(ads.getDescripcion());
        if(ads.getDescripcion().equalsIgnoreCase("Plantel")){
            e.setPlantel((Plantel) atributos.get(8));
        }else if (ads.getDescripcion().equalsIgnoreCase("departamento")){
            e.setDepartamento((Departamento) atributos.get(9));
        }else{
            e.setDireccion((Direccion) atributos.get(10));
        }
        return e;
    }

    public static Usuario getUsuario(List<String> atributos) {
        TipoCuenta t = new TipoCuenta();
        Usuario u = new Usuario();

        
        u.setPrimerNombre(atributos.get(0));
        u.setSegundoNombre(atributos.get(1));
        u.setApellidoPaterno(atributos.get(2));
        u.setApellidoMaterno(atributos.get(3));
        u.setUsuario(atributos.get(4));
        t.setId(Integer.parseInt(atributos.get(5)));
        u.setTipoCuenta(t);
        u.setContrasena(atributos.get(6));
        if (atributos.size() > 7) {
            u.setId(Integer.parseInt(atributos.get(7)));
        }
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
        s.setLugar(atributos.get(6));
        
        if(atributos.size() > 7)
            s.setId(Integer.parseInt(atributos.get(7)));
        return s;
    }

    public static Object getEvento(List<Object> atributos) {
        TipoEvento tc = new TipoEvento();
        tc.setId((Integer) atributos.get(0));
        Evento c = new Evento();
        c.setTipoEvento(tc);
        c.setNombre((String)atributos.get(1));
        c.setDescripcion((String)atributos.get(2));
        if(atributos.size()>3){
            c.setId((Integer) atributos.get(3));
        }
        return c;
    }
    
    //Descomposicion de un solo objeto
        
    public static List<Object> descomponerObjeto(Object obj){
        if(obj instanceof Puesto){
            return descomponerPuesto((Puesto) obj);
        } else if (obj instanceof Evento) {
            return descomponerEvento((Evento) obj);
        } else if (obj instanceof Empleado) {
            return descomponerEmpleado((Empleado) obj);
        }else if(obj instanceof Usuario){
              return descomponerUsuario((Usuario)obj);
        }else if(obj instanceof Departamento){
              return descomponerDepartamento((Departamento)obj);
        }else if(obj instanceof Sede){
              return descomponerSede((Sede)obj);
        }else if(obj instanceof ImplementacionEvento){
              return descomponerProEvento((ImplementacionEvento)obj);
        }else if(obj instanceof Proveedor){
              return descomponerProveedor((Proveedor)obj);
        }else if(obj instanceof Plantel){
              return descomponerPlantel((Plantel)obj);
        }else if(obj instanceof Alerta){
            return descomponerAlerta((Alerta) obj);
        }else if(obj instanceof Direccion){
            return descomponerDireccion((Direccion) obj);
        }        
        else{
            return null;
        }
    }

    public static String[][] descomponerLogin(List<Object> objs) {
        if (objs != null && objs.size() > 0) {
            if (objs.get(0) instanceof Usuario) {
                List<Usuario> us = new ArrayList<>();
                for (int i = 0; i < objs.size(); i++) {
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
        return info;
    }

    private static List<Object> descomponerPuesto(Puesto puesto){
        List<Object> info = new ArrayList<>();
        info.add(puesto.getNombre());
        info.add(puesto.getId());
        return info;
    }
    
    private static List<Object> descomponerDireccion(Direccion direccion){
        List<Object> info = new ArrayList<>();
        info.add(direccion.getNombre());
        info.add(direccion.getId());
        return info;
    }
    
    private static List<Object> descomponerEvento(Evento evento) {
        List<Object> info = new ArrayList<>();
        info.add(evento.getId());
        info.add(evento.getNombre());
        info.add(evento.getDescripcion());
        info.add(evento.getTipoEvento().toString());
        return info;
    }
    
    private static List<Object> descomponerEmpleado(Empleado empleado) {
        List<Object> info = new ArrayList<>();
        System.out.println(empleado.getPrimerNombre());
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
        info.add(empleado.getDireccion());
        return info;
    }
    
    private static List<Object> descomponerUsuario(Usuario usuario){
        List<Object> info = new ArrayList<>();
        TipoCuenta t;
        info.add(usuario.getPrimerNombre());
        info.add(usuario.getSegundoNombre());
        info.add(usuario.getApellidoPaterno());
        info.add(usuario.getApellidoMaterno());
        t = usuario.getTipoCuenta();
        info.add(usuario.getUsuario());
        info.add(t.getDescripcion());
        info.add(usuario.getContrasena());
        return info;
    }
    
    private static List<Object> descomponerProEvento(ImplementacionEvento
            eventoImplementado) {
        List<Object> info = new ArrayList<>();
        Evento evento = eventoImplementado.getEvento();
        TipoEvento tipoEvento = evento.getTipoEvento();
        
        info.add(eventoImplementado.getId());
        info.add(eventoImplementado.getEvento());
        info.add(evento.getNombre());
        info.add(evento.getDescripcion());
        info.add(tipoEvento.toString());
        info.add(eventoImplementado.getFechaInicial());
        info.add(eventoImplementado.getFechaFinal());
        info.add(eventoImplementado.getSede());
        info.add(eventoImplementado.getProveedor());
        info.add(eventoImplementado.getEmpleados());
        return info;
    }
    
    private static List<Object> descomponerAlerta(Alerta alerta){
        List<Object> info = new ArrayList();
        info.add(alerta.getId());
        info.add(alerta.getPeriodo());
        info.add(alerta.getDescripcion());
        info.add(alerta.getImplementacionEventos());
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
                return descomponerEventos(cr);
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
            }else if(objetos.get(0) instanceof ImplementacionEvento){
                List<ImplementacionEvento> eventoImplementado = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    eventoImplementado.
                            add((ImplementacionEvento) objetos.get(i));
                }
                return descomponerProEventos(eventoImplementado);
            }else if(objetos.get(0) instanceof ImplementacionEventoEnunciadoLogistica){
                List<ImplementacionEventoEnunciadoLogistica> calificacion = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    calificacion.add((ImplementacionEventoEnunciadoLogistica) objetos.get(i));
                }
                return descomponerCalificacion(calificacion);
            }else if(objetos.get(0) instanceof Proveedor){
                List<Proveedor> pr = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    pr.add((Proveedor) objetos.get(i));
                }
                return descomponerProveedores(pr);
            }else if(objetos.get(0) instanceof Plantel){
                List<Plantel> pl = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    pl.add((Plantel) objetos.get(i));
                }
                return descomponerPlanteles(pl);
            }else if(objetos.get(0) instanceof Direccion){
                List<Direccion> di = new ArrayList();
                for(int i = 0; i < objetos.size(); i++){
                    di.add((Direccion) objetos.get(i));
                }
                return descomponerDirecciones(di);
            }
        }
        return null;
    }
    
    /**
     * descomponerProveedor
     * @param proveedor
     * @return 
     */
    private static List<Object> descomponerProveedor(Proveedor proveedor){
        List<Object> info = new ArrayList<>();        
        TipoProveedor m;
        info.add(proveedor.getPrimerNombre());
        info.add(proveedor.getSegundoNombre());
        info.add(proveedor.getApellidoPaterno());
        info.add(proveedor.getApellidoMaterno());
        info.add(proveedor.getCorreoElectronico());
        m = proveedor.getTipoProveedor();
        info.add(m.getDescripcion());
        info.add(proveedor.getEventos());
        info.add(proveedor.getTelefono());
        return info;
    }
    
    /**
     * descomponerProveedores
     * @param pr
     * @return 
     */
    private static String[][] descomponerProveedores(List<Proveedor> pr){
        String[][] info = new String[pr.size()][2];
        for(int i = 0; i < pr.size(); i++){
            Proveedor p = pr.get(i);
            info[i][0] = String.valueOf(p.getId());
            info[i][1] = p.getPrimerNombre();
            if(p.getSegundoNombre() != null)
                info[i][1] +=" "+p.getSegundoNombre();
            info[i][1] +=" "+p.getApellidoPaterno();
            info[i][1] +=" "+p.getApellidoMaterno();
        }
        return info;
    }
    
    /**
     * 
     * @param plantel
     * @return 
     */
    private static List<Object> descomponerPlantel(Plantel plantel){
        List<Object> info = new ArrayList<>();        
        Zona z;
        info.add(plantel.getNombre());
        info.add(plantel.getCalle());
        info.add(plantel.getColonia());
        info.add(plantel.getNumeroDireccion());
        z=plantel.getZona();
        info.add(z.getNombre());
        return info;
    }
    
    /**
     * 
     * @param pl
     * @return 
     */
    private static String[][] descomponerPlanteles(List<Plantel> pl){
        String[][] info = new String[pl.size()][3];
        for(int i = 0; i < pl.size(); i++){
            Plantel p = pl.get(i);
            info[i][0] = String.valueOf(p.getId());
            info[i][1] = p.getNombre();
            info[i][2] =p.getCalle()+" ";
            info[i][2] +=p.getColonia()+" ";
            info[i][2] +=p.getNumeroDireccion();
        }
        return info;
    }
    
    private static String[][] descomponerDepartamentos(List<Departamento> dp){
        String[][] info = new String[dp.size()][3];
        for(int i = 0; i < dp.size(); i++){
            Departamento d = dp.get(i);
            info[i][0] = d.getId() + "";
            info[i][1] = d.getNombre();
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
    
    private static String[][] descomponerDirecciones(List<Direccion> di){
        String[][] info = new String[di.size()][2];
        for(int i = 0; i < di.size(); i++){
            Direccion d = di.get(i);
            info[i][0] = d.getId()+"";
            info[i][1] = d.getNombre();
        }
        return info;
    }
    
    private static String[][] descomponerEventos(List<Evento> cr) {
        String[][] info = new String[cr.size()][3];
        for(int i = 0; i < cr.size(); i++){
            Evento c = cr.get(i);
            info[i][0] = c.getId().toString();
            info[i][1] = c.getNombre();
            info[i][2] = c.getTipoEvento().toString();
        }
        return info;
    }

    private static String[][] descomponerEmpleados(List<Empleado> emps) {
        String[][] info = new String[emps.size()][3];
        for(int i = 0; i < emps.size(); i++){
            Empleado e = emps.get(i);
            info[i][0] = e.getNumero();
            if(e.getSegundoNombre()==null){
                info[i][1] = e.getPrimerNombre() + " " 
                        + e.getApellidoPaterno() + " " + e.getApellidoMaterno();
            }else{
                info[i][1] = e.getPrimerNombre() + " " + e.getSegundoNombre() + " "
                        + e.getApellidoPaterno() + " " + e.getApellidoMaterno();
            }
        }
        return info;
    }

    private static String[][] descomponerUsuarios(List<Usuario> us) {
        String[][] info = new String[us.size()][3];
        for (int i = 0; i < us.size(); i++) {
            Usuario u = us.get(i);
            TipoCuenta t;
            t = u.getTipoCuenta();
            info[i][0] = String.valueOf(u.getId());
            info[i][1] = u.getUsuario();
            info[i][2] = u.getPrimerNombre();
            if (u.getSegundoNombre() != null
                    && u.getSegundoNombre().equals("") == false) {
                info[i][2] += " " + u.getSegundoNombre();
            }
            info[i][2] += " " + u.getApellidoPaterno() + " " + u.getApellidoMaterno();
        }
        return info;
    }

    private static List<Object> descomponerSede(Sede sede) {
        List<Object> info = new ArrayList<>();
        Municipio m;
        info.add(sede.getNombre());
        m = sede.getMunicipio();
        info.add(m.getNombre());
        info.add(sede.getColonia());
        info.add(sede.getCalle());
        info.add(sede.getNumeroDireccion());
        info.add(sede.getCapacidad());
        info.add(sede.getLugar());
        return info;
    }

    private static String[][] descomponerSedes(List<Sede> se) {
        String[][] info = new String[se.size()][2];
        for (int i = 0; i < se.size(); i++) {
            Sede s = se.get(i);
            info[i][0] = String.valueOf(s.getId());
            info[i][1] = s.getNombre();
        }
        return info;

    }

    private static String[][] descomponerLogins(List<Usuario> us) {
        String[][] info = new String[us.size()][3];
        for (int i = 0; i < us.size(); i++) {
            Usuario u = us.get(i);
            TipoCuenta t;
            t = u.getTipoCuenta();
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
        (List<ImplementacionEvento> eventoImplementado) {
        String[][] info = new String[eventoImplementado.size()][4];
        for (int i = 0; i < eventoImplementado.size(); i++) {
            ImplementacionEvento eventoImp = eventoImplementado.get(i);
            info[i][0] = eventoImp.getId().toString();
            info[i][1] = eventoImp.getFechaInicial().toString();
            info[i][2] = eventoImp.getEvento().toString();
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
        (List<ImplementacionEventoEnunciadoLogistica> enunciado) {
        String[][] info = new String[enunciado.size()][4];
        for (int i = 0; i < enunciado.size(); i++) {
            ImplementacionEventoEnunciadoLogistica calificacionEvento = enunciado.get(i);
            
            info[i][0] = calificacionEvento.getId().toString();
            info[i][3] = calificacionEvento.getCalificacion()+"";

        }
        return info;
    }
}
