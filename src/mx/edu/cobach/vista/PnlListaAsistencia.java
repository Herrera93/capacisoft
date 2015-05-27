/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.print.PrinterException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.ImplementacionCurso;
import mx.edu.cobach.vista.controlador.ReporteControlador;

/**
 *
 * @author liuts
 */
public class PnlListaAsistencia extends javax.swing.JPanel implements Comunicador {

    private final DefaultTableModel modelEvento, modelLista;
    private String[] titulosTablaEvento, titulosTablaLista;
    private final ReporteControlador control;

    /**
     * Creates new form PnlListaAsistencia
     */
    public PnlListaAsistencia() {
        initComponents();
        this.titulosTablaEvento = new String[]{"id", "Fecha inicial", "Nombre del Evento"};
        modelEvento = new DefaultTableModel(titulosTablaEvento, 6) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        eventoTbl.setModel(modelEvento);
        this.titulosTablaLista = new String[]{"ID", "Numero empleado", "Nombre del empleado", "Puesto", "Correo Electronico"};
        modelLista = new DefaultTableModel(titulosTablaLista, 6) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        listaAsistenciaTbl.setModel(modelLista);
        control = new ReporteControlador(this, ImplementacionCurso.class);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionPnl = new javax.swing.JPanel();
        eventoSPn = new javax.swing.JScrollPane();
        eventoTbl = new javax.swing.JTable();
        fechaInicialLbl = new javax.swing.JLabel();
        fechaHastaLbl = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        fechaInicioDCh = new com.toedter.calendar.JDateChooser();
        fechaHastaDCh = new com.toedter.calendar.JDateChooser();
        informacionPnl = new javax.swing.JPanel();
        listaAsistenciaSPn = new javax.swing.JScrollPane();
        listaAsistenciaTbl = new javax.swing.JTable();
        imprimirBtn = new javax.swing.JButton();
        informacionLbl = new javax.swing.JLabel();

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setPreferredSize(new java.awt.Dimension(408, 587));

        eventoTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha del evento", "Nombre del evento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventoTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventoTblMouseClicked(evt);
            }
        });
        eventoSPn.setViewportView(eventoTbl);
        if (eventoTbl.getColumnModel().getColumnCount() > 0) {
            eventoTbl.getColumnModel().getColumn(0).setResizable(false);
            eventoTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        fechaInicialLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaInicialLbl.setText("Fecha de:");

        fechaHastaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaHastaLbl.setText("a:");

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

        opcionMsjLbl.setText("Ingrese un rango de fecha para buscar eventos especificos");

        fechaInicioDCh.setDateFormatString("dd/MM/yyyy");
        fechaInicioDCh.setFocusable(false);
        fechaInicioDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaInicioDChPropertyChange(evt);
            }
        });

        fechaHastaDCh.setDateFormatString("dd/MM/yyyy");
        fechaHastaDCh.setFocusable(false);
        fechaHastaDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fechaHastaDChPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionLbl)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(buscarBtn))
                            .addComponent(opcionMsjLbl))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                        .addComponent(eventoSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                        .addComponent(fechaInicialLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaInicioDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaHastaLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaHastaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addComponent(opcionLbl)
                        .addGap(10, 10, 10)
                        .addComponent(opcionMsjLbl)
                        .addGap(32, 32, 32)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaHastaLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaInicialLbl)))
                    .addComponent(fechaInicioDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaHastaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eventoSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(767, 558));
        informacionPnl.setMinimumSize(new java.awt.Dimension(767, 558));

        listaAsistenciaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero del empleado", "Nombre del empleado", "Puesto", "Correo electrónico "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaAsistenciaSPn.setViewportView(listaAsistenciaTbl);
        if (listaAsistenciaTbl.getColumnModel().getColumnCount() > 0) {
            listaAsistenciaTbl.getColumnModel().getColumn(0).setResizable(false);
            listaAsistenciaTbl.getColumnModel().getColumn(1).setResizable(false);
            listaAsistenciaTbl.getColumnModel().getColumn(2).setResizable(false);
            listaAsistenciaTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        imprimirBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imprimirBtn.setText("Imprimir");
        imprimirBtn.setEnabled(false);
        imprimirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBtnActionPerformed(evt);
            }
        });

        informacionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        informacionLbl.setText("Información de los empleados");

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaAsistenciaSPn, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addComponent(informacionLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informacionLbl)
                .addGap(29, 29, 29)
                .addComponent(listaAsistenciaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imprimirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo que se ejecuta al cambiar la fecha del componente deFechaDCh. Se
     * ajusta la fecha minima del componente aFechaDCh y se ajusta si esta ya es
     * menor que la actual.
     *
     * @param evt Evento de cambio de propiedad
     */
    private void fechaInicioDChPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaInicioDChPropertyChange
        Date deFecha = fechaInicioDCh.getDate();
        if (deFecha != null) {
            fechaHastaDCh.setMinSelectableDate(deFecha);
            if (fechaHastaDCh.getDate() != null && fechaHastaDCh.getDate().before(deFecha)) {
                fechaHastaDCh.setDate(deFecha);
            }
        }
    }//GEN-LAST:event_fechaInicioDChPropertyChange

    /**
     * Metodo que se ejecuta al cambiar la fecha del componente aFechaDCh. Se
     * ajusta la fecha maxima del componente deFechaDCh y se ajusta si esta ya
     * es mayor que la actual.
     *
     * @param evt Evento de cambio de propiedad
     */
    private void fechaHastaDChPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fechaHastaDChPropertyChange
        Date hastaFecha = fechaHastaDCh.getDate();
        if (hastaFecha != null) {
            fechaInicioDCh.setMaxSelectableDate(hastaFecha);
            if (fechaInicioDCh.getDate() != null && fechaInicioDCh.getDate().after(hastaFecha)) {
                fechaInicioDCh.setDate(hastaFecha);
            }
        }
    }//GEN-LAST:event_fechaHastaDChPropertyChange

    /**
     * Evento que se ejecuta cuando se presiona el boton Buscar el cual obtendra
     * el rango de fechas para realizar la busqueda de los eventos, ademas 
     * @param evt 
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        control.buscarEventosPorFecha(fechaInicioDCh.getDate(), fechaHastaDCh.getDate());
        imprimirBtn.setEnabled(true);
        fechaInicioDCh.setDate(null);
        fechaHastaDCh.setDate(null);
    }//GEN-LAST:event_buscarBtnActionPerformed

    /**
     * Evento que se produce cuando se selecciona un renglon de la tabla eventoTbl,
     * donde se obtendra el id y se realizara la busqueda por el medo generarReporteLista.
     * @param evt 
     */
    private void eventoTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventoTblMouseClicked
        int row = eventoTbl.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt((String) modelEvento.getValueAt(row, 0));
        control.generarReporteLista(id);
        eventoTbl.clearSelection();
    }//GEN-LAST:event_eventoTblMouseClicked

    /**
     * Este evento se ejecuta cuando se presiona el boton Imprimir, el cual
     * manda llamar un metodo de la tabla, el cual abrira una cuadro de dialoga
     * para realizar la impresion
     * @param evt 
     */
    private void imprimirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirBtnActionPerformed
        try {
            listaAsistenciaTbl.print();
        } catch (PrinterException ex) {
            Logger.getLogger(PnlListaAsistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imprimirBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JScrollPane eventoSPn;
    private javax.swing.JTable eventoTbl;
    private com.toedter.calendar.JDateChooser fechaHastaDCh;
    private javax.swing.JLabel fechaHastaLbl;
    private javax.swing.JLabel fechaInicialLbl;
    private com.toedter.calendar.JDateChooser fechaInicioDCh;
    private javax.swing.JButton imprimirBtn;
    private javax.swing.JLabel informacionLbl;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JScrollPane listaAsistenciaSPn;
    private javax.swing.JTable listaAsistenciaTbl;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo que recibe una matriz, donde se obtendran sus valores para
     * añadirlos a la modelo de la tabla, también se ocultara la columna id y se
     * le dara se redefinira el ancho de la columna 0.
     *
     * @param info Matriz String para vaciar en tabla
     */
    @Override
    public void setTabla(String[][] info) {
        if (info.length == 0) {
            modelEvento.setDataVector(new String[3][0], titulosTablaEvento);
            JOptionPane.showMessageDialog(null, "No se Encontro la busqueda");
        } else {
            modelEvento.setDataVector(info, titulosTablaEvento);
            //Esconder columna ID
            TableColumn idTbc = eventoTbl.getColumnModel().getColumn(0);
            eventoTbl.getColumnModel().removeColumn(idTbc);
        }
    }

    /**
     * Metodo que recibe una matriz, donde se obtendran sus valores para
     * añadirlos a la modelo de la tabla, también se ocultara la columna id y se
     * le dara se redefinira el ancho de la columna 0.
     *
     * @param info Matriz String para vaciar en tabla
     */
    @Override
    public void setInfo(List info) {
        int x = -1;
            ImplementacionCurso listaAsistencia = (ImplementacionCurso) info.get(0);
            System.out.println(listaAsistencia.getFechaFinal() + "");
            String[][] lista = new String[listaAsistencia.getEmpleados().size()][6];
            for (Iterator it = listaAsistencia.getEmpleados().iterator(); it.hasNext();) {
                x++;
                Empleado empleado = (Empleado) it.next();
                lista[x][0] = empleado.getId() + "";
                lista[x][1] = empleado.getNumero() + "";
                lista[x][2] = empleado.getPrimerNombre() + " " + empleado.getSegundoNombre()
                        + " " + empleado.getApellidoPaterno() + " " + empleado.getApellidoMaterno();
                lista[x][3] = empleado
                        .getPuesto().toString();
                lista[x][4] = empleado.getCorreo();
            }

            modelLista.setDataVector(lista, titulosTablaLista);
            //Esconder columna ID
            TableColumn idTbc = listaAsistenciaTbl.getColumnModel().getColumn(0);
            listaAsistenciaTbl.getColumnModel().removeColumn(idTbc);
            listaAsistenciaTbl.getColumnModel().getColumn(0).setPreferredWidth(30);
    }

    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
