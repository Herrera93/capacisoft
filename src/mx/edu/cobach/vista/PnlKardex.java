/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.vista.controlador.ReporteControlador;

/**
 *
 * @author Fernando
 */
public class PnlKardex extends javax.swing.JPanel implements Comunicador {

    private ReporteControlador control;
    private Empleado controlEmpleado;
    private DefaultTableModel model;
    private String id;
    private String[] titulosTabla = {"Numero", "Nombre", "Puesto", "Correo Electronico"};

    /**
     * Constructor de PnlKardex
     */
    public PnlKardex() {
        initComponents();
        control = new ReporteControlador(this, Empleado.class);
        controlEmpleado = new Empleado();
        model = new DefaultTableModel(titulosTabla, 15){
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        empleadoTbl.setModel(model);
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
        numeroLbl = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        numeroTFd = new javax.swing.JTextField();
        nombreTFd = new javax.swing.JTextField();
        opcionesLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        tipoLbl = new javax.swing.JLabel();
        tipoCBx = new javax.swing.JComboBox();
        nombreMsjLbl = new javax.swing.JLabel();
        numeroMsjLbl = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        empleadoSPn = new javax.swing.JScrollPane();
        empleadoTbl = new javax.swing.JTable();
        generarBtn = new javax.swing.JButton();
        informacionLbl = new javax.swing.JLabel();
        kardexMsjLbl = new javax.swing.JLabel();

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setPreferredSize(new java.awt.Dimension(408, 587));

        numeroLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroLbl.setText("Numero del Empleado:");

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre:");

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        numeroTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroTFd.setEnabled(false);
        numeroTFd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeroTFdFocusGained(evt);
            }
        });
        numeroTFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTFdKeyTyped(evt);
            }
        });

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.setEnabled(false);
        nombreTFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTFdKeyTyped(evt);
            }
        });

        opcionesLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionesLbl.setText("Opciones ");

        opcionMsjLbl.setText("Seleccione el tipo de busqueda a realizar para activar los campos ");

        tipoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoLbl.setText("Tipo de Búsqueda:");

        tipoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<html><br></html>", "Numero del Empleado", "Nombre " }));
        tipoCBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCBxActionPerformed(evt);
            }
        });

        nombreMsjLbl.setText("<html>Ingrese un nombre para devolver las coincidencias del nombre<br> con algún empleado</html>");

        numeroMsjLbl.setText("Ingrese el numero del empleado ");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(numeroLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(opcionMsjLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(tipoLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroMsjLbl)
                                    .addComponent(nombreMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opcionesLbl))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(nombreLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opcionesLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionMsjLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLbl)
                    .addComponent(tipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(numeroMsjLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLbl)
                    .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nombreMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(767, 566));
        informacionPnl.setMinimumSize(new java.awt.Dimension(767, 566));

        empleadoTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Puesto", "Correo electrónico"
            }
        ));
        empleadoTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleadoTblMouseClicked(evt);
            }
        });
        empleadoSPn.setViewportView(empleadoTbl);

        generarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generarBtn.setText("Generar");
        generarBtn.setEnabled(false);
        generarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarBtnActionPerformed(evt);
            }
        });

        informacionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        informacionLbl.setText("Información del Kardex del empleado");

        kardexMsjLbl.setText("Seleccione un empleado de la tabla para generar el Kardex y presionar el boton \"Generar\"");

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empleadoSPn, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(generarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(informacionLbl)
                            .addComponent(kardexMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(informacionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(kardexMsjLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empleadoSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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

    private void numeroTFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTFdKeyTyped
        char car = evt.getKeyChar();
        if (numeroTFd.getText().length() >= 5) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_numeroTFdKeyTyped

    private void nombreTFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFdKeyTyped
        char car = evt.getKeyChar();
        if (nombreTFd.getText().length() >= 20) {
            evt.consume();
        }
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á' //Minúsculas             
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á' //Mayúsculas             
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && car != 'ñ'
                && car != 'Ñ'
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreTFdKeyTyped

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if (!numeroTFd.getText().isEmpty() || !nombreTFd.getText().isEmpty()) {
            if (!numeroTFd.getText().isEmpty()) {
                control.buscarPorNumero(Integer.parseInt(numeroTFd.getText()));
                numeroTFd.setText("");
                tipoCBx.setSelectedIndex(0);
            }
            if (!nombreTFd.getText().isEmpty()) {
                control.buscarPorNombre(nombreTFd.getText());
                nombreTFd.setText("");
                tipoCBx.setSelectedIndex(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene el Campos Vacios");
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void empleadoTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadoTblMouseClicked
        int row = empleadoTbl.rowAtPoint(evt.getPoint());
        id = (String) model.getValueAt(row, 0);
        generarBtn.setEnabled(true);
    }//GEN-LAST:event_empleadoTblMouseClicked

    private void generarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarBtnActionPerformed
        try {
            control.generarKardex(id);
        } catch (IOException ex) {
            Logger.getLogger(PnlKardex.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        empleadoTbl.clearSelection();
        generarBtn.setEnabled(false);
    }//GEN-LAST:event_generarBtnActionPerformed

    private void numeroTFdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroTFdFocusGained
        nombreTFd.setEnabled(false);
        nombreTFd.setText("");
        numeroTFd.setEnabled(true);
    }//GEN-LAST:event_numeroTFdFocusGained

    private void tipoCBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCBxActionPerformed
        if(tipoCBx.getSelectedIndex()==1){
            numeroTFd.setEnabled(true);
            nombreTFd.setEnabled(false);
            nombreTFd.setText("");
        }else if(tipoCBx.getSelectedIndex()==2){
            nombreTFd.setEnabled(true);
            numeroTFd.setEnabled(false);
            numeroTFd.setText("");
        }else{
            nombreTFd.setEnabled(false);
            numeroTFd.setEnabled(false);
            numeroTFd.setText("");
            nombreTFd.setText("");
        }
    }//GEN-LAST:event_tipoCBxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JScrollPane empleadoSPn;
    private javax.swing.JTable empleadoTbl;
    private javax.swing.JButton generarBtn;
    private javax.swing.JLabel informacionLbl;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JLabel kardexMsjLbl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JLabel nombreMsjLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel numeroLbl;
    private javax.swing.JLabel numeroMsjLbl;
    private javax.swing.JTextField numeroTFd;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JLabel opcionesLbl;
    private javax.swing.JComboBox tipoCBx;
    private javax.swing.JLabel tipoLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje,
                        "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void setTabla(String[][] info) {
        if (info.length==0) {
            setMensaje("No se encontro la búsqueda");
            model.setDataVector(info, titulosTabla);
            empleadoTbl.getColumnModel().getColumn(0).setPreferredWidth(20);
            empleadoTbl.getColumnModel().getColumn(1).setPreferredWidth(170);
        } else {
            model.setDataVector(info, titulosTabla);
            empleadoTbl.getColumnModel().getColumn(0).setPreferredWidth(20);
            empleadoTbl.getColumnModel().getColumn(1).setPreferredWidth(170);
        }
    }

    @Override
    public void setInfo(List info) {
        
    }

    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenarDatos(Object implementacionEvento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
