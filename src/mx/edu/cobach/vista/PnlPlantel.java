/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.vista.controlador.HelperEntidad;
import mx.edu.cobach.vista.controlador.PlantelControlador;
import mx.edu.cobach.vista.controlador.SedeControlador;


public class PnlPlantel extends javax.swing.JPanel implements Comunicador {
   
    private final DefaultTableModel model;
    private final String[] titulosTabla;
    private final PlantelControlador control;
    private int idPlantelActual;
    private boolean buscando=false;
    private KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();

    /**
     * En este metodo, Se inicializan los componentes, se asigna la cabecera a
     * la tabla y se bloquean algunos componentes.
     */
    public PnlPlantel() {
        initComponents();
        titulosTabla= new String[]{"Número","Nombre","Dirección","Eliminar"};
        model = new DefaultTableModel(titulosTabla, 4);
        plantelesTbl.setModel(model);
        plantelesTbl.setColumnSelectionAllowed(false);
        plantelesTbl.setDragEnabled(false);
        control = new PlantelControlador(this,Plantel.class);
        nombreBuscarTFd.setEnabled(true);
        setEnabledPanelInformacion(false);
        setEnabledPanelOpcion(false);
        
        /**
         * Metodo que sirve para validar que solo se admitan letras mayusculas
         * en los campos de texto.
         */
        manager.addKeyEventDispatcher(new KeyEventDispatcher(){
            public boolean dispatchKeyEvent(KeyEvent e) {
                if(e.getID() == KeyEvent.KEY_TYPED){
                    if(e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z'){
                        e.setKeyChar((char)(((int)e.getKeyChar()) - 32));
                    }
                }
                return false;
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

        opcionPnl = new javax.swing.JPanel();
        tablaPlantelSPn = new javax.swing.JScrollPane();
        plantelesTbl = new javax.swing.JTable();
        agregarTFd = new javax.swing.JButton();
        NombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        nombreAgregarLbl = new javax.swing.JLabel();
        diraccionLbl = new javax.swing.JLabel();
        zonaLbl = new javax.swing.JLabel();
        nombreTFd = new javax.swing.JTextField();
        zonaCBx = new javax.swing.JComboBox();
        calleTFd = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        agregarLbl = new javax.swing.JLabel();
        agregarMsjLbl = new javax.swing.JLabel();
        calleLbl = new javax.swing.JLabel();
        numeroLbl = new javax.swing.JLabel();
        numeroTFd = new javax.swing.JTextField();
        coloniaLbl = new javax.swing.JLabel();
        coloniaTFd = new javax.swing.JTextField();

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));

        plantelesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        plantelesTbl.setMaximumSize(new java.awt.Dimension(225, 64));
        plantelesTbl.setMinimumSize(new java.awt.Dimension(225, 64));
        plantelesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plantelesTblMouseClicked(evt);
            }
        });
        tablaPlantelSPn.setViewportView(plantelesTbl);
        if (plantelesTbl.getColumnModel().getColumnCount() > 0) {
            plantelesTbl.getColumnModel().getColumn(0).setResizable(false);
            plantelesTbl.getColumnModel().getColumn(1).setResizable(false);
            plantelesTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        agregarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarTFd.setText("Agregar");
        agregarTFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTFdActionPerformed(evt);
            }
        });

        NombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombreBuscarLbl.setText("Nombre del plantel:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

        opcionMsjLbl.setText("<HTML>Seleccione el boton \"Agregar\" para habilitar la seccion de registro<BR>Si desea realizar una busqueda, seleccione el boton \"Buscar\"</HTML>");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaPlantelSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addComponent(agregarTFd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(NombreBuscarLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(opcionLbl))
                        .addGap(0, 70, Short.MAX_VALUE))))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreBuscarLbl)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarTFd)
                    .addComponent(buscarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaPlantelSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(767, 394));
        informacionPnl.setMinimumSize(new java.awt.Dimension(767, 394));

        nombreAgregarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreAgregarLbl.setText("Nombre del plantel:");

        diraccionLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diraccionLbl.setText("Dirección del plantel");

        zonaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zonaLbl.setText("Area:");

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTFdFocusLost(evt);
            }
        });

        zonaCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zonaCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zona Costa", "Zona Valle", "CEMSAD´S" }));
        zonaCBx.setToolTipText("Seleccioné la zona del plantel");

        calleTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        agregarLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLbl.setText("Agregar");

        agregarMsjLbl.setText("Ingrese la información a almacenar");

        calleLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calleLbl.setText("Calle:");

        numeroLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroLbl.setText("Numero:");

        numeroTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        coloniaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coloniaLbl.setText("Colonia:");

        coloniaTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarMsjLbl)
                    .addComponent(agregarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diraccionLbl)
                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(informacionPnlLayout.createSequentialGroup()
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coloniaLbl))
                            .addGap(339, 339, 339)
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(informacionPnlLayout.createSequentialGroup()
                                    .addComponent(zonaLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zonaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(informacionPnlLayout.createSequentialGroup()
                                    .addComponent(numeroLbl)
                                    .addGap(46, 46, 46)
                                    .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(calleTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(informacionPnlLayout.createSequentialGroup()
                            .addComponent(nombreAgregarLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(coloniaTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(agregarLbl)
                .addGap(11, 11, 11)
                .addComponent(agregarMsjLbl)
                .addGap(18, 18, 18)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAgregarLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(diraccionLbl)
                        .addGap(33, 33, 33)
                        .addComponent(calleLbl))
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calleTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroLbl)
                            .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zonaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zonaLbl)
                    .addComponent(coloniaLbl)
                    .addComponent(coloniaTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informacionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**Al accionar el boton buscar se activara este metodo que verifica si el
     *campo de nombre de opciones esta activo y buscara la informacion deseada,
     *de lo contrario activara el campo de nombre.
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if(nombreBuscarTFd.isEnabled()){
            buscar();
        }else{
            setEnabledPanelInformacion(false);
            setEnabledPanelOpcion(true);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    /**
     *Al accionar el boton guardar o modificar, e activara este metodo
     * que verifica los campos de texto, y almacena o modifica
     * la informacion en la base de datos.
     */
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        setEnabledPanelOpcion(false);
           setEnabledPanelInformacion(false);
        if(nombreTFd.getText().equals("") && coloniaTFd.getText().equals(""))
            setMensaje("Debe ingresar los datos solicitados");
            else
                if(nombreTFd.getText().equals(""))
                    setMensaje("Debe ingresar el nombre del plantel");
                else
                    if(coloniaTFd.getText().equals(""))
                        setMensaje("Debe ingresar el nombre de colonia del plantel");
        
                    else{
                        List<String> atr = new ArrayList<String>();
                        atr.add(nombreTFd.getText());
                        atr.add(calleTFd.getText());
                        atr.add(coloniaTFd.getText());            
                        atr.add(numeroTFd.getText());
                        switch(String.valueOf(zonaCBx.getSelectedItem())){
                            case "Zona Costa": atr.add("1"); break;
                            case "Zona Valle": atr.add("2"); break;
                            case "CEMSAD´S": atr.add("3"); break;
                        } 
                        if(!guardarBtn.getText().equalsIgnoreCase("Modificar")){
                            setEnabledPanelInformacion(false);
                            setEnabledPanelOpcion(false);    
                            control.alta(HelperEntidad.getPlantel(atr)); 
                        }else{
                            setEnabledPanelInformacion(false);
                            setEnabledPanelOpcion(false);
                            atr.add(String.valueOf(idPlantelActual));
                            control.modificacion(HelperEntidad.getPlantel(atr));
                        }
                        nombreTFd.setText("");
                        coloniaTFd.setText("");
                        calleTFd.setText("");
                        numeroTFd.setText("");
                    }
        setEnabledPanelInformacion(true);
    }//GEN-LAST:event_guardarBtnActionPerformed

    /**
     *Al accionar el boton agregar, se activara este metodo que desbloqueara
     * los componentes de la seccion informacion y si hay un dato seleccionado
     * en la tabla, mostrara la informacion de dicho tato.
     */
    private void agregarTFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTFdActionPerformed
        int renglon = plantelesTbl.getSelectedRow();
        if(renglon == -1) {
            guardarBtn.setText("Guardar");
        }else{
            int id = Integer.parseInt((String)model.getValueAt(renglon, 0));
            idPlantelActual=id;
            control.buscar(id); 
            guardarBtn.setText("Modificar");
        }
        setEnabledPanelInformacion(true);
        setEnabledPanelOpcion(false);  
    }//GEN-LAST:event_agregarTFdActionPerformed

    /**
     *Al seleccionar la opcion eliminar de un dato de la tabla se activara
     * este metodo, que confirma su eliminacion y lo elimina de la base de datos.
     */
    private void plantelesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantelesTblMouseClicked
        int row = plantelesTbl.rowAtPoint(evt.getPoint());
        int col = plantelesTbl.columnAtPoint(evt.getPoint());
        if(col == 3) {
            int op = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este registro?",
                    "Precaución", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == 0){
                int id = Integer.parseInt((String)model.getValueAt(row, 0));
                control.baja(id);
                 setEnabledPanelOpcion(true);
           setEnabledPanelInformacion(false);
               buscar();
            }else
                plantelesTbl.clearSelection();
        }
    }//GEN-LAST:event_plantelesTblMouseClicked

    /**
     *Al seleccionar otro componente estando en el campo nombre de el area de
     * informacion, buscara en la base de datos un nombre que tenga coincidencia
     * con algun plantel.
     */
    private void nombreTFdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusLost
        if(!guardarBtn.getText().equals("Modificar"))
        if(nombreTFd.getText().equals("")==false){
            buscando=true;
            control.buscarPorNombre(nombreTFd.getText());
            buscando=false;
        }
    }//GEN-LAST:event_nombreTFdFocusLost
    
    /**
     * Metodo para buscar un nombre de plantel especifico o todos los planteles
     * registrados.
     */
    public void buscar(){
        if(nombreBuscarTFd.getText().equals("")==false)
            control.buscarPorNombre(nombreBuscarTFd.getText());
        else
            control.buscarTodos();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreBuscarLbl;
    private javax.swing.JLabel agregarLbl;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JButton agregarTFd;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel calleLbl;
    private javax.swing.JTextField calleTFd;
    private javax.swing.JLabel coloniaLbl;
    private javax.swing.JTextField coloniaTFd;
    private javax.swing.JLabel diraccionLbl;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JLabel nombreAgregarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel numeroLbl;
    private javax.swing.JTextField numeroTFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JTable plantelesTbl;
    private javax.swing.JScrollPane tablaPlantelSPn;
    private javax.swing.JComboBox zonaCBx;
    private javax.swing.JLabel zonaLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Este metodo muestra un mensaje en pantalla con el contenido de 
     * mensaje.
     * @param String mensaje 
     */
    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * 
     * @param String[][] info 
     */
    @Override
    public void setTabla(String[][] info) {
        model.setRowCount(0);
        if(buscando){
            if(info!=null)
                for(int x=0;x<info.length;x++)
                    if(info[x][1].equals(nombreTFd.getText())){
                        setMensaje("Ya existe ese plantel");
                        break;
                    }
        }else
            if(info==null)
                model.setRowCount(0);
                else{
                    model.setDataVector(info, titulosTabla);
                    TableColumn tc = plantelesTbl.getColumnModel().getColumn(3);
                    tc.setCellEditor(plantelesTbl.getDefaultEditor(Boolean.class));
                    tc.setCellRenderer(plantelesTbl.getDefaultRenderer(Boolean.class));
                    tc = plantelesTbl.getColumnModel().getColumn(0);
                }
    }

    @Override
    public void setInfo(List info) {
        if(info==null)
            setMensaje("No se encontraron coincidencias");
        else{
            nombreTFd.setText(info.get(0).toString());
            calleTFd.setText(info.get(1).toString());
            coloniaTFd.setText(info.get(2).toString());
            numeroTFd.setText(info.get(3).toString());
            zonaCBx.setSelectedItem(info.get(4).toString());
        }
    }

    @Override
    public void setLista(List info, int i) {}

    private void setEnabledPanelInformacion(boolean b) {
       // model.setRowCount(0);
        nombreTFd.setEnabled(b);
        calleTFd.setEnabled(b);
        coloniaTFd.setEnabled(b);
        numeroTFd.setEnabled(b);
        zonaCBx.setEnabled(b);
    }
    
    private void setEnabledPanelOpcion(boolean b) {
        model.setRowCount(0);
        nombreBuscarTFd.setEnabled(b);
        plantelesTbl.setEnabled(b);
        
    }
    
}
