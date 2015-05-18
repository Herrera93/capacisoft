/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.vista.controlador.BaseControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author liuts
 */
public class PnlPlantel extends javax.swing.JPanel implements Comunicador {
    
    private BaseControlador control;
    

    /**
     * Creates new form PnlPlantel
     */
    public PnlPlantel() {
        initComponents();
        control = new BaseControlador(this, Plantel.class);
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
        tablaPlantelSPn = new javax.swing.JScrollPane();
        tablaPlantelTbl = new javax.swing.JTable();
        agregarTFd = new javax.swing.JButton();
        NombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        BuscarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        nombreAgregarLbl = new javax.swing.JLabel();
        diraccionLbl = new javax.swing.JLabel();
        zonaLbl = new javax.swing.JLabel();
        nombreAgregarTFd = new javax.swing.JTextField();
        zonaCBx = new javax.swing.JComboBox();
        CalleTFd = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        agregarLbl = new javax.swing.JLabel();
        agregarMsjLbl = new javax.swing.JLabel();
        calleLbl = new javax.swing.JLabel();
        numeroLbl = new javax.swing.JLabel();
        numeroTFd = new javax.swing.JTextField();
        coloniaLbl = new javax.swing.JLabel();
        coloniaTFd = new javax.swing.JTextField();

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));

        tablaPlantelTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPlantelTbl.setMaximumSize(new java.awt.Dimension(225, 64));
        tablaPlantelTbl.setMinimumSize(new java.awt.Dimension(225, 64));
        tablaPlantelSPn.setViewportView(tablaPlantelTbl);
        if (tablaPlantelTbl.getColumnModel().getColumnCount() > 0) {
            tablaPlantelTbl.getColumnModel().getColumn(0).setResizable(false);
            tablaPlantelTbl.getColumnModel().getColumn(1).setResizable(false);
            tablaPlantelTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        agregarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarTFd.setText("Agregar");

        NombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombreBuscarLbl.setText("Nombre del plantel:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BuscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

        opcionMsjLbl.setText("Ingrese el nombre para buscar la información especifica");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaPlantelSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addComponent(agregarTFd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionMsjLbl)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(NombreBuscarLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(opcionLbl))
                        .addGap(0, 94, Short.MAX_VALUE))))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionMsjLbl)
                .addGap(18, 18, 18)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreBuscarLbl)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarTFd)
                    .addComponent(BuscarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaPlantelSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(767, 394));
        informacionPnl.setMinimumSize(new java.awt.Dimension(767, 394));

        nombreAgregarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreAgregarLbl.setText("Nombre del plantel:");

        diraccionLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diraccionLbl.setText("Dirección del plantel");

        zonaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zonaLbl.setText("Zona:");

        nombreAgregarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        zonaCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zonaCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Oficinas Generales", "Zona Norte", "Zona Sur" }));
        zonaCBx.setToolTipText("Seleccioné la zona del plantel");

        CalleTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        agregarLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLbl.setText("Agregar");

        agregarMsjLbl.setText("Ingrese la información a almacenar");

        calleLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calleLbl.setText("Calle:");

        numeroLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroLbl.setText("Numero:");

        numeroTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        coloniaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coloniaLbl.setText("Colonia:");

        coloniaTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addComponent(nombreAgregarLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreAgregarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(agregarMsjLbl)
                    .addComponent(agregarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diraccionLbl)
                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(informacionPnlLayout.createSequentialGroup()
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coloniaLbl))
                            .addGap(75, 75, 75)
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CalleTFd, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(coloniaTFd))
                            .addGap(81, 81, 81)
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(informacionPnlLayout.createSequentialGroup()
                                    .addComponent(zonaLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zonaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(informacionPnlLayout.createSequentialGroup()
                                    .addComponent(numeroLbl)
                                    .addGap(46, 46, 46)
                                    .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(agregarLbl)
                .addGap(11, 11, 11)
                .addComponent(agregarMsjLbl)
                .addGap(18, 18, 18)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAgregarLbl)
                    .addComponent(nombreAgregarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(diraccionLbl)
                        .addGap(33, 33, 33)
                        .addComponent(calleLbl))
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CalleTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroLbl)
                            .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zonaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zonaLbl)
                    .addComponent(coloniaLbl)
                    .addComponent(coloniaTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informacionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        List <Object> atr = new ArrayList<>();
        
        atr.add(zonaCBx.getSelectedIndex()+1);
        atr.add(nombreAgregarTFd.getText());
        atr.add(CalleTFd.getText());
        atr.add(numeroTFd.getText());
        atr.add(coloniaTFd.getText());
        control.alta(HelperEntidad.getPlantel(atr));
        
        
    }//GEN-LAST:event_guardarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JTextField CalleTFd;
    private javax.swing.JLabel NombreBuscarLbl;
    private javax.swing.JLabel agregarLbl;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JButton agregarTFd;
    private javax.swing.JLabel calleLbl;
    private javax.swing.JLabel coloniaLbl;
    private javax.swing.JTextField coloniaTFd;
    private javax.swing.JLabel diraccionLbl;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JLabel nombreAgregarLbl;
    private javax.swing.JTextField nombreAgregarTFd;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel numeroLbl;
    private javax.swing.JTextField numeroTFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JScrollPane tablaPlantelSPn;
    private javax.swing.JTable tablaPlantelTbl;
    private javax.swing.JComboBox zonaCBx;
    private javax.swing.JLabel zonaLbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje,
                "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void setTabla(String[][] info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInfo(List info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
