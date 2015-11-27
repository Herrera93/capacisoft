/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.vista.controlador.ImplementarEventoControlador;

/**
 * Esta clase mostrara la interfaz de la busqueda del evento o la seleccion de
 * un evento para llevarlo a implementar
 */
public class PnlProgramarEvento extends javax.swing.JPanel implements
        Comunicador {

    /**
     * Creates new form PnlProgramarEvento
     */
    public PnlEventoRealizar eventoRealizarPnl;
    public PnlEventoRealizado eventoRealizadoPnl;

    public final ImplementarEventoControlador control;
    public final DefaultComboBoxModel tipoEventoModel;
    public final DefaultTableModel model;
    public String[] titulosTabla = {"ID", "Fecha Inicial", "Nombre del evento",
        "activo", "Eliminar"};
    public String estado;
    private Capacisoft capacisoft;
    private int idEventoActual;

    //mensaje instruccion : JLabel

    public PnlProgramarEvento(Capacisoft capacisoft) {
        this.capacisoft = capacisoft;
        control = new ImplementarEventoControlador(this,
                ImplementacionEvento.class);
        initComponents();
        agregar();
        model = new DefaultTableModel(titulosTabla, 4);
        tablaTbl.setModel(model);
        TableColumn tc = tablaTbl.getColumnModel().getColumn(0);
        tablaTbl.getColumnModel().removeColumn(tc);
        tc = tablaTbl.getColumnModel().getColumn(2);
        tablaTbl.getColumnModel().removeColumn(tc);
        tablaTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaTbl.getColumnModel().getColumn(0).setPreferredWidth(150);
        tablaTbl.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaTbl.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
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
        eventoRealizarPnl = new PnlEventoRealizar(capacisoft);
        eventoRealizarPnl.setLocation(404, 0);
        eventoRealizarPnl.setSize(781, 589);
        eventoRealizarPnl.setVisible(false);
        add(eventoRealizarPnl);

        eventoRealizadoPnl = new PnlEventoRealizado(capacisoft);
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesTP = new javax.swing.JTabbedPane();
        registrarPnl = new javax.swing.JPanel();
        nombreRegLbl = new javax.swing.JLabel();
        tipoRegCBx = new javax.swing.JComboBox();
        regRealizarBtn = new javax.swing.JButton();
        regRealizadoBtn = new javax.swing.JButton();
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
        tablaMsjLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1150, 576));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        opcionesTP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionesTP.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionesTP.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionesTP.setPreferredSize(new java.awt.Dimension(401, 603));

        registrarPnl.setPreferredSize(new java.awt.Dimension(392, 571));

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

        opcionesRegLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionesRegLbl.setText("Opciones");

        notaRegLbl.setText("<html>Seleccione el tipo de evento que desea registrar, para registrar un evento ya realizado seleccione la opcion de  \"Registrar evento realizado\", si desea registrar un evento a realizar seleccione la opcion de \"Programar evento<br>a realizar\"");

        javax.swing.GroupLayout registrarPnlLayout = new javax.swing.GroupLayout(registrarPnl);
        registrarPnl.setLayout(registrarPnlLayout);
        registrarPnlLayout.setHorizontalGroup(
            registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarPnlLayout.createSequentialGroup()
                .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarPnlLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionesRegLbl)
                            .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registrarPnlLayout.createSequentialGroup()
                                    .addComponent(nombreRegLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipoRegCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(notaRegLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(registrarPnlLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regRealizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regRealizadoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        registrarPnlLayout.setVerticalGroup(
            registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opcionesRegLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaRegLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registrarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreRegLbl)
                    .addComponent(tipoRegCBx))
                .addGap(41, 41, 41)
                .addComponent(regRealizadoBtn)
                .addGap(18, 18, 18)
                .addComponent(regRealizarBtn)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        opcionesTP.addTab("Registrar evento de capacitación", registrarPnl);

        buscarPnl.setPreferredSize(new java.awt.Dimension(392, 571));

        nombreBusLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBusLbl.setText("Nombre del evento: ");

        sedeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedeLbl.setText("Fecha del evento:");

        tablaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha Inicial", "Nombre del evento", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        notaBusLbl.setText("<html>Ingrese el nombre o la fecha del evento para buscar la información<br>especifica");

        sedeLbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedeLbl1.setText("Hasta:");

        fechaInicialDCh.setDateFormatString("dd/MM/yyyy");
        fechaInicialDCh.setMaximumSize(new java.awt.Dimension(91, 20));

        fechaTerminacionDCh.setDateFormatString("dd/MM/yyyy");
        fechaTerminacionDCh.setMaximumSize(new java.awt.Dimension(91, 20));

        tablaMsjLbl.setText("<html>Para Modificar seleccione la fecha inicial o el nombre del evento que desea modificar, para eliminar selecciona el cuadro eliminar de la columna Eliminar del evento que desee</html> ");

        javax.swing.GroupLayout buscarPnlLayout = new javax.swing.GroupLayout(buscarPnl);
        buscarPnl.setLayout(buscarPnlLayout);
        buscarPnlLayout.setHorizontalGroup(
            buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarPnlLayout.createSequentialGroup()
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(buscarPnlLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buscarPnlLayout.createSequentialGroup()
                                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sedeLbl)
                                    .addComponent(notaBusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(opcionesBusLbl)
                                    .addComponent(sedeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                            .addGroup(buscarPnlLayout.createSequentialGroup()
                                .addComponent(nombreBusLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipoBusCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(buscarPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaTerminacionDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarBtn)
                            .addComponent(fechaInicialDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, buscarPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tablaMsjLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        buscarPnlLayout.setVerticalGroup(
            buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opcionesBusLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaBusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBusLbl)
                    .addComponent(tipoBusCBx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sedeLbl)
                    .addComponent(fechaInicialDCh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(buscarPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sedeLbl1)
                    .addComponent(fechaTerminacionDCh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        opcionesTP.addTab("Buscar Evento", buscarPnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionesTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 749, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesTP, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
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
            if (JOptionPane.showConfirmDialog(this, "La información se"
                    + " esta modificando,¿Aun así desea cancelarla?",
                    "Precaucion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE) == 0) {
                eventoRealizarPnl.limpiarCampos();
                eventoRealizadoPnl.limpiarCampos();
                eventoRealizadoPnl.setVisible(true);
                eventoRealizarPnl.setVisible(false);
                eventoRealizadoPnl.llenarEvento((Evento) tipoRegCBx.
                        getSelectedItem());
                eventoRealizadoPnl.llenarTodo();
                eventoRealizarPnl.visibilidad(true);
            }
        } else {
            eventoRealizarPnl.setVisible(false);
            eventoRealizadoPnl.setVisible(true);
            eventoRealizadoPnl.llenarEvento((Evento) tipoRegCBx.
                    getSelectedItem());
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
            if (JOptionPane.showConfirmDialog(this, "La información se"
                    + " esta modificando,¿Aun así desea cancelarla?",
                    "Precaucion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE) == 0) {
                eventoRealizadoPnl.limpiarCampos();
                eventoRealizarPnl.limpiarCampos();
                eventoRealizarPnl.setVisible(true);
                eventoRealizadoPnl.setVisible(false);
                eventoRealizarPnl.llenarEvento((Evento) tipoRegCBx
                        .getSelectedItem());
                eventoRealizarPnl.llenarTodo();
                eventoRealizarPnl.visibilidad(true);
            }
        } else {
            eventoRealizadoPnl.setVisible(false);
            eventoRealizarPnl.setVisible(true);
            eventoRealizarPnl.llenarEvento((Evento) tipoRegCBx
                    .getSelectedItem());
            eventoRealizarPnl.llenarTodo();
            eventoRealizarPnl.visibilidad(true);
        }
    }//GEN-LAST:event_regRealizarBtnActionPerformed

    /**
     * Este metodo permite que la informacion de la tabla mostrada al usuario,
     * se muestre en los paneles de los eventos para modificar o que estos
     * eventos sean borrados
     *
     * @param evt
     */
    private void tablaTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTblMouseClicked
        int col = tablaTbl.columnAtPoint(evt.getPoint());
        int row = tablaTbl.rowAtPoint(evt.getPoint());
        if (col == 0 || col == 1) {
            if(eventoRealizadoPnl.isVisible() || eventoRealizarPnl.isVisible()){
                if (JOptionPane.showConfirmDialog(this, "La información que"
                    + " esta modificando se perdera ¿Aun así desea cancelarla?",
                    "Precaucion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE) == 0) {
                    //Se obtiene el id de la columna no visible para realizar una 
                    //busqueda especifica.
                    if (((String) model.getValueAt(row, 3)).equals("Activo")) {
                        estado = "Activo";
                    } else {
                        estado = "Finalizado";
                    }
                    control.setClass(ImplementacionEvento.class);
                    control.buscarMod(Integer.parseInt((String) model.
                            getValueAt(row, 0)));
                }
            }else{
                //Se obtiene el id de la columna no visible para realizar una 
                //busqueda especifica.
                if (((String) model.getValueAt(row, 3)).equals("Activo")) {
                    estado = "Activo";
                } else {
                    estado = "Finalizado";
                }
                control.setClass(ImplementacionEvento.class);
                control.buscarMod(Integer.parseInt((String) model.
                        getValueAt(row, 0)));
            }
            //Manda un mensaje de Confirmación sobre la eliminacion
        } else if (col == 2) {
            int id = Integer.parseInt((String)model.getValueAt(row, 0));
            if((eventoRealizadoPnl.isVisible() || eventoRealizarPnl.isVisible())
                && idEventoActual == id){
                JOptionPane.showMessageDialog(this, "No se puede eliminar la implementacion que se esta"
                    + " modificando actualmente.","Precaución", JOptionPane.ERROR_MESSAGE);
                model.setValueAt(false, row, 4);
                tablaTbl.clearSelection();
            } else if(JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este registro?",
                "Precaución", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0){
                control.baja(id);
                control.buscarTodos();
            } else {
                model.setValueAt(false, row, 4);
                tablaTbl.clearSelection();
            }
        }
    }//GEN-LAST:event_tablaTblMouseClicked
    /**
     * Este metodo permite que el usuario pueda buscar un evento ya realizado o
     * a realizar, buscando todos los eventos si estan vacios todos los campos o
     * mandando toda la informacion de fechas y nombre si no estan vacios
     *
     * @param evt
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        Evento evento = (Evento) tipoBusCBx.getSelectedItem();
        Date de = fechaInicialDCh.getDate();
        Date hasta = fechaTerminacionDCh.getDate();
        control.setClass(ImplementacionEvento.class);
        if (evento.getNombre().equals("") && de == null && hasta == null) {
            control.buscarTodos();
        } else {
            control.buscarImplementacion(evento, de, hasta);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed
    /**
     * Este metodo permite que cuando el usuario busque un evento que desea
     * registrar este abilite los botones de programar evento a realizar o
     * registrar evento realizado.
     *
     * @param evt
     */
    private void tipoRegCBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoRegCBxItemStateChanged
        if ((Evento) tipoBusCBx.getSelectedItem() != null) {
            if (((Evento) tipoBusCBx.getSelectedItem()).getNombre().
                    compareTo("") != 0) {
                regRealizadoBtn.setEnabled(true);
                regRealizarBtn.setEnabled(true);
            } else {
                regRealizadoBtn.setEnabled(false);
                regRealizarBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tipoRegCBxItemStateChanged
    /**
     * Este metodo permite que cuando el usuario busque un evento que desea
     * registrar este abilite los botones de programar evento a realizar o
     * registrar evento realizado.
     *
     * @param evt
     */
    private void tipoBusCBxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoBusCBxItemStateChanged
        if ((Evento) tipoBusCBx.getSelectedItem() != null) {
            if (((Evento) tipoBusCBx.getSelectedItem()).getNombre().
                    compareTo("") != 0) {
                regRealizadoBtn.setEnabled(true);
                regRealizarBtn.setEnabled(true);
            } else {
                regRealizadoBtn.setEnabled(false);
                regRealizarBtn.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tipoBusCBxItemStateChanged
    /**
     * Metodo que permite que cuando se cambie de interfaz el usuario, elimine
     * la informacion referente a la programacion de los eventos
     *
     * @param evt
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        regRealizadoBtn.setEnabled(false);
        regRealizarBtn.setEnabled(false);
        eventoRealizarPnl.limpiarCampos();
        eventoRealizadoPnl.limpiarCampos();
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buscarBtn;
    private javax.swing.JPanel buscarPnl;
    public com.toedter.calendar.JDateChooser fechaInicialDCh;
    public com.toedter.calendar.JDateChooser fechaTerminacionDCh;
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
    private javax.swing.JLabel tablaMsjLbl;
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

        TableColumn tc = tablaTbl.getColumnModel().getColumn(4);
        tc.setCellEditor(tablaTbl.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tablaTbl.getDefaultRenderer(Boolean.class));
        tablaTbl.getColumnModel().removeColumn(tablaTbl.getColumnModel().
                getColumn(0));
        tc = tablaTbl.getColumnModel().getColumn(2);
        tablaTbl.getColumnModel().removeColumn(tc);
        tablaTbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablaTbl.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablaTbl.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaTbl.getColumnModel().getColumn(2).setPreferredWidth(50);
        tablaTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }

    /**
     * Metodo sobrescrito de la clase Comunicador que ayuda a mandar la
     * informacion del evento a su respecivo panel, dependiendo del estado del
     * evento
     *
     * @param info
     */
    @Override
    public void setInfo(List info) {
        if (estado.equals("Finalizado")) {
            eventoRealizarPnl.setVisible(false);
            eventoRealizadoPnl.setVisible(true);
            eventoRealizadoPnl.llenarTodo();
            eventoRealizadoPnl.obtenerMod(info);
            eventoRealizadoPnl.visibilidad(true);
        } else if (estado.equals("Activo")) {
            eventoRealizarPnl.setVisible(true);
            eventoRealizadoPnl.setVisible(false);
            eventoRealizarPnl.llenarTodo();
            eventoRealizarPnl.obtenerMod(info, "Modificar");
            eventoRealizarPnl.visibilidad(true);
        } else {
            eventoRealizarPnl.setVisible(true);
            eventoRealizadoPnl.setVisible(false);
            eventoRealizarPnl.llenarTodo();
            eventoRealizarPnl.obtenerMod(info, "Guardar");
            eventoRealizarPnl.visibilidad(true);
        }
        idEventoActual = (int) info.get(0);
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
                Evento evento = new Evento("");
                tipoEventoModel.addElement(evento);
                for (int j = 0; j < info.size(); j++) {
                    tipoEventoModel.addElement(info.get(j));
                }
                break;
        }
    }

    /**
     * Metodo que permite llenar la informacion relacionada a los eventos
     *
     * @param implementacionEvento
     */
    @Override
    public void llenarDatos(Object implementacionEvento) {
        ImplementacionEvento ie = (ImplementacionEvento) implementacionEvento;
        System.out.println("Programar evento");
        llenarTodo();
        this.updateUI();
        tipoRegCBx.setSelectedIndex(ie.getEvento().getId());
        this.formComponentShown(null);
        opcionesTP.setSelectedIndex(1);
        fechaInicialDCh.setDate(ie.getFechaInicial());
        fechaTerminacionDCh.setDate(ie.getFechaFinal());
    }
    
    /**
     * Metodo que permite obtener el id de implementacionEvento desde el
     * componente de alertas
     * @param eventoImplementado 
     */
    public void obtenerEventoImplementado(ImplementacionEvento eventoImplementado) {
        estado = "Activo Guardar";
        control.setClass(ImplementacionEvento.class);
        control.buscarMod(eventoImplementado.getId());
    }

}
