/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.controlador.EncuestaControlador;

/**
 * Clase de panel para agregar los diferentes empleados en una encuesta.
 */
public class PnlAgregarEmpleados extends javax.swing.JPanel implements Comunicador{

    //Controlador que permite la interaccion con las capas bajas
    private final EncuestaControlador control;
    //Modelo de la tabla empleados
    private final DefaultTableModel empleadosTblModel;
    //Modelo de la tabla de aspectos a empleados
    private final DefaultTableModel empleadosAgrTblModel;    
    //Titulos de la tablas (Ambas usan la misma)
    private final String[] titulosTabla;
    //Modelo del combo box de competencias    
    private final DefaultComboBoxModel busquedaModel;
    
     /**
     * Se inicializan la configuracion de los componentes  y los atributos.
     */
    public PnlAgregarEmpleados() {
        control = new EncuestaControlador(this);
        titulosTabla = new String[]{"ID", "Numero", "Empleados"};
        initComponents();
        empleadosTblModel = new DefaultTableModel(titulosTabla, 5);
        empleadosTbl.setModel(empleadosTblModel);
        
        empleadosAgrTblModel = new DefaultTableModel(titulosTabla, 0);
        empleadosAgrTbl.setModel(empleadosAgrTblModel);
        
        //Se esconden las columnas ID en ambas tablas
        TableColumn columnaID;      
        
        columnaID = empleadosTbl.getColumnModel().getColumn(0);
        empleadosTbl.getColumnModel().removeColumn(columnaID);        
        
        columnaID = empleadosAgrTbl.getColumnModel().getColumn(0);
        empleadosAgrTbl.getColumnModel().removeColumn(columnaID);
        
        //Se asigna el modelo al Combo Box
        busquedaModel = new DefaultComboBoxModel();
        busquedaCBx.setModel(busquedaModel);
        
        busquedaCBx.setVisible(false);
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
        empleadosTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        empleadosAgrTbl = new javax.swing.JTable();
        agregarBtn = new javax.swing.JButton();
        agregaTodosBtn = new javax.swing.JButton();
        enviarBtn = new javax.swing.JButton();
        borrarBtn = new javax.swing.JButton();
        borrarTodosBtn = new javax.swing.JButton();
        disenoTltLbl = new javax.swing.JLabel();
        tipoBusquedaLbll = new javax.swing.JLabel();
        tipoBusquedaCBx = new javax.swing.JComboBox();
        disenoInsLbl = new javax.swing.JLabel();
        aspectosBtn = new javax.swing.JButton();
        busquedaLbl = new javax.swing.JLabel();
        busquedaCBx = new javax.swing.JComboBox();
        busquedaTFd = new javax.swing.JTextField();
        busquedaBtn = new javax.swing.JButton();

        realizarEncuesta_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        empleadosTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        empleadosTbl.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(empleadosTbl);
        empleadosTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (empleadosTbl.getColumnModel().getColumnCount() > 0) {
            empleadosTbl.getColumnModel().getColumn(0).setResizable(false);
            empleadosTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        empleadosAgrTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        empleadosAgrTbl.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(empleadosAgrTbl);
        empleadosAgrTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (empleadosAgrTbl.getColumnModel().getColumnCount() > 0) {
            empleadosAgrTbl.getColumnModel().getColumn(0).setResizable(false);
            empleadosAgrTbl.getColumnModel().getColumn(1).setResizable(false);
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

        disenoTltLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disenoTltLbl.setText("Diseño de encuesta");

        tipoBusquedaLbll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoBusquedaLbll.setText("Tipo de busqueda:");

        tipoBusquedaCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoBusquedaCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Puesto", "Plantel", "Departamento" }));
        tipoBusquedaCBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoBusquedaCBxItemStateChanged(evt);
            }
        });

        disenoInsLbl.setText("<html>Podra seleccionar un tipo de busqueda para filtrar los empleados y seleccionarlos para mandar la encuesta</html>");

        aspectosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aspectosBtn.setText("Agregar aspectos");
        aspectosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspectosBtnActionPerformed(evt);
            }
        });

        busquedaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        busquedaLbl.setText("Nombre:");

        busquedaCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        busquedaCBx.setPreferredSize(new java.awt.Dimension(220, 23));

        busquedaTFd.setPreferredSize(new java.awt.Dimension(220, 23));

        busquedaBtn.setText("Buscar");
        busquedaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaBtnActionPerformed(evt);
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
                        .addComponent(aspectosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                        .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disenoInsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(disenoTltLbl)
                            .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                                .addComponent(tipoBusquedaLbll)
                                .addGap(18, 18, 18)
                                .addComponent(tipoBusquedaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(busquedaLbl)
                                .addGap(18, 18, 18)
                                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(busquedaCBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(busquedaTFd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(busquedaBtn)))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        realizarEncuesta_PnlLayout.setVerticalGroup(
            realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(disenoTltLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disenoInsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoBusquedaLbll)
                    .addComponent(tipoBusquedaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaLbl)
                    .addComponent(busquedaTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedaBtn)
                    .addComponent(busquedaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(realizarEncuesta_PnlLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregaTodosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrarTodosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarEncuesta_PnlLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(realizarEncuesta_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aspectosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    /**
     * Metodo que se ejecuta al presionar el boton enviar. Este metodo toma
     * el padre de esta panel y ejecuta el metodo enviarEncuesta();
     * @param evt Evento ejecutado
     */
    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        PnlSeguimiento seguimientoPnl = (PnlSeguimiento) this.getParent();
            seguimientoPnl.enviarEncuesta();
    }//GEN-LAST:event_enviarBtnActionPerformed

    /**
     * Metodo que se ejectura al cambiar la seleccion del tipo de busqueda. Segun
     * el tipo de busqueda seleccionada, se cambiaran los labels y se agregaran
     * las listas con datos correspondientes.
     * @param evt Evento ejecutado
     */
    private void tipoBusquedaCBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoBusquedaCBxItemStateChanged
        int indice = tipoBusquedaCBx.getSelectedIndex();
        if(indice == 0){
            busquedaTFd.setVisible(true);
            busquedaCBx.setEnabled(false);
            busquedaCBx.setVisible(false);
            busquedaLbl.setText(("Nombre: "));
        }else{
            busquedaTFd.setVisible(false);
            busquedaCBx.setEnabled(true);
            busquedaCBx.setVisible(true);
            switch(indice){
                case 1:
                    busquedaLbl.setText("Puesto: ");
                    control.setClass(Puesto.class);
                    control.buscarTodosLista(1);
                    break;
                case 2:
                    busquedaLbl.setText("Plantel: ");
                    control.setClass(Plantel.class);
                    control.buscarTodosLista(1);
                    break;
                case 3:
                    busquedaLbl.setText("Departamento: ");
                    control.setClass(Departamento.class);
                    control.buscarTodosLista(1);
                    break;
            }
        }
    }//GEN-LAST:event_tipoBusquedaCBxItemStateChanged

    /**
     * Metodo ejecutado al presionar el boton de agregar. Este metodo pasa el
     * empleado a la tabla de empleados agregados y lo elimina de la tabla original.
     * @param evt Evento ejecutado
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        int renglonIndice = empleadosTbl.getSelectedRow();
        if(empleadosTblModel.getRowCount() == 0){
            setMensaje("No hay empleados que agregar");
        }else if(renglonIndice == -1){
            setMensaje("No se ha seleccionado un empleado");
        }else{
            String[] renglon = new String[3];
            renglon[0] = (String) empleadosTblModel.getValueAt(renglonIndice, 0);
            renglon[1] = (String) empleadosTblModel.getValueAt(renglonIndice, 1);
            renglon[2] = (String) empleadosTblModel.getValueAt(renglonIndice, 2);
            empleadosAgrTblModel.addRow(renglon);
            removerAgregados();
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    /**
     * Metodo ejecutado al presionar el boton de agregar todos. Este metodo pasa
     * todos los empleados a la tabla de empleados agregados y los elimina de la 
     * tabla original.
     * @param evt Evento ejecutado
     */
    private void agregaTodosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaTodosBtnActionPerformed
        int renglones = empleadosTblModel.getRowCount();
        if(renglones == 0){
            setMensaje("No hay empleados que agregar");
        }else{
            for(int i = 0; i < renglones; i++){
                String[] aspecto = new String[3];
                aspecto[0] = (String) empleadosTblModel.getValueAt(i, 0);
                aspecto[1] = (String) empleadosTblModel.getValueAt(i, 1);
                aspecto[2] = (String) empleadosTblModel.getValueAt(i, 2);
                empleadosAgrTblModel.addRow(aspecto);
            }
            removerAgregados();
        }
    }//GEN-LAST:event_agregaTodosBtnActionPerformed

    /**
     * Metodo ejecutado al presionar el boton de borrar. Este metodo pasa el
     * empleado a la tabla de empleados y lo elimina de la tabla de empleados agregados.
     * @param evt Evento ejecutado
     */
    private void borrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarBtnActionPerformed
        int renglonIndice = empleadosAgrTbl.getSelectedRow();
        if(empleadosAgrTblModel.getRowCount() == 0){
            setMensaje("No hay empleados que eliminar");
        }else if(renglonIndice == -1){
            setMensaje("No se ha seleccionado un empleado");
        }else{
            empleadosAgrTblModel.removeRow(renglonIndice);
            //Se recarga el combo box para actualizacion
            int indiceOriginal = tipoBusquedaCBx.getSelectedIndex();
            tipoBusquedaCBx.setSelectedIndex(0);
            tipoBusquedaCBx.setSelectedIndex(indiceOriginal);
        }
    }//GEN-LAST:event_borrarBtnActionPerformed

    /**
     * Metodo ejecutado al presionar el boton de borrar todos. Este metodo pasa
     * todos los empleados agregados a la tabla de empleados original y los 
     * elimina de la tabla de empleados agregados.
     * @param evt Evento ejecutado
     */
    private void borrarTodosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarTodosBtnActionPerformed
        if(empleadosAgrTblModel.getRowCount() == 0){
            setMensaje("No hay empleados que eliminar");
        }else{
            for(int i = 0; i < empleadosAgrTblModel.getRowCount(); i++){
                empleadosAgrTblModel.removeRow(i);
                i--;
            }        
            //Se recarga el combo box para actualizacion
            int indiceOriginal = tipoBusquedaCBx.getSelectedIndex();
            tipoBusquedaCBx.setSelectedIndex(0);
            tipoBusquedaCBx.setSelectedIndex(indiceOriginal);
        }
    }//GEN-LAST:event_borrarTodosBtnActionPerformed

    /**
     * Metodo ejecutado al presionar el boton de aspectos. Este metodo esconde
     * el panel actual.
     * @param evt 
     */
    private void aspectosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aspectosBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_aspectosBtnActionPerformed

    /**
     * Metodo ejecutado al presionar el boton de buscar. Segun el tipo
     * de busqueda se ejecuta la busqueda del control correspondiente.
     * @param evt Evento ejecutado
     */
    private void busquedaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaBtnActionPerformed
        int indice = tipoBusquedaCBx.getSelectedIndex();
        switch(indice){
            case 0:
                control.buscarPorNombre(busquedaTFd.getText());
                break;
            case 1:
                control.buscarPorPuesto(busquedaCBx.getSelectedItem());
                break;
            case 2:
                control.buscarPorPlantel(busquedaCBx.getSelectedItem());
                break;
            case 3:
                control.buscarPorDepartamento(busquedaCBx.getSelectedItem());
                break;
        }
    }//GEN-LAST:event_busquedaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregaTodosBtn;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton aspectosBtn;
    private javax.swing.JButton borrarBtn;
    private javax.swing.JButton borrarTodosBtn;
    private javax.swing.JButton busquedaBtn;
    private javax.swing.JComboBox busquedaCBx;
    private javax.swing.JLabel busquedaLbl;
    private javax.swing.JTextField busquedaTFd;
    private javax.swing.JLabel disenoInsLbl;
    private javax.swing.JLabel disenoTltLbl;
    private javax.swing.JTable empleadosAgrTbl;
    private javax.swing.JTable empleadosTbl;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel realizarEncuesta_Pnl;
    private javax.swing.JComboBox tipoBusquedaCBx;
    private javax.swing.JLabel tipoBusquedaLbll;
    // End of variables declaration//GEN-END:variables

    /**
     * Obtiene una lista de los identificadores de los empleados agregados.
     * @return Lista con los identificadores.
     */
    public List<Integer> getEmpleados(){
        List<Integer> empleadosIds = new ArrayList();
        for(int i = 0; i < empleadosAgrTblModel.getRowCount(); i++){
            String id = (String) empleadosAgrTblModel.getValueAt(i, 0);
            empleadosIds.add(Integer.parseInt(id));
        }
        return empleadosIds;
    }
    
    /**
     * Metodo utilizado par actualizar las tablas de los aspectos, de esta manera
     * se eliminaran los aspectos que ya hayan sido agregados a evaluar en
     * la encuesta.
     */
    private void removerAgregados(){
        String[] idsAgregadas = new String[empleadosAgrTblModel.getRowCount()];
        for(int i = 0; i < idsAgregadas.length; i++){
            idsAgregadas[i] = (String) empleadosAgrTblModel.getValueAt(i, 0);
        }
        List<String> listaIds = Arrays.asList(idsAgregadas);
        for(int i = 0; i < empleadosTbl.getRowCount(); i++){
            if(listaIds.contains((String) empleadosTblModel.getValueAt(i, 0))) {
                empleadosTblModel.removeRow(i);
                i--;
            }
        }
    }

    /**
     * Metodo para mostrar un mensaje de advertencia por medio del JOptionPane.
     * @param mensaje Mensaje a mostrar.
     */
    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
    }
    
    /**
     * Metodo asignar la informacion a la tabla de empleados.
     * @param info Matriz con la informacion a asignar.
     */
    @Override
    public void setTabla(String[][] info) {
        TableColumn columnaID;
        empleadosTblModel.setDataVector(info, titulosTabla);        
        //Esconder columna ID
        columnaID = empleadosTbl.getColumnModel().getColumn(0);
        empleadosTbl.getColumnModel().removeColumn(columnaID);        
        //Remover aspectos ya seleccionados
        removerAgregados();
    }

     /**
     * Metodo no implementado.
     * @param info 
     */
    @Override
    public void setInfo(List info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * El metodo asigna la lista de informacion al combo box determinado.
     * @param info Lista con la informacion
     * @param i Indice de identificacion de combo box
     */
    @Override
    public void setLista(List info, int i) {
        if(info.isEmpty()) return;
        switch(i){
            case 1:
                busquedaModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  busquedaModel.addElement(info.get(j));
                }
                busquedaModel.insertElementAt(new Puesto(), 0);
                busquedaCBx.setSelectedIndex(0);
                break;
        }
    }

    /**
     * El metodo limpia la tabla de empleados agregados.
     */
    public void limpiar() {
        empleadosAgrTblModel.setDataVector(new String[0][3], titulosTabla);
    }
}
