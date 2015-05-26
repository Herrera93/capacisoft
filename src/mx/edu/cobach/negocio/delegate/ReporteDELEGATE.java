/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.negocio.delegate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mx.edu.cobach.negocio.facade.ServiceLocatorFACADE;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionCurso;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.util.ApachePoiUtil;

/**
 *
 * @author fernando
 */
public class ReporteDELEGATE {

    public String[][] buscarPorNombre(String nombre) {
        List<Object> emps = ServiceLocatorFACADE.getEmpleado().buscarPorNombre(nombre);
            String[][] info = new String[emps.size()][5];
            for (int i = 0; i < emps.size(); i++) {
                Empleado e = (Empleado) emps.get(i);
                info[i][0] = e.getId().toString();
                info[i][1] = e.getNumero();
                info[i][2] = e.getPrimerNombre() + " " + e.getSegundoNombre() + " "
                        + e.getApellidoPaterno() + " " + e.getApellidoMaterno();
                info[i][3] = e.getPuesto().toString();
                info[i][4] = e.getCorreo();
            }
            return info;
    }

    public String[][] buscarPorNumero(int numero) {
        List<Object> emps =ServiceLocatorFACADE.getEmpleado().buscarPorNumero(numero);
            String[][] info = new String[emps.size()][5];
            for (int i = 0; i < emps.size(); i++) {
                Empleado e = (Empleado) emps.get(i);
                info[i][0] = e.getId().toString();
                info[i][1] = e.getNumero();
                info[i][2] = e.getPrimerNombre() + " " + e.getSegundoNombre() + " "
                        + e.getApellidoPaterno() + " " + e.getApellidoMaterno();
                info[i][3] = e.getPuesto().toString();
                info[i][4] = e.getCorreo();
            }
            return info;
    }
    
    public Object generarReporteLista(int numero){
        Object listaAsistencia = (ImplementacionCurso) ServiceLocatorFACADE.getInstance().
                find(numero, ImplementacionCurso.class);
        return listaAsistencia;
    }
    
    public String[][] generarReportePorFechas(Date de, Date hasta){
        List<Object> eventosPorFechas  =  ServiceLocatorFACADE.getPrograma()
                .buscarEventoPorFechas(null, de, hasta);
        String[][] evento = new String[eventosPorFechas.size()][5];
        for (int i = 0; i < eventosPorFechas.size(); i++){
            ImplementacionCurso eD = (ImplementacionCurso) eventosPorFechas.get(i);
            evento[i][0] = eD.getFechaInicial() + "";
            evento[i][1] = eD.getFechaFinal() + "";
            evento[i][2] = eD.getCurso().toString();
            evento[i][3] = eD.getSede().toString();
            evento[i][4] = eD.getProveedor().toString();
        }
        return evento;
    }
    
    public String[][] buscarEventoPorFechas(Date de, Date hasta){
        List<Object> eventosPorFechas  =  ServiceLocatorFACADE.getPrograma()
                .buscarEventoPorFechas(null, de, hasta);
        String[][] evento = new String[eventosPorFechas.size()][3];
        for (int i = 0; i < eventosPorFechas.size(); i++){
            ImplementacionCurso eD = (ImplementacionCurso) eventosPorFechas.get(i);
            evento[i][0] = eD.getId() + "";
            evento[i][1] = eD.getFechaInicial() + "";
            evento[i][2] = eD.getCurso().toString();
        }
        return evento;
    }
    
    public String[][] generarReportePorDepartamento(Departamento departamento){
        List<Object> eventosPorDepartamento  =  ServiceLocatorFACADE.getPrograma()
                .buscarEventosPorDepartamento(departamento);
        String[][] evento = new String[eventosPorDepartamento.size()][5];
        for (int i = 0; i < eventosPorDepartamento.size(); i++){
            ImplementacionCurso eD = (ImplementacionCurso) eventosPorDepartamento.get(i);
            evento[i][0] = eD.getFechaInicial() + "";
            evento[i][1] = eD.getFechaFinal() + "";
            evento[i][2] = eD.getCurso().toString();
            evento[i][3] = eD.getSede().toString();
            evento[i][4] = eD.getProveedor().toString();
            System.out.println(eD.getFechaFinal() + "");
        }
        return evento;
    }
    
    public String[][] generarReportePorPlantel(Plantel plantel){
        List<Object> eventosPorPlantel  =  ServiceLocatorFACADE.getPrograma()
                .buscarEventosPorPlantel(plantel);
        String[][] evento = new String[eventosPorPlantel.size()][5];
        for (int i = 0; i < eventosPorPlantel.size(); i++){
            ImplementacionCurso eD = (ImplementacionCurso) eventosPorPlantel.get(i);
            evento[i][0] = eD.getFechaInicial() + "";
            evento[i][1] = eD.getFechaFinal() + "";
            evento[i][2] = eD.getCurso().toString();
            evento[i][3] = eD.getSede().toString();
            evento[i][4] = eD.getProveedor().toString();
            System.out.println(eD.getFechaFinal() + "");
        }
        return evento;
    }

    public void generarKardex(int numero) throws IOException {
        
        int numEvento = 0;
        ApachePoiUtil word = new ApachePoiUtil();
        List <String> lista = new ArrayList();
        Empleado empleadoInfo = (Empleado) ServiceLocatorFACADE.getInstance().
                find(numero, Empleado.class);
        
        Map<String, String> agregarInfo = new HashMap();
        String nombre = empleadoInfo.getPrimerNombre() + " " + empleadoInfo.getSegundoNombre()
                + " " + empleadoInfo.getApellidoPaterno() + " " + empleadoInfo.getApellidoMaterno();

        agregarInfo.put("<@nombre>", nombre);
        agregarInfo.put("<@numero>", empleadoInfo.getNumero());
        agregarInfo.put("<@puesto>", empleadoInfo.getPuesto().toString());
        agregarInfo.put("","");
        word.reemplazarTabla(agregarInfo);
        
        for (Iterator it = empleadoInfo.getImplementacionCursos().iterator(); it.hasNext();) {
            numEvento++;
            ImplementacionCurso impEvento = (ImplementacionCurso) it.next();
            Evento evento = impEvento.getCurso();
            lista.add(evento.toString());
            lista.add(impEvento.getFechaInicial() + "");
            lista.add(impEvento.getFechaFinal() + "");
        }
        word.crearTabla(lista, numEvento);
        word.cerrarSesion();
    }
}
