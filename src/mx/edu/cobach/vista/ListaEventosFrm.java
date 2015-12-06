/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.vista.controlador.EventoControlador;

/**
 *
 * @author Alex
 */
public class ListaEventosFrm extends javax.swing.JFrame implements Comunicador {

    private final EventoControlador control;

    private final DefaultTableModel candidatosModel;
    private final DefaultTableModel agregadosModel;
    private final String[] titulosTabla = {"ID", "Evento", "Tipo de evento"};
    private final ImageIcon imageLogo;
    //Comunicador con la interfaz grafica
    protected final Comunicador com;
    //Clase con la que estara trabajando la base de datos

    
    /**
     * Creates new form ListaEventos
     * @param com
     */
    public ListaEventosFrm(Comunicador com) {
        this.com = com;
        imageLogo = new ImageIcon(CapacisoftFrm.class.getResource("/mx/edu/cobach/"
                + "vista/recursos/logo.png"));
        setTitle("CapaciSoft-Lista de eventos");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        control = new EventoControlador(this);
        setIconImage(imageLogo.getImage());

        candidatosModel = new DefaultTableModel(titulosTabla, 0){
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        candidatosTbl.setModel(candidatosModel);
        candidatosTbl.setColumnSelectionAllowed(false);
        candidatosTbl.setDragEnabled(false);

        agregadosModel = new DefaultTableModel(titulosTabla, 0){
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        agregadosTbl.setModel(agregadosModel);
        agregadosTbl.setColumnSelectionAllowed(false);
        agregadosTbl.setDragEnabled(false);
        
        candidatosModel.setDataVector(null, titulosTabla);
        TableColumn tc = candidatosTbl.getColumnModel().getColumn(0);
        candidatosTbl.getColumnModel().removeColumn(tc);
        candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        candidatosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        candidatosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        agregadosModel.setDataVector(null, titulosTabla);
        tc = agregadosTbl.getColumnModel().getColumn(0);
        agregadosTbl.getColumnModel().removeColumn(tc);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        agregadosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        agregadosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
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

        candidatosLbl = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        crearTablaBtn = new javax.swing.JButton();
        agregadosSPn = new javax.swing.JScrollPane();
        agregadosTbl = new javax.swing.JTable();
        cancelarBtn = new javax.swing.JButton();
        agregadosLbl = new javax.swing.JLabel();
        listaEventosInsLbl = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        agregarTBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        eventoLbl = new javax.swing.JLabel();
        eliminarTBtn = new javax.swing.JButton();
        candidatosSPn = new javax.swing.JScrollPane();
        candidatosTbl = new javax.swing.JTable();
        eventoTFd = new javax.swing.JTextField();
        listaEventosTltLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        candidatosLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        candidatosLbl.setText("Posibles eventos");

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        crearTablaBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crearTablaBtn.setText("Crear Tabla");
        crearTablaBtn.setEnabled(false);
        crearTablaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablaBtnActionPerformed(evt);
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
        agregadosTbl.setEnabled(false);
        agregadosSPn.setViewportView(agregadosTbl);

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        agregadosLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregadosLbl.setText("Eventos seleccionados");

        listaEventosInsLbl.setText("<html>Anada los eventos que el proveedor puede impartir, en la izquierda se muestran todos los eventos y en la derecha los eventos elegidos, se pueden<br>buscar eventos por medio de su nombre, para salir o cancelar el registro presione el botón \"Cancelar\"</html>");

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

        eventoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoLbl.setText("Nombre del Evento:");

        eliminarTBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminarTBtn.setText("<<");
        eliminarTBtn.setToolTipText("Eliminar todos los empleados");
        eliminarTBtn.setEnabled(false);
        eliminarTBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTBtnActionPerformed(evt);
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
        candidatosSPn.setViewportView(candidatosTbl);

        eventoTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoTFd.setMaximumSize(new java.awt.Dimension(6, 23));
        eventoTFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoTFdActionPerformed(evt);
            }
        });
        eventoTFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventoTFdKeyTyped(evt);
            }
        });

        listaEventosTltLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaEventosTltLbl.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(candidatosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregadosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(crearTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listaEventosTltLbl)
                                    .addComponent(listaEventosInsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(eventoLbl)
                                .addGap(46, 46, 46)
                                .addComponent(eventoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(candidatosLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregadosLbl)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(listaEventosTltLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaEventosInsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventoLbl)
                    .addComponent(eventoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(candidatosLbl)
                    .addComponent(agregadosLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(candidatosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(agregadosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if(eventoTFd.getText().equals("")){
            control.buscarTodos();
        }else{
            HashMap<String, Object> condiciones = new HashMap<>();
            condiciones.put("nombre", eventoTFd.getText());
            
            control.buscarPor("evento", condiciones);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void crearTablaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTablaBtnActionPerformed
        String[][] matriz = new String[agregadosModel.getRowCount()][agregadosModel.getColumnCount()];
        for (int k = 0; k < agregadosModel.getRowCount(); k++) {
            for (int j = 0; j < agregadosModel.getColumnCount(); j++) {
                matriz[k][j] = agregadosModel.getValueAt(k, j) + "";
            }
        }
        matriz[0][0] = matriz[0][0] + "TLE1";
        com.setTabla(matriz);
        List<String> info = new ArrayList();
        info.add("Desbloquear");
        com.setInfo(info);
        this.dispose();
    }//GEN-LAST:event_crearTablaBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        if (agregadosTbl.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "¿Desea cancelar la realizacion "
                + "de la lista de eventos?", "Precaucion",
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

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        if (candidatosTbl.getSelectedRow() >= 0) {
            agregarEmpleadosTabla(candidatosTbl.getSelectedRow());
        }
        if (agregadosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void agregarTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTBtnActionPerformed
        for (int i = 0; i < candidatosModel.getRowCount(); i++) {
            agregarEmpleadosTabla(i);
        }
        if (agregadosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_agregarTBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea eliminar el evento de "
            + "la lista de eventos?", "Precaucion",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
        if (agregadosTbl.getSelectedRow() >= 0) {
            int cont = 0;
            Object[][] tableData = new Object[agregadosTbl.
            getRowCount() - 1][agregadosModel.getColumnCount()];
            for (int i = 0; i < agregadosTbl.getRowCount(); i++) {
                if (((String) agregadosModel.getValueAt(i, 0)).
                    compareTo((String) agregadosModel.getValueAt(
                        agregadosTbl.getSelectedRow(),
                        0)) != 0) {
                tableData[cont][0] = agregadosModel.getValueAt(i, 0);
                tableData[cont][1] = agregadosModel.getValueAt(i, 1);
                tableData[cont][2] = agregadosModel.getValueAt(i, 2);
                cont++;
            }
        }
        agregadosModel.setDataVector(tableData, titulosTabla);
        TableColumn tc = agregadosTbl.getColumnModel().getColumn(0);
        agregadosTbl.getColumnModel().removeColumn(tc);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        agregadosTbl.getColumnModel().getColumn(0).
        setPreferredWidth(10);
        agregadosTbl.getColumnModel().getColumn(1).
        setPreferredWidth(160);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        }
        }
        if (agregadosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void eliminarTBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTBtnActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Desea eliminar toda la lista "
            + "de eventos?", "Precaucion",
            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
        agregadosModel.setDataVector(null, titulosTabla);
        TableColumn tc = agregadosTbl.getColumnModel().getColumn(0);
        agregadosTbl.getColumnModel().removeColumn(tc);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        agregadosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        agregadosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        }
        if (agregadosTbl.getRowCount() > 0) {
            crearTablaBtn.setEnabled(true);
        } else {
            crearTablaBtn.setEnabled(false);
        }
    }//GEN-LAST:event_eliminarTBtnActionPerformed

    private void eventoTFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventoTFdKeyTyped
        if (!Character.isLetter(evt.getKeyChar())  
            && !Character.isISOControl(evt.getKeyChar())
            && !Character.isWhitespace(evt.getKeyChar()) 
            || eventoTFd.getText().length() == 45
                ) {
             evt.consume();
            
            
        }
    }//GEN-LAST:event_eventoTFdKeyTyped

    private void eventoTFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoTFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventoTFdActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregadosLbl;
    private javax.swing.JScrollPane agregadosSPn;
    private javax.swing.JTable agregadosTbl;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton agregarTBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel candidatosLbl;
    private javax.swing.JScrollPane candidatosSPn;
    private javax.swing.JTable candidatosTbl;
    private javax.swing.JButton crearTablaBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton eliminarTBtn;
    private javax.swing.JLabel eventoLbl;
    private javax.swing.JTextField eventoTFd;
    private javax.swing.JLabel listaEventosInsLbl;
    private javax.swing.JLabel listaEventosTltLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que permite agregar los empleados en la tabla de asistencia
     */
    private void agregarEmpleadosTabla(int posicionLista) {
        boolean bandera = false;
        agregadosTbl.setEnabled(true);
        for (int j = 0; j < agregadosModel.getRowCount(); j++) {
            if (candidatosModel.getValueAt(posicionLista, 0).
                    equals(agregadosModel.getValueAt(j, 0))) {
                bandera = true;
            }
        }
        if (bandera == false) {
            Object[][] tableData = new Object[agregadosModel.
                    getRowCount() + 1][agregadosModel.getColumnCount()];
            //ciclo que pasa la informacion de la tabla de lista 
            //final para que al final sea agregado el nuevo empleado a 
            //esta matriz
            for (int k = 0; k < agregadosModel.getRowCount(); k++) {
                for (int j = 0; j < agregadosModel.getColumnCount(); j++) {
                    tableData[k][j] = agregadosModel.getValueAt(k, j);
                }
            }
            tableData[agregadosModel.getRowCount()][0] = candidatosModel.
                    getValueAt(posicionLista, 0);
            tableData[agregadosModel.getRowCount()][1] = candidatosModel.
                    getValueAt(posicionLista, 1);
            tableData[agregadosModel.getRowCount()][2] = candidatosModel.
                    getValueAt(posicionLista, 2);
            agregadosModel.setDataVector(tableData, titulosTabla);
            TableColumn tc = agregadosTbl.getColumnModel().getColumn(0);
            agregadosTbl.getColumnModel().removeColumn(tc);
            agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            agregadosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            agregadosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
            agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        }
        visibilidadOpcT(true);
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
    
    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public void setTabla(String[][] info) {
        if(info == null){
            setMensaje("No se encontraron coincidencias");
        }else{
            //Se checa si la palabra TLE1 se encuentra dentro de la matriz
            info[0][0] = info[0][0].replaceAll("TLE1", "");
            //Se elimina la palabra TLE1 para que solo quede el id puro
            candidatosTbl.setEnabled(true);
            candidatosModel.setDataVector(info, titulosTabla);

            TableColumn tc = candidatosTbl.getColumnModel().getColumn(0);
            candidatosTbl.getColumnModel().removeColumn(tc);

            candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            candidatosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            candidatosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
            candidatosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
            visibilidadOpcT(true);
        }
    }

    @Override
    public void setInfo(List info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenarDatos(Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                rootPane, "En realidad desea cerrar la lista de eventos?",
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
        agregadosModel.setDataVector(info, titulosTabla);
        TableColumn tc = agregadosTbl.getColumnModel().getColumn(0);
        agregadosTbl.getColumnModel().removeColumn(tc);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        agregadosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
        agregadosTbl.getColumnModel().getColumn(1).setPreferredWidth(160);
        agregadosTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        agregadosTbl.setEnabled(true);
        visibilidadOpcT(true);
    }
}