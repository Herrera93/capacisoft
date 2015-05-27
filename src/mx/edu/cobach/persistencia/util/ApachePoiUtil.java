package mx.edu.cobach.persistencia.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.math.BigInteger;
//import java.util.List;
//import javax.swing.JOptionPane;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;

import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 * Esta clase sirve como conexcion entre la aplicacion de java y la apliacion
 * word de la paqueteria office, utilizando las librerias de la API ApachePOI 
 * la cual es openSource.
 * @author fernando
 */
public class ApachePoiUtil {

    XWPFDocument doc;
    List<XWPFParagraph> xwpfParagraphs;
    FileOutputStream salida;

    /**
     * Constructor de la clase ApachePoi
     * @throws IOException 
     */
    public ApachePoiUtil() throws IOException {
        this.doc = new XWPFDocument(new FileInputStream("nombre.docx"));
        this.xwpfParagraphs = doc.getParagraphs();
        this.salida = new FileOutputStream("salida.docx");
    }

    /**
     * Método que se ejecuta cuando es llamado por el método generarReporte de
     * la clase ReporteDELEGATE, recibe un HasMAP el cual contiene una etiqueta y 
     * el valor a reemplazar la etiqueta, esta etiqueta se encuentra contenida en 
     * el documento word que se usara como plantilla para generar el kardex del 
     * empleado.
     * @param reemplazar 
     */
    public void reemplazarValores(Map<String, String> reemplazar) {

        //Esta instacia obtiene todas las tablas del documento word.
        List<XWPFTable> tables = doc.getTables();
        //Este ciclo se recorre por tabla 
        for (XWPFTable xwpfTable : tables) {
            //obtiene los renglones de la tabla actual en el ciclo
            List<XWPFTableRow> tableRows = xwpfTable.getRows();
            //Recorre cada renglon de la tabla
            for (XWPFTableRow xwpfTableRow : tableRows) {
                //Obtiene todas las celdas del renglon actual
                List<XWPFTableCell> tableCells = xwpfTableRow
                        .getTableCells();
                //Recorre cada celda de la tabla
                for (XWPFTableCell xwpfTableCell : tableCells) {
                    //Se obtiene el parrafo de la celda actual
                    xwpfParagraphs = xwpfTableCell.getParagraphs();
                    //Se manda llamar el metodo reemplazarParrafo para cambiar las
                    //etiquetas predefinidas por texto, se manda el hasMap reemplazar.
                    reemplazarParrafo(reemplazar);
                }
            }
        }
    }
    
    /**
     * Método que se cuando es llamado por el método generarKardex de la clase
     * ReporteControlador, este recibe una lista de tipo string donde se contendra
     * toda la informacion con respeto a los evento que asistio un empleado, un int
     * que tendra la cantidad de eventos a los que asistió, donde anadira reglones
     * a la plantila de word para insertar los reglones.
     * @param crear
     * @param numEvento 
     */
    public void crearTabla(List<String> crear, int numEvento) {
        
        //Obtiene las tablas de la plantilla de word
        List<XWPFTable> tables = doc.getTables();
        //Ciclo de 0 haste el numero de eventos que tiene el empleado
        for (int numRenglon = 0; numRenglon < numEvento; numRenglon++) {
            //Crea el renglon de la tabla 
            XWPFTableRow renglon = tables.get(1).createRow();
            //obtiene la lista de las celdas del renglo
            List<XWPFTableCell> tableCells = renglon.getTableCells();
            //asigna los eventos, fecha inicial y fecha final a cada celda
                tableCells.get(0).setText(crear.get(numRenglon*3));
                tableCells.get(1).setText(crear.get(numRenglon*3+1));
                tableCells.get(2).setText(crear.get(numRenglon*3+2 ));
        }
    }
    
    /**
     * Metodo que se ejecuta al ser llamado por el metodo reemplazarValores, donde
     * recibe el HashMAP con la informacion del empleado y las etiquetas que seran
     * reemplazadas por el texto enviado.
     * @param reemplazar 
     */
    public void reemplazarParrafo(Map<String, String> reemplazar) {
        //recorre todo el renglon o parrafo
        for (XWPFParagraph xwpfParagraph : xwpfParagraphs) {
            //Obtiene todo el texto contenido en renglo o parrafo
            List<XWPFRun> xwpfRuns = xwpfParagraph.getRuns();
            //Ciclo que se recorre por cada texto encontrado
            for (XWPFRun xwpfRun : xwpfRuns) {
                //Obtiene el texo actual y lo convierte en string
                String xwpfRunText = xwpfRun.getText(xwpfRun
                        .getTextPosition());
                //Recorre el map buscado la coincidencia entre el hasMap y el
                //text obtenido por el RunText
                for (Map.Entry<String, String> entry : reemplazar
                        .entrySet()) {
                    //Si encuentra la coincidencia entra al ciclo
                    if (xwpfRunText != null
                            && xwpfRunText.contains(entry.getKey())) {
                        //Reemplazar el texto obtenido por el parrafo
                        xwpfRunText = xwpfRunText.replaceAll(
                                entry.getKey(), entry.getValue());
                    }
                }
                xwpfRun.setText(xwpfRunText, 0);
            }
        }
    }

    /**
     * Método que se llama para cerrar la sesión, donde se indica que ya no habra
     * modificaciones al documento y cierra el documento para su edición renombrando
     * el archivo y asignandole un nombre de salida.
     */
    public void cerrarSesion() {
        try {
            doc.write(salida);
            salida.flush();
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(ApachePoiUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
