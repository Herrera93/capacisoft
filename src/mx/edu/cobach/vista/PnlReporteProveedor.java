/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

/**
 *
 * @author liuts
 */
public class PnlReporteProveedor extends javax.swing.JPanel {

    /**
     * Creates new form PnlReporteProveedor
     */
    public PnlReporteProveedor() {
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

        opcionReporteProveedor_Pnl = new javax.swing.JPanel();
        calificacion_ORP_Lbl = new javax.swing.JLabel();
        hasta_ORP_Lbl = new javax.swing.JLabel();
        calificacion_ORP_CBx = new javax.swing.JComboBox();
        hasta_ORP_CBx = new javax.swing.JComboBox();
        buscar_ORP_Btn = new javax.swing.JButton();
        informacionReporteProveedor_Pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor_IRP_Tbl = new javax.swing.JTable();
        imprimir_IRP_Btn = new javax.swing.JButton();

        opcionReporteProveedor_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        calificacion_ORP_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calificacion_ORP_Lbl.setText("Calificación de:");

        hasta_ORP_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hasta_ORP_Lbl.setText("hasta:");

        calificacion_ORP_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calificacion_ORP_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }));

        hasta_ORP_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hasta_ORP_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }));

        buscar_ORP_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_ORP_Btn.setText("Buscar");

        javax.swing.GroupLayout opcionReporteProveedor_PnlLayout = new javax.swing.GroupLayout(opcionReporteProveedor_Pnl);
        opcionReporteProveedor_Pnl.setLayout(opcionReporteProveedor_PnlLayout);
        opcionReporteProveedor_PnlLayout.setHorizontalGroup(
            opcionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionReporteProveedor_PnlLayout.createSequentialGroup()
                .addGroup(opcionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionReporteProveedor_PnlLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(opcionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calificacion_ORP_Lbl)
                            .addComponent(hasta_ORP_Lbl))
                        .addGap(60, 60, 60)
                        .addGroup(opcionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hasta_ORP_CBx, 0, 70, Short.MAX_VALUE)
                            .addComponent(calificacion_ORP_CBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionReporteProveedor_PnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar_ORP_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        opcionReporteProveedor_PnlLayout.setVerticalGroup(
            opcionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionReporteProveedor_PnlLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(opcionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calificacion_ORP_Lbl)
                    .addComponent(calificacion_ORP_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(opcionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasta_ORP_Lbl)
                    .addComponent(hasta_ORP_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar_ORP_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        informacionReporteProveedor_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProveedor_IRP_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Proveedor", "Teléfono", "Correo electrónico", "Tipo ", "Calificación "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProveedor_IRP_Tbl);
        if (tablaProveedor_IRP_Tbl.getColumnModel().getColumnCount() > 0) {
            tablaProveedor_IRP_Tbl.getColumnModel().getColumn(0).setResizable(false);
            tablaProveedor_IRP_Tbl.getColumnModel().getColumn(1).setResizable(false);
            tablaProveedor_IRP_Tbl.getColumnModel().getColumn(2).setResizable(false);
            tablaProveedor_IRP_Tbl.getColumnModel().getColumn(3).setResizable(false);
            tablaProveedor_IRP_Tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        imprimir_IRP_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        imprimir_IRP_Btn.setText("Imprimir");

        javax.swing.GroupLayout informacionReporteProveedor_PnlLayout = new javax.swing.GroupLayout(informacionReporteProveedor_Pnl);
        informacionReporteProveedor_Pnl.setLayout(informacionReporteProveedor_PnlLayout);
        informacionReporteProveedor_PnlLayout.setHorizontalGroup(
            informacionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionReporteProveedor_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionReporteProveedor_PnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imprimir_IRP_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        informacionReporteProveedor_PnlLayout.setVerticalGroup(
            informacionReporteProveedor_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionReporteProveedor_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(imprimir_IRP_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionReporteProveedor_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionReporteProveedor_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionReporteProveedor_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(informacionReporteProveedor_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_ORP_Btn;
    private javax.swing.JComboBox calificacion_ORP_CBx;
    private javax.swing.JLabel calificacion_ORP_Lbl;
    private javax.swing.JComboBox hasta_ORP_CBx;
    private javax.swing.JLabel hasta_ORP_Lbl;
    private javax.swing.JButton imprimir_IRP_Btn;
    private javax.swing.JPanel informacionReporteProveedor_Pnl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel opcionReporteProveedor_Pnl;
    private javax.swing.JTable tablaProveedor_IRP_Tbl;
    // End of variables declaration//GEN-END:variables
}