/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.controlador.BaseControlador;
import mx.edu.cobach.vista.controlador.EmpleadoControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author liuts
 */
public class PnlEmpleadoAdministrativo extends javax.swing.JPanel implements
        Comunicador{
    
    private final DefaultTableModel model;
    private final DefaultComboBoxModel puestoModel, plantelModel, dptoModel,
            adscripModel;
    private final String[] titulosTabla;
    private final EmpleadoControlador control;
    /**
     * Creates new form PnlEmpleadoAdministrativo
     */
    public PnlEmpleadoAdministrativo() {
        this.titulosTabla = new String[]{"Numero", "Nombre", "Eliminar"};
        initComponents();
        model = new DefaultTableModel(titulosTabla, 5);
        tablaEmpleados_OE_Tbl.setModel(model);
        tablaEmpleados_OE_Tbl.setColumnSelectionAllowed(false);
        tablaEmpleados_OE_Tbl.setDragEnabled(false);
        control = new EmpleadoControlador(this, Empleado.class);
        puestoModel = new DefaultComboBoxModel();
        plantelModel = new DefaultComboBoxModel();
        dptoModel = new DefaultComboBoxModel();
        adscripModel = new DefaultComboBoxModel();
        puesto_IE_CBx.setModel(puestoModel);
        plantel_IE_CBx.setModel(plantelModel);
        departamento_IE_CBx.setModel(dptoModel);
        adscripcion_IE_CBx.setModel(adscripModel);
        adscripcion_OE_CBx.setModel(adscripModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionEmpleado_Pnl = new javax.swing.JPanel();
        nombreEmpleado_OE_Lbl = new javax.swing.JLabel();
        plantelEmpleado_OE_Lbl = new javax.swing.JLabel();
        nombreEmpleado_OE_TFd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados_OE_Tbl = new javax.swing.JTable();
        buscar_OE_Btn = new javax.swing.JButton();
        agregar_OE_Btn = new javax.swing.JButton();
        adscripcion_OE_CBx = new javax.swing.JComboBox();
        nota_OE_Lbl = new javax.swing.JLabel();
        opciones_OE_Lbl = new javax.swing.JLabel();
        informacionEmpleado_Pnl = new javax.swing.JPanel();
        puesto_IE_Pnl = new javax.swing.JLabel();
        plantel_IE_Lbl = new javax.swing.JLabel();
        numero_IE_Lbl = new javax.swing.JLabel();
        correoElectronico_IE_Lbl = new javax.swing.JLabel();
        adscripcion_IE_Lbl = new javax.swing.JLabel();
        departamento_IE_Lbl = new javax.swing.JLabel();
        numero_IE_TFd = new javax.swing.JTextField();
        correoElectronico_IE_TFd = new javax.swing.JTextField();
        puesto_IE_CBx = new javax.swing.JComboBox();
        plantel_IE_CBx = new javax.swing.JComboBox();
        adscripcion_IE_CBx = new javax.swing.JComboBox();
        departamento_IE_CBx = new javax.swing.JComboBox();
        guardar_IE_Btn = new javax.swing.JButton();
        primerNombre_IE_Lbl = new javax.swing.JLabel();
        primerNombre_IE_TFd = new javax.swing.JTextField();
        segundoNombre_IE_TFd = new javax.swing.JTextField();
        segundoNombre_IE_Lbl = new javax.swing.JLabel();
        segundoApellido_IE_TFd = new javax.swing.JTextField();
        segundoApellido_IE_Lbl = new javax.swing.JLabel();
        primerApellido_IE_TFd = new javax.swing.JTextField();
        primerApellido_IE_Lbl = new javax.swing.JLabel();
        agregar_IE_LBl = new javax.swing.JLabel();
        nota_IE_Lbl = new javax.swing.JLabel();

        opcionEmpleado_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionEmpleado_Pnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionEmpleado_Pnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionEmpleado_Pnl.setPreferredSize(new java.awt.Dimension(408, 587));

        nombreEmpleado_OE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreEmpleado_OE_Lbl.setText("Nombre del empledo:");

        plantelEmpleado_OE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plantelEmpleado_OE_Lbl.setText("Adscripción del empleado:");

        nombreEmpleado_OE_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreEmpleado_OE_TFd.setEnabled(false);

        tablaEmpleados_OE_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmpleados_OE_Tbl);
        if (tablaEmpleados_OE_Tbl.getColumnModel().getColumnCount() > 0) {
            tablaEmpleados_OE_Tbl.getColumnModel().getColumn(0).setResizable(false);
            tablaEmpleados_OE_Tbl.getColumnModel().getColumn(1).setResizable(false);
            tablaEmpleados_OE_Tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        buscar_OE_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_OE_Btn.setText("Buscar");
        buscar_OE_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_OE_BtnActionPerformed(evt);
            }
        });

        agregar_OE_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregar_OE_Btn.setText("Agregar");
        agregar_OE_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_OE_BtnActionPerformed(evt);
            }
        });

        adscripcion_OE_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adscripcion_OE_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plantel", "Departamento" }));
        adscripcion_OE_CBx.setEnabled(false);

        nota_OE_Lbl.setText("Ingrese el nombre para buscar la información especifica");

        opciones_OE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opciones_OE_Lbl.setText("Opciones ");

        javax.swing.GroupLayout opcionEmpleado_PnlLayout = new javax.swing.GroupLayout(opcionEmpleado_Pnl);
        opcionEmpleado_Pnl.setLayout(opcionEmpleado_PnlLayout);
        opcionEmpleado_PnlLayout.setHorizontalGroup(
            opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                                .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregar_OE_Btn)
                                    .addComponent(plantelEmpleado_OE_Lbl)
                                    .addComponent(nombreEmpleado_OE_Lbl))
                                .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                                                .addComponent(nombreEmpleado_OE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                                                .addComponent(adscripcion_OE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(61, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionEmpleado_PnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscar_OE_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))))
                            .addGroup(opcionEmpleado_PnlLayout.createSequentialGroup()
                                .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opciones_OE_Lbl)
                                    .addComponent(nota_OE_Lbl))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        opcionEmpleado_PnlLayout.setVerticalGroup(
            opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionEmpleado_PnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opciones_OE_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota_OE_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreEmpleado_OE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreEmpleado_OE_Lbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plantelEmpleado_OE_Lbl)
                    .addComponent(adscripcion_OE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar_OE_Btn)
                    .addComponent(buscar_OE_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        informacionEmpleado_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        puesto_IE_Pnl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puesto_IE_Pnl.setText("Puesto:");

        plantel_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plantel_IE_Lbl.setText("Plantel:");

        numero_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numero_IE_Lbl.setText("Num. Empleado:");

        correoElectronico_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correoElectronico_IE_Lbl.setText("Correo electrónico :");

        adscripcion_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adscripcion_IE_Lbl.setText("Adscripción ");

        departamento_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamento_IE_Lbl.setText("Departamento:");

        numero_IE_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numero_IE_TFd.setEnabled(false);

        correoElectronico_IE_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correoElectronico_IE_TFd.setEnabled(false);

        puesto_IE_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puesto_IE_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        puesto_IE_CBx.setToolTipText("Seleccioné el puesto que esta asigando el empleado");
        puesto_IE_CBx.setEnabled(false);

        plantel_IE_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plantel_IE_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        plantel_IE_CBx.setToolTipText("Seleccioné el plantel que esta asigando el empleado");
        plantel_IE_CBx.setEnabled(false);

        adscripcion_IE_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adscripcion_IE_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plantel", "Departamento" }));
        adscripcion_IE_CBx.setToolTipText("Seleccioné la  adscripción que esta asigando el empleado");
        adscripcion_IE_CBx.setEnabled(false);

        departamento_IE_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamento_IE_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departamento_IE_CBx.setToolTipText("Seleccioné el departamento que esta asigando el empleado");
        departamento_IE_CBx.setEnabled(false);

        guardar_IE_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardar_IE_Btn.setText("Guardar");
        guardar_IE_Btn.setEnabled(false);
        guardar_IE_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_IE_BtnActionPerformed(evt);
            }
        });

        primerNombre_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primerNombre_IE_Lbl.setText("Primer nombre:");

        primerNombre_IE_TFd.setEnabled(false);

        segundoNombre_IE_TFd.setEnabled(false);

        segundoNombre_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        segundoNombre_IE_Lbl.setText("Segundo nombre:");

        segundoApellido_IE_TFd.setEnabled(false);

        segundoApellido_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        segundoApellido_IE_Lbl.setText("Segundo apellido:");

        primerApellido_IE_TFd.setEnabled(false);

        primerApellido_IE_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primerApellido_IE_Lbl.setText("Primer apellido:");

        agregar_IE_LBl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregar_IE_LBl.setText("Agregar");

        nota_IE_Lbl.setText("Ingrese la información a almacenar");

        javax.swing.GroupLayout informacionEmpleado_PnlLayout = new javax.swing.GroupLayout(informacionEmpleado_Pnl);
        informacionEmpleado_Pnl.setLayout(informacionEmpleado_PnlLayout);
        informacionEmpleado_PnlLayout.setHorizontalGroup(
            informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                        .addComponent(primerNombre_IE_Lbl)
                        .addGap(18, 18, 18)
                        .addComponent(primerNombre_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                .addComponent(segundoNombre_IE_Lbl)
                                .addGap(55, 55, 55)
                                .addComponent(segundoNombre_IE_TFd, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                .addComponent(segundoApellido_IE_Lbl)
                                .addGap(59, 59, 59)
                                .addComponent(segundoApellido_IE_TFd))
                            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                .addComponent(correoElectronico_IE_Lbl)
                                .addGap(46, 46, 46)
                                .addComponent(correoElectronico_IE_TFd)))
                        .addGap(69, 69, 69))
                    .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                        .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(adscripcion_IE_Lbl)
                                .addGap(38, 38, 38)
                                .addComponent(adscripcion_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                .addComponent(plantel_IE_Lbl)
                                .addGap(63, 63, 63)
                                .addComponent(plantel_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionEmpleado_PnlLayout.createSequentialGroup()
                                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                        .addComponent(puesto_IE_Pnl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(puesto_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                        .addComponent(primerApellido_IE_Lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(primerApellido_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(175, 175, 175)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                        .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                                .addComponent(numero_IE_Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nota_IE_Lbl)
                            .addComponent(agregar_IE_LBl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 473, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionEmpleado_PnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionEmpleado_PnlLayout.createSequentialGroup()
                        .addComponent(departamento_IE_Lbl)
                        .addGap(18, 18, 18)
                        .addComponent(departamento_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionEmpleado_PnlLayout.createSequentialGroup()
                        .addComponent(guardar_IE_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        informacionEmpleado_PnlLayout.setVerticalGroup(
            informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionEmpleado_PnlLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(agregar_IE_LBl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_IE_Lbl)
                .addGap(51, 51, 51)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_IE_Lbl)
                    .addComponent(numero_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoNombre_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoNombre_IE_Lbl)
                    .addComponent(primerNombre_IE_Lbl)
                    .addComponent(primerNombre_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(primerApellido_IE_Lbl)
                    .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(primerApellido_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(segundoApellido_IE_Lbl)
                        .addComponent(segundoApellido_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puesto_IE_Pnl)
                    .addComponent(puesto_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoElectronico_IE_Lbl)
                    .addComponent(correoElectronico_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adscripcion_IE_Lbl)
                    .addComponent(adscripcion_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(informacionEmpleado_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departamento_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamento_IE_Lbl)
                    .addComponent(plantel_IE_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plantel_IE_Lbl))
                .addGap(36, 36, 36)
                .addComponent(guardar_IE_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionEmpleado_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionEmpleado_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionEmpleado_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(informacionEmpleado_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_IE_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_IE_BtnActionPerformed
        List<Object> atributos = new ArrayList<>();
        atributos.add(numero_IE_TFd.getText());
        atributos.add(primerNombre_IE_TFd.getText());
        atributos.add(segundoNombre_IE_TFd.getText());
        atributos.add(primerApellido_IE_TFd.getText());
        atributos.add(segundoApellido_IE_TFd.getText());
        atributos.add(puesto_IE_CBx.getSelectedItem());
        atributos.add(correoElectronico_IE_TFd.getText());
        atributos.add(adscripcion_IE_CBx.getSelectedItem());
        atributos.add(plantel_IE_CBx.getSelectedItem());
        atributos.add(departamento_IE_CBx.getSelectedItem());
        control.alta(HelperEntidad.getEmpleado(atributos));
        numero_IE_TFd.setText("");
        primerNombre_IE_TFd.setText("");
        segundoNombre_IE_TFd.setText("");
        primerApellido_IE_TFd.setText("");
        segundoApellido_IE_TFd.setText("");
        correoElectronico_IE_TFd.setText("");        
        control.buscarTodos();
    }//GEN-LAST:event_guardar_IE_BtnActionPerformed

    private void agregar_OE_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_OE_BtnActionPerformed
        setEnabledPanelInformacion(true);
    }//GEN-LAST:event_agregar_OE_BtnActionPerformed

    private void buscar_OE_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_OE_BtnActionPerformed
        String nombre = nombreEmpleado_OE_TFd.getText();
        control.buscarPorNombre(nombre);
    }//GEN-LAST:event_buscar_OE_BtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adscripcion_IE_CBx;
    private javax.swing.JLabel adscripcion_IE_Lbl;
    private javax.swing.JComboBox adscripcion_OE_CBx;
    private javax.swing.JLabel agregar_IE_LBl;
    private javax.swing.JButton agregar_OE_Btn;
    private javax.swing.JButton buscar_OE_Btn;
    private javax.swing.JLabel correoElectronico_IE_Lbl;
    private javax.swing.JTextField correoElectronico_IE_TFd;
    private javax.swing.JComboBox departamento_IE_CBx;
    private javax.swing.JLabel departamento_IE_Lbl;
    private javax.swing.JButton guardar_IE_Btn;
    private javax.swing.JPanel informacionEmpleado_Pnl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreEmpleado_OE_Lbl;
    private javax.swing.JTextField nombreEmpleado_OE_TFd;
    private javax.swing.JLabel nota_IE_Lbl;
    private javax.swing.JLabel nota_OE_Lbl;
    private javax.swing.JLabel numero_IE_Lbl;
    private javax.swing.JTextField numero_IE_TFd;
    private javax.swing.JPanel opcionEmpleado_Pnl;
    private javax.swing.JLabel opciones_OE_Lbl;
    private javax.swing.JLabel plantelEmpleado_OE_Lbl;
    private javax.swing.JComboBox plantel_IE_CBx;
    private javax.swing.JLabel plantel_IE_Lbl;
    private javax.swing.JLabel primerApellido_IE_Lbl;
    private javax.swing.JTextField primerApellido_IE_TFd;
    private javax.swing.JLabel primerNombre_IE_Lbl;
    private javax.swing.JTextField primerNombre_IE_TFd;
    private javax.swing.JComboBox puesto_IE_CBx;
    private javax.swing.JLabel puesto_IE_Pnl;
    private javax.swing.JLabel segundoApellido_IE_Lbl;
    private javax.swing.JTextField segundoApellido_IE_TFd;
    private javax.swing.JLabel segundoNombre_IE_Lbl;
    private javax.swing.JTextField segundoNombre_IE_TFd;
    private javax.swing.JTable tablaEmpleados_OE_Tbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public void setTabla(String[][] info) {
        model.setDataVector(info, titulosTabla);
        TableColumn tc = tablaEmpleados_OE_Tbl.getColumnModel().getColumn(2);
        tc.setCellEditor(tablaEmpleados_OE_Tbl.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tablaEmpleados_OE_Tbl.getDefaultRenderer(Boolean.class));
        tablaEmpleados_OE_Tbl.getColumnModel().removeColumn(tc);
    }

    @Override
    public void setLista(List info, int i) {
        if(info.isEmpty()) return;
        switch(i){
            case 1:
                puestoModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  puestoModel.addElement(info.get(j));
                }
                break;
            case 2:
                plantelModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  plantelModel.addElement(info.get(j));
                }
                break;
            case 3:
                dptoModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  dptoModel.addElement(info.get(j));
                }
                break;
            case 4:
                adscripModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  adscripModel.addElement(info.get(j));
                }
                break;                
        }
    }
    
    public void llenarTodo(){
        control.buscarTodos();
        control.setClass(Puesto.class);
        control.buscarTodosLista(1);
        control.setClass(Plantel.class);
        control.buscarTodosLista(2);
        control.setClass(Departamento.class);
        control.buscarTodosLista(3);
        control.setClass(Adscripcion.class);
        control.buscarTodosLista(4);
        control.setClass(Empleado.class);
        setEnabledPanelInformacion(false);
        
    }
    
    private void setEnabledPanelInformacion(boolean b){
        numero_IE_TFd.setEnabled(b);
        primerNombre_IE_TFd.setEnabled(b);
        segundoNombre_IE_TFd.setEnabled(b);
        primerApellido_IE_TFd.setEnabled(b);
        segundoApellido_IE_TFd.setEnabled(b);
        correoElectronico_IE_TFd.setEnabled(b);
        puesto_IE_CBx.setEnabled(b);
        plantel_IE_CBx.setEnabled(b);
        adscripcion_IE_CBx.setEnabled(b);
        departamento_IE_CBx.setEnabled(b);
        guardar_IE_Btn.setEnabled(b);
    }

    @Override
    public void setInfo(String[][] info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
