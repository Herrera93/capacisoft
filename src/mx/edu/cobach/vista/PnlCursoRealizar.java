/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

/**
 *
 * @author liuts
 */
public class PnlCursoRealizar extends javax.swing.JPanel {

    /**
     * Creates new form PnlCursoRealizar
     */
    public PnlCursoRealizar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informacionCurso_TP = new javax.swing.JTabbedPane();
        general_Pnl = new javax.swing.JPanel();
        nombreCurso_G_Lbl = new javax.swing.JLabel();
        fechaInicial_G_Lbl = new javax.swing.JLabel();
        fechaTerminacion_G_Lbl = new javax.swing.JLabel();
        tipo_G_Lbl = new javax.swing.JLabel();
        sede_G_Lbl = new javax.swing.JLabel();
        numero_G_Lbl = new javax.swing.JLabel();
        descripcion_G_Lbl = new javax.swing.JLabel();
        nombreCurso_G_TFd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionCurso_G_TAa = new javax.swing.JTextArea();
        tipo_G_CBx = new javax.swing.JComboBox();
        sede_G_CBx = new javax.swing.JComboBox();
        numero_G_CBx = new javax.swing.JComboBox();
        guardar_G_Btn = new javax.swing.JButton();
        fechaInicio_G_DCh = new com.toedter.calendar.JDateChooser();
        fechaTerminacion_G_DCh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        seleccion_LA_Lbl = new javax.swing.JLabel();
        tipo_LA_CBx = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSeleccion_LA_Tbl = new javax.swing.JTable();
        agregarEmpleado_LA_Btn = new javax.swing.JButton();
        agregarTodos_AL_Btn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaSeleccionCampo_LA_tbl = new javax.swing.JTable();
        guardar_LA_Btn = new javax.swing.JButton();
        SeleccionCampo_LA_TFd = new javax.swing.JTextField();
        seleccionCampo_LA_Lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        informacionCurso_TP.setPreferredSize(new java.awt.Dimension(739, 472));

        nombreCurso_G_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreCurso_G_Lbl.setText("Nombre del curso:");

        fechaInicial_G_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaInicial_G_Lbl.setText("Fecha inicial de curso:");

        fechaTerminacion_G_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaTerminacion_G_Lbl.setText("Fecha de terminación  del curso:");

        tipo_G_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_G_Lbl.setText("Tipo de curso:");

        sede_G_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sede_G_Lbl.setText("Sede del curso:");

        numero_G_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numero_G_Lbl.setText("Numero de Proveedor:");

        descripcion_G_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcion_G_Lbl.setText("Descripcion del curso:");

