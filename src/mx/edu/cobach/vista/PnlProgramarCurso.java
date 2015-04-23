/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

/**
 *
 * @author liuts
 */
public class PnlProgramarCurso extends javax.swing.JPanel {

    /**
     * Creates new form PnlProgramarCurso
     */
    
    private PnlCursoRealizar cursoRealizarPnl;
    private PnlCursoRealizado cursoRealizadoPnl;
    
    public PnlProgramarCurso() {
        initComponents();
        agregar();
    }
    
    private void agregar(){
        cursoRealizarPnl = new PnlCursoRealizar();
        cursoRealizarPnl.setLocation(410,0);
        cursoRealizarPnl.setSize(771,589);
        cursoRealizarPnl.setVisible(false);
        add(cursoRealizarPnl);
        
        cursoRealizadoPnl = new PnlCursoRealizado();
        cursoRealizadoPnl.setLocation(410,0);
        cursoRealizadoPnl.setSize(771,589);
        cursoRealizadoPnl.setVisible(false);
        add(cursoRealizadoPnl);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opcionesCurso_TP = new javax.swing.JTabbedPane();
        registrarCurso_Pnl = new javax.swing.JPanel();
        nombreCurso_RC_Lbl = new javax.swing.JLabel();
        tipoCurso_RC_CBx = new javax.swing.JComboBox();
        programarCursoRealizar_RC_Btn = new javax.swing.JButton();
        registrarCursoRealizado_RC_Btn = new javax.swing.JButton();
        pnlcalendario_OC_Pnl = new javax.swing.JPanel();
        calendario_RC_Cal = new com.jpcomponents.JPCalendar();
        opciones_RC_Lbl = new javax.swing.JLabel();
        BuscarCurso_Pnl = new javax.swing.JPanel();
        nombre_BC_Lbl = new javax.swing.JLabel();
        sede_BC_Lbl = new javax.swing.JLabel();
        sede_BC_TFd = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCursos_BC_Tbl = new javax.swing.JTable();
        buscar_BC_Btn = new javax.swing.JButton();
        seleccion_BC_CBx = new javax.swing.JComboBox();
        opciones_BC_Lbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1150, 576));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombreCurso_RC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreCurso_RC_Lbl.setText("Nombre del curso:");

        tipoCurso_RC_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoCurso_RC_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        programarCursoRealizar_RC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        programarCursoRealizar_RC_Btn.setText("Programar curso a realizar");
        programarCursoRealizar_RC_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programarCursoRealizar_RC_BtnActionPerformed(evt);
            }
        });

        registrarCursoRealizado_RC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registrarCursoRealizado_RC_Btn.setText("Registrar curso realizado");
        registrarCursoRealizado_RC_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCursoRealizado_RC_BtnActionPerformed(evt);
            }
        });

        pnlcalendario_OC_Pnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlcalendario_OC_PnlLayout = new javax.swing.GroupLayout(pnlcalendario_OC_Pnl);
        pnlcalendario_OC_Pnl.setLayout(pnlcalendario_OC_PnlLayout);
        pnlcalendario_OC_PnlLayout.setHorizontalGroup(
            pnlcalendario_OC_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcalendario_OC_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calendario_RC_Cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlcalendario_OC_PnlLayout.setVerticalGroup(
            pnlcalendario_OC_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcalendario_OC_PnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(calendario_RC_Cal, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        opciones_RC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opciones_RC_Lbl.setText("Opciones");

        javax.swing.GroupLayout registrarCurso_PnlLayout = new javax.swing.GroupLayout(registrarCurso_Pnl);
        registrarCurso_Pnl.setLayout(registrarCurso_PnlLayout);
        registrarCurso_PnlLayout.setHorizontalGroup(
            registrarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCurso_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registrarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarCurso_PnlLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(registrarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opciones_RC_Lbl)
                            .addGroup(registrarCurso_PnlLayout.createSequentialGroup()
                                .addComponent(nombreCurso_RC_Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(tipoCurso_RC_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(registrarCurso_PnlLayout.createSequentialGroup()
                        .addComponent(registrarCursoRealizado_RC_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(programarCursoRealizar_RC_Btn))
                    .addComponent(pnlcalendario_OC_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        registrarCurso_PnlLayout.setVerticalGroup(
            registrarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCurso_PnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(opciones_RC_Lbl)
                .addGap(18, 18, 18)
                .addGroup(registrarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreCurso_RC_Lbl)
                    .addComponent(tipoCurso_RC_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarCursoRealizado_RC_Btn)
                    .addComponent(programarCursoRealizar_RC_Btn))
                .addGap(26, 26, 26)
                .addComponent(pnlcalendario_OC_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        opcionesCurso_TP.addTab("Registrar curso de capacitación", registrarCurso_Pnl);

        BuscarCurso_Pnl.setPreferredSize(new java.awt.Dimension(352, 400));
        BuscarCurso_Pnl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BuscarCurso_PnlComponentShown(evt);
            }
        });

        nombre_BC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre_BC_Lbl.setText("Nombre del curso: ");

        sede_BC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sede_BC_Lbl.setText("Sede del curso:");

        sede_BC_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tablaCursos_BC_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha Inicial", "Nombre del curso", "Estado", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaCursos_BC_Tbl);
        if (tablaCursos_BC_Tbl.getColumnModel().getColumnCount() > 0) {
            tablaCursos_BC_Tbl.getColumnModel().getColumn(0).setResizable(false);
            tablaCursos_BC_Tbl.getColumnModel().getColumn(1).setResizable(false);
            tablaCursos_BC_Tbl.getColumnModel().getColumn(2).setResizable(false);
            tablaCursos_BC_Tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        buscar_BC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_BC_Btn.setText("Buscar");

        seleccion_BC_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccion_BC_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        opciones_BC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opciones_BC_Lbl.setText("Opciones");

        javax.swing.GroupLayout BuscarCurso_PnlLayout = new javax.swing.GroupLayout(BuscarCurso_Pnl);
        BuscarCurso_Pnl.setLayout(BuscarCurso_PnlLayout);
        BuscarCurso_PnlLayout.setHorizontalGroup(
            BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarCurso_PnlLayout.createSequentialGroup()
                .addGroup(BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarCurso_PnlLayout.createSequentialGroup()
                        .addGroup(BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscar_BC_Btn)
                            .addGroup(BuscarCurso_PnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sede_BC_Lbl)
                                    .addComponent(nombre_BC_Lbl))
                                .addGap(18, 18, 18)
                                .addGroup(BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(seleccion_BC_CBx, 0, 163, Short.MAX_VALUE)
                                    .addComponent(sede_BC_TFd))
                                .addGap(70, 70, 70)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(BuscarCurso_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opciones_BC_Lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BuscarCurso_PnlLayout.setVerticalGroup(
            BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarCurso_PnlLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(opciones_BC_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_BC_Lbl)
                    .addComponent(seleccion_BC_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BuscarCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sede_BC_Lbl)
                    .addComponent(sede_BC_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscar_BC_Btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        opcionesCurso_TP.addTab("Buscar Curso", BuscarCurso_Pnl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesCurso_TP)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesCurso_TP)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(736, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarCursoRealizado_RC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCursoRealizado_RC_BtnActionPerformed
        cursoRealizarPnl.setVisible(false);
        cursoRealizadoPnl.setVisible(true);
    }//GEN-LAST:event_registrarCursoRealizado_RC_BtnActionPerformed

    private void programarCursoRealizar_RC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programarCursoRealizar_RC_BtnActionPerformed
        cursoRealizarPnl.setVisible(true);
        cursoRealizadoPnl.setVisible(false);
    }//GEN-LAST:event_programarCursoRealizar_RC_BtnActionPerformed

    private void BuscarCurso_PnlComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BuscarCurso_PnlComponentShown
        cursoRealizarPnl.setVisible(false);
        cursoRealizadoPnl.setVisible(false);
    }//GEN-LAST:event_BuscarCurso_PnlComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuscarCurso_Pnl;
    private javax.swing.JButton buscar_BC_Btn;
    private com.jpcomponents.JPCalendar calendario_RC_Cal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nombreCurso_RC_Lbl;
    private javax.swing.JLabel nombre_BC_Lbl;
    private javax.swing.JTabbedPane opcionesCurso_TP;
    private javax.swing.JLabel opciones_BC_Lbl;
    private javax.swing.JLabel opciones_RC_Lbl;
    private javax.swing.JPanel pnlcalendario_OC_Pnl;
    private javax.swing.JButton programarCursoRealizar_RC_Btn;
    private javax.swing.JButton registrarCursoRealizado_RC_Btn;
    private javax.swing.JPanel registrarCurso_Pnl;
    private javax.swing.JLabel sede_BC_Lbl;
    private javax.swing.JTextField sede_BC_TFd;
    private javax.swing.JComboBox seleccion_BC_CBx;
    private javax.swing.JTable tablaCursos_BC_Tbl;
    private javax.swing.JComboBox tipoCurso_RC_CBx;
    // End of variables declaration//GEN-END:variables
}
