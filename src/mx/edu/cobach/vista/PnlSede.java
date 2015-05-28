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
import mx.edu.cobach.persistencia.entidades.Sede;
import mx.edu.cobach.vista.controlador.HelperEntidad;
import mx.edu.cobach.vista.controlador.SedeControlador;
import mx.edu.cobach.vista.controlador.PlantelControlador;

public class PnlSede extends javax.swing.JPanel implements Comunicador{
    
    private final DefaultTableModel model;
    private final String[] titulosTabla;
    private final SedeControlador control;
    private final PlantelControlador controlPlantel;
    private int idSedeActual;
    private boolean buscando=false;
    private KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    
    public PnlSede() {
        initComponents();
        titulosTabla= new String[]{"Número","Nombre","Eliminar"};
        model = new DefaultTableModel(titulosTabla, 0);
        sedesTbl.setModel(model);
        sedesTbl.setColumnSelectionAllowed(false);
        sedesTbl.setDragEnabled(false);
        control = new SedeControlador(this,Sede.class);
        controlPlantel = new PlantelControlador(this,Plantel.class);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        sedesTbl = new javax.swing.JTable();
        nombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        agregarBtn = new javax.swing.JButton();
        buscarBtn = new javax.swing.JButton();
        opcionesLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        coloniaLbl = new javax.swing.JLabel();
        municipioLbl = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        nombreTFd = new javax.swing.JTextField();
        coloniaTFd = new javax.swing.JTextField();
        municipioCBx = new javax.swing.JComboBox();
        cantidadLbl = new javax.swing.JLabel();
        capacidadTFd = new javax.swing.JTextField();
        calleLbl = new javax.swing.JLabel();
        numeroLbl = new javax.swing.JLabel();
        calleTFd = new javax.swing.JTextField();
        numeroTFd = new javax.swing.JTextField();
        agregarLbl = new javax.swing.JLabel();
        agregarMsjLbl = new javax.swing.JLabel();
        lugarLbl1 = new javax.swing.JLabel();
        lugarTFd = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));
        setPreferredSize(new java.awt.Dimension(1181, 587));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setPreferredSize(new java.awt.Dimension(408, 587));

        sedesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sedesTbl.setMaximumSize(new java.awt.Dimension(225, 64));
        sedesTbl.setMinimumSize(new java.awt.Dimension(225, 64));
        sedesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sedesTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sedesTbl);
        if (sedesTbl.getColumnModel().getColumnCount() > 0) {
            sedesTbl.getColumnModel().getColumn(0).setResizable(false);
            sedesTbl.getColumnModel().getColumn(1).setResizable(false);
            sedesTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre de la sede:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarTFd.setEnabled(false);

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        opcionesLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionesLbl.setText("Opciones ");

        opcionMsjLbl.setText("<HTML>Seleccione el boton \"Agregar\" para habilitar la seccion de registro<BR>Si desea realizar una busqueda, seleccione el boton \"Buscar\"</HTML>");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(nombreBuscarLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(opcionesLbl))
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(agregarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(opcionesLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreBuscarLbl))
                .addGap(18, 18, 18)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBtn)
                    .addComponent(buscarBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(769, 587));
        informacionPnl.setMinimumSize(new java.awt.Dimension(769, 587));
        informacionPnl.setPreferredSize(new java.awt.Dimension(769, 587));

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre:");

        coloniaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coloniaLbl.setText("Colonia:");

        municipioLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        municipioLbl.setText("Municipio:");

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.setEnabled(false);
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.setEnabled(false);
        nombreTFd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTFdFocusLost(evt);
            }
        });

        coloniaTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coloniaTFd.setEnabled(false);

        municipioCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        municipioCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mexicali", "Tecate", "Tijuana", "Rosarito", "Ensenada" }));
        municipioCBx.setToolTipText("Seleccioné el municipio de la sede");
        municipioCBx.setEnabled(false);

        cantidadLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cantidadLbl.setText("Capacidad:");

        capacidadTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        capacidadTFd.setEnabled(false);

        calleLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calleLbl.setText("Calle:");

        numeroLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroLbl.setText("Número de direccion:");

        calleTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calleTFd.setEnabled(false);

        numeroTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroTFd.setEnabled(false);

        agregarLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLbl.setText("Agregar");

        agregarMsjLbl.setText("Ingrese la información a almacenar");

        lugarLbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lugarLbl1.setText("Lugar:");

        lugarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lugarTFd.setEnabled(false);

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarMsjLbl)
                    .addComponent(agregarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informacionPnlLayout.createSequentialGroup()
                                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lugarLbl1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombreLbl, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(81, 81, 81)
                                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(informacionPnlLayout.createSequentialGroup()
                                            .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(informacionPnlLayout.createSequentialGroup()
                                            .addComponent(lugarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informacionPnlLayout.createSequentialGroup()
                                    .addComponent(coloniaLbl)
                                    .addGap(86, 86, 86)
                                    .addComponent(coloniaTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(informacionPnlLayout.createSequentialGroup()
                                .addComponent(numeroLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informacionPnlLayout.createSequentialGroup()
                                .addComponent(cantidadLbl)
                                .addGap(44, 44, 44)
                                .addComponent(capacidadTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(informacionPnlLayout.createSequentialGroup()
                                    .addComponent(municipioLbl)
                                    .addGap(64, 64, 64)
                                    .addComponent(municipioCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(informacionPnlLayout.createSequentialGroup()
                                    .addComponent(calleLbl)
                                    .addGap(80, 80, 80)
                                    .addComponent(calleTFd))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(agregarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarMsjLbl)
                .addGap(38, 38, 38)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipioLbl)
                    .addComponent(municipioCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lugarLbl1)
                    .addComponent(lugarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coloniaLbl)
                    .addComponent(coloniaTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calleTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calleLbl))
                .addGap(54, 54, 54)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cantidadLbl)
                        .addComponent(capacidadTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numeroLbl)
                        .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(informacionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * 
     * @param evt 
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        int renglon = sedesTbl.getSelectedRow();
        if(renglon == -1) {
            guardarBtn.setText("Guardar");
        }else{
            int id = Integer.parseInt((String)model.getValueAt(renglon, 0));
            idSedeActual=id;
        try{
            control.buscar(id); 
        
            guardarBtn.setText("Modificar");
            }catch(Exception ex){}
        }
        setEnabledPanelInformacion(true);
        setEnabledPanelOpcion(false);
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
       buscando=false;
        if(nombreBuscarTFd.isEnabled()){
        buscar();
        //setMensaje("buscar");
        }else{
           setEnabledPanelOpcion(true);
           setEnabledPanelInformacion(false);
       }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        setEnabledPanelOpcion(false);
           setEnabledPanelInformacion(false);
        if(nombreTFd.getText().equals("") &&
          coloniaTFd.getText().equals("") &&
           capacidadTFd.getText().equals("") ) 
            setMensaje("Debe ingresar los datos solicitados");
        else if(nombreTFd.getText().equals(""))
             setMensaje("Debe ingresar el nombre de la sede");
        else if(lugarTFd.getText().equals(""))
             setMensaje("Debe ingresar el nombre de lugar de la sede");
        else if(coloniaTFd.getText().equals(""))
             setMensaje("Debe ingresar el nombre de colonia de la sede");
        else if(capacidadTFd.getText().equals(""))
             setMensaje("Debe ingresar la capacidad del lugar");
        else{
            List<String> atr = new ArrayList<String>();
            atr.add(nombreTFd.getText());
            switch(String.valueOf(municipioCBx.getSelectedItem())){
                case "Mexicali": atr.add("1"); break;
                case "Tecate": atr.add("2"); break;
                case "Tijuana": atr.add("3"); break;
                case "Rosarito": atr.add("4"); break;
                case "Ensenada": atr.add("5"); break;
            }
            atr.add(coloniaTFd.getText());
            atr.add(calleTFd.getText());
            atr.add(numeroTFd.getText());
            atr.add(capacidadTFd.getText());
            atr.add(lugarTFd.getText());
            
            if(!guardarBtn.getText().equalsIgnoreCase("Modificar")){
                    control.alta(HelperEntidad.getSede(atr));  
                }else{
                    atr.add(String.valueOf(idSedeActual));
                    control.modificacion(HelperEntidad.getSede(atr));
                }
            nombreTFd.setText("");
           coloniaTFd.setText("");
           calleTFd.setText("");
           capacidadTFd.setText("");
           numeroTFd.setText("");
           lugarTFd.setText("");
        } 
        setEnabledPanelInformacion(true);
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void sedesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sedesTblMouseClicked
        int row = sedesTbl.rowAtPoint(evt.getPoint());
        int col = sedesTbl.columnAtPoint(evt.getPoint());
        if(col == 2) {
            int op = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este registro?",
                    "Precaución", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == 0){
                int id = Integer.parseInt((String)model.getValueAt(row, 0));
                control.baja(id);
                setEnabledPanelOpcion(true);
           setEnabledPanelInformacion(false);
                buscar();
            }
        }
    }//GEN-LAST:event_sedesTblMouseClicked
    
    /**
     * nombreTFd focus
     * @param evt 
     */
    private void nombreTFdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusLost
        if(!guardarBtn.getText().equals("Modificar"))
        if(nombreTFd.getText().equals("")==false){
            buscando=true;    //VALIDAR SI EL NOMBRE DEL PLANTEL YA EXISTE
            calleTFd.setEnabled(true);
            coloniaTFd.setEnabled(true);
            numeroTFd.setEnabled(true);
            controlPlantel.buscarPorNombre(nombreTFd.getText());
            buscando=false;
       }
    }//GEN-LAST:event_nombreTFdFocusLost
    
    public void buscar(){
        if(nombreBuscarTFd.getText().equals(""))
            control.buscarTodos();
        else
            control.buscarPorNombre(nombreBuscarTFd.getText());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel agregarLbl;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel calleLbl;
    private javax.swing.JTextField calleTFd;
    private javax.swing.JLabel cantidadLbl;
    private javax.swing.JTextField capacidadTFd;
    private javax.swing.JLabel coloniaLbl;
    private javax.swing.JTextField coloniaTFd;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lugarLbl1;
    private javax.swing.JTextField lugarTFd;
    private javax.swing.JComboBox municipioCBx;
    private javax.swing.JLabel municipioLbl;
    private javax.swing.JLabel nombreBuscarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel numeroLbl;
    private javax.swing.JTextField numeroTFd;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JLabel opcionesLbl;
    private javax.swing.JTable sedesTbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
         JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public void setTabla(String[][] info) {
        model.setRowCount(0);
        if(buscando){
            if(info!=null){
                calleTFd.setText("");
                coloniaTFd.setText("");
                numeroTFd.setText("");
                calleTFd.setEnabled(true);
                coloniaTFd.setEnabled(true);
                numeroTFd.setEnabled(true);
                for(int x=0;x<info.length;x++)
                    if(nombreTFd.getText().equals(info[x][1])){
                        controlPlantel.buscar(Integer.parseInt(info[0][0]));
                        calleTFd.setEnabled(false);
                        coloniaTFd.setEnabled(false);
                        numeroTFd.setEnabled(false);
                        break;
                    }
            }
             
        }else{
               
            if( info!=null){
                
            model.setDataVector(info, titulosTabla);
            TableColumn tc = sedesTbl.getColumnModel().getColumn(2);
            tc.setCellEditor(sedesTbl.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(sedesTbl.getDefaultRenderer(Boolean.class));
            tc = sedesTbl.getColumnModel().getColumn(0);
            
            }else
                setMensaje("No se encontraron coincidencias");
        }
        
    }
    
    
    @Override
    public void setInfo(List info) {
        if(buscando){
            if(info!=null){
                nombreTFd.setText(info.get(0).toString());
                calleTFd.setText(info.get(1).toString());
                coloniaTFd.setText(info.get(2).toString());
                numeroTFd.setText(info.get(3).toString());
            }
        }else if(info==null)
            setMensaje("No se encontraron coincidencias");
        else{
            nombreTFd.setText(info.get(0).toString());
            municipioCBx.setSelectedItem(info.get(1).toString());
            coloniaTFd.setText(info.get(2).toString());
            calleTFd.setText(info.get(3).toString());
            numeroTFd.setText(info.get(4).toString());
            capacidadTFd.setText(info.get(5).toString());
            lugarTFd.setText(info.get(6).toString());
        }
    }

    

    @Override
    public void setLista(List info, int i) {}

    private void setEnabledPanelInformacion(boolean b) {
        nombreTFd.setEnabled(b);
        lugarTFd.setEnabled(b);
        municipioCBx.setEnabled(b);
        coloniaTFd.setEnabled(b);
        capacidadTFd.setEnabled(b);
        calleTFd.setEnabled(b);
        numeroTFd.setEnabled(b);
        guardarBtn.setEnabled(b);
    }
    
    private void setEnabledPanelOpcion(boolean b) {
        nombreBuscarTFd.setEnabled(b);
        sedesTbl.setEnabled(b);
        model.setRowCount(0);
    }
    
}
