/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

/**
 *
 * @author liuts
 */
public class PnlProveedor extends javax.swing.JPanel {

    /**
     * Creates new form PnlProveedor
     */
    public PnlProveedor() {
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

        opcionProveedor_Pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores_OP_Tbl = new javax.swing.JTable();
        buscar_OP_Btn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        nombreProveedor_OP_Lbl = new javax.swing.JLabel();
        agregar_OP_Btn = new javax.swing.JButton();
        informacionProveedor_TBn = new javax.swing.JTabbedPane();
        informacion_Proveedor_Pnl = new javax.swing.JPanel();
        nombreProveedor_IP_Lbl = new javax.swing.JLabel();
        nombreProveedor_IP_TFd = new javax.swing.JTextField();
        calificacion_IP_Lbl = new javax.swing.JLabel();
        calificacion_IP_CBx = new javax.swing.JComboBox();
        tipo_IP_Lbl = new javax.swing.JLabel();
        telefono_IP_lBL = new javax.swing.JLabel();
        telefono_IP_TFd = new javax.swing.JTextField();
        interno_IP_RBtn = new javax.swing.JRadioButton();
        externo_IP_RBtn = new javax.swing.JRadioButton();
        correoElectronico_IP_Lbl = new javax.swing.JLabel();
        correoElectronico_IP_TFd = new javax.swing.JTextField();
        guardar_IP_Btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        agregarcURSO_Btn = new javax.swing.JButton();
        agregarTodos_Btn = new javax.swing.JButton();
        guardar_Btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCurso_Tb = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTodos_Tb = new javax.swing.JTable();

        opcionProveedor_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionProveedor_Pnl.setPreferredSize(new java.awt.Dimension(352, 400));

        tablaProveedores_OP_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProveedores_OP_Tbl);
        if (tablaProveedores_OP_Tbl.getColumnModel().getColumnCount() > 0) {
            tablaProveedores_OP_Tbl.getColumnModel().getColumn(0).setResizable(false);
            tablaProveedores_OP_Tbl.getColumnModel().getColumn(1).setResizable(false);
            tablaProveedores_OP_Tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        buscar_OP_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_OP_Btn.setText("Buscar");
        buscar_OP_Btn.setActionCommand("Busca");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nombreProveedor_OP_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreProveedor_OP_Lbl.setText("Nombre del Proveedor:");

        agregar_OP_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregar_OP_Btn.setText("Agregar");

        javax.swing.GroupLayout opcionProveedor_PnlLayout = new javax.swing.GroupLayout(opcionProveedor_Pnl);
        opcionProveedor_Pnl.setLayout(opcionProveedor_PnlLayout);
        opcionProveedor_PnlLayout.setHorizontalGroup(
            opcionProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionProveedor_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(opcionProveedor_PnlLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(opcionProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionProveedor_PnlLayout.createSequentialGroup()
                                .addComponent(nombreProveedor_OP_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 43, Short.MAX_VALUE))
                            .addGroup(opcionProveedor_PnlLayout.createSequentialGroup()
                                .addComponent(agregar_OP_Btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscar_OP_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addContainerGap())
        );
        opcionProveedor_PnlLayout.setVerticalGroup(
            opcionProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionProveedor_PnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(opcionProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProveedor_OP_Lbl)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(opcionProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar_OP_Btn)
                    .addComponent(buscar_OP_Btn))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        informacionProveedor_TBn.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        informacion_Proveedor_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombreProveedor_IP_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreProveedor_IP_Lbl.setText("Nombre del proveedor:");

        nombreProveedor_IP_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        calificacion_IP_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calificacion_IP_Lbl.setText("Calificación:");

        calificacion_IP_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calificacion_IP_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }));

        tipo_IP_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_IP_Lbl.setText("Tipo de proveedor:");

        telefono_IP_lBL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefono_IP_lBL.setText("Teléfono :");

        telefono_IP_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        interno_IP_RBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        interno_IP_RBtn.setText("Interno");

        externo_IP_RBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        externo_IP_RBtn.setText("Externo");

        correoElectronico_IP_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correoElectronico_IP_Lbl.setText("Correo electrónico :");

        correoElectronico_IP_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        guardar_IP_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardar_IP_Btn.setText("Guardar");

