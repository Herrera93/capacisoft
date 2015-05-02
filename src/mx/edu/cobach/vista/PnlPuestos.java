/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.controlador.BaseControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;
import mx.edu.cobach.vista.controlador.PuestoControlador;

/**
 *
 * @author liuts
 */
public class PnlPuestos extends javax.swing.JPanel implements Comunicador {

    private DefaultTableModel model;
    private String[] titulosTabla = {"ID","Nombre", "Eliminar"};
    private BaseControlador control;
    private PuestoControlador puestoControl;
    private int ipPuesto;

    /**
     * Creates new form PnlPuestos
     */
    public PnlPuestos() {
        initComponents();
        model = new DefaultTableModel(titulosTabla, 4);
        tablaTbl.setModel(model);
        tablaTbl.setColumnSelectionAllowed(false);
        tablaTbl.setDragEnabled(false);
        tablaTbl.setModel(model);
        control = new BaseControlador(this, Puesto.class);
        puestoControl = new PuestoControlador(this, Puesto.class);
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
        nombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        tablaSPn = new javax.swing.JScrollPane();
        tablaTbl = new javax.swing.JTable();
        buscarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        nombrePuesto_IP_TFd = new javax.swing.JTextField();
        agregarLBl = new javax.swing.JLabel();
        agregarMsjLbl = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));
        setPreferredSize(new java.awt.Dimension(1181, 587));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre del puesto:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarTFd.setEnabled(false);

        tablaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTbl.setColumnSelectionAllowed(true);
        tablaTbl.setEnabled(false);
        tablaTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaTbl.getTableHeader().setReorderingAllowed(false);
        tablaTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTblMouseClicked(evt);
            }
        });
        tablaSPn.setViewportView(tablaTbl);
        tablaTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaTbl.getColumnModel().getColumnCount() > 0) {
            tablaTbl.getColumnModel().getColumn(0).setResizable(false);
            tablaTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

        opcionMsjLbl.setText("Ingrese el nombre para buscar la información especifica");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarBtn)
                            .addComponent(opcionMsjLbl)
                            .addComponent(opcionLbl)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(nombreBuscarLbl)
                                .addGap(18, 18, 18)
                                .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionMsjLbl)
                .addGap(17, 17, 17)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreBuscarLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBtn)
                    .addComponent(agregarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(726, 587));
        informacionPnl.setMinimumSize(new java.awt.Dimension(726, 587));

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre del puesto:");

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.setEnabled(false);
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        nombrePuesto_IP_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrePuesto_IP_TFd.setEnabled(false);

        agregarLBl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLBl.setText("Agregar");

        agregarMsjLbl.setText("Ingrese la información a almacenar");

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarMsjLbl)
                    .addComponent(agregarLBl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addComponent(nombreLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombrePuesto_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(agregarLBl)
                .addGap(18, 18, 18)
                .addComponent(agregarMsjLbl)
                .addGap(22, 22, 22)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombrePuesto_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        if (nombrePuesto_IP_TFd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo esta vacio");
        } else {
            if (guardarBtn.getText().equals("Guardar")) {
                List<String> atr = new ArrayList<String>();
                atr.add(nombrePuesto_IP_TFd.getText());
                control.alta(HelperEntidad.getPuesto(atr,"Guardar"));
                
            } else if (guardarBtn.getText().equals("Modificar")) {
                List<String> atr = new ArrayList<String>();
                atr.add(ipPuesto+"");
                atr.add(nombrePuesto_IP_TFd.getText());
                control.modificacion(HelperEntidad.getPuesto(atr,"Mod/Eli"));
                
            }
            nombrePuesto_IP_TFd.setText("");
            agregarBtn.setEnabled(true);
            nombreBuscarTFd.setEnabled(false);
            nombrePuesto_IP_TFd.setEnabled(false);
            guardarBtn.setEnabled(false);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if(nombreBuscarTFd.isEnabled()==false){
            nombreBuscarTFd.setEnabled(true);
        } else if (nombreBuscarTFd.getText().equals("")) {
            control.buscarTodos();
        } else {
            puestoControl.buscar(nombreBuscarTFd.getText());
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        nombrePuesto_IP_TFd.setEnabled(true);
        guardarBtn.setEnabled(true);
        nombrePuesto_IP_TFd.setText("");
        agregarLBl.setText("Agregar");
        guardarBtn.setText("Guardar");
        agregarBtn.setEnabled(false);
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void tablaTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTblMouseClicked
        
        int row = tablaTbl.rowAtPoint(evt.getPoint());
        int col = tablaTbl.columnAtPoint(evt.getPoint());
        if(col == 0){
            int id = Integer.parseInt((String)model.getValueAt(row, 0));
            puestoControl.buscarMod(id);
        }
        else if(col == 1) {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == 0){
                int id = Integer.parseInt((String)model.getValueAt(row, 0));
                control.baja(id);
                control.buscarTodos();model.getDataVector().removeAllElements();
                nombreBuscarTFd.setEnabled(false);
                nombrePuesto_IP_TFd.setEnabled(false);
                nombrePuesto_IP_TFd.setText("");
                guardarBtn.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_tablaTblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel agregarLBl;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JLabel nombreBuscarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombrePuesto_IP_TFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JScrollPane tablaSPn;
    private javax.swing.JTable tablaTbl;
    // End of variables declaration//GEN-END:variables
    
    @Override
        public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
        public void setTabla(String[][] info) {
        tablaTbl.setEnabled(true);
        model.setDataVector(info, titulosTabla);
        TableColumn tc = tablaTbl.getColumnModel().getColumn(2);
        tc.setCellEditor(tablaTbl.getDefaultEditor(Boolean.class));
        tc.setCellRenderer (tablaTbl.getDefaultRenderer(Boolean.class));
        tc = tablaTbl.getColumnModel().getColumn(0);
        tablaTbl.getColumnModel().removeColumn(tc);
    }
    @Override
    public void setLista(List info, int i) {
    }

    @Override
    public void setInfo(List info) {
        
        nombrePuesto_IP_TFd.setText(info.get(0).toString());
        ipPuesto = Integer.parseInt(info.get(1).toString());
        nombrePuesto_IP_TFd.setEnabled(true);
        guardarBtn.setEnabled(true);
        guardarBtn.setText("Modificar");
        agregarLBl.setText("Modificar");
    }

    @Override
    public void setLogin(String[][] login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
