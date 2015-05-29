/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.vista.controlador.ImplementarEventoControlador;

/**
 * Esta clase mostrara la interfaz de la busqueda del evento o la seleccion de
 * un evento para llevarlo a implementar
 */
public class PnlProgramarEvento extends javax.swing.JPanel implements Comunicador {

    /**
     * Creates new form PnlProgramarEvento
     */
    public PnlEventoRealizar eventoRealizarPnl;
    public PnlEventoRealizado eventoRealizadoPnl;

    public final ImplementarEventoControlador control;
    public final DefaultComboBoxModel tipoEventoModel;
    public final DefaultTableModel model;
    public String[] titulosTabla = {"ID", "Fecha Inicial", "Nombre del evento",
        "Estado", "Eliminar"};
    public String estado;

    public PnlProgramarEvento() {
        control = new ImplementarEventoControlador(this, ImplementacionEvento.class);
        initComponents();
        agregar();
        model = new DefaultTableModel(titulosTabla, 4);
        tablaTbl.setModel(model);
        tablaTbl.setColumnSelectionAllowed(false);
        tablaTbl.setDragEnabled(false);
        tipoEventoModel = new DefaultComboBoxModel();
        tipoRegCBx.setModel(tipoEventoModel);
        tipoBusCBx.setModel(tipoEventoModel);
    }

    /**
     * Metodo que permite agregar la interfaz de los paneles
     */
    private void agregar() {
        eventoRealizarPnl = new PnlEventoRealizar();
        eventoRealizarPnl.setLocation(404, 0);
        eventoRealizarPnl.setSize(781, 589);
        eventoRealizarPnl.setVisible(false);
        add(eventoRealizarPnl);

        eventoRealizadoPnl = new PnlEventoRealizado();
        eventoRealizadoPnl.setLocation(404, 0);
        eventoRealizadoPnl.setSize(781, 589);
        eventoRealizadoPnl.setVisible(false);
        add(eventoRealizadoPnl);

    }

