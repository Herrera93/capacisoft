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
import javax.swing.table.TableColumn;
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
public class ListaAsistencia extends javax.swing.JFrame implements Comunicador {

    /**
     * Creates new form ListaAsistencia
     */
    private static ImplementarEventoControlador control;
    private final DefaultComboBoxModel campoModel;

    private DefaultTableModel modelTablaEmI;
    private DefaultTableModel modelTablaEmF;
    private final DefaultComboBoxModel tipoModel;
    private String[] titulosTablaEm = {"Numero",
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
    public ListaAsistencia(Comunicador com) {
        this.com = com;
        imageLogo = new ImageIcon(Capacisoft.class.getResource("/mx/edu/cobach/"
                + "vista/recursos/logo.png"));
        setTitle("CapaciSoft-Lista de Asistencia");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        control = new ImplementarEventoControlador(this,
                ImplementacionEvento.class);
        campoModel = new DefaultComboBoxModel();
        tipoModel = new DefaultComboBoxModel();
        tipoLACBx.setModel(tipoModel);
        campoModel.addElement("");
        campoModel.addElement("Nombre");
        campoModel.addElement("Departamento");
        campoModel.addElement("Puesto");
        campoModel.addElement("Plantel");
        campoModel.addElement("Direccion");
        campoModel.addElement("Departamento Y Nombre_Empleado");
        campoModel.addElement("Puestos Y Nombre_Empleado");
        campoModel.addElement("Plantel Y Nombre_Empleado");
        campoModel.addElement("Direccion Y Nombre_Empleado");
        campoCBx.setModel(campoModel);
        setIconImage(imageLogo.getImage());

        modelTablaEmI = new DefaultTableModel(titulosTablaEm, 0);
        tablaLisITbl.setModel(modelTablaEmI);
        tablaLisITbl.setColumnSelectionAllowed(false);
        tablaLisITbl.setDragEnabled(false);

        modelTablaEmF = new DefaultTableModel(titulosTablaEm, 0);
        tablaLisFTbl.setModel(modelTablaEmF);
        tablaLisFTbl.setColumnSelectionAllowed(false);
        tablaLisFTbl.setDragEnabled(false);
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

        agregarLALbl = new javax.swing.JLabel();
        nota_LI_Lbl = new javax.swing.JLabel();
        campoLbl = new javax.swing.JLabel();
        campoCBx = new javax.swing.JComboBox();
        nombreLALbl = new javax.swing.JLabel();
        seleccionLALbl = new javax.swing.JLabel();
        nombreLATFd = new javax.swing.JTextField();
        tipoLACBx = new javax.swing.JComboBox();
        buscarLABtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaLisFTbl = new javax.swing.JTable();
        listaAsistenciaLALbl = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        agregarTBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        eliminarTBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaLisITbl = new javax.swing.JTable();
        listaCandidatosLALbl = new javax.swing.JLabel();
        crearTablaBtn = new javax.swing.JButton();
        cancelarLABtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregarLALbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLALbl.setText("Agregar");

        nota_LI_Lbl.setText("Ingrese la información a almacenar");

        campoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoLbl.setText("Selecciona un campo:");

        campoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Departamento", "Plantel", "Puesto" }));
        campoCBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoCBxItemStateChanged(evt);
            }
        });

        nombreLALbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLALbl.setText("Nombre del Empleado:");

        seleccionLALbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccionLALbl.setText("Nombre del Departamento:");

        nombreLATFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLATFd.setMaximumSize(new java.awt.Dimension(6, 23));
        nombreLATFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreLATFdKeyTyped(evt);
            }
        });

        tipoLACBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoLACBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Departamento", "Plantel", "Puesto" }));
        tipoLACBx.setMaximumSize(new java.awt.Dimension(117, 23));

        buscarLABtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarLABtn.setText("Buscar");
        buscarLABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLABtnActionPerformed(evt);
            }
        });

        tablaLisFTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLisFTbl.setEnabled(false);
        jScrollPane5.setViewportView(tablaLisFTbl);

        listaAsistenciaLALbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaAsistenciaLALbl.setText("Lista de asistencia");

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

        tablaLisITbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaLisITbl);

        listaCandidatosLALbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaCandidatosLALbl.setText("Lista de posibles candidatos");

        crearTablaBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crearTablaBtn.setText("Crear Tabla");
        crearTablaBtn.setEnabled(false);
        crearTablaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablaBtnActionPerformed(evt);
            }
        });

        cancelarLABtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarLABtn.setText("Cancelar");
        cancelarLABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLABtnActionPerformed(evt);
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
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(seleccionLALbl)
                                .addGap(18, 18, 18)
                                .addComponent(tipoLACBx, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreLALbl)
                                    .addComponent(campoLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreLATFd, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addComponent(buscarLABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(listaCandidatosLALbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                        .addComponent(listaAsistenciaLALbl)
                        .addGap(159, 159, 159))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarLALbl)
                    .addComponent(nota_LI_Lbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarLABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(crearTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(agregarLALbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota_LI_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLbl)
                    .addComponent(campoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLATFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLALbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionLALbl)
                    .addComponent(tipoLACBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarLABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCandidatosLALbl)
                    .addComponent(listaAsistenciaLALbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarLABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                seleccionLALbl.setText("Nombre del Departamento:");
                break;
            case "Plantel":
                visibilidadBusNombre(false);
                visibilidadBusTipo(true);
                control.setClass(Plantel.class);
                control.buscarTodosLista(1);
                seleccionLALbl.setText("Nombre del Plantel:");
                break;
            case "Puesto":
                visibilidadBusNombre(false);
                visibilidadBusTipo(true);
                control.setClass(Puesto.class);
                control.buscarTodosLista(1);
                seleccionLALbl.setText("Nombre de la Puesto:");
                break;
            case "Direccion":
                visibilidadBusNombre(false);
                visibilidadBusTipo(true);
                control.setClass(Direccion.class);
                control.buscarTodosLista(1);
                seleccionLALbl.setText("Nombre del Direccion:");
                break;
            case "Departamento Y Nombre_Empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Departamento.class);
                control.buscarTodosLista(1);
                seleccionLALbl.setText("Nombre del Departamento:");
                break;
            case "Plantel Y Nombre_Empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Plantel.class);
                control.buscarTodosLista(1);
                seleccionLALbl.setText("Nombre del Plantel:");
                break;
            case "Puestos Y Nombre_Empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Puesto.class);
                control.buscarTodosLista(1);
                seleccionLALbl.setText("Nombre del Puesto:");
                break;
            case "Direccion Y Nombre_Empleado":
                visibilidadBusNombre(true);
                visibilidadBusTipo(true);
                control.setClass(Direccion.class);
                control.buscarTodosLista(1);
                seleccionLALbl.setText("Nombre del Direccion:");
                break;
        }
    }//GEN-LAST:event_campoCBxItemStateChanged
    /**
     * Este metodo valida que el usuarios no escriba letras, entre otros
     * parametros
     *
     * @param evt
     */
    private void nombreLATFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreLATFdKeyTyped
        if (Character.isLetter(evt.getKeyChar())
                || Character.isISOControl(evt.getKeyChar())
                || Character.isWhitespace(evt.getKeyChar())) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_nombreLATFdKeyTyped
    /**
     * Este metodo busca todas las referencias dependiendo de como la solicita
     * el usuario
     *
     * @param evt
     */
    private void buscarLABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLABtnActionPerformed
        control.setClass(Empleado.class);
        switch ((String) campoCBx.getSelectedItem()) {
            case "Nombre":
                if (nombreLATFd.getText().equals("")) {
                    control.buscarTodos();
                } else {
                    control.buscarEmpN(nombreLATFd.getText());
                }
                break;
            case "Departamento":
                control.buscarEmpD((Departamento) tipoLACBx.getSelectedItem());
                break;
            case "Plantel":
                control.buscarEmpPl((Plantel) tipoLACBx.getSelectedItem());
                break;
            case "Puesto":
                control.buscarEmpPu((Puesto) tipoLACBx.getSelectedItem());
                break;
            case "Direccion":
                control.buscarEmpDi((Direccion) tipoLACBx.getSelectedItem());
                break;
            case "Departamento Y Nombre_Empleado":
                control.buscarEmpPorDepartamentoNEmpleado((Departamento) tipoLACBx.
                        getSelectedItem(), nombreLATFd.getText());
                break;
            case "Plantel Y Nombre_Empleado":
                control.buscarEmpPorPlantelNEmpleado((Plantel) tipoLACBx.
                        getSelectedItem(), nombreLATFd.getText());
                break;
            case "Puesto Y Nombre_Empleado":
                control.buscarEmpPorPuestoNEmpleado((Puesto) tipoLACBx.
                        getSelectedItem(), nombreLATFd.getText());
                break;
            case "Direccion Y Nombre_Empleado":
                control.buscarEmpPorDireccionEmpleado((Direccion) tipoLACBx.
                        getSelectedItem(), nombreLATFd.getText());
                break;
        }
    }//GEN-LAST:event_buscarLABtnActionPerformed
    /**
     * Este metodo agrega a los empleados a la lista de asistencia, mandando
     * cada uno de los empleados de sus pocisiones
     *
     * @param evt
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        if (tablaLisITbl.getSelectedRow() >= 0) {
            agregarEmpleadosTabla(tablaLisITbl.getSelectedRow());
        }
        if (tablaLisFTbl.getRowCount() > 0) {
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
        for (int i = 0; i < modelTablaEmI.getRowCount(); i++) {
            agregarEmpleadosTabla(i);
        }
        if (tablaLisFTbl.getRowCount() > 0) {
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
            if (tablaLisFTbl.getSelectedRow() >= 0) {
                int cont = 0;
                Object[][] tableData = new Object[tablaLisFTbl.
                        getRowCount() - 1][modelTablaEmF.getColumnCount()];
                for (int i = 0; i < tablaLisFTbl.getRowCount(); i++) {
                    if (((String) modelTablaEmF.getValueAt(i, 0)).
                            compareTo((String) modelTablaEmF.getValueAt(
                                            tablaLisFTbl.getSelectedRow(),
                                            0)) != 0) {
                        tableData[cont][0] = modelTablaEmF.getValueAt(i, 0);
                        tableData[cont][1] = modelTablaEmF.getValueAt(i, 1);
                        tableData[cont][2] = modelTablaEmF.getValueAt(i, 2);
                        cont++;
                    }
                }
                modelTablaEmF.setDataVector(tableData, titulosTablaEm);
                tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                tablaLisFTbl.getColumnModel().getColumn(0).
                        setPreferredWidth(10);
                tablaLisFTbl.getColumnModel().getColumn(1).
                        setPreferredWidth(160);
                tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
            }
        }
        if (tablaLisFTbl.getRowCount() > 0) {
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
            modelTablaEmF.setDataVector(null, titulosTablaEm);
            tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tablaLisFTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaLisFTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
            tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        }
        if (tablaLisFTbl.getRowCount() > 0) {
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
        tablaLisFTbl.setEnabled(true);
        for (int j = 0; j < modelTablaEmF.getRowCount(); j++) {
            if (modelTablaEmI.getValueAt(posicionLista, 0).
                    equals(modelTablaEmF.getValueAt(j, 0))) {
                bandera = true;
            }
        }
        if (bandera == false) {
            Object[][] tableData = new Object[modelTablaEmF.
                    getRowCount() + 1][modelTablaEmF.getColumnCount()];
            //ciclo que pasa la informacion de la tabla de lista 
            //final para que al final sea agregado el nuevo empleado a 
            //esta matriz
            for (int k = 0; k < modelTablaEmF.getRowCount(); k++) {
                for (int j = 0; j < modelTablaEmF.getColumnCount(); j++) {
                    tableData[k][j] = modelTablaEmF.getValueAt(k, j);
                }
            }
            tableData[modelTablaEmF.getRowCount()][0] = modelTablaEmI.
                    getValueAt(posicionLista, 0);
            tableData[modelTablaEmF.getRowCount()][1] = modelTablaEmI.
                    getValueAt(posicionLista, 1);
            modelTablaEmF.setDataVector(tableData, titulosTablaEm);
            tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tablaLisFTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaLisFTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
            tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
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
        String[][] matriz = new String[modelTablaEmF.getRowCount()][modelTablaEmF.getColumnCount()];
        for (int k = 0; k < modelTablaEmF.getRowCount(); k++) {
            for (int j = 0; j < modelTablaEmF.getColumnCount(); j++) {
                matriz[k][j] = modelTablaEmF.getValueAt(k, j) + "";
            }
        }
        matriz[0][0] = matriz[0][0] + "TLE1";
        com.setTabla(matriz);
        List<String> info = new ArrayList<String>();
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
    private void cancelarLABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLABtnActionPerformed
        if (tablaLisFTbl.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this,
                    "¿Desea cancelar la realizacion "
                    + "de la lista de asistencia?", "Precaucion",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                List<String> info = new ArrayList<String>();
                info.add("Desbloquear");
                com.setInfo(info);
                this.dispose();

            }
        } else {
            List<String> info = new ArrayList<String>();
            info.add("Desbloquear");
            com.setInfo(info);
            this.dispose();
        }
    }//GEN-LAST:event_cancelarLABtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel agregarLALbl;
    private javax.swing.JButton agregarTBtn;
    private javax.swing.JButton buscarLABtn;
    private javax.swing.JComboBox campoCBx;
    private javax.swing.JLabel campoLbl;
    private javax.swing.JButton cancelarLABtn;
    private javax.swing.JButton crearTablaBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton eliminarTBtn;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel listaAsistenciaLALbl;
    private javax.swing.JLabel listaCandidatosLALbl;
    private javax.swing.JLabel nombreLALbl;
    private javax.swing.JTextField nombreLATFd;
    private javax.swing.JLabel nota_LI_Lbl;
    private javax.swing.JLabel seleccionLALbl;
    private javax.swing.JTable tablaLisFTbl;
    private javax.swing.JTable tablaLisITbl;
    private javax.swing.JComboBox tipoLACBx;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo para hacer visible o imvisible la busqueda por nombre
     *
     * @param visibilidad
     */
    public void visibilidadBusNombre(boolean visibilidad) {
        nombreLATFd.setEnabled(visibilidad);
        buscarLABtn.setEnabled(visibilidad);
    }

    /**
     * Metodo para hacer visible o invisible la busqueda por
     * plantel,departamento, puesto
     *
     * @param visibilidad
     */
    public void visibilidadBusTipo(boolean visibilidad) {
        tipoLACBx.setEnabled(visibilidad);
        buscarLABtn.setEnabled(visibilidad);
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
        tablaLisITbl.setEnabled(true);
        modelTablaEmI.setDataVector(info, titulosTablaEm);
        tablaLisITbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaLisITbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaLisITbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        tablaLisITbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        visibilidadOpcT(true);

    }

    /**
     * Agrega los datos al modelo de la tabla, también se ocultara la columna id
     * y se le dara se redefinira el ancho de la columna 0.
     *
     * @param info
     */
    private void tabla() {

        modelTablaEmI.setDataVector(null, titulosTablaEm);
        tablaLisITbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaLisITbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaLisITbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        tablaLisITbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        modelTablaEmF.setDataVector(null, titulosTablaEm);
        tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaLisFTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaLisFTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }

    /**
     * Metodo sobrescrito de la clase Comunicador
     *
     * @param info
     * @param i
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
    public void llenarDatos(Object implementacionEvento) {
    }

    /**
     * Metodo que permite cerrar el JFrane dandole una advertencia al usuario,
     *
     */
    private void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que permite cerrar el JFrane dandole una advertencia al usuario,
     *
     */
    private void confirmarSalida() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(
                rootPane, "En realidad desea realizar "
                + "cerrar la lista de asistencia",
                "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            List<String> info = new ArrayList<String>();
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
        modelTablaEmF.setDataVector(info, titulosTablaEm);
        tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaLisFTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaLisFTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        tablaLisFTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        tablaLisFTbl.setEnabled(true);
        visibilidadOpcT(true);
    }

}
