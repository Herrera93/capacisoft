package mx.edu.cobach.persistencia.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//import java.math.BigInteger;
//import java.util.List;
//import javax.swing.JOptionPane;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;

import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fernando
 */
public class ApachePoiUtil {

    XWPFDocument doc;
    List<XWPFParagraph> xwpfParagraphs;
    FileOutputStream salida;

    public ApachePoiUtil() throws IOException {
        this.doc = new XWPFDocument(new FileInputStream("nombre.docx"));
        xwpfParagraphs = doc.getParagraphs();
        salida = new FileOutputStream("salida.docx");
    }

    public void reemplazarTabla(Map<String, String> reemplazar) {
        List<XWPFTable> tables = doc.getTables();
        for (XWPFTable xwpfTable : tables) {
            List<XWPFTableRow> tableRows = xwpfTable.getRows();
            for (XWPFTableRow xwpfTableRow : tableRows) {
                List<XWPFTableCell> tableCells = xwpfTableRow
                        .getTableCells();
                for (XWPFTableCell xwpfTableCell : tableCells) {
                    xwpfParagraphs = xwpfTableCell.getParagraphs();
                    reemplazarParrafo(reemplazar);
                }
            }
        }
    }

    public void reemplazarParrafo(Map<String, String> reemplazar) {
        for (XWPFParagraph xwpfParagraph : xwpfParagraphs) {
            List<XWPFRun> xwpfRuns = xwpfParagraph.getRuns();
            for (XWPFRun xwpfRun : xwpfRuns) {
                String xwpfRunText = xwpfRun.getText(xwpfRun
                        .getTextPosition());
                for (Map.Entry<String, String> entry : reemplazar
                        .entrySet()) {
                    if (xwpfRunText != null
                            && xwpfRunText.contains(entry.getKey())) {
                        xwpfRunText = xwpfRunText.replaceAll(
                                entry.getKey(), entry.getValue());
                    }
                }
                xwpfRun.setText(xwpfRunText, 0);
            }
        }
    }
    
    public void cerrarSesion(){
            try {
            doc.write(salida);
            salida.flush();
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(ApachePoiUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

   