    /**
     * Metodo que permite mandar a obtener la informacion de todos las sedes y
     * eventos registrados informacion o la modificque.
     */
    public void llenarTodo() {
        control.setClass(Evento.class);
        control.buscarTodosLista(1);
        control.setClass(Sede.class);
        control.buscarTodosLista(2);
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
        opcionesTP = new javax.swing.JTabbedPane();
        registrarPnl = new javax.swing.JPanel();
        nombreRegLbl = new javax.swing.JLabel();
        tipoRegCBx = new javax.swing.JComboBox();
        regRealizarBtn = new javax.swing.JButton();
        regRealizadoBtn = new javax.swing.JButton();
        calendarioPnl = new javax.swing.JPanel();
        agendarCursosCal = new com.jpcomponents.JPCalendar();
        opcionesRegLbl = new javax.swing.JLabel();
        notaRegLbl = new javax.swing.JLabel();
        buscarPnl = new javax.swing.JPanel();
        nombreBusLbl = new javax.swing.JLabel();
        sedeLbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaTbl = new javax.swing.JTable();
        buscarBtn = new javax.swing.JButton();
        tipoBusCBx = new javax.swing.JComboBox();
        opcionesBusLbl = new javax.swing.JLabel();
        notaBusLbl = new javax.swing.JLabel();
        sedeLbl1 = new javax.swing.JLabel();
        fechaInicialDCh = new com.toedter.calendar.JDateChooser();
        fechaTerminacionDCh = new com.toedter.calendar.JDateChooser();

        setPreferredSize(new java.awt.Dimension(1150, 576));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        opcionesTP.setMaximumSize(new java.awt.Dimension(403, 588));
        opcionesTP.setMinimumSize(new java.awt.Dimension(403, 588));

        registrarPnl.setMaximumSize(new java.awt.Dimension(398, 560));

        nombreRegLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreRegLbl.setText("Nombre del evento:");

        tipoRegCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoRegCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipoRegCBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoRegCBxItemStateChanged(evt);
            }
        });

        regRealizarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regRealizarBtn.setText("Programar evento a realizar");
        regRealizarBtn.setEnabled(false);
        regRealizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regRealizarBtnActionPerformed(evt);
            }
        });

        regRealizadoBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regRealizadoBtn.setText("Registrar evento realizado");
        regRealizadoBtn.setEnabled(false);
        regRealizadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regRealizadoBtnActionPerformed(evt);
            }
        });

        calendarioPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout calendarioPnlLayout = new javax.swing.GroupLayout(calendarioPnl);
        calendarioPnl.setLayout(calendarioPnlLayout);
        calendarioPnlLayout.setHorizontalGroup(
            calendarioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarioPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agendarCursosCal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        calendarioPnlLayout.setVerticalGroup(
            calendarioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarioPnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(agendarCursosCal, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        opcionesRegLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionesRegLbl.setText("Opciones");

        notaRegLbl.setText("Ingrese el nombre para buscar la información especifica");

        javax.swing.GroupLayout registrarPnlLayout = new javax.swing.GroupLayout(registrarPnl);
        registrarPnl.setLayout(registrarPnlLayout);
        registrarPnlLayout.setHorizontalGroup(
            registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarPnlLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionesRegLbl)
                            .addGroup(registrarPnlLayout.createSequentialGroup()
                                .addComponent(nombreRegLbl)
                                .addGap(18, 18, 18)
                                .addComponent(tipoRegCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(notaRegLbl))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(registrarPnlLayout.createSequentialGroup()
                        .addComponent(regRealizadoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regRealizarBtn))
                    .addComponent(calendarioPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        registrarPnlLayout.setVerticalGroup(
            registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarPnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(opcionesRegLbl)
                .addGap(3, 3, 3)
                .addComponent(notaRegLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreRegLbl)
                    .addComponent(tipoRegCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regRealizadoBtn)
                    .addComponent(regRealizarBtn))
                .addGap(26, 26, 26)
                .addComponent(calendarioPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        opcionesTP.addTab("Registrar evento de capacitación", registrarPnl);

        buscarPnl.setMaximumSize(new java.awt.Dimension(352, 400));
        buscarPnl.setPreferredSize(new java.awt.Dimension(352, 400));

        nombreBusLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBusLbl.setText("Nombre del evento: ");

        sedeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedeLbl.setText("Fecha del evento:");

        tablaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha Inicial", "Nombre del evento", "Estado", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTbl.setMaximumSize(new java.awt.Dimension(300, 64));
        tablaTbl.setMinimumSize(new java.awt.Dimension(300, 64));
        tablaTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTblMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaTbl);
        if (tablaTbl.getColumnModel().getColumnCount() > 0) {
            tablaTbl.getColumnModel().getColumn(0).setResizable(false);
            tablaTbl.getColumnModel().getColumn(1).setResizable(false);
            tablaTbl.getColumnModel().getColumn(2).setResizable(false);
            tablaTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        tipoBusCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoBusCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipoBusCBx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoBusCBxItemStateChanged(evt);
            }
        });

        opcionesBusLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionesBusLbl.setText("Opciones");

        notaBusLbl.setText("Ingrese el nombre para buscar la información especifica");

        sedeLbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedeLbl1.setText("a:");

        fechaInicialDCh.setDateFormatString("dd/MM/yyyy");
        fechaInicialDCh.setMaximumSize(new java.awt.Dimension(91, 20));

        fechaTerminacionDCh.setDateFormatString("dd/MM/yyyy");
        fechaTerminacionDCh.setMaximumSize(new java.awt.Dimension(91, 20));

        javax.swing.GroupLayout buscarPnlLayout = new javax.swing.GroupLayout(buscarPnl);
        buscarPnl.setLayout(buscarPnlLayout);
        buscarPnlLayout.setHorizontalGroup(
            buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPnlLayout.createSequentialGroup()
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buscarPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buscarPnlLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscarPnlLayout.createSequentialGroup()
                                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreBusLbl)
                                    .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sedeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sedeLbl)))
                                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(buscarPnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tipoBusCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarPnlLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fechaTerminacionDCh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fechaInicialDCh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarBtn))
                            .addComponent(notaBusLbl)
                            .addComponent(opcionesBusLbl))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        buscarPnlLayout.setVerticalGroup(
            buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opcionesBusLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaBusLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBusLbl)
                    .addComponent(tipoBusCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sedeLbl)
                    .addComponent(fechaInicialDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sedeLbl1)
                        .addComponent(fechaTerminacionDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarBtn))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        opcionesTP.addTab("Buscar Evento", buscarPnl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(opcionesTP, javax.swing.GroupLayout.PREFERRED_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 725, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo que al seleccionar click se colocara la interfaz del evento de
     * capacitacion realizado
     *
     * @param evt
     */
    private void regRealizadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regRealizadoBtnActionPerformed
        if (eventoRealizarPnl.isCambio() == true
                || eventoRealizadoPnl.isCambio() == true) {
            int op = JOptionPane.showConfirmDialog(this, "La información se"
                    + " esta modificando,¿Aun así desea cancelarla?",
                    "Precaucion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (op == 0) {
                eventoRealizarPnl.limpiarCampos();
                eventoRealizadoPnl.limpiarCampos();
                eventoRealizadoPnl.setVisible(true);
                eventoRealizarPnl.setVisible(false);
                eventoRealizadoPnl.buscarEvento((Evento) tipoRegCBx.
                        getSelectedItem());
                eventoRealizadoPnl.llenarTodo();
                eventoRealizarPnl.visibilidad(true);
            }
        } else {
            eventoRealizarPnl.setVisible(false);
            eventoRealizadoPnl.setVisible(true);
            eventoRealizadoPnl.buscarEvento((Evento) tipoRegCBx.getSelectedItem());
            eventoRealizadoPnl.llenarTodo();
            eventoRealizadoPnl.visibilidad(true);
        }
    }//GEN-LAST:event_regRealizadoBtnActionPerformed
    /**
     * Metodo que al seleccionar click se colocara la interfaz del evento de
     * capacitacion a realizar
     *
     * @param evt
     */
    private void regRealizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regRealizarBtnActionPerformed
        if (eventoRealizarPnl.isCambio() == true
                || eventoRealizadoPnl.isCambio() == true) {
            int op = JOptionPane.showConfirmDialog(this, "La información se"
                    + " esta modificando,¿Aun así desea cancelarla?",
                    "Precaucion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            if (op == 0) {
                eventoRealizadoPnl.limpiarCampos();
                eventoRealizarPnl.limpiarCampos();
                eventoRealizadoPnl.limpiarCampos();
                eventoRealizarPnl.setVisible(true);
                eventoRealizadoPnl.setVisible(false);
                eventoRealizarPnl.buscarEvento((Evento) tipoRegCBx
                        .getSelectedItem());
                eventoRealizarPnl.llenarTodo();
                eventoRealizarPnl.visibilidad(true);
            }
        } else {
            eventoRealizadoPnl.setVisible(false);
            eventoRealizarPnl.setVisible(true);
            eventoRealizarPnl.buscarEvento((Evento) tipoRegCBx
                    .getSelectedItem());
            eventoRealizarPnl.llenarTodo();
            eventoRealizarPnl.visibilidad(true);
        }
    }//GEN-LAST:event_regRealizarBtnActionPerformed


    private void tablaTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTblMouseClicked
        //Obtenelos el renglon y columna donde se hizo click
        int row = tablaTbl.rowAtPoint(evt.getPoint());
        int col = tablaTbl.columnAtPoint(evt.getPoint());
        if (col == 0 || col == 1 || col == 2) {
            //Se obtiene el id de la columna no visible para realizar una 
            //busqueda especifica.
            //int id = Integer.parseInt((String)model.getValueAt(row, 0));
            String activo = (String) model.getValueAt(row, 3);
            //control.buscarMod(id);
            if (activo.equals("Activo")) {
                estado = "Activo";

            } else {
                estado = "Finalizado";
            }
            int id = Integer.parseInt((String) model.getValueAt(row, 0));
            control.setClass(ImplementacionEvento.class);
            control.buscarMod(id);
            //Manda un mensaje de Confirmación sobre la eliminacion
        } else if (col == 3) {
            int op = JOptionPane.
                    showConfirmDialog(this,
                            "¿Esta seguro de eliminar este registro?",
                            "Precaucion",
                            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (op == 0) {
                //Obtenemos ID de la columna escondida
                int id = Integer.parseInt((String) model.getValueAt(row, 0));
                control.baja(id);
                control.buscarTodos();
                model.getDataVector().removeAllElements();
            } else {
                model.setValueAt(false, row, 2);
            }
        }
    }//GEN-LAST:event_tablaTblMouseClicked

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        Evento campoEvento = (Evento) tipoBusCBx.getSelectedItem();
        if (campoEvento != null) {
            if (campoEvento.getNombre().compareTo("") != 0) {
                control.setClass(ImplementacionEvento.class);
                control.buscarPorEvento(
                        (Evento) tipoBusCBx.getSelectedItem());
            } else if (fechaInicialDCh.getDate() != null
                    && fechaTerminacionDCh.getDate() != null) {
                System.out.println("entre");
                Date de = fechaInicialDCh.getDate();
                Date hasta = fechaTerminacionDCh.getDate();
                control
                        .setClass(ImplementacionEvento.class
                        );
                control.buscarImplementacion(de, hasta);
            } else {
                control.setClass(ImplementacionEvento.class
                );
                control.buscarTodos();
            }
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void tipoRegCBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoRegCBxItemStateChanged
        Evento campo = (Evento) tipoBusCBx.getSelectedItem();
        if (campo != null) {
            if (campo.getNombre().compareTo("") != 0) {
                regRealizadoBtn.setEnabled(true);
                regRealizarBtn.setEnabled(true);
            } else {
                regRealizadoBtn.setEnabled(false);
                regRealizarBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tipoRegCBxItemStateChanged

    private void tipoBusCBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoBusCBxItemStateChanged
        Evento campo = (Evento) tipoBusCBx.getSelectedItem();
        if (campo != null) {
            if (campo.getNombre().compareTo("") != 0) {
                regRealizadoBtn.setEnabled(true);
                regRealizarBtn.setEnabled(true);
            } else {
                regRealizadoBtn.setEnabled(false);
                regRealizarBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tipoBusCBxItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        regRealizadoBtn.setEnabled(false);
        regRealizarBtn.setEnabled(false);
        eventoRealizarPnl.limpiarCampos();
        eventoRealizadoPnl.limpiarCampos();
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.jpcomponents.JPCalendar agendarCursosCal;
    public javax.swing.JButton buscarBtn;
    private javax.swing.JPanel buscarPnl;
    private javax.swing.JPanel calendarioPnl;
    public com.toedter.calendar.JDateChooser fechaInicialDCh;
    public com.toedter.calendar.JDateChooser fechaTerminacionDCh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nombreBusLbl;
    private javax.swing.JLabel nombreRegLbl;
    private javax.swing.JLabel notaBusLbl;
    private javax.swing.JLabel notaRegLbl;
    private javax.swing.JLabel opcionesBusLbl;
    private javax.swing.JLabel opcionesRegLbl;
    private javax.swing.JTabbedPane opcionesTP;
    private javax.swing.JButton regRealizadoBtn;
    private javax.swing.JButton regRealizarBtn;
    private javax.swing.JPanel registrarPnl;
    private javax.swing.JLabel sedeLbl;
    private javax.swing.JLabel sedeLbl1;
    private javax.swing.JTable tablaTbl;
    public javax.swing.JComboBox tipoBusCBx;
    private javax.swing.JComboBox tipoRegCBx;
    // End of variables declaration//GEN-END:variables
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
        tablaTbl.setEnabled(true);
        model.setDataVector(info, titulosTabla);
        //Esconder columna ID
        TableColumn tc = tablaTbl.getColumnModel().getColumn(4);
        tc
                .setCellEditor(tablaTbl.getDefaultEditor(Boolean.class
                        ));
        tc.setCellRenderer(tablaTbl.getDefaultRenderer(Boolean.class
        ));
        tc = tablaTbl.getColumnModel().getColumn(0);

        tablaTbl.getColumnModel()
                .removeColumn(tc);
    }

    /**
     * Metodo sobrescrito de la clase Comunicador que ayuda a mandar la
     * informacion del evento a su respecivo panel, dependiendo del estado del
     * evento
     *
     * @param info
     * @param i
     */
    @Override
    public void setInfo(List info) {
        if (estado.equals("Finalizado")) {
            eventoRealizarPnl.setVisible(false);
            eventoRealizadoPnl.setVisible(true);
            eventoRealizadoPnl.llenarTodo();
            eventoRealizadoPnl.obtenerMod(info);
            eventoRealizadoPnl.visibilidad(true);
        } else {
            eventoRealizarPnl.setVisible(true);
            eventoRealizadoPnl.setVisible(false);
            eventoRealizarPnl.llenarTodo();
            eventoRealizarPnl.obtenerMod(info);
            eventoRealizarPnl.visibilidad(true);
        }
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
                tipoEventoModel.removeAllElements();
                Evento evento = new Evento();
                evento.setNombre("");
                tipoEventoModel.addElement(evento);
                for (int j = 0; j < info.size(); j++) {
                    tipoEventoModel.addElement(info.get(j));
                }
                break;
        }
    }
    
    @Override
    public void llenarDatos(Object evento){
        System.out.println("Programar evento");
           llenarTodo();
        System.out.println(((ImplementacionEvento) evento)
                .getEvento().getNombre());
        tipoRegCBx.setSelectedIndex(((ImplementacionEvento) evento)
                .getEvento().getId());
        this.formComponentShown(null);
        this.setVisible(true);
        this.updateUI();
    }
}
