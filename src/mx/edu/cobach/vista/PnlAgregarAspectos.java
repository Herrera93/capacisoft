/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Competencia;
import mx.edu.cobach.vista.controlador.EncuestaControlador;

/**
 *
 * @author liuts
 */
public class PnlAgregarAspectos extends javax.swing.JPanel implements Comunicador{

    /**
     * Creates new form PnlAgregarAspectos
     */
    private final EncuestaControlador control;
    private final DefaultTableModel aspectosTblModel, aspectosAgrTblModel;
    private final String[] titulosTabla;    
    private final DefaultComboBoxModel competenciaModel;
    
    public PnlAgregarAspectos() {
        control = new EncuestaControlador(this);
        titulosTabla = new String[]{"ID", "Aspectos"};
        initComponents();
        aspectosTblModel = new DefaultTableModel(titulosTabla, 5);
        aspectosTbl.setModel(aspectosTblModel);
        
        aspectosAgrTblModel = new DefaultTableModel(titulosTabla, 0);
        aspectosAgregadosTbl.setModel(aspectosAgrTblModel);
        
        TableColumn columnaID;      
        
        columnaID = aspectosTbl.getColumnModel().getColumn(0);
        aspectosTbl.getColumnModel().removeColumn(columnaID);        
        
        columnaID = aspectosAgregadosTbl.getColumnModel().getColumn(0);
        aspectosAgregadosTbl.getColumnModel().removeColumn(columnaID);
        
        competenciaModel = new DefaultComboBoxModel();
        competenciaCBx.setModel(competenciaModel);
    }
    
