/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.edu.cobach.negocio.delegate.ServiceLocatorDELEGATE;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.vista.Comunicador;
/**
 *
 * @author fernando
 */
public class ReporteControlador extends BaseControlador{
    
    
    public ReporteControlador(Comunicador com, Class clazz){
        super(com, clazz);
    }
    
    /**
     * Metodo que recibe un string que se conecta con el ServiceLocatorDELEGATE
     * para obtener una matriz de empleados por coincidencias.
     * @param nombre 
     */
    public void buscarPorNombre(String nombre){
        String[][] empleado = ServiceLocatorDELEGATE.getReporteDelegate()
                .buscarPorNombre(nombre);
        com.setTabla(empleado);
    }
    
    /**
     * Metodo que recibe un int que se conecta con el ServiceLocatorDELEGATE para 
     * obtener una matriz de empleados por coincidencias
     * @param numero 
     */
    public void buscarPorNumero(int numero){
        String[][] empleado = ServiceLocatorDELEGATE.getReporteDelegate()
                .buscarPorNumero(numero);
        com.setTabla(empleado);
    }
    
    /**
     * Metodo que recibe un int que se conecta con el ServiceLocatorDELEGATE para
     * obtener un mensaje de kardex generado exitosamente
     * @param numero
     * @throws IOException 
     */
    public void generarKardex(int numero) throws IOException{
        ServiceLocatorDELEGATE.getReporteDelegate().generarKardex(numero);
        com.setMensaje("El Kardex fue generado Exitosamente");
    }
    
    /**
     * Metodo que recibe un objeto de tipo departamento el cual se conecta con 
     * el ServiceLocatorDELEGATE, donde este recibira una matriz de eventos 
     * implementados en el departamento 
     * @param departamento 
     */
    public void generarReportePorDepartamento(Departamento departamento){
        String[][] reporteEvento = ServiceLocatorDELEGATE.getReporteDelegate()
                .generarReportePorDepartamento(departamento);
        com.setTabla(reporteEvento);     
    }
    
    /**
     * Metodo que recibe un objeto de tipo plantel el cual se conecta con 
     * el ServiceLocatorDELEGATE, donde este recibira una matriz de eventos 
     * implementados en el plantel
     * 
     * @param plantel
     */
    public void generarReportePorPlantel(Plantel plantel){
        String[][] reporteEvento = ServiceLocatorDELEGATE.getReporteDelegate().
                generarReportePorPlantel(plantel);
        com.setTabla(reporteEvento);
                        
    }
    
    /**
     * Metodo que recibe un dos atributos de tipo date el cual se conecta con 
     * el ServiceLocatorDELEGATE, donde este recibira una matriz de eventos 
     * implementados por coincidencia de rango de fechas. 
     * @param de
     * @param hasta 
     */
    public void generarEventosPorFecha(Date de, Date hasta){
        String [][] reporteEvento = ServiceLocatorDELEGATE.getReporteDelegate()
                .generarReportePorFechas(de, hasta);
        com.setTabla(reporteEvento);
    }
    
    /**
     * Metodo que recibe un dos atributos de tipo date el cual se conecta con 
     * el ServiceLocatorDELEGATE, donde este recibira una matriz de eventos 
     * implementados por coincidencia de rango de fechas. 
     * @param de
     * @param hasta 
     */
    public void buscarEventosPorFecha(Date de, Date hasta){
        String [][] buscarEvento = ServiceLocatorDELEGATE.getReporteDelegate()
                .buscarEventoPorFechas(de, hasta);
        com.setTabla(buscarEvento);
    }
    
    /**
     * Metodo que recibe un atributo de tipo int el cual se conecta con 
     * el ServiceLocatorDELEGATE, donde este recibira una matriz de eventos 
     * implementados por lista de asistencia. 
     * @param numero
     */
    public void generarReporteLista(int numero){
        Object lista = ServiceLocatorDELEGATE.getReporteDelegate()
                .generarReporteLista(numero);
        List <Object> listaAsistencia = new ArrayList();
        listaAsistencia.add(lista);
        com.setInfo(listaAsistencia);
    }
    
}