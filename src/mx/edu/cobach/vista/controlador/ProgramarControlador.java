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
import mx.edu.cobach.persistencia.entidades.ImplementacionCurso;
import mx.edu.cobach.persistencia.entidades.ImplementacionCursoEnunciadoLogistica;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.vista.Comunicador;

/**
 *
 * @author liuts
 */
public class ProgramarControlador extends BaseControlador {

    public ProgramarControlador(Comunicador com, Class clazz) {
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
        Object o = ServiceLocatorDELEGATE.getPrograma().find(id, eventoClase);
        com.setInfo(HelperEntidad.descomponerObjeto(o));
    }

    /**
     * Sirve para buscar todos los eventos que puedan implementarse implementar
     *
     * @param id
     * @param eventoClase
     */
    public void buscarPorEvento(Evento evento) {
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarPorEvento(evento);
        com.setTabla(HelperEntidad.descomponerObjetos(o));
    }

    /**
     * Sirve para buscar todos sedes donde se implanto un curso implementar
     *
     * @param id
     * @param eventoClase
     */
    public void buscarPorSede(Sede sede) {
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarPorSede(sede);
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
        Object o = ServiceLocatorDELEGATE.getPrograma().find(id, empleado);
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
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarEmPorNombre(clave);
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
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarPorEncuesta(EnunciadoLogistica.class);
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
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarEmPorDepartamento(departamento);
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
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarEmPorPlantel(plantel);
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
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarEmPorPuesto(puesto);
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
        List<Object> implementaciones = ServiceLocatorDELEGATE.getPrograma()
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
            List listacalificacion) {
        Object object;

        object = ServiceLocatorDELEGATE.getPrograma().guardarEvento(impleEvento, clazz);

        for (int x = 0; x < listacalificacion.size(); x++) {
            ImplementacionCursoEnunciadoLogistica infoCalificacion
                    = new ImplementacionCursoEnunciadoLogistica();
            ImplementacionCurso implementacionCurso = new ImplementacionCurso();
            implementacionCurso.setId(Integer.parseInt(object.toString()));

            infoCalificacion = (ImplementacionCursoEnunciadoLogistica) listacalificacion.get(x);
            infoCalificacion.setImplementacionCurso(implementacionCurso);
            ServiceLocatorDELEGATE.getInstance().saveOrUpdate(infoCalificacion, clazz);
        }

        com.setMensaje("Se ha guardado existosamente");
    }

    /**
     * Este evento sirve para obtener una lista de la calificacion de logistica
     * implementada
     *
     * @param cursoProgramarId
     */
    public void bucarCalificacionMod(int cursoProgramarId) {
        List<Object> o = ServiceLocatorDELEGATE.getPrograma().buscarPorEncuesta(ImplementacionCursoEnunciadoLogistica.class);
        String matriz[][] = HelperEntidad.descomponerObjetos(o);
        matriz[0][0] = matriz[0][0] + "TLE4"; //se agrega un string para hubicar a que direccion de las 3 tablas se dirigira
        com.setTabla(matriz);
    }

}
