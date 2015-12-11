/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import modelo.dto.DataTable;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.persistencia.entidades.Puesto;
import persistencia.Enlace;

/**
 *
 */
public class DataHelper {

    //Obtencion de entidades
    public static ImplementacionEventoEnunciadoLogistica getEnunciado(List<Object> atributos) {
        ImplementacionEventoEnunciadoLogistica enunciado
                = new ImplementacionEventoEnunciadoLogistica();
        enunciado.setEnunciadoLogistica((EnunciadoLogistica) atributos.get(0));
        enunciado.setCalificacion((int) atributos.get(1));
        enunciado.setImplementacionEvento((ImplementacionEvento) atributos.get(2));
        return enunciado;
    }

    public static DataTable getDepartamento(List<Object> atributos) {
        final String ID = "id";
        final String NOMBRE = "nombre";

        String[] columnas = {ID, NOMBRE};
        DataTable dtDepartamento = new DataTable(columnas, 1, columnas.length);

        //posicionarse en el registro 1
        dtDepartamento.next();

        //Guardar los datos
        dtDepartamento.setObject(NOMBRE, atributos.get(0));

        //Reiniciar para lectura desde la primera posición.
        dtDepartamento.rewind();

        return dtDepartamento;
    }

    /**
     * getProveedor
     *
     * @param List<String> atributos
     * @return Proveedor
     */
    public static Proveedor getProveedor(List<Object> atributos) {
        Proveedor p = new Proveedor();
        TipoProveedor t = new TipoProveedor();
        p.setPrimerNombre(atributos.get(0).toString());
        p.setSegundoNombre(atributos.get(1).toString());
        p.setApellidoPaterno(atributos.get(2).toString());
        p.setApellidoMaterno(atributos.get(3).toString());
        p.setCorreoElectronico(atributos.get(4).toString());
        p.setTelefono(atributos.get(5).toString());
        t.setId(Integer.parseInt(atributos.get(6).toString()));
        p.setTipoProveedor(t);
        p.setEventos((Set<Evento>) atributos.get(7));
        if (atributos.size() > 8) {
            p.setId(Integer.parseInt(atributos.get(8).toString()));
        }
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
            if (atributos.get(4) != null) {
                implementaEvento.setSede((Sede) atributos.get(4));
            }
            if (atributos.get(5) != null) {
                implementaEvento.setProveedor((Proveedor) atributos.get(5));
            }
            if (atributos.get(6) != null) {
                implementaEvento.setEmpleados((Set<Empleado>) atributos.get(6));
            }
            if (atributos.size() > 7) {
                implementaEvento.setAlertas((Set<Alerta>) atributos.get(7));
            }
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

    public static DataTable getPuesto(List<String> atributos) {
        //Sólo para que no haya errores de dedo, no son necesarios
        final String ID = "id";
        final String NOMBRE = "nombre";

        String[] columnas = {ID, NOMBRE};

        DataTable dtPuesto = new DataTable(columnas, 1, columnas.length);

        //posicionarse en el registro 1
        dtPuesto.next();

        //Guardar los datos
        dtPuesto.setObject(NOMBRE, atributos.get(0));

        //Reiniciar para lectura desde la primera posición.
        dtPuesto.rewind();

        return dtPuesto;
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

    public static DataTable getDireccion(List<String> atributos) {
        final String ID = "id";
        final String NOMBRE = "nombre";

        String[] columnas = {ID, NOMBRE};

        DataTable dtDireccion = new DataTable(columnas, 1, columnas.length);

        //posicionarse en el registro 1
        dtDireccion.next();

        //Guardar los datos
        dtDireccion.setObject(NOMBRE, atributos.get(0));

        //Reiniciar para lectura desde la primera posición.
        dtDireccion.rewind();

        return dtDireccion;
    }

    public static DataTable getEmpleado(List<Object> atributos) {
        //Sólo para que no haya errores de dedo, no son necesarios
        final String NUMERO = "numero";
        final String PRIMER_NOMBRE = "primer_nombre";
        final String SEGUNDO_NOMBRE = "segundo_nombre";
        final String APELLIDO_PATERNO = "apellido_paterno";
        final String APELLIDO_MATERNO = "apellido_materno";
        final String CORREO = "correo";
        final String ADSCRIPCION_ID = "adscripcion_id";
        final String PUESTO_ID = "puesto_id";
        final String DEPARTAMENTO_ID = "departamento_id";
        final String PLANTEL_ID = "plantel_id";
        final String DIRECCION_ID = "direccion_id";

        String[] columnas = {NUMERO, PRIMER_NOMBRE, SEGUNDO_NOMBRE, APELLIDO_PATERNO,
            APELLIDO_MATERNO, CORREO, ADSCRIPCION_ID, PUESTO_ID, DEPARTAMENTO_ID,
            PLANTEL_ID, DIRECCION_ID};
        DataTable dtEmpleado = new DataTable(columnas, 1, columnas.length);

        //posicionarse en el registro 1
        dtEmpleado.next();

        //Guardar los datos
        dtEmpleado.setObject(NUMERO, atributos.get(0));
        dtEmpleado.setObject(PRIMER_NOMBRE, atributos.get(1));
        dtEmpleado.setObject(SEGUNDO_NOMBRE, atributos.get(2));
        dtEmpleado.setObject(APELLIDO_PATERNO, atributos.get(3));
        dtEmpleado.setObject(APELLIDO_MATERNO, atributos.get(4));
        dtEmpleado.setObject(CORREO, atributos.get(5));
        dtEmpleado.setObject(ADSCRIPCION_ID, ((Adscripcion) atributos.get(6)).getId());
        dtEmpleado.setObject(PUESTO_ID, ((Puesto) atributos.get(7)).getId());
        dtEmpleado.setObject(DEPARTAMENTO_ID, atributos.get(8)
                != null ? ((Departamento) atributos.get(8)).getId() : null);
        dtEmpleado.setObject(PLANTEL_ID, atributos.get(9)
                != null ? ((Plantel) atributos.get(9)).getId() : null);
        dtEmpleado.setObject(DIRECCION_ID, atributos.get(10)
                != null ? ((Direccion) atributos.get(10)).getId() : null);

        //Reiniciar para lectura desde la primera posición.
        dtEmpleado.rewind();

        System.out.println(dtEmpleado.toString());
        return dtEmpleado;
    }

    public static DataTable getUsuario(List<String> atributos) {
        //Sólo para que no haya errores de dedo, no son necesarios
        final String ID = "id";
        final String PRIMER_NOMBRE = "primer_nombre";
        final String SEGUNDO_NOMBRE = "segundo_nombre";
        final String APELLIDO_PATERNO = "apellido_paterno";
        final String APELLIDO_MATERNO = "apellido_materno";
        final String USUARIO = "usuario";
        final String CONTRASENA = "contrasena";
        final String TIPO_CUENTA_ID = "tipo_cuenta_id";

        String[] columnas = {ID, PRIMER_NOMBRE, SEGUNDO_NOMBRE, APELLIDO_PATERNO,
            APELLIDO_MATERNO, USUARIO, CONTRASENA, TIPO_CUENTA_ID};

        DataTable dtUsuario = new DataTable(columnas, 1, columnas.length);

        //posicionarse en el registro 1
        dtUsuario.next();

        //Guardar los datos
        dtUsuario.setObject(PRIMER_NOMBRE, atributos.get(0));
        dtUsuario.setObject(SEGUNDO_NOMBRE, atributos.get(1));
        dtUsuario.setObject(APELLIDO_PATERNO, atributos.get(2));
        dtUsuario.setObject(APELLIDO_MATERNO, atributos.get(3));
        dtUsuario.setObject(USUARIO, atributos.get(4));
        dtUsuario.setObject(TIPO_CUENTA_ID, atributos.get(5));
        dtUsuario.setObject(CONTRASENA, atributos.get(6));

        //Reiniciar para lectura desde la primera posición.
        dtUsuario.rewind();

        return dtUsuario;
    }

    public static Sede getSede(List<String> atributos) {
        Sede s = new Sede();
        Municipio m = new Municipio();
        s.setNombre(atributos.get(0));
        m.setId(Integer.parseInt(atributos.get(1)));
        s.setMunicipio(m);
        s.setColonia(atributos.get(2));
        s.setCalle(atributos.get(3));
        s.setNumeroDireccion(atributos.get(4));
        s.setCapacidad(Integer.parseInt(atributos.get(5)));
        s.setLugar(atributos.get(6));

        if (atributos.size() > 7) {
            s.setId(Integer.parseInt(atributos.get(7)));
        }
        return s;
    }

    public static DataTable getEvento(List<Object> atributos) {
        //Sólo para que no haya errores de dedo, no son necesarios
        final String ID = "id";
        final String TIPO_EVENTO_ID = "tipo_evento_id";
        final String NOMBRE = "nombre";
        final String DESCRIPCION = "descripcion";

        String[] columnas = {ID, NOMBRE, DESCRIPCION, TIPO_EVENTO_ID};
        DataTable dtEvento = new DataTable(columnas, 1, columnas.length);

        //posicionarse en el registro 1
        dtEvento.next();

        //Guardar los datos
        dtEvento.setObject(TIPO_EVENTO_ID, atributos.get(0));
        dtEvento.setObject(NOMBRE, atributos.get(1));
        dtEvento.setObject(DESCRIPCION, atributos.get(2));

        //Reiniciar para lectura desde la primera posición.
        dtEvento.rewind();

        return dtEvento;
    }

    public static DataTable getPlantel(List<Object> atributos) {
        //Sólo para que no haya errores de dedo, no son necesarios
        final String ID = "id";
        final String NOMBRE = "nombre";
        final String CALLE = "calle";
        final String COLONIA = "colonia";
        final String NUMERO_DIRECCION = "numero_direccion";
        final String ZONA_ID = "zona_id";

        String[] columnas = {ID, NOMBRE, CALLE, COLONIA, NUMERO_DIRECCION, ZONA_ID};
        DataTable dtPlantel = new DataTable(columnas, 1, columnas.length);

        //posicionarse en el registro 1
        dtPlantel.next();

        //Guardar los datos
        dtPlantel.setObject(NOMBRE, atributos.get(0));
        dtPlantel.setObject(CALLE, atributos.get(1));
        dtPlantel.setObject(COLONIA, atributos.get(2));
        dtPlantel.setObject(NUMERO_DIRECCION, atributos.get(3));
        dtPlantel.setObject(ZONA_ID, atributos.get(4));

        //Reiniciar para lectura desde la primera posición.
        dtPlantel.rewind();

        return dtPlantel;
    }

    //Descomposicion de un solo objeto
    public static List<Object> descomponerRegistro(Object obj) {
        /*if (obj instanceof Puesto) {
         //return descomponerPuesto((Puesto) obj);
         } else if (obj instanceof Evento) {
         return descomponerEvento((Evento) obj);
         } else
         if (obj instanceof Empleado) {
         return descomponerEmpleado((Empleado) obj);
         } else */
        if (obj instanceof Usuario) {
            return descomponerUsuario((Usuario) obj);
        } else if (obj instanceof Sede) {
            return descomponerSede((Sede) obj);
        } else if (obj instanceof ImplementacionEvento) {
            return descomponerProEvento((ImplementacionEvento) obj);
        } else if (obj instanceof Proveedor) {
            return descomponerProveedor((Proveedor) obj);
        } /*else if (obj instanceof Plantel) {
         return descomponerPlantel((Plantel) obj);
         } */ else if (obj instanceof Alerta) {
            return descomponerAlerta((Alerta) obj);
//        } else if (obj instanceof Direccion) {
//            return descomponerDireccion((Direccion) obj);
//        } else {
//            return null;
//        }
        }
        return null;
    }

    public static List<Object> descomponerRegistro(String tablaFuente,
            DataTable registro) {
        List registroDescompuesto = null;

        if (registro != null && registro.getRowCount() > 0) {
            if (tablaFuente.equalsIgnoreCase("evento")) {
                registroDescompuesto = descomponerEvento(registro);
            } else if (tablaFuente.equalsIgnoreCase("puesto")) {
                registroDescompuesto = descomponerPuesto(registro);
            } else if (tablaFuente.equalsIgnoreCase("direccion")) {
                registroDescompuesto = descomponerDireccion(registro);
            } else if (tablaFuente.equalsIgnoreCase("departamento")) {
                registroDescompuesto = descomponerDepartamento(registro);
            } else if (tablaFuente.equalsIgnoreCase("plantel")) {
                registroDescompuesto = descomponerPlantel(registro);
            } else if (tablaFuente.equalsIgnoreCase("empleado")) {
                registroDescompuesto = descomponerEmpleado(registro);
            }
        }

        return registroDescompuesto;
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

    private static List<Object> descomponerDepartamento(DataTable departamento) {
        List<Object> info = new ArrayList<>();

        //Iterar en los registros 
        departamento.rewind();
        departamento.next();
        info.add(departamento.getInt("id"));
        info.add(departamento.getString("nombre"));
        return info;
    }

    private static List<Object> descomponerPuesto(DataTable puesto) {
        List<Object> info = new ArrayList<>();

        //Iterar en los registros 
        puesto.rewind();
        puesto.next();
        info.add(puesto.getInt("id"));
        info.add(puesto.getString("nombre"));
        return info;
    }

    private static List<Object> descomponerDireccion(DataTable direccion) {
        List<Object> info = new ArrayList<>();

        //Iterar en los registros 
        direccion.rewind();
        direccion.next();
        info.add(direccion.getInt("id"));
        info.add(direccion.getString("nombre"));
        return info;
    }

    private static List<Object> descomponerEvento(DataTable evento) {
        List<Object> info = new ArrayList<>();

        //Iterar en los registros
        evento.rewind();

        evento.next();

        info.add(evento.getInt("id"));
        info.add(evento.getString("nombre"));
        info.add(evento.getString("descripcion"));

        //Obtener el nombre del tipo_evento
        Map<String, Object> attrWhere = new HashMap<>();

        attrWhere.put("id", evento.getInt("tipo_evento_id"));

        DataTable tipoEvento = buscar("tipo_evento", null, null, attrWhere);

        tipoEvento.next();

        info.add(descomponerTiposEventosAObjetos(tipoEvento).get(0));

        return info;
    }

    private static List<Object> descomponerEmpleado(DataTable empleado) {
        HashMap<String, Object> condicion = new HashMap<>();
        List<Object> info = new ArrayList();

        empleado.rewind();
        empleado.next();

        info.add(empleado.getString("numero"));
        info.add(empleado.getString("primer_nombre"));
        info.add(empleado.getString("segundo_nombre"));
        info.add(empleado.getString("apellido_paterno"));
        info.add(empleado.getString("apellido_materno"));

        condicion.put("id", empleado.getInt("puesto_id"));
        DataTable auxiliar = DataHelper.buscar("puesto", null, null, condicion);
        info.add(DataHelper.descomponerRegistrosAObjetos("puesto", auxiliar).get(0));

        info.add(empleado.getString("correo"));

        if (empleado.getObject("plantel_id") != null) {
            condicion.clear();
            condicion.put("id", empleado.getInt("plantel_id"));
            auxiliar = DataHelper.buscar("plantel", null, null, condicion);
            info.add(DataHelper.descomponerRegistrosAObjetos("plantel", auxiliar).get(0));
        } else {
            info.add(null);
        }

        condicion.clear();
        condicion.put("id", empleado.getInt("adscripcion_id"));
        auxiliar = DataHelper.buscar("adscripcion", null, null, condicion);
        info.add(DataHelper.descomponerRegistrosAObjetos("adscripcion", auxiliar).get(0));

        if (empleado.getObject("departamento_id") != null) {
            condicion.clear();
            condicion.put("id", empleado.getInt("departamento_id"));
            auxiliar = DataHelper.buscar("departamento", null, null, condicion);
            info.add(DataHelper.descomponerRegistrosAObjetos("departamento", auxiliar).get(0));
        } else {
            info.add(null);
        }

        if (empleado.getObject("direccion_id") != null) {
            condicion.clear();
            condicion.put("id", empleado.getInt("direccion_id"));
            auxiliar = DataHelper.buscar("direccion", null, null, condicion);
            info.add(DataHelper.descomponerRegistrosAObjetos("direccion", auxiliar).get(0));
        } else {
            info.add(null);
        }

        return info;
    }

    private static List<Object> descomponerUsuario(Usuario usuario) {
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

    private static List<Object> descomponerUsuario(DataTable usuario) {
        List<Object> info = new ArrayList<>();

        //Iterar en los registros
        usuario.rewind();

        usuario.next();

        info.add(usuario.getString("primer_nombre"));
        info.add(usuario.getString("segundo_nombre"));
        info.add(usuario.getString("apellido_paterno"));
        info.add(usuario.getString("apellido_materno"));
        info.add(usuario.getString("usuario"));

        //Obtener el nombre del tipo_cuenta
        Map<String, Object> attrWhere = new HashMap<>();

        attrWhere.put("id", usuario.getInt("tipo_cuenta_id"));

        DataTable tipoCuenta = buscar("tipo_cuenta", null, null, attrWhere);

        tipoCuenta.next();

        info.add(descomponerTiposCuentaAObjectos(tipoCuenta).get(0));
        info.add(usuario.getString("contrasena"));

        return info;
    }

    private static List<Object> descomponerProEvento(ImplementacionEvento eventoImplementado) {
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

    private static List<Object> descomponerAlerta(Alerta alerta) {
        List<Object> info = new ArrayList();
        info.add(alerta.getId());
        info.add(alerta.getPeriodo());
        info.add(alerta.getDescripcion());
        info.add(alerta.getImplementacionEventos());
        return info;
    }

    //Descomposicion de lista de objetos
    public static String[][] descomponerRegistros(List<Object> objetos) {
        System.out.println("Lista: " + objetos);
        if (objetos.size() > 0) {
            /*if (objetos.get(0) instanceof Puesto) {
             List<Puesto> ps = new ArrayList<>();
             for (int i = 0; i < objetos.size(); i++) {
             ps.add((Puesto) objetos.get(i));
             }
             return descomponerPuestos(ps);
             } else
             if (objetos.get(0) instanceof Empleado) {
             List<Empleado> emps = new ArrayList();
             for (int i = 0; i < objetos.size(); i++) {
             emps.add((Empleado) objetos.get(i));
             }
             return descomponerEmpleados(emps);
             } else if (objetos.get(0) instanceof Evento) {
             List<Evento> cr = new ArrayList();
             for (int i = 0; i < objetos.size(); i++) {
             cr.add((Evento) objetos.get(i));
             }
             return descomponerEventos(cr);
             }  else if (objetos.get(0) instanceof Usuario) {
             List<Usuario> us = new ArrayList();
             for (int i = 0; i < objetos.size(); i++) {
             us.add((Usuario) objetos.get(i));
             }
             return descomponerUsuarios(us);
             } else if (objetos.get(0) instanceof Departamento) {
             List<Departamento> dp = new ArrayList();
             for (int i = 0; i < objetos.size(); i++) {
             dp.add((Departamento) objetos.get(i));
             }
             return descomponerDepartamentos(dp);
             } else */
            if (objetos.get(0) instanceof Sede) {
                List<Sede> se = new ArrayList();
                for (int i = 0; i < objetos.size(); i++) {
                    se.add((Sede) objetos.get(i));
                }
                return descomponerSedes(se);
            } else if (objetos.get(0) instanceof Aspecto) {
                List<Aspecto> aspectos = new ArrayList();
                for (int i = 0; i < objetos.size(); i++) {
                    aspectos.add((Aspecto) objetos.get(i));
                }
                return descomponerAspectos(aspectos);
            } else if (objetos.get(0) instanceof EnunciadoLogistica) {
                List<EnunciadoLogistica> enunciado = new ArrayList();
                for (int i = 0; i < objetos.size(); i++) {
                    enunciado.add((EnunciadoLogistica) objetos.get(i));
                }
                return descomponerEnunciados(enunciado);
            } else if (objetos.get(0) instanceof ImplementacionEvento) {
                List<ImplementacionEvento> eventoImplementado = new ArrayList();
                for (int i = 0; i < objetos.size(); i++) {
                    eventoImplementado.
                            add((ImplementacionEvento) objetos.get(i));
                }
                return descomponerProEventos(eventoImplementado);
            } else if (objetos.get(0) instanceof ImplementacionEventoEnunciadoLogistica) {
                List<ImplementacionEventoEnunciadoLogistica> calificacion = new ArrayList();
                for (int i = 0; i < objetos.size(); i++) {
                    calificacion.add((ImplementacionEventoEnunciadoLogistica) objetos.get(i));
                }
                return descomponerCalificacion(calificacion);
            } else if (objetos.get(0) instanceof Proveedor) {
                List<Proveedor> pr = new ArrayList();
                for (int i = 0; i < objetos.size(); i++) {
                    pr.add((Proveedor) objetos.get(i));
                }
                return descomponerProveedores(pr);
            } /*else if (objetos.get(0) instanceof Plantel) {
             List<Plantel> pl = new ArrayList();
             for (int i = 0; i < objetos.size(); i++) {
             pl.add((Plantel) objetos.get(i));
             }
             return descomponerPlanteles(pl);
             }*/
//            } else if (objetos.get(0) instanceof Direccion) {
//                List<Direccion> di = new ArrayList();
//                for (int i = 0; i < objetos.size(); i++) {
//                    di.add((Direccion) objetos.get(i));
//                }
//                return descomponerDirecciones(di);
//            }

        }
        return null;
    }

    public static List<Object> descomponerRegistrosAObjetos(String tablaFuente,
            DataTable dataTable) {
        List<Object> datosDescompuestos = null;

        if (dataTable != null && dataTable.getRowCount() > 0) {
            if (tablaFuente.equalsIgnoreCase("tipo_evento")) {
                datosDescompuestos = descomponerTiposEventosAObjetos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("puesto")) {
                datosDescompuestos = descomponerPuestosAObjetos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("plantel")) {
                datosDescompuestos = descomponerPlantelesAObjetos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("departamento")) {
                datosDescompuestos = descomponerDepartamentosAObjetos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("direccion")) {
                datosDescompuestos = descomponerDireccionesAObjetos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("adscripcion")) {
                datosDescompuestos = descomponerAdscripcionesAObjetos(dataTable);
            }
        }

        return datosDescompuestos;
    }

    public static String[][] descomponerRegistros(String tablaFuente,
            DataTable dataTable) {

        String[][] datosDescompuestos = null;

        if (dataTable != null && dataTable.getRowCount() > 0) {

            if (tablaFuente.equalsIgnoreCase("evento")) {
                datosDescompuestos = descomponerEventos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("puesto")) {
                datosDescompuestos = descomponerPuestos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("direccion")) {
                datosDescompuestos = descomponerDirecciones(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("empleado")) {
                datosDescompuestos = descomponerEmpleados(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("departamento")) {
                datosDescompuestos = descomponerDepartamentos(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("plantel")) {
                datosDescompuestos = descomponerPlanteles(dataTable);
            } else if (tablaFuente.equalsIgnoreCase("usuario")) {
                datosDescompuestos = descomponerUsuarios(dataTable);
            }

        }

        return datosDescompuestos;
    }

    /**
     * descomponerProveedor
     *
     * @param proveedor
     * @return
     */
    private static List<Object> descomponerProveedor(Proveedor proveedor) {
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
     *
     * @param pr
     * @return
     */
    private static String[][] descomponerProveedores(List<Proveedor> pr) {
        String[][] info = new String[pr.size()][2];
        for (int i = 0; i < pr.size(); i++) {
            Proveedor p = pr.get(i);
            info[i][0] = String.valueOf(p.getId());
            info[i][1] = p.getPrimerNombre();
            if (p.getSegundoNombre() != null) {
                info[i][1] += " " + p.getSegundoNombre();
            }
            info[i][1] += " " + p.getApellidoPaterno();
            info[i][1] += " " + p.getApellidoMaterno();
        }
        return info;
    }

    private static List<Object> descomponerPlantel(DataTable plantel) {
        List<Object> info = new ArrayList<>();

        //Iterar en los registros
        plantel.rewind();

        plantel.next();

        //a lo mejor va la llave primaria aqui
        info.add(plantel.getString("nombre"));
        info.add(plantel.getString("calle"));
        info.add(plantel.getString("colonia"));
        info.add(plantel.getString("numero_direccion"));

        //Obtener el nombre de la zona
        Map<String, Object> condicion = new HashMap<>();

        condicion.put("id", plantel.getInt("zona_id"));

        DataTable zona = buscar("zona", null, null, condicion);

        zona.next();

        info.add(descomponerZonasAObjetos(zona).get(0));

        return info;
    }

    private static String[][] descomponerPlanteles(DataTable planteles) {
        String[][] info = new String[planteles.getRowCount()][3];

        //Iterar en los registros
        planteles.rewind();

        int i = 0;
        while (planteles.next()) {
            info[i][0] = planteles.getObject("id").toString();
            info[i][1] = planteles.getString("nombre");
            info[i][2] = planteles.getString("calle") + " ";
            info[i][2] += planteles.getString("colonia") + " ";
            info[i][2] += planteles.getString("numero_direccion");

            i++;
        }

        return info;
    }

    private static String[][] descomponerPuestos(DataTable puesto) {
        String[][] info = new String[puesto.getRowCount()][3];

        //Iterar en los registros
        puesto.rewind();
        int i = 0;
        while (puesto.next()) {
            info[i][0] = puesto.getObject("id").toString();
            info[i][1] = puesto.getString("nombre");
            i++;
        }

        return info;
    }

    private static String[][] descomponerDirecciones(DataTable direccion) {
        String[][] info = new String[direccion.getRowCount()][3];

        //Iterar en los registros
        direccion.rewind();
        int i = 0;
        while (direccion.next()) {
            info[i][0] = direccion.getObject("id").toString();
            info[i][1] = direccion.getString("nombre");
            i++;
        }

        return info;
    }

    private static String[][] descomponerEventos(DataTable eventos) {
        String[][] info = new String[eventos.getRowCount()][3];

        //Iterar en los registros
        eventos.rewind();
        int i = 0;
        while (eventos.next()) {
            info[i][0] = eventos.getObject("id").toString();
            info[i][1] = eventos.getString("nombre");

            //Obtener el nombre del tipo_evento
            Map<String, Object> attrWhere = new HashMap<>();

            attrWhere.put("id", eventos.getInt("tipo_evento_id"));

            DataTable tipoEvento = buscar("tipo_evento",
                    new String[]{"descripcion"}, new String[]{null}, attrWhere);

            tipoEvento.next();

            info[i][2] = tipoEvento.getString("descripcion");

            i++;
        }

        return info;
    }

    private static String[][] descomponerDepartamentos(DataTable departamentos) {
        String[][] info = new String[departamentos.getRowCount()][2];

        //Iterar en los registros
        departamentos.rewind();
        int i = 0;
        while (departamentos.next()) {
            info[i][0] = departamentos.getObject("id").toString();
            info[i][1] = departamentos.getString("nombre");

            i++;
        }

        return info;
    }

    private static String[][] descomponerEmpleados(DataTable emps) {
        String[][] info = new String[emps.getRowCount()][2];

        //Iterar en los registros
        emps.rewind();
        int i = 0;
        while (emps.next()) {
            info[i][0] = emps.getString("numero");
            info[i][1] = emps.getString("primer_nombre") + " "
                    + emps.getString("segundo_nombre") + " "
                    + emps.getString("apellido_paterno") + " "
                    + emps.getString("apellido_materno");
            i++;
        }

        return info;
    }

    private static String[][] descomponerUsuarios(DataTable usuarios) {
        String[][] info = new String[usuarios.getRowCount()][5];

        //Iterar en los registros
        usuarios.rewind();
        int i = 0;
        while (usuarios.next()) {
            info[i][0] = usuarios.getObject("id").toString();
            info[i][1] = usuarios.getString("usuario");
            info[i][2] = usuarios.getString("primer_nombre");
            if (usuarios.getString("segundo_nombre") != null
                    && usuarios.getString("segundo_nombre").equals("") == false) {
                info[i][2] += " " + usuarios.getString("segundo_nombre");
            }
            info[i][2] += " " + usuarios.getString("apellido_paterno")
                    + " " + usuarios.getString("apellido_materno");

            info[i][3] = usuarios.getString("contrasena");

            //Obtener nombre del tipo usuario
            HashMap<String, Object> condicion = new HashMap<>();
            condicion.put("id", usuarios.getInt("tipo_cuenta_id"));

            DataTable tipoCuenta = buscar("tipo_cuenta", new String[]{"descripcion"},
                    new String[]{null}, condicion);

            tipoCuenta.next();

            info[i][4] = tipoCuenta.getString("descripcion");

            i++;
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
            info[i][1] = s.getNombre() + " \"" + s.getLugar() + "\"";
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

    private static String[][] descomponerAspectos(List<Aspecto> aspectos) {
        String[][] info = new String[aspectos.size()][2];
        for (int i = 0; i < aspectos.size(); i++) {
            Aspecto aspecto = aspectos.get(i);
            info[i][0] = String.valueOf(aspecto.getId());
            info[i][1] = aspecto.getAspecto();
        }
        return info;
    }

    private static String[][] descomponerProEventos(List<ImplementacionEvento> eventoImplementado) {
        String[][] info = new String[eventoImplementado.size()][4];
        for (int i = 0; i < eventoImplementado.size(); i++) {
            ImplementacionEvento eventoImp = eventoImplementado.get(i);
            info[i][0] = eventoImp.getId().toString();
            info[i][1] = eventoImp.getFechaInicial().toString();
            info[i][2] = eventoImp.getEvento().toString();
            if (eventoImp.isActivo() == true) {
                info[i][3] = "Activo";
            } else {
                info[i][3] = "Finalizado";
            }
        }
        return info;
    }

    private static String[][] descomponerEnunciados(List<EnunciadoLogistica> enunciado) {
        String[][] info = new String[enunciado.size()][3];
        for (int i = 0; i < enunciado.size(); i++) {
            EnunciadoLogistica enunciadoLogistica = enunciado.get(i);
            info[i][0] = enunciadoLogistica.getId().toString();
            info[i][1] = enunciadoLogistica.getDescripcion();
            info[i][2] = enunciadoLogistica.getTipoEnunciado().toString();
        }
        return info;
    }

    private static String[][] descomponerCalificacion(List<ImplementacionEventoEnunciadoLogistica> enunciado) {
        String[][] info = new String[enunciado.size()][4];
        for (int i = 0; i < enunciado.size(); i++) {
            ImplementacionEventoEnunciadoLogistica calificacionEvento = enunciado.get(i);

            info[i][0] = calificacionEvento.getId().toString();
            info[i][3] = calificacionEvento.getCalificacion() + "";

        }
        return info;
    }

    public static DataTable buscar(String tabla, String[] columnas,
            String[] aliases, Map<String, ?> attrWhere) {
        DataTable dt = null;
        try {
            dt = Enlace.getPersistencia().get(tabla, columnas, aliases, attrWhere);
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(DataHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dt;
    }

    private static List descomponerTiposEventosAObjetos(DataTable tipoEventos) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        tipoEventos.rewind();
        int i = 0;
        while (tipoEventos.next()) {
            TipoEvento tipo = new TipoEvento(tipoEventos.getString("descripcion"));
            tipo.setId(tipoEventos.getInt("id"));
            lista.add(tipo);
        }

        return lista;
    }

    private static List descomponerPuestosAObjetos(DataTable puestos) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        puestos.rewind();
        int i = 0;
        while (puestos.next()) {
            Puesto puesto = new Puesto(puestos.getString("nombre"));
            puesto.setId(puestos.getInt("id"));
            lista.add(puesto);
        }

        return lista;
    }

    private static List descomponerDepartamentosAObjetos(DataTable departamentos) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        departamentos.rewind();
        int i = 0;
        while (departamentos.next()) {
            Departamento dpto = new Departamento(departamentos.getString("nombre"));
            dpto.setId(departamentos.getInt("id"));
            lista.add(dpto);
        }

        return lista;
    }

    private static List descomponerDireccionesAObjetos(DataTable direcciones) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        direcciones.rewind();
        int i = 0;
        while (direcciones.next()) {
            Direccion dir = new Direccion(direcciones.getString("nombre"));
            dir.setId(direcciones.getInt("id"));
            lista.add(dir);
        }

        return lista;
    }

    private static List descomponerAdscripcionesAObjetos(DataTable adscripciones) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        adscripciones.rewind();
        int i = 0;
        while (adscripciones.next()) {
            Adscripcion ads = new Adscripcion(adscripciones.getString("descripcion"));
            ads.setId(adscripciones.getInt("id"));
            lista.add(ads);
        }

        return lista;
    }

    private static List descomponerTiposCuentaAObjectos(DataTable tiposCuenta) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        tiposCuenta.rewind();

        int i = 0;
        while (tiposCuenta.next()) {
            TipoCuenta tipoCuenta = new TipoCuenta(tiposCuenta
                    .getString("descripcion"));

            tipoCuenta.setId(tiposCuenta.getInt("id"));
            lista.add(tipoCuenta);
        }

        return lista;
    }

    private static List descomponerPlantelesAObjetos(DataTable planteles) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        planteles.rewind();
        int i = 0;
        while (planteles.next()) {
            Plantel plantel = new Plantel();
            plantel.setId(planteles.getInt("id"));
            plantel.setNombre(planteles.getString("nombre"));
            plantel.setColonia(planteles.getString("colonia"));
            plantel.setCalle(planteles.getString("calle"));
            plantel.setNumeroDireccion(planteles.getString("numero_direccion"));

            //Obtener la zona
            Map<String, Object> attrWhere = new HashMap<>();

            attrWhere.put("id", planteles.getInt("zona_id"));

            DataTable zona = buscar("zona", null, null, attrWhere);

            zona.next();

            plantel.setZona((Zona) descomponerZonasAObjetos(zona).get(0));

            lista.add(plantel);
        }

        return lista;
    }

    public static List descomponerZonasAObjetos(DataTable zonas) {
        List<Object> lista = new ArrayList();

        //Iterar en los registros
        zonas.rewind();
        int i = 0;
        while (zonas.next()) {
            Zona zona = new Zona(zonas.getString("nombre"));
            zona.setId(zonas.getInt("id"));
            lista.add(zona);
        }

        return lista;
    }
}