        javax.swing.GroupLayout informacion_Proveedor_PnlLayout = new javax.swing.GroupLayout(informacion_Proveedor_Pnl);
        informacion_Proveedor_Pnl.setLayout(informacion_Proveedor_PnlLayout);
        informacion_Proveedor_PnlLayout.setHorizontalGroup(
            informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Proveedor_PnlLayout.createSequentialGroup()
                .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacion_Proveedor_PnlLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreProveedor_IP_Lbl)
                            .addComponent(telefono_IP_lBL))
                        .addGap(18, 18, 18)
                        .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreProveedor_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(informacion_Proveedor_PnlLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(tipo_IP_Lbl)
                        .addGap(29, 29, 29)
                        .addComponent(interno_IP_RBtn)))
                .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacion_Proveedor_PnlLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(externo_IP_RBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(informacion_Proveedor_PnlLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calificacion_IP_Lbl)
                            .addComponent(correoElectronico_IP_Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calificacion_IP_CBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoElectronico_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacion_Proveedor_PnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar_IP_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        informacion_Proveedor_PnlLayout.setVerticalGroup(
            informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacion_Proveedor_PnlLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProveedor_IP_Lbl)
                    .addComponent(nombreProveedor_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calificacion_IP_Lbl)
                    .addComponent(calificacion_IP_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono_IP_lBL)
                    .addComponent(telefono_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correoElectronico_IP_Lbl)
                    .addComponent(correoElectronico_IP_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacion_Proveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_IP_Lbl)
                    .addComponent(interno_IP_RBtn)
                    .addComponent(externo_IP_RBtn))
                .addGap(241, 241, 241)
                .addComponent(guardar_IP_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        informacionProveedor_TBn.addTab("General", informacion_Proveedor_Pnl);

        agregarcURSO_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarcURSO_Btn.setText(">");

        agregarTodos_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarTodos_Btn.setText(">>");

        guardar_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardar_Btn.setText("Guardar");

        tablaCurso_Tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Curso", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCurso_Tb);
        if (tablaCurso_Tb.getColumnModel().getColumnCount() > 0) {
            tablaCurso_Tb.getColumnModel().getColumn(0).setResizable(false);
            tablaCurso_Tb.getColumnModel().getColumn(1).setResizable(false);
        }

        tablaTodos_Tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Curso", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaTodos_Tb);
        if (tablaTodos_Tb.getColumnModel().getColumnCount() > 0) {
            tablaTodos_Tb.getColumnModel().getColumn(0).setResizable(false);
            tablaTodos_Tb.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(agregarcURSO_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(agregarTodos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(guardar_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(agregarcURSO_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(agregarTodos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        informacionProveedor_TBn.addTab("Lista de cursos impartidos", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionProveedor_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionProveedor_TBn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionProveedor_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addComponent(informacionProveedor_TBn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarTodos_Btn;
    private javax.swing.JButton agregar_OP_Btn;
    private javax.swing.JButton agregarcURSO_Btn;
    private javax.swing.JButton buscar_OP_Btn;
    private javax.swing.JComboBox calificacion_IP_CBx;
    private javax.swing.JLabel calificacion_IP_Lbl;
    private javax.swing.JLabel correoElectronico_IP_Lbl;
    private javax.swing.JTextField correoElectronico_IP_TFd;
    private javax.swing.JRadioButton externo_IP_RBtn;
    private javax.swing.JButton guardar_Btn;
    private javax.swing.JButton guardar_IP_Btn;
    private javax.swing.JTabbedPane informacionProveedor_TBn;
    private javax.swing.JPanel informacion_Proveedor_Pnl;
    private javax.swing.JRadioButton interno_IP_RBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nombreProveedor_IP_Lbl;
    private javax.swing.JTextField nombreProveedor_IP_TFd;
    private javax.swing.JLabel nombreProveedor_OP_Lbl;
    private javax.swing.JPanel opcionProveedor_Pnl;
    private javax.swing.JTable tablaCurso_Tb;
    private javax.swing.JTable tablaProveedores_OP_Tbl;
    private javax.swing.JTable tablaTodos_Tb;
    private javax.swing.JTextField telefono_IP_TFd;
    private javax.swing.JLabel telefono_IP_lBL;
    private javax.swing.JLabel tipo_IP_Lbl;
    // End of variables declaration//GEN-END:variables
}
