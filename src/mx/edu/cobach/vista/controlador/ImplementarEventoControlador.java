/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.EnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEventoEnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.vista.Comunicador;

/**
 * Esta clase sirve para controlar la informacion de los eventos utilizando
 * metodos para la obtencion de la informacion necesario y descomponerla en 
 * listas y matrices para enviarlas a los pnl
 * @author liuts
 */
public class ImplementarEventoControlador extends BaseControlador {
    /**
     * Controlador de la clase ImplementarEventoControlador
     * @param com
     * @param clazz 
     */
    public ImplementarEventoControlador(Comunicador com, Class clazz) {
        super(com, clazz);
    }

    /**
     * Este metodo sirve para buscar el curso implementado a modificar
     *
     * @param id
     */
    public void buscarMod(int id) {
        Object o = ServiceLocatorDELEGATE.getInstance().find(id, clazz);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }

    /**
     * Sirve para buscar un evento especifico para agregarlo a los cursos a
     * implementar
     *
     * @param id
     * @param eventoClase
     */
    public void buscarCurId(Integer id, Class<Evento> eventoClase) {
        Object o = ServiceLocatorDELEGATE.getImplementarEvento().find(id, eventoClase);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }

    /**
     * Sirve para buscar todos los eventos que puedan implementarse implementar
     *
     * @param id
     * @param eventoClase
     */
    public void buscarPorEvento(Evento evento) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().buscarPorEvento(evento);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }

    /**
     * Sirve para buscar todos sedes donde se implanto un curso implementar
     *
     * @param id
     * @param eventoClase
     */
    public void buscarPorSede(Sede sede) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().buscarPorSede(sede);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }

    /**
     * Este metodo sirve para buscar el id del empleado y agregarlo a la lista
     * de asistencia para la lista de asistencia
     *
     * @param id
     * @param cursoClase
     */
    public void buscarEmpId(Integer id, Class<Empleado> empleado) {
        Object o = ServiceLocatorDELEGATE.getImplementarEvento().find(id, empleado);
        System.out.println(o.toString());
        List<Object> atr = new ArrayList<Object>();
        atr.add(o);
        String matriz[][] = HelperEntidad.descomponerObjetos(atr);
        matriz[0][0] = matriz[0][0] + "TLE2"; //se agrega un string para hubicar a que direccion de las 3 tablas se dirigira
        com.setTabla(matriz);
    }

    /**
     * Este metodo sirve para buscar la coincidencia del nombree de los
     * empleados para la lista de asistencia
     *
     * @param clave
     */
    public void buscarEmpN(String clave) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().buscarEmPorNombre(clave);
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        //se agrega un string para hubicar a que direccion de las 
        //3 tablas se dirigira
        matriz[0][0] = matriz[0][0] + "TLE1";
        com.setTabla(matriz);
    }

    /**
     * Este metodo sirve para buscar la encuesta para del curso finalizado
     */
    public void buscarEncuesta() {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().findAll(EnunciadoLogistica.class);
        System.out.println(o.size());
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        matriz[0][0] = matriz[0][0] + "TLE3"; //se agrega un string para hubicar a que direccion de las 3 tablas se dirigira
        com.setTabla(matriz);
    }

    /**
     * Este metodo sirve para buscar la coincidencia del departamento de los
     * empleados para la lista de asistencia
     *
     * @param id
     * @param cursoClase
     */
    public void buscarEmpD(Departamento departamento) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().buscarEmPorDepartamento(departamento);
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        matriz[0][0] = matriz[0][0] + "TLE1"; //se agrega un string para hubicar a que direccion de las 3 tablas se dirigira
        com.setTabla(matriz);
    }

    /**
     * Este metodo sirve para buscar la coincidencia del Planteles de los
     * empleados para la lista de asistencia
     *
     * @param id
     * @param cursoClase
     */
    public void buscarEmpPl(Plantel plantel) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().buscarEmPorPlantel(plantel);
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        matriz[0][0] = matriz[0][0] + "TLE1"; //se agrega un string para hubicar a que direccion de las 3 tablas se dirigira
        com.setTabla(matriz);
    }

    /**
     * Este metodo sirve para buscar la coincidencia del puesto de los empleados
     * para la lista de asistencia
     *
     * @param id
     * @param cursoClase
     */
    public void buscarEmpPu(Puesto puesto) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().buscarEmPorPuesto(puesto);
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        matriz[0][0] = matriz[0][0] + "TLE1"; //se agrega un string para hubicar a que direccion de las 3 tablas se dirigira
        com.setTabla(matriz);
    }

    /**
     * Este metodo sirve para buscar la coincidencia de los cursos implementados
     *
     * @param de
     * @param hasta
     */
    public void buscarImplementacion(Date de, Date hasta) {
        List<Object> implementaciones = ServiceLocatorDELEGATE.getImplementarEvento()
                .buscarPorFechas(de, hasta);
        com.setTabla(HelperEntidad.descomponerObjetos(implementaciones));
    }

    /**
     * Este metodo sirve para guardar o modificar la informacion de un curso
     * implementado
     *
     * @param impleEvento
     * @param listacalificacion
     */
    public void guardarOModificarEventoImplementado(Object impleEvento,
            List listaCalificacion, String envio) {
        Object object;
        if (envio.equals("Guardar")) {
            object = ServiceLocatorDELEGATE.getImplementarEvento().guardarEvento(impleEvento, clazz);
            for (int x = 0; x < listaCalificacion.size(); x++) {
                ImplementacionEventoEnunciadoLogistica infoCalificacion
                        = new ImplementacionEventoEnunciadoLogistica();
                ImplementacionEvento implementacionEvento = new ImplementacionEvento();
                implementacionEvento.setId(Integer.parseInt(object.toString()));

                infoCalificacion = (ImplementacionEventoEnunciadoLogistica) listaCalificacion.get(x);
                infoCalificacion.setImplementacionEvento(implementacionEvento);
                ServiceLocatorDELEGATE.getInstance().saveOrUpdate(infoCalificacion, clazz);
            }
        }else{
            ServiceLocatorDELEGATE.getInstance().saveOrUpdate(impleEvento, clazz);
            for (int x = 0; x < listaCalificacion.size(); x++) {
                ImplementacionEventoEnunciadoLogistica infoCalificacion
                        = new ImplementacionEventoEnunciadoLogistica();
                infoCalificacion = (ImplementacionEventoEnunciadoLogistica) listaCalificacion.get(x);
                ServiceLocatorDELEGATE.getInstance().saveOrUpdate(infoCalificacion, clazz);
            }
        }
        com.setMensaje("Se ha guardado existosamente");
    }

    /**
     * Este evento sirve para obtener una lista de la calificacion de logistica
     * implementada
     *
     * @param impleEvento
     */
    public void bucarCalificacionMod(ImplementacionEvento impleEvento) {
        List<Object> o = ServiceLocatorDELEGATE.getImplementarEvento().buscarPorEncuesta(impleEvento);
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        matriz[0][0] = matriz[0][0] + "TLE4"; //se agrega un string para hubicar a que direccion de las 3 tablas se dirigira
        com.setTabla(matriz);
    }

}
