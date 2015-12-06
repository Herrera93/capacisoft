/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Direccion;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.controlador.ImplementarEventoControlador;

/**
 *
 * @author Liuts
 */
public final class ListaAsistenciaFrm extends javax.swing.JFrame implements Comunicador {

    /**
     * Creates new form ListaAsistencia
     */
    private static ImplementarEventoControlador control;
    private final DefaultComboBoxModel campoModel;

    private final DefaultTableModel agregadosModel;
    private final DefaultTableModel candidatosModel;
    private final DefaultComboBoxModel tipoModel;
    private final String[] titulosTabla = {"Numero",
        "Nombre del Empleado"};
    private final ImageIcon imageLogo;
    //Comunicador con la interfaz grafica
    protected final Comunicador com;
    //Clase con la que estara trabajando la base de datos

    /**
     * Este constructor recibe el parametro de comunicador, permitiendo que
     * mande los la tablas de la lista de asistencia
     *
     * @param com
     */
    public ListaAsistenciaFrm(Comunicador com) {
        this.com = com;
        imageLogo = new ImageIcon(CapacisoftFrm.class.getResource("/mx/edu/cobach/"
                + "vista/recursos/logo.png"));
        setTitle("CapaciSoft-Lista de Asistencia");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        control = new ImplementarEventoControlador(this,
                ImplementacionEvento.class);
        campoModel = new DefaultComboBoxModel();
        tipoModel = new DefaultComboBoxModel();
        seleccionCBx.setModel(tipoModel);
        campoModel.addElement("");
        campoModel.addElement("Nombre");
        campoModel.addElement("Departamento");
        campoModel.addElement("Puesto");
        campoModel.addElement("Plantel");
        campoModel.addElement("Direccion");
        campoModel.addElement("Departamento/Nombre empleado");
        campoModel.addElement("Puestos/Nombre Empleado");
        campoModel.addElement("Plantel/Nombre empleado");
        campoModel.addElement("Direccion/Nombre empleado");
        campoCBx.setModel(campoModel);
        setIconImage(imageLogo.getImage());

        agregadosModel = new DefaultTableModel(titulosTabla, 0) {
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        agregadosTbl.setModel(agregadosModel);
        agregadosTbl.setColumnSelectionAllowed(false);
        agregadosTbl.setDragEnabled(false);

        candidatosModel = new DefaultTableModel(titulosTabla, 0) {
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        candidatosTbl.setModel(candidatosModel);
        candidatosTbl.setColumnSelectionAllowed(false);
        candidatosTbl.setDragEnabled(false);
        visibilidadBusNombre(false);
        visibilidadBusTipo(false);
        tabla();
        cerrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaTltLbl = new javax.swing.JLabel();
        listaInsLbl = new javax.swing.JLabel();
        campoLbl = new javax.swing.JLabel();
        campoCBx = new javax.swing.JComboBox();
        nombreLbl = new javax.swing.JLabel();
        seleccionLbl = new javax.swing.JLabel();
        nombreTFd = new javax.swing.JTextField();
        seleccionCBx = new javax.swing.JComboBox();
        buscarBtn = new javax.swing.JButton();
        candidatosSPn = new javax.swing.JScrollPane();
        candidatosTbl = new javax.swing.JTable();
        agregadosLbl = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        agregarTBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        eliminarTBtn = new javax.swing.JButton();
        agregadosSPn = new javax.swing.JScrollPane();
        agregadosTbl = new javax.swing.JTable();
        candidatosLbl = new javax.swing.JLabel();
        crearTablaBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaTltLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaTltLbl.setText("Registro");

        listaInsLbl.setText("Ingrese la información a almacenar");

        campoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoLbl.setText("Selecciona un campo:");

        campoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Departamento", "Plantel", "Puesto" }));
        campoCBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoCBxItemStateChanged(evt);
            }
        });

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre del Empleado:");

        seleccionLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccionLbl.setText("Nombre del Departamento:");

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.setMaximumSize(new java.awt.Dimension(6, 23));
        nombreTFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTFdKeyTyped(evt);
            }
        });

        seleccionCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccionCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Departamento", "Plantel", "Puesto" }));
        seleccionCBx.setMaximumSize(new java.awt.Dimension(117, 23));

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        candidatosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero del empleado", "Nombre del empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        candidatosTbl.setEnabled(false);
        candidatosSPn.setViewportView(candidatosTbl);

        agregadosLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregadosLbl.setText("Lista de empleados");

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setText(">");
        agregarBtn.setToolTipText("Seleccioné un empleado para la lista de asistencia");
        agregarBtn.setEnabled(false);
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        agregarTBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarTBtn.setText(">>");
        agregarTBtn.setToolTipText("Agregar todos los empleados");
        agregarTBtn.setEnabled(false);
        agregarTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTBtnActionPerformed(evt);
            }
        });

        eliminarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminarBtn.setText("<");
        eliminarBtn.setToolTipText("Seleccioné un empleado a eliminar");
        eliminarBtn.setEnabled(false);
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        eliminarTBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminarTBtn.setText("<<");
        eliminarTBtn.setToolTipText("Eliminar todos los empleados");
        eliminarTBtn.setEnabled(false);
        eliminarTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTBtnActionPerformed(evt);
            }
        });

        agregadosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero del empleado", "Nombre del empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        agregadosSPn.setViewportView(agregadosTbl);

        candidatosLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        candidatosLbl.setText("Lista de posibles candidatos");

        crearTablaBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crearTablaBtn.setText("Crear Tabla");
        crearTablaBtn.setEnabled(false);
        crearTablaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablaBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(seleccionCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregadosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(candidatosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(candidatosLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                        .addComponent(agregadosLbl)
                        .addGap(159, 159, 159))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaTltLbl)
                    .addComponent(listaInsLbl)
                    .addComponent(campoLbl)
                    .addComponent(nombreLbl)
                    .addComponent(seleccionLbl))
                .addContainerGap(764, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(crearTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(listaTltLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaInsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLbl)
                    .addComponent(campoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionLbl)
                    .addComponent(seleccionCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(candidatosLbl)
                    .addComponent(agregadosLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregadosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(candidatosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo busca prepara los campos de busqueda para buscar al empleado
     * dependiendo de sus referencias
     *
     * @param evt
     */
    private void campoCBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_campoCBxItemStateChanged
        switch ((String) campoCBx.getSelectedItem()) {
            case "":
                visibilidadBusNombre(false);
                visibilidadBusTipo(false);
                break;
            case "Nombre":
                visibilidadBusTipo(false);
                visibilidadBusNombre(true);
                break;
            case "Departamento":
                visibilidadBusNombre(false);
                visibilidadBusTipo(true);
                control.setClass(Departamento.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre del Departamento:");
                break;
            case "Plantel":
                visibilidadBusNombre(false);
                visibilidadBusTipo(true);
                control.setClass(Plantel.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre del Plantel:");
                break;
            case "Puesto":
                visibilidadBusNombre(false);
                visibilidadBusTipo(true);
                control.setClass(Puesto.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre del Puesto:");
                break;
            case "Direccion":
                visibilidadBusNombre(false);
                visibilidadBusTipo(true);
                control.setClass(Direccion.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre de la Direccion:");
                break;
            case "Departamento/Nombre empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Departamento.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre del Departamento:");
                break;
            case "Plantel/Nombre empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Plantel.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre del Plantel:");
                break;
            case "Puestos/Nombre empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Puesto.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre del Puesto:");
                break;
            case "Direccion/Nombre empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Direccion.class);
                control.buscarTodosLista(1);
                seleccionLbl.setText("Nombre de la Direccion:");
                break;
        }
    }//GEN-LAST:event_campoCBxItemStateChanged
    /**
     * Este metodo valida que el usuarios no escriba letras, entre otros
     * parametros
     *
     * @param evt
     */
    private void nombreTFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFdKeyTyped
        if (!Character.isLetter(evt.getKeyChar())  
            && !Character.isISOControl(evt.getKeyChar())
            && !Character.isWhitespace(evt.getKeyChar())) {
             evt.consume();
        }
    }//GEN-LAST:event_nombreTFdKeyTyped
    /**
     * Este metodo busca todas las referencias dependiendo de como la solicita
     * el usuario
     *
     * @param evt
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        control.setClass(Empleado.class);
        switch ((String) campoCBx.getSelectedItem()) {
            case "Nombre":
                if (nombreTFd.getText().equals("")) {
                    control.buscarTodos();
                } else {
                    control.buscarEmpN(nombreTFd.getText());
                }
                break;
            case "Departamento":
                control.buscarEmpD((Departamento) seleccionCBx.getSelectedItem());
                break;
            case "Plantel":
                control.buscarEmpPl((Plantel) seleccionCBx.getSelectedItem());
                break;
            case "Puesto":
                control.buscarEmpPu((Puesto) seleccionCBx.getSelectedItem());
                break;
            case "Direccion":
                control.buscarEmpDi((Direccion) seleccionCBx.getSelectedItem());
                break;
            case "Departamento/Nombre empleado":
                control.buscarEmpPorDepartamentoNEmpleado((Departamento) seleccionCBx.
                        getSelectedItem(), nombreTFd.getText());
                break;
            case "Plantel/Nombre empleado":
                control.buscarEmpPorPlantelNEmpleado((Plantel) seleccionCBx.
                        getSelectedItem(), nombreTFd.getText());
                break;
            case "Puesto/Nombre empleado":
                control.buscarEmpPorPuestoNEmpleado((Puesto) seleccionCBx.
                        getSelectedItem(), nombreTFd.getText());
                break;
            case "Direccion/Nombre empleado":
                control.buscarEmpPorDireccionEmpleado((Direccion) seleccionCBx.
                        getSelectedItem(), nombreTFd.getText());
                break;
        }
    }//GEN-LAST:event_buscarBtnActionPerformed
    /**
     * Este metodo agrega a los empleados a la lista de asistencia, mandando
     * cada uno de los empleados de sus pocisiones
     *
     * @param evt
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        if (agregadosTbl.getSelectedRow() >= 0) {
            agregarEmpleadosTabla(agregadosTbl.getSelectedRow());
        }
        if (candidatosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_agregarBtnActionPerformed
    /**
     * Este metodo agrega un empleado a la lista de asistencia, mandando el
     * empleado que selecciono el usuario
     *
     * @param evt
     */
    private void agregarTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTBtnActionPerformed
        for (int i = 0; i < agregadosModel.getRowCount(); i++) {
            agregarEmpleadosTabla(i);
        }
        if (candidatosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_agregarTBtnActionPerformed
    /**
     * Este metodo elimina una persona de la lista de asistencia
     *
     * @param evt
     */
    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea eliminar al empleado de "
                + "la lista de asistencia?", "Precaucion",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            if (candidatosTbl.getSelectedRow() >= 0) {
                int cont = 0;
                Object[][] tableData = new Object[candidatosTbl.
                        getRowCount() - 1][candidatosModel.getColumnCount()];
                for (int i = 0; i < candidatosTbl.getRowCount(); i++) {
                    if (((String) candidatosModel.getValueAt(i, 0)).
                            compareTo((String) candidatosModel.getValueAt(
                                            candidatosTbl.getSelectedRow(),
                                            0)) != 0) {
                        tableData[cont][0] = candidatosModel.getValueAt(i, 0);
                        tableData[cont][1] = candidatosModel.getValueAt(i, 1);
                        cont++;
                    }
                }
                candidatosModel.setDataVector(tableData, titulosTabla);
                candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                candidatosTbl.getColumnModel().getColumn(0).
                        setPreferredWidth(10);
                candidatosTbl.getColumnModel().getColumn(1).
                        setPreferredWidth(160);
                candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
            }
        }
        if (candidatosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed
    /**
     * Este metodo elimina todos los empleados de la lista de asistencia.
     *
     * @param evt
     */
    private void eliminarTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTBtnActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea eliminar toda la lista "
                + "de asistencia?", "Precaucion",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            candidatosModel.setDataVector(null, titulosTabla);
            candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            candidatosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            candidatosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
            candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        }
        if (candidatosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_eliminarTBtnActionPerformed
    /**
     * Metodo que permite agregar los empleados en la tabla de asistencia
     */
    private void agregarEmpleadosTabla(int posicionLista) {
        boolean bandera = false;
        candidatosTbl.setEnabled(true);
        for (int j = 0; j < candidatosModel.getRowCount(); j++) {
            if (agregadosModel.getValueAt(posicionLista, 0).
                    equals(candidatosModel.getValueAt(j, 0))) {
                bandera = true;
            }
        }
        if (bandera == false) {
            Object[][] tableData = new Object[candidatosModel.
                    getRowCount() + 1][candidatosModel.getColumnCount()];
            //ciclo que pasa la informacion de la tabla de lista 
            //final para que al final sea agregado el nuevo empleado a 
            //esta matriz
            for (int k = 0; k < candidatosModel.getRowCount(); k++) {
                for (int j = 0; j < candidatosModel.getColumnCount(); j++) {
                    tableData[k][j] = candidatosModel.getValueAt(k, j);
                }
            }
            tableData[candidatosModel.getRowCount()][0] = agregadosModel.
                    getValueAt(posicionLista, 0);
            tableData[candidatosModel.getRowCount()][1] = agregadosModel.
                    getValueAt(posicionLista, 1);
            candidatosModel.setDataVector(tableData, titulosTabla);
            candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            candidatosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            candidatosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
            candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        }
        visibilidadOpcT(true);
    }

    /**
     * Este metodo crea una tabla para la lista de asistencia final para el
     * usuario en la interfaz de eventos realizados o a relizar
     *
     * @param evt
     */
    private void crearTablaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTablaBtnActionPerformed
        String[][] matriz = new String[candidatosModel.getRowCount()][candidatosModel.getColumnCount()];
        for (int k = 0; k < candidatosModel.getRowCount(); k++) {
            for (int j = 0; j < candidatosModel.getColumnCount(); j++) {
                matriz[k][j] = candidatosModel.getValueAt(k, j) + "";
            }
        }
        matriz[0][0] = matriz[0][0] + "TLE1";
        com.setTabla(matriz);
        List<String> info = new ArrayList();
        info.add("Desbloquear");
        com.setInfo(info);
        this.dispose();
    }//GEN-LAST:event_crearTablaBtnActionPerformed
    /**
     * Este metodo permite cancelar la lista de empleados, cerrando la ventana
     * de la lista de empleados
     *
     * @param evt
     */
    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        if (candidatosTbl.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Desea cancelar la realizacion "
                    + "de la lista de asistencia?", "Precaucion",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                List<String> info = new ArrayList();
                info.add("Desbloquear");
                com.setInfo(info);
                this.dispose();

            }
        } else {
            List<String> info = new ArrayList();
            info.add("Desbloquear");
            com.setInfo(info);
            this.dispose();
        }
    }//GEN-LAST:event_cancelarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregadosLbl;
    private javax.swing.JScrollPane agregadosSPn;
    private javax.swing.JTable agregadosTbl;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton agregarTBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JComboBox campoCBx;
    private javax.swing.JLabel campoLbl;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel candidatosLbl;
    private javax.swing.JScrollPane candidatosSPn;
    private javax.swing.JTable candidatosTbl;
    private javax.swing.JButton crearTablaBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton eliminarTBtn;
    private javax.swing.JLabel listaInsLbl;
    private javax.swing.JLabel listaTltLbl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JComboBox seleccionCBx;
    private javax.swing.JLabel seleccionLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo para hacer visible o imvisible la busqueda por nombre
     *
     * @param visibilidad
     */
    public void visibilidadBusNombre(boolean visibilidad) {
        nombreTFd.setEnabled(visibilidad);
        buscarBtn.setEnabled(visibilidad);
    }

    /**
     * Metodo para hacer visible o invisible la busqueda por
     * plantel,departamento, puesto
     *
     * @param visibilidad
     */
    public void visibilidadBusTipo(boolean visibilidad) {
        seleccionCBx.setEnabled(visibilidad);
        buscarBtn.setEnabled(visibilidad);
    }

    /**
     * Establece una visibilidad de las opciones de las flechas del panel para
     * enviar la informacion del usuairo.
     *
     * @param visibilidad
     */
    private void visibilidadOpcT(boolean visibilidad) {
        agregarBtn.setEnabled(visibilidad);
        agregarTBtn.setEnabled(visibilidad);
        eliminarBtn.setEnabled(visibilidad);
        eliminarTBtn.setEnabled(visibilidad);
    }

    /**
     * Metodo sobrescrito de la clase comunicador mensaje de confirmación de
     * registro o modificacion exitosa.
     *
     * @param mensaje String con mensaje de confirmacion de registro.
     */
    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
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
        //Se checa si la palabra TLE1 se encuentra dentro de la matriz
        info[0][0] = info[0][0].replaceAll("TLE1", "");
        //Se elimina la palabra TLE1 para que solo quede el id puro
        agregadosTbl.setEnabled(true);
        agregadosModel.setDataVector(info, titulosTabla);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        agregadosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        agregadosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        visibilidadOpcT(true);

    }

    /**
     * Agrega los datos al modelo de la tabla, también se ocultara la columna id
     * y se le dara se redefinira el ancho de la columna 0.
     *
     * @param info
     */
    private void tabla() {

        agregadosModel.setDataVector(null, titulosTabla);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        agregadosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        agregadosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        candidatosModel.setDataVector(null, titulosTabla);
        candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        candidatosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        candidatosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }

    /**
     * Metodo sobrescrito de la clase Comunicador
     *
     * @param info
     */
    @Override
    public void setInfo(List info) {
    }

    /**
     * Metodo sobrescrito de la clase comunicador que recibe una Lista con la
     * los resultados de una busqueda especifica y vaciarlo en los campos y
     * checkbox
     *
     * @param info Lista de Objeto con información de búsqueda.
     * @param i
     */
    @Override
    public void setLista(List info, int i) {
        if (info.isEmpty()) {
            return;
        }
        switch (i) {
            case 1:
                tipoModel.removeAllElements();
                for (Object j : info) {
                    tipoModel.addElement(j);
                }
                break;
        }
    }

    /**
     * Metodo que permite llenar los datos del evento
     *
     * @param evento
     */
    @Override
    public void llenarDatos(Object evento) {
    }

    /**
     * Metodo que permite cerrar el JFrane dandole una advertencia al usuario,
     *
     */
    private void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
        } catch (Exception e) {
        }
    }

    /**
     * Metodo que permite cerrar el JFrane dandole una advertencia al usuario,
     *
     */
    private void confirmarSalida() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(
                rootPane, "En realidad desea cerrar la lista de asistencia?",
                "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            List<String> info = new ArrayList();
            info.add("Desbloquear");
            com.setInfo(info);
            this.dispose();
        }
    }

    /**
     * Metodo que permite crear la lista de asistencia ya realizada.
     *
     * @param info
     */
    public void mandarTabla(String[][] info) {
        candidatosModel.setDataVector(info, titulosTabla);
        candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        candidatosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        candidatosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        candidatosTbl.setEnabled(true);
        visibilidadOpcT(true);
    }

}