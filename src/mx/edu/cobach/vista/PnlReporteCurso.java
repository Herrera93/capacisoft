/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

/**
 *
 * @author liuts
 */
public class PnlReporteCurso extends javax.swing.JPanel {

    /**
     * Creates new form PnlReporteCurso
     */
    public PnlReporteCurso() {
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

        jPanel1 = new javax.swing.JPanel();
        opcionReporteCurso_tb = new javax.swing.JTabbedPane();
        departamento_Pnl = new javax.swing.JPanel();
        departamento_D_Lbl = new javax.swing.JLabel();
        seleccion_D_CBx = new javax.swing.JComboBox();
        opciones_OD_Lbl = new javax.swing.JLabel();
        nota_OD_Lbl2 = new javax.swing.JLabel();
        fecha_Pnl = new javax.swing.JPanel();
        fechaInicio_F_Lbl = new javax.swing.JLabel();
        fechaHasta_F_Lbl = new javax.swing.JLabel();
        fechaInicial_F_TFd = new javax.swing.JTextField();
        fechaHasta_F_TFd = new javax.swing.JTextField();
        buscar_F_Btn = new javax.swing.JButton();
        nota_OD_Lbl4 = new javax.swing.JLabel();
        opciones_OD_Lbl2 = new javax.swing.JLabel();
        plantel_Pnl = new javax.swing.JPanel();
        plantel_P_Lbl = new javax.swing.JLabel();
        seleccion_P_CBx = new javax.swing.JComboBox();
        nota_OD_Lbl3 = new javax.swing.JLabel();
        opciones_OD_Lbl1 = new javax.swing.JLabel();
        informacionReporteCurso_Pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos_IRC_Tbl = new javax.swing.JTable();
        imprimir_IRC_Btn = new javax.swing.JButton();
        info_IC_Lbl = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        opcionReporteCurso_tb.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionReporteCurso_tb.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionReporteCurso_tb.setPreferredSize(new java.awt.Dimension(408, 587));

        departamento_D_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamento_D_Lbl.setText("Departamento: ");

        seleccion_D_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        opciones_OD_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opciones_OD_Lbl.setText("Opciones ");

        nota_OD_Lbl2.setText("Ingrese el nombre para buscar la información especifica");

        javax.swing.GroupLayout departamento_PnlLayout = new javax.swing.GroupLayout(departamento_Pnl);
        departamento_Pnl.setLayout(departamento_PnlLayout);
        departamento_PnlLayout.setHorizontalGroup(
            departamento_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departamento_PnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(departamento_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nota_OD_Lbl2)
                    .addComponent(opciones_OD_Lbl)
                    .addGroup(departamento_PnlLayout.createSequentialGroup()
                        .addComponent(departamento_D_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seleccion_D_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        departamento_PnlLayout.setVerticalGroup(
            departamento_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departamento_PnlLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(opciones_OD_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_OD_Lbl2)
                .addGap(46, 46, 46)
                .addGroup(departamento_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departamento_D_Lbl)
                    .addComponent(seleccion_D_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        opcionReporteCurso_tb.addTab("Por Departamento", departamento_Pnl);

        fechaInicio_F_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaInicio_F_Lbl.setText("Fecha de:");

        fechaHasta_F_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaHasta_F_Lbl.setText("a:");

        fechaInicial_F_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fechaHasta_F_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buscar_F_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_F_Btn.setText("Buscar");

        nota_OD_Lbl4.setText("Ingrese el nombre para buscar la información especifica");

        opciones_OD_Lbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opciones_OD_Lbl2.setText("Opciones ");

        javax.swing.GroupLayout fecha_PnlLayout = new javax.swing.GroupLayout(fecha_Pnl);
        fecha_Pnl.setLayout(fecha_PnlLayout);
        fecha_PnlLayout.setHorizontalGroup(
            fecha_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fecha_PnlLayout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(buscar_F_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(fecha_PnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(fecha_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nota_OD_Lbl4)
                    .addComponent(opciones_OD_Lbl2)
                    .addGroup(fecha_PnlLayout.createSequentialGroup()
                        .addGroup(fecha_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaInicio_F_Lbl)
                            .addComponent(fechaHasta_F_Lbl))
                        .addGap(18, 18, 18)
                        .addGroup(fecha_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaInicial_F_TFd)
                            .addComponent(fechaHasta_F_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fecha_PnlLayout.setVerticalGroup(
            fecha_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fecha_PnlLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(opciones_OD_Lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_OD_Lbl4)
                .addGap(29, 29, 29)
                .addGroup(fecha_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaInicio_F_Lbl)
                    .addComponent(fechaInicial_F_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(fecha_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaHasta_F_Lbl)
                    .addComponent(fechaHasta_F_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(buscar_F_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        opcionReporteCurso_tb.addTab("Por fechas", fecha_Pnl);

        plantel_P_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plantel_P_Lbl.setText("Plantel:");

        seleccion_P_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccion_P_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nota_OD_Lbl3.setText("Ingrese el nombre para buscar la información especifica");

        opciones_OD_Lbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opciones_OD_Lbl1.setText("Opciones ");

        javax.swing.GroupLayout plantel_PnlLayout = new javax.swing.GroupLayout(plantel_Pnl);
        plantel_Pnl.setLayout(plantel_PnlLayout);
        plantel_PnlLayout.setHorizontalGroup(
            plantel_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantel_PnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(plantel_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nota_OD_Lbl3)
                    .addComponent(opciones_OD_Lbl1)
                    .addGroup(plantel_PnlLayout.createSequentialGroup()
                        .addComponent(plantel_P_Lbl)
                        .addGap(36, 36, 36)
                        .addComponent(seleccion_P_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        plantel_PnlLayout.setVerticalGroup(
            plantel_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plantel_PnlLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(opciones_OD_Lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_OD_Lbl3)
                .addGap(52, 52, 52)
                .addGroup(plantel_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plantel_P_Lbl)
                    .addComponent(seleccion_P_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(393, Short.MAX_VALUE))
        );

        opcionReporteCurso_tb.addTab("Por plantel", plantel_Pnl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionReporteCurso_tb, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionReporteCurso_tb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        informacionReporteCurso_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionReporteCurso_Pnl.setMaximumSize(new java.awt.Dimension(768, 564));
        informacionReporteCurso_Pnl.setMinimumSize(new java.awt.Dimension(768, 564));

        tablaCursos_IRC_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha inicial", "Fecha final", "Nombre", "Tipo", "Sede", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCursos_IRC_Tbl);
        if (tablaCursos_IRC_Tbl.getColumnModel().getColumnCount() > 0) {
            tablaCursos_IRC_Tbl.getColumnModel().getColumn(0).setResizable(false);
            tablaCursos_IRC_Tbl.getColumnModel().getColumn(1).setResizable(false);
            tablaCursos_IRC_Tbl.getColumnModel().getColumn(2).setResizable(false);
            tablaCursos_IRC_Tbl.getColumnModel().getColumn(3).setResizable(false);
            tablaCursos_IRC_Tbl.getColumnModel().getColumn(5).setResizable(false);
        }

        imprimir_IRC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imprimir_IRC_Btn.setText("Imprimir");

        info_IC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        info_IC_Lbl.setText("Información del los cursos realizados");

        javax.swing.GroupLayout informacionReporteCurso_PnlLayout = new javax.swing.GroupLayout(informacionReporteCurso_Pnl);
        informacionReporteCurso_Pnl.setLayout(informacionReporteCurso_PnlLayout);
        informacionReporteCurso_PnlLayout.setHorizontalGroup(
            informacionReporteCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionReporteCurso_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacionReporteCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionReporteCurso_PnlLayout.createSequentialGroup()
                        .addGap(0, 636, Short.MAX_VALUE)
                        .addComponent(imprimir_IRC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informacionReporteCurso_PnlLayout.createSequentialGroup()
                        .addComponent(info_IC_Lbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        informacionReporteCurso_PnlLayout.setVerticalGroup(
            informacionReporteCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionReporteCurso_PnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(info_IC_Lbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imprimir_IRC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionReporteCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(informacionReporteCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_F_Btn;
    private javax.swing.JLabel departamento_D_Lbl;
    private javax.swing.JPanel departamento_Pnl;
    private javax.swing.JLabel fechaHasta_F_Lbl;
    private javax.swing.JTextField fechaHasta_F_TFd;
    private javax.swing.JTextField fechaInicial_F_TFd;
    private javax.swing.JLabel fechaInicio_F_Lbl;
    private javax.swing.JPanel fecha_Pnl;
    private javax.swing.JButton imprimir_IRC_Btn;
    private javax.swing.JLabel info_IC_Lbl;
    private javax.swing.JPanel informacionReporteCurso_Pnl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nota_OD_Lbl2;
    private javax.swing.JLabel nota_OD_Lbl3;
    private javax.swing.JLabel nota_OD_Lbl4;
    private javax.swing.JTabbedPane opcionReporteCurso_tb;
    private javax.swing.JLabel opciones_OD_Lbl;
    private javax.swing.JLabel opciones_OD_Lbl1;
    private javax.swing.JLabel opciones_OD_Lbl2;
    private javax.swing.JLabel plantel_P_Lbl;
    private javax.swing.JPanel plantel_Pnl;
    private javax.swing.JComboBox seleccion_D_CBx;
    private javax.swing.JComboBox seleccion_P_CBx;
    private javax.swing.JTable tablaCursos_IRC_Tbl;
    // End of variables declaration//GEN-END:variables
}