        nombreCurso_G_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreCurso_G_TFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCurso_G_TFdActionPerformed(evt);
            }
        });

        descripcionCurso_G_TAa.setColumns(20);
        descripcionCurso_G_TAa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionCurso_G_TAa.setRows(5);
        jScrollPane1.setViewportView(descripcionCurso_G_TAa);

        tipo_G_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_G_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sede_G_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sede_G_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        numero_G_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numero_G_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        guardar_G_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardar_G_Btn.setText("Guardar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Agregar");

        javax.swing.GroupLayout general_PnlLayout = new javax.swing.GroupLayout(general_Pnl);
        general_Pnl.setLayout(general_PnlLayout);
        general_PnlLayout.setHorizontalGroup(
            general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(general_PnlLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(general_PnlLayout.createSequentialGroup()
                        .addComponent(descripcion_G_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar_G_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(general_PnlLayout.createSequentialGroup()
                        .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(general_PnlLayout.createSequentialGroup()
                                .addComponent(fechaTerminacion_G_Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(fechaTerminacion_G_DCh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, general_PnlLayout.createSequentialGroup()
                                        .addComponent(fechaInicial_G_Lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(fechaInicio_G_DCh, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, general_PnlLayout.createSequentialGroup()
                                        .addComponent(nombreCurso_G_Lbl)
                                        .addGap(102, 102, 102)
                                        .addComponent(nombreCurso_G_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(59, 59, 59)
                        .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(general_PnlLayout.createSequentialGroup()
                                .addComponent(tipo_G_Lbl)
                                .addGap(57, 57, 57)
                                .addComponent(tipo_G_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(general_PnlLayout.createSequentialGroup()
                                .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numero_G_Lbl)
                                    .addComponent(sede_G_Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sede_G_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero_G_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        general_PnlLayout.setVerticalGroup(
            general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(general_PnlLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_G_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_G_Lbl)
                    .addComponent(nombreCurso_G_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCurso_G_Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaInicio_G_DCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaInicial_G_Lbl)
                    .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sede_G_Lbl)
                        .addComponent(sede_G_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(general_PnlLayout.createSequentialGroup()
                        .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numero_G_Lbl)
                            .addComponent(numero_G_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fechaTerminacion_G_Lbl)
                                .addComponent(fechaTerminacion_G_DCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79)
                        .addGroup(general_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion_G_Lbl)))
                    .addGroup(general_PnlLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(guardar_G_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );

        informacionCurso_TP.addTab("General", general_Pnl);

        seleccion_LA_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccion_LA_Lbl.setText("Selecciona un campo:");

        tipo_LA_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_LA_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Departamento", "Plantel", "Puesto" }));

        tablaSeleccion_LA_Tbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaSeleccion_LA_Tbl);

        agregarEmpleado_LA_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarEmpleado_LA_Btn.setText(">");

        agregarTodos_AL_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarTodos_AL_Btn.setText(">>");

        tablaSeleccionCampo_LA_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero del empleado", "Nombre del empleado", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaSeleccionCampo_LA_tbl);

        guardar_LA_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardar_LA_Btn.setText("Guardar");

        SeleccionCampo_LA_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        seleccionCampo_LA_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccionCampo_LA_Lbl.setText("Nombre del Empleado:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Agregar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(guardar_LA_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarTodos_AL_Btn)
                            .addComponent(agregarEmpleado_LA_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seleccionCampo_LA_Lbl)
                        .addGap(18, 18, 18)
                        .addComponent(SeleccionCampo_LA_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(seleccion_LA_Lbl)
                .addGap(18, 18, 18)
                .addComponent(tipo_LA_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(agregarEmpleado_LA_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(agregarTodos_AL_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(guardar_LA_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccion_LA_Lbl)
                    .addComponent(tipo_LA_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionCampo_LA_Lbl)
                    .addComponent(SeleccionCampo_LA_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        informacionCurso_TP.addTab("Lista de asistencia", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacionCurso_TP, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacionCurso_TP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreCurso_G_TFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCurso_G_TFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCurso_G_TFdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SeleccionCampo_LA_TFd;
    private javax.swing.JButton agregarEmpleado_LA_Btn;
    private javax.swing.JButton agregarTodos_AL_Btn;
    private javax.swing.JTextArea descripcionCurso_G_TAa;
    private javax.swing.JLabel descripcion_G_Lbl;
    private javax.swing.JLabel fechaInicial_G_Lbl;
    private com.toedter.calendar.JDateChooser fechaInicio_G_DCh;
    private com.toedter.calendar.JDateChooser fechaTerminacion_G_DCh;
    private javax.swing.JLabel fechaTerminacion_G_Lbl;
    private javax.swing.JPanel general_Pnl;
    private javax.swing.JButton guardar_G_Btn;
    private javax.swing.JButton guardar_LA_Btn;
    private javax.swing.JTabbedPane informacionCurso_TP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel nombreCurso_G_Lbl;
    private javax.swing.JTextField nombreCurso_G_TFd;
    private javax.swing.JComboBox numero_G_CBx;
    private javax.swing.JLabel numero_G_Lbl;
    private javax.swing.JComboBox sede_G_CBx;
    private javax.swing.JLabel sede_G_Lbl;
    private javax.swing.JLabel seleccionCampo_LA_Lbl;
    private javax.swing.JLabel seleccion_LA_Lbl;
    private javax.swing.JTable tablaSeleccionCampo_LA_tbl;
    private javax.swing.JTable tablaSeleccion_LA_Tbl;
    private javax.swing.JComboBox tipo_G_CBx;
    private javax.swing.JLabel tipo_G_Lbl;
    private javax.swing.JComboBox tipo_LA_CBx;
    // End of variables declaration//GEN-END:variables
}