    /*
    Este metodo es utilizado para llenar las listas con la informacion de la 
    base de datos. Se ejecuta antes de entrar al panel para que una vez que se
    entre se mostrara todos los datos correspondientes.
    */
    public void llenarTodo(){
        control.setClass(Competencia.class);
        control.buscarTodosLista(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        realizarEncuesta_Pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aspectosTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        aspectosAgregadosTbl = new javax.swing.JTable();
        agregarBtn = new javax.swing.JButton();
        agregaTodosBtn = new javax.swing.JButton();
        enviarBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        borrarTodosBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        competenciaLbl = new javax.swing.JLabel();
        competenciaCBx = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        empleadosBtn = new javax.swing.JButton();

        realizarEncuesta_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        aspectosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Aspecto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        aspectosTbl.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(aspectosTbl);
        aspectosTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (aspectosTbl.getColumnModel().getColumnCount() > 0) {
            aspectosTbl.getColumnModel().getColumn(0).setResizable(false);
            aspectosTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        aspectosAgregadosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Aspecto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        aspectosAgregadosTbl.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(aspectosAgregadosTbl);
        aspectosAgregadosTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (aspectosAgregadosTbl.getColumnModel().getColumnCount() > 0) {
            aspectosAgregadosTbl.getColumnModel().getColumn(0).setResizable(false);
            aspectosAgregadosTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setText(">");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        agregaTodosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregaTodosBtn.setText(">>");
        agregaTodosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaTodosBtnActionPerformed(evt);
            }
        });

        enviarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enviarBtn.setText("Enviar Encuesta");
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        borrarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        borrarBtn.setText("<");
        borrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarBtnActionPerformed(evt);
            }
        });

        borrarTodosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        borrarTodosBtn.setText("<<");
        borrarTodosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarTodosBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Diseño de encuesta");

        competenciaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        competenciaLbl.setText("Tipo de Competencia:");

        competenciaCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        competenciaCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tecnología", "Comunicación", "Trabajo en equipo" }));
        competenciaCBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                competenciaCBxItemStateChanged(evt);
            }
        });

        jLabel2.setText("<html>Al seleccionar un tipo de competencia se mostraran los aspectos correspondientes en la secci&oacute;n de dise&ntilde;o de encuesta.</html>");

        empleadosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empleadosBtn.setText("Agregar empleados");
        empleadosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout realizarEncuesta_PnlLayout = new javax.swing.GroupLayout(realizarEncuesta_Pnl);
        realizarEncuesta_Pnl.setLayout(realizarEncuesta_PnlLayout);
        realizarEncuesta_PnlLayout.setHorizontalGroup(
            realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                        .addComponent(empleadosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                        .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                                .addComponent(competenciaLbl)
                                .addGap(18, 18, 18)
                                .addComponent(competenciaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(agregaTodosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(borrarTodosBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(borrarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(agregarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        realizarEncuesta_PnlLayout.setVerticalGroup(
            realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(competenciaLbl)
                    .addComponent(competenciaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregaTodosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrarTodosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empleadosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(realizarEncuesta_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(realizarEncuesta_Pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarBtnActionPerformed

    private void competenciaCBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_competenciaCBxItemStateChanged
        if(competenciaCBx.getSelectedIndex() != 0)
        control.buscarPorCompetencia(competenciaCBx.getSelectedItem());
    }//GEN-LAST:event_competenciaCBxItemStateChanged

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        int renglonIndice = aspectosTbl.getSelectedRow();
        if(aspectosTblModel.getRowCount() == 0){
            setMensaje("No hay aspectos que agregar");
        }else if(renglonIndice == -1){
            setMensaje("No se ha seleccionado un aspecto");
        }else{
            String[] renglon = new String[2];
            renglon[0] = (String) aspectosTblModel.getValueAt(renglonIndice, 0);
            renglon[1] = (String) aspectosTblModel.getValueAt(renglonIndice, 1);
            aspectosAgrTblModel.addRow(renglon);
            removerAgregados();
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void agregaTodosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaTodosBtnActionPerformed
        int renglones = aspectosTblModel.getRowCount();
        if(renglones == 0){
            setMensaje("No hay aspectos que agregar");
        }else{
            for(int i = 0; i < renglones; i++){
                String[] aspecto = new String[2];
                aspecto[0] = (String) aspectosTblModel.getValueAt(i, 0);
                aspecto[1] = (String) aspectosTblModel.getValueAt(i, 1);
                aspectosAgrTblModel.addRow(aspecto);
            }
            removerAgregados();
        }
    }//GEN-LAST:event_agregaTodosBtnActionPerformed

    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        int renglonIndice = aspectosAgregadosTbl.getSelectedRow();
        if(aspectosAgrTblModel.getRowCount() == 0){
            setMensaje("No hay aspectos que eliminar");
        }else if(renglonIndice == -1){
            setMensaje("No se ha seleccionado un aspecto");
        }else{
            aspectosAgrTblModel.removeRow(renglonIndice);
            //Se recarga el combo box para actualizacion
            int indiceOriginal = competenciaCBx.getSelectedIndex();
            competenciaCBx.setSelectedIndex(0);
            competenciaCBx.setSelectedIndex(indiceOriginal);
        }
    }//GEN-LAST:event_borrarBtnActionPerformed

    private void borrarTodosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTodosBtnActionPerformed
        if(aspectosAgrTblModel.getRowCount() == 0){
            setMensaje("No hay aspectos que eliminar");
        }else{
            for(int i = 0; i < aspectosAgrTblModel.getRowCount(); i++){
                aspectosAgrTblModel.removeRow(i);
                i--;
            }        
            //Se recarga el combo box para actualizacion
            int indiceOriginal = competenciaCBx.getSelectedIndex();
            competenciaCBx.setSelectedIndex(0);
            competenciaCBx.setSelectedIndex(indiceOriginal);
        }
    }//GEN-LAST:event_borrarTodosBtnActionPerformed

    private void empleadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_empleadosBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregaTodosBtn;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTable aspectosAgregadosTbl;
    private javax.swing.JTable aspectosTbl;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton borrarTodosBtn;
    private javax.swing.JComboBox competenciaCBx;
    private javax.swing.JLabel competenciaLbl;
    private javax.swing.JButton empleadosBtn;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel realizarEncuesta_Pnl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo utilizado par actualizar las tablas de los aspectos, de esta manera
     * se eliminaran los aspectos que ya hayan sido agregados a evaluar en
     * la encuesta.
     */
    private void removerAgregados(){
        String[] idsAgregadas = new String[aspectosAgrTblModel.getRowCount()];
        for(int i = 0; i < idsAgregadas.length; i++){
            idsAgregadas[i] = (String) aspectosAgrTblModel.getValueAt(i, 0);
        }
        List<String> listaIds = Arrays.asList(idsAgregadas);
        for(int i = 0; i < aspectosTbl.getRowCount(); i++){
            if(listaIds.contains((String) aspectosTblModel.getValueAt(i, 0))) {
                aspectosTblModel.removeRow(i);
                i--;
            }
        }
    }

    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void setTabla(String[][] info) {
        TableColumn columnaID;
        aspectosTblModel.setDataVector(info, titulosTabla);        
        //Esconder columna ID
        columnaID = aspectosTbl.getColumnModel().getColumn(0);
        aspectosTbl.getColumnModel().removeColumn(columnaID);        
        //Remover aspectos ya seleccionados
        removerAgregados();
    }

    @Override
    public void setInfo(List info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLista(List info, int i) {
        if(info.isEmpty()) return;
        switch(i){
            case 1:
                competenciaModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  competenciaModel.addElement(info.get(j));
                }
                competenciaModel.insertElementAt(new Competencia(""), 0);
                competenciaCBx.setSelectedIndex(0);
                break;
        }
    }
}