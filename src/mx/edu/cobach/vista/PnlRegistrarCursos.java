/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.vista.controlador.BaseControlador;
import mx.edu.cobach.vista.controlador.CursoControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author liuts
 */
public class PnlRegistrarCursos extends javax.swing.JPanel implements Comunicador{
    
    private BaseControlador control;
    private CursoControlador cursoControl;
    private DefaultTableModel model;
    private String[] titulosTabla = {"ID","Nombre","Tipo","Eliminar"};
    int id;

    /**
     * Creates new form PnlRegistrarCursos
     */
    public PnlRegistrarCursos() {
        initComponents();
        control = new BaseControlador(this, Curso.class);
        cursoControl = new CursoControlador(this, Curso.class);
        model = new DefaultTableModel(titulosTabla, 4);
        tablaCursos_OC_Tbl.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesCurso_Pnl = new javax.swing.JPanel();
        tipo_OC_Lbl = new javax.swing.JLabel();
        cursos_OC_SPn = new javax.swing.JScrollPane();
        tablaCursos_OC_Tbl = new javax.swing.JTable();
        agregar_OC_Btn = new javax.swing.JButton();
        buscar_OC_Btn = new javax.swing.JButton();
        tipo_OC_CBx1 = new javax.swing.JComboBox();
        informacionCurso_Pnl = new javax.swing.JPanel();
        tipo_IC_Lbl = new javax.swing.JLabel();
        guardar_IC_Btn = new javax.swing.JButton();
        descripcion_IC_SPn = new javax.swing.JScrollPane();
        descripcion_IC_TAa = new javax.swing.JTextArea();
        nombre_IC_TFd = new javax.swing.JTextField();
        seleccion_IC_CBx = new javax.swing.JComboBox();
        nombre_IC_Lbl = new javax.swing.JLabel();
        descripcion_IC_Lbl = new javax.swing.JLabel();

        opcionesCurso_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipo_OC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_OC_Lbl.setText("Tipo de curso:");

        tablaCursos_OC_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Eliminar"
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
        tablaCursos_OC_Tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaCursos_OC_Tbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCursos_OC_Tbl.getTableHeader().setReorderingAllowed(false);
        tablaCursos_OC_Tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCursos_OC_TblMouseClicked(evt);
            }
        });
        cursos_OC_SPn.setViewportView(tablaCursos_OC_Tbl);
        if (tablaCursos_OC_Tbl.getColumnModel().getColumnCount() > 0) {
            tablaCursos_OC_Tbl.getColumnModel().getColumn(0).setResizable(false);
            tablaCursos_OC_Tbl.getColumnModel().getColumn(1).setResizable(false);
            tablaCursos_OC_Tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        agregar_OC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregar_OC_Btn.setText("Agregar");
        agregar_OC_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_OC_BtnActionPerformed(evt);
            }
        });

        buscar_OC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_OC_Btn.setText("Buscar");
        buscar_OC_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_OC_BtnActionPerformed(evt);
            }
        });

        tipo_OC_CBx1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_OC_CBx1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Todos", "Conferencia", "Taller" }));

        javax.swing.GroupLayout opcionesCurso_PnlLayout = new javax.swing.GroupLayout(opcionesCurso_Pnl);
        opcionesCurso_Pnl.setLayout(opcionesCurso_PnlLayout);
        opcionesCurso_PnlLayout.setHorizontalGroup(
            opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                        .addComponent(cursos_OC_SPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo_OC_Lbl)
                            .addComponent(agregar_OC_Btn))
                        .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(tipo_OC_CBx1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesCurso_PnlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscar_OC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))))
        );
        opcionesCurso_PnlLayout.setVerticalGroup(
            opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_OC_CBx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_OC_Lbl))
                .addGap(26, 26, 26)
                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar_OC_Btn)
                    .addComponent(buscar_OC_Btn))
                .addGap(31, 31, 31)
                .addComponent(cursos_OC_SPn, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        informacionCurso_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipo_IC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_IC_Lbl.setText("Tipo de curso:");

        guardar_IC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardar_IC_Btn.setText("Guardar");
        guardar_IC_Btn.setEnabled(false);
        guardar_IC_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_IC_BtnActionPerformed(evt);
            }
        });

        descripcion_IC_TAa.setColumns(20);
        descripcion_IC_TAa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcion_IC_TAa.setRows(5);
        descripcion_IC_TAa.setEnabled(false);
        descripcion_IC_SPn.setViewportView(descripcion_IC_TAa);

        nombre_IC_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre_IC_TFd.setEnabled(false);

        seleccion_IC_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccion_IC_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Conferencia ", "Taller" }));
        seleccion_IC_CBx.setEnabled(false);

        nombre_IC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre_IC_Lbl.setText("Nombre del Curso:");

        descripcion_IC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcion_IC_Lbl.setText("Descripción del curso:");

        javax.swing.GroupLayout informacionCurso_PnlLayout = new javax.swing.GroupLayout(informacionCurso_Pnl);
        informacionCurso_Pnl.setLayout(informacionCurso_PnlLayout);
        informacionCurso_PnlLayout.setHorizontalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionCurso_PnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar_IC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                        .addComponent(descripcion_IC_Lbl)
                        .addGap(30, 30, 30)
                        .addComponent(descripcion_IC_SPn, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                        .addComponent(nombre_IC_Lbl)
                        .addGap(28, 28, 28)
                        .addComponent(nombre_IC_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(tipo_IC_Lbl)
                        .addGap(28, 28, 28)
                        .addComponent(seleccion_IC_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        informacionCurso_PnlLayout.setVerticalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_IC_Lbl)
                    .addComponent(nombre_IC_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_IC_Lbl)
                    .addComponent(seleccion_IC_CBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion_IC_Lbl)
                    .addComponent(descripcion_IC_SPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar_IC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionesCurso_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcionesCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_IC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_IC_BtnActionPerformed
        if(guardar_IC_Btn.getText().equals("Guardar")){     
            if(nombre_IC_TFd.getText().isEmpty() || 
                    descripcion_IC_Lbl.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Dejo Campos Vacios");
            }else{
            List<Object> atr =  new ArrayList<>();
            atr.add(seleccion_IC_CBx.getSelectedIndex()+1);
            atr.add(nombre_IC_TFd.getText());
            atr.add(descripcion_IC_TAa.getText());
            nombre_IC_TFd.setText("");
            descripcion_IC_TAa.setText("");
            seleccion_IC_CBx.setSelectedIndex(0);
            control.alta(HelperEntidad.getCurso(atr));
            }
        }else{
            List<Object> atr =  new ArrayList<>();
            atr.add(seleccion_IC_CBx.getSelectedIndex()+1);
            atr.add(nombre_IC_TFd.getText());
            atr.add(descripcion_IC_TAa.getText());
            atr.add(id);
            nombre_IC_TFd.setText("");
            descripcion_IC_TAa.setText("");
            seleccion_IC_CBx.setSelectedIndex(0);
            control.modificacion(HelperEntidad.getCurso(atr));
        }
    }//GEN-LAST:event_guardar_IC_BtnActionPerformed

    private void agregar_OC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_OC_BtnActionPerformed
        nombre_IC_TFd.setText("");
        descripcion_IC_TAa.setText("");
        seleccion_IC_CBx.setSelectedIndex(0);
        guardar_IC_Btn.setEnabled(true);
        guardar_IC_Btn.setText("Guardar");
        nombre_IC_TFd.setEnabled(true);
        descripcion_IC_TAa.setEnabled(true);
        seleccion_IC_CBx.setEnabled(true);
        guardar_IC_Btn.setEnabled(true);
    }//GEN-LAST:event_agregar_OC_BtnActionPerformed

    private void buscar_OC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_OC_BtnActionPerformed

        if(tipo_OC_CBx1.getSelectedIndex()== 0){
            control.buscarTodos();        
        }else if(tipo_OC_CBx1.getSelectedIndex() != 0){
            cursoControl.buscarTipoCurso(tipo_OC_CBx1.getSelectedIndex());
        }
    }//GEN-LAST:event_buscar_OC_BtnActionPerformed

    private void tablaCursos_OC_TblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCursos_OC_TblMouseClicked
        //Obtenelos el renglon y columna donde se hizo click
        int row = tablaCursos_OC_Tbl.rowAtPoint(evt.getPoint());
        int col = tablaCursos_OC_Tbl.columnAtPoint(evt.getPoint());
        
        if(col == 1){
            int id = Integer.parseInt((String)model.getValueAt(row, 0));
            control.buscar(id);
                        System.out.println("ID: " + model.getValueAt(row, 0));
        }else if(col == 3) {
            //System.out.println("ID: " + model.getValueAt(row, 0));
            //Preguntamos si esta seguro de la eliminacion
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == 0){
                //System.out.println("BORRAR");
                //Obtenemos ID de la columna escondida
                int id = Integer.parseInt((String)model.getValueAt(row, 0));
                control.baja(id);
                control.buscarTodos();
            }
        }
    }//GEN-LAST:event_tablaCursos_OC_TblMouseClicked

    private void tablaCursos_OE_TblActionPerformed(ListSelectionEvent e){
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_OC_Btn;
    private javax.swing.JButton buscar_OC_Btn;
    private javax.swing.JScrollPane cursos_OC_SPn;
    private javax.swing.JLabel descripcion_IC_Lbl;
    private javax.swing.JScrollPane descripcion_IC_SPn;
    private javax.swing.JTextArea descripcion_IC_TAa;
    private javax.swing.JButton guardar_IC_Btn;
    private javax.swing.JPanel informacionCurso_Pnl;
    private javax.swing.JLabel nombre_IC_Lbl;
    private javax.swing.JTextField nombre_IC_TFd;
    private javax.swing.JPanel opcionesCurso_Pnl;
    private javax.swing.JComboBox seleccion_IC_CBx;
    private javax.swing.JTable tablaCursos_OC_Tbl;
    private javax.swing.JLabel tipo_IC_Lbl;
    private javax.swing.JComboBox tipo_OC_CBx1;
    private javax.swing.JLabel tipo_OC_Lbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public void setTabla(String[][] info) {
        model.setDataVector(info, titulosTabla);
        //Esconder columna ID
//        TableColumn tc = tablaCursos_OC_Tbl.getColumnModel().getColumn(0);
//        tablaCursos_OC_Tbl.getColumnModel().removeColumn(tc);
    }


    @Override
    public void setLista(List info, int i) {

    }

    @Override
    public void setInfo(List info) {
        id = (int) info.get(0);
        System.out.println(id + "info");
        nombre_IC_TFd.setText((String) info.get(1));
        descripcion_IC_TAa.setText((String) info.get(2));
        if(info.get(3).equals("conferencia")){
            seleccion_IC_CBx.setSelectedIndex(0);
        }else{
            seleccion_IC_CBx.setSelectedIndex(1);
        }
        nombre_IC_TFd.setEnabled(true);
        descripcion_IC_TAa.setEnabled(true);
        seleccion_IC_CBx.setEnabled(true);
        guardar_IC_Btn.setText("Modificar");
        guardar_IC_Btn.setEnabled(true);
    }
}
