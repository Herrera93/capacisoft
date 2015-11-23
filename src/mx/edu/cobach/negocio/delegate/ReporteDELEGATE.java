/*s
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
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.util.ApachePoiUtil;

/**
 *
 * @author fernando
 */
public class ReporteDELEGATE {

    /**
     * Método que recibe un string, este envia el string por medio de la
     * instancia del ServiceLocatorFACADE a EmpleadoFACADE, se manda el string
     * para la busqueda por nombre del empleado donde este regresa las
     * coincidencias, el método devuelve una matriz con las coincidencia.
     *
     * @param nombre
     * @return info
     */
    public String[][] buscarPorNombre(String nombre) {
        List<Object> emps = ServiceLocatorFACADE.getEmpleado().buscarPorNombre(nombre);
        String[][] info = new String[emps.size()][5];
        for (int i = 0; i < emps.size(); i++) {
            Empleado e = (Empleado) emps.get(i);
            info[i][0] = e.getId().toString();
            info[i][1] = e.getNumero();
            if (e.getSegundoNombre()== null) {
                info[i][2] = e.getPrimerNombre() + " "+ e.getApellidoPaterno() +
                        " " + e.getApellidoMaterno();
            } else {
                info[i][2] = e.getPrimerNombre() + " " + e.getSegundoNombre() + " "
                        + e.getApellidoPaterno() + " " + e.getApellidoMaterno();
            }
            info[i][3] = e.getPuesto().toString();
            info[i][4] = e.getCorreo();
        }
        return info;
    }

    /**
     * Método que recibe un int, este envia el int por medio de la instancia del
     * ServiceLocatorFACADE a EmpleadoFACADE, se manda int para la busqueda por
     * numero del empleado donde este regresa las coincidencias, el método
     * devuelve una matriz con las coincidencia.
     *
     * @param numero
     * @return
     */
    public String[][] buscarPorNumero(int numero) {
        List<Object> emps = ServiceLocatorFACADE.getEmpleado().validarPorNumero(numero);
        String[][] info = new String[emps.size()][5];
        for (int i = 0; i < emps.size(); i++) {
            Empleado e = (Empleado) emps.get(i);
            info[i][0] = e.getId().toString();
            info[i][1] = e.getNumero();
            if (e.getSegundoNombre()== null) {
                info[i][2] = e.getPrimerNombre() + " "+ e.getApellidoPaterno() +
                        " " + e.getApellidoMaterno();
            } else {
                info[i][2] = e.getPrimerNombre() + " " + e.getSegundoNombre() + " "
                        + e.getApellidoPaterno() + " " + e.getApellidoMaterno();
            }
            info[i][3] = e.getPuesto().toString();
            info[i][4] = e.getCorreo();
        }
        return info;
    }

    /**
     * Método que se recibe un int, este int se envia se por medio de la
     * instancia del ServiceLocatorFACADE a un BaseFACADE donde este regresara
     * un objeto con la lista de asistencia de un evento implementado, el metodo
     * generarReporteLista devolvera un objeto.
     *
     * @param numero
     * @return listaAsistencia
     */
    public Object generarReporteLista(int numero) {
        Object listaAsistencia = (ImplementacionEvento) ServiceLocatorFACADE.getInstance().
                find(numero, ImplementacionEvento.class);
        return listaAsistencia;
    }

    /**
     * Método que recibe dos atributos de tipos date, esto los enviara a través
     * de la instancia del ServiceLocatorFACADE a un donde este regresara una
     * lista de objetos de los eventos que coincidan con las fechas enviadas, el
     * metodo generarReportePorFecha devolvera una matriz con los eventos que se
     * encontraron.
     *
     * @param de
     * @param hasta
     * @return
     */
    public String[][] generarReportePorFechas(Date de, Date hasta) {
        List<Object> eventosPorFechas = ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventoPorFechas(null, de, hasta);
        String[][] evento = new String[eventosPorFechas.size()][5];
        for (int i = 0; i < eventosPorFechas.size(); i++) {
            ImplementacionEvento eD = (ImplementacionEvento) eventosPorFechas.get(i);
            evento[i][0] = eD.getFechaInicial() + "";
            evento[i][1] = eD.getFechaFinal() + "";
            evento[i][2] = eD.getEvento().toString();
            evento[i][3] = eD.getSede().toString();
            evento[i][4] = eD.getProveedor().toString();
        }
        return evento;
    }

    /**
     * Método que recibe dos atributos de tipos date, esto los enviara a través
     * de la instancia del ServiceLocatorFACADE a un donde este regresara una
     * lista de objetos de los eventos que coincidan con las fechas enviadas, el
     * metodo generarReportePorFecha devolvera una matriz con los eventos que se
     * encontraron.
     *
     * @param de
     * @param hasta
     * @return
     */
    public String[][] buscarEventoPorFechas(Date de, Date hasta) {
        List<Object> eventosPorFechas = ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventoPorFechas(null, de, hasta);
        String[][] evento = new String[eventosPorFechas.size()][3];
        for (int i = 0; i < eventosPorFechas.size(); i++) {
            ImplementacionEvento eD = (ImplementacionEvento) eventosPorFechas.get(i);
            evento[i][0] = eD.getId() + "";
            evento[i][1] = eD.getFechaInicial() + "";
            evento[i][2] = eD.getEvento().toString();
        }
        return evento;
    }

