/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
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
    private String[] titulosTabla = {"Nombre","Tipo","Eliminar"};
    int id;

    /**
     * Creates new form PnlRegistrarCursos
     */
    public PnlRegistrarCursos() {
        initComponents();
        control = new BaseControlador(this, Curso.class);
        cursoControl = new CursoControlador(this, Curso.class);
        tablaCursos_OC_Tbl.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    String nombreBusqu = null;
                    int[] selectedRow = tablaCursos_OC_Tbl.getSelectedRows();
                        int[] selectedColumns = tablaCursos_OC_Tbl.
                                getSelectedColumns();
                        for (int i = 0; i < selectedRow.length; i++) {
                          for (int j = 0; j < selectedColumns.length; j++) {
                            nombreBusqu = (String) tablaCursos_OC_Tbl.
                                    getValueAt(selectedRow[i], selectedColumns[j]);
                          }
                        }
                        if(nombreBusqu!=null){
                            System.out.println(nombreBusqu);
                            cursoControl.buscarNombre(nombreBusqu);

                        }else{
                        }
                        tablaCursos_OE_TblActionPerformed(e);
            }
        });
        
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
        opciones_OC_Lbl = new javax.swing.JLabel();
        nota_OC_Lbl = new javax.swing.JLabel();
        informacionCurso_Pnl = new javax.swing.JPanel();
        tipo_IC_Lbl = new javax.swing.JLabel();
        guardar_IC_Btn = new javax.swing.JButton();
        descripcion_IC_SPn = new javax.swing.JScrollPane();
        descripcion_IC_TAa = new javax.swing.JTextArea();
        nombre_IC_TFd = new javax.swing.JTextField();
        seleccion_IC_CBx = new javax.swing.JComboBox();
        nombre_IC_Lbl = new javax.swing.JLabel();
        descripcion_IC_Lbl = new javax.swing.JLabel();
        agregar_IC_LBl = new javax.swing.JLabel();
        nota_IC_Lbl = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));
        setPreferredSize(new java.awt.Dimension(1181, 587));

        opcionesCurso_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionesCurso_Pnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionesCurso_Pnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionesCurso_Pnl.setPreferredSize(new java.awt.Dimension(408, 587));

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
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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

        buscar_OC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_OC_Btn.setText("Buscar");

        tipo_OC_CBx1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_OC_CBx1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipo_OC_CBx1.setToolTipText("Seleccioné el tipo de curso para buscar");
        tipo_OC_CBx1.setEnabled(false);

        opciones_OC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opciones_OC_Lbl.setText("Opciones ");

        nota_OC_Lbl.setText("Ingrese el nombre para buscar la información especifica");

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
                            .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipo_OC_Lbl)
                                    .addComponent(agregar_OC_Btn))
                                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscar_OC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))
                                    .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(tipo_OC_CBx1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(98, Short.MAX_VALUE))))
                            .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opciones_OC_Lbl)
                                    .addComponent(nota_OC_Lbl))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        opcionesCurso_PnlLayout.setVerticalGroup(
            opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesCurso_PnlLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(opciones_OC_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_OC_Lbl)
                .addGap(18, 18, 18)
                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_OC_Lbl)
                    .addComponent(tipo_OC_CBx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(opcionesCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar_OC_Btn)
                    .addComponent(buscar_OC_Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cursos_OC_SPn, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        informacionCurso_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionCurso_Pnl.setMaximumSize(new java.awt.Dimension(767, 391));
        informacionCurso_Pnl.setMinimumSize(new java.awt.Dimension(767, 391));
        informacionCurso_Pnl.setPreferredSize(new java.awt.Dimension(767, 391));

        tipo_IC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo_IC_Lbl.setText("Tipo de curso:");

        guardar_IC_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardar_IC_Btn.setText("Guardar");
        guardar_IC_Btn.setEnabled(false);

        descripcion_IC_TAa.setColumns(20);
        descripcion_IC_TAa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcion_IC_TAa.setRows(5);
        descripcion_IC_TAa.setEnabled(false);
        descripcion_IC_SPn.setViewportView(descripcion_IC_TAa);

        nombre_IC_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre_IC_TFd.setEnabled(false);

        seleccion_IC_CBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccion_IC_CBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seleccion_IC_CBx.setToolTipText("Seleccioné el tipo de curso de capacitación");
        seleccion_IC_CBx.setEnabled(false);

        nombre_IC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre_IC_Lbl.setText("Nombre del Curso:");

        descripcion_IC_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcion_IC_Lbl.setText("Descripción del curso:");

        agregar_IC_LBl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregar_IC_LBl.setText("Agregar");

        nota_IC_Lbl.setText("Ingrese la información a almacenar");

        javax.swing.GroupLayout informacionCurso_PnlLayout = new javax.swing.GroupLayout(informacionCurso_Pnl);
        informacionCurso_Pnl.setLayout(informacionCurso_PnlLayout);
        informacionCurso_PnlLayout.setHorizontalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar_IC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nota_IC_Lbl)
                    .addComponent(agregar_IC_LBl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(76, Short.MAX_VALUE))
        );
        informacionCurso_PnlLayout.setVerticalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(agregar_IC_LBl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_IC_Lbl)
                .addGap(28, 28, 28)
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
                .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addComponent(opcionesCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardar_IC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_IC_BtnActionPerformed
        if(guardar_IC_Btn.getText() == "Guardar"){            
            List<String> atr =  new ArrayList<String>();
            atr.add(seleccion_IC_CBx.getSelectedIndex()+1 + "");
            atr.add(nombre_IC_TFd.getText());
            atr.add(descripcion_IC_TAa.getText());
            control.alta(HelperEntidad.getCurso(atr));
        }else{
            List<String> atr =  new ArrayList<String>();
            atr.add(seleccion_IC_CBx.getSelectedIndex()+1 + "");
            atr.add(nombre_IC_TFd.getText());
            atr.add(descripcion_IC_TAa.getText());
            control.modificacion(HelperEntidad.getCurso(atr , id));
        }
    }//GEN-LAST:event_guardar_IC_BtnActionPerformed

    private void agregar_OC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_OC_BtnActionPerformed
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
            cursoControl.buscar(tipo_OC_CBx1.getSelectedIndex());
        }
    }//GEN-LAST:event_buscar_OC_BtnActionPerformed

    private void tablaCursos_OE_TblActionPerformed(ListSelectionEvent e){
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregar_IC_LBl;
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
    private javax.swing.JLabel nota_IC_Lbl;
    private javax.swing.JLabel nota_OC_Lbl;
    private javax.swing.JPanel opcionesCurso_Pnl;
    private javax.swing.JLabel opciones_OC_Lbl;
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
        model = new DefaultTableModel(titulosTabla, 4);
        tablaCursos_OC_Tbl.setModel(model);
        model.setDataVector(info, titulosTabla);
    }

    @Override
    public void setInfo(String[][] info) {
        id = Integer.parseInt(info[0][0]);
        System.out.println(id);
        nombre_IC_TFd.setText(info[1][0]);
        descripcion_IC_TAa.setText(info[2][0]);
        if(info[3][0].equals("conferencia")){
            seleccion_IC_CBx.setSelectedIndex(0);
        }else{
            seleccion_IC_CBx.setSelectedIndex(1);
        }
            
        nombre_IC_TFd.setEnabled(true);
        descripcion_IC_TAa.setEnabled(true);
        seleccion_IC_CBx.setEnabled(true);
        guardar_IC_Btn.setText("Modificar");
        
    }

    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