    /**
     * Método que recibe un atributo de tipo departamento, este los enviara a
     * través de la instancia del ServiceLocatorFACADE a un donde este regresara
     * una lista de objetos de los eventos que coincidan con las fechas
     * enviadas, el método generarReportePorDepartamento devolvera una matriz
     * con los eventos que se encontraron.
     *
     * @param departamento
     * @return
     */
    public String[][] generarReportePorDepartamento(Departamento departamento) {
        List<Object> eventosPorDepartamento = ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventosPorDepartamento(departamento);
        String[][] evento = new String[eventosPorDepartamento.size()][5];
        for (int i = 0; i < eventosPorDepartamento.size(); i++) {
            ImplementacionEvento eD = (ImplementacionEvento) eventosPorDepartamento.get(i);
            evento[i][0] = eD.getFechaInicial() + "";
            evento[i][1] = eD.getFechaFinal() + "";
            evento[i][2] = eD.getEvento().toString();
            evento[i][3] = eD.getSede().toString();
            evento[i][4] = eD.getProveedor().toString();
            System.out.println(eD.getFechaFinal() + "");
        }
        return evento;
    }

    /**
     * * Método que recibe un atributo de tipo plantel, este los enviara a
     * través de la instancia del ServiceLocatorFACADE a un donde este regresara
     * una lista de objetos de los eventos que coincidan con las fechas
     * enviadas, el método generarReportePorPlantel devolvera una matriz con los
     * eventos que se encontraron.
     *
     * @param plantel
     * @return
     */
    public String[][] generarReportePorPlantel(Plantel plantel) {
        List<Object> eventosPorPlantel = ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventosPorPlantel(plantel);
        String[][] evento = new String[eventosPorPlantel.size()][5];
        for (int i = 0; i < eventosPorPlantel.size(); i++) {
            ImplementacionEvento eD = (ImplementacionEvento) eventosPorPlantel.get(i);
            evento[i][0] = eD.getFechaInicial() + "";
            evento[i][1] = eD.getFechaFinal() + "";
            evento[i][2] = eD.getEvento().toString();
            evento[i][3] = eD.getSede().toString();
            evento[i][4] = eD.getProveedor().toString();
            System.out.println(eD.getFechaFinal() + "");
        }
        return evento;
    }

    /**
     * Este método se utiliza para la creación del kardex del empleado, se
     * conectara con la clase ApachePOIUTIL para utlizar sus metodos y mandar
     * los registros del empleado para la generacion del kardex
     *
     * @param numero
     * @throws IOException
     */
    public void generarKardex(int numero) throws IOException {

        int numEvento = 0;
        //instancia de la clase ApachePoiUtil
        ApachePoiUtil word;
        List<String> lista = new ArrayList();
        Empleado empleadoInfo = (Empleado) ServiceLocatorFACADE.getInstance().
                find(numero, Empleado.class);

        Map<String, String> agregarInfo = new HashMap();
        String nombre = empleadoInfo.getPrimerNombre() + " " + empleadoInfo.getSegundoNombre()
                + " " + empleadoInfo.getApellidoPaterno() + " " + empleadoInfo.getApellidoMaterno();
        word = new ApachePoiUtil(nombre);
        //Se agregan los valores del empleado.
        agregarInfo.put("<@nombre>", nombre);
        agregarInfo.put("<@numero>", empleadoInfo.getNumero());
        agregarInfo.put("<@puesto>", empleadoInfo.getPuesto().toString());
        agregarInfo.put("", "");
        word.reemplazarValores(agregarInfo);

        for (Iterator it = empleadoInfo.getImplementacionEventos().iterator(); it.hasNext();) {
            numEvento++;
            ImplementacionEvento impEvento = (ImplementacionEvento) it.next();
            Evento evento = impEvento.getEvento();
            lista.add(evento.toString());
            lista.add(impEvento.getFechaInicial() + "");
            lista.add(impEvento.getFechaFinal() + "");
        }
        word.crearTabla(lista, numEvento);
        word.cerrarSesion();
    }
    
    /**
     * Metodo que recibe un objeto de tipo direccion el cual se conecta con 
     * el ServiceLocatorDELEGATE, donde este recibira una matriz de eventos 
     * implementados en la direccion
     * @param direccion
     * @return retorna matriz con la informacion de los eventos coincidentes
     */
    public String[][] generarReportePorDireccion(Direccion direccion) {
        List<Object> eventosPorDireccion = ServiceLocatorFACADE.getImplementacionEvento()
                .buscarEventosPorDireccion(direccion);
        String[][] evento = new String[eventosPorDireccion.size()][5];
        for (int i = 0; i < eventosPorDireccion.size(); i++) {
            ImplementacionEvento eD = (ImplementacionEvento) eventosPorDireccion.get(i);
            evento[i][0] = eD.getFechaInicial() + "";
            evento[i][1] = eD.getFechaFinal() + "";
            evento[i][2] = eD.getEvento().toString();
            evento[i][3] = eD.getSede().toString();
            evento[i][4] = eD.getProveedor().toString();
            System.out.println(eD.getFechaFinal() + "");
        }
        return evento;
    }
}
