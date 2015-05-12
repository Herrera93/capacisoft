package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.vista.controlador.HelperEntidad;
import mx.edu.cobach.vista.controlador.UsuarioControlador;

public class PnlUsuarios extends javax.swing.JPanel implements Comunicador{

    private final DefaultTableModel model;
    private final String[] titulosTabla;
    private final UsuarioControlador control;
    private int idUsuarioActual;
    
    public PnlUsuarios() {
        initComponents();
        titulosTabla= new String[]{"Numero","Usuario","Nombre", "Eliminar"};
        model = new DefaultTableModel(titulosTabla, 4);
        usuariosTbl.setModel(model);
        usuariosTbl.setColumnSelectionAllowed(false);
        usuariosTbl.setDragEnabled(false);
        control = new UsuarioControlador(this,Usuario.class);
        nombreBuscarTFd.setEnabled(true);
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
        usuariosTbl = new javax.swing.JTable();
        nombreUsuario_OU_Lbl = new javax.swing.JLabel();
        nombreUsuario_OU_TFd = new javax.swing.JTextField();
        buscar_OU_Btn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        nombreBuscarLbl = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        informacionPnl = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        nombreTFd = new javax.swing.JTextField();
        usuarioLbl = new javax.swing.JLabel();
        usuarioTFd = new javax.swing.JTextField();
        contrasenaLbl = new javax.swing.JLabel();
        tipoLbl = new javax.swing.JLabel();
        tipoCBx = new javax.swing.JComboBox();
        guardarBtn = new javax.swing.JButton();
        agregarMsjLbl = new javax.swing.JLabel();
        agregarLbl = new javax.swing.JLabel();
        segundoNombreTFd = new javax.swing.JTextField();
        segundoNombreLbl = new javax.swing.JLabel();
        apellidoPaternoTFd = new javax.swing.JTextField();
        apellidoPaternoLbl = new javax.swing.JLabel();
        apellidoMaternoTFd = new javax.swing.JTextField();
        apellidoMaternoLbl = new javax.swing.JLabel();
        confirmarContrasenaLbl = new javax.swing.JLabel();
        contrasenaPFd = new javax.swing.JPasswordField();
        confirmarContrasenaPFd = new javax.swing.JPasswordField();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));
        setPreferredSize(new java.awt.Dimension(1181, 587));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setPreferredSize(new java.awt.Dimension(408, 587));

        usuariosTbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuariosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Empleado", "Eliminar"
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
        usuariosTbl.setMaximumSize(new java.awt.Dimension(225, 64));
        usuariosTbl.setMinimumSize(new java.awt.Dimension(225, 64));
        usuariosTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usuariosTbl);
        if (usuariosTbl.getColumnModel().getColumnCount() > 0) {
            usuariosTbl.getColumnModel().getColumn(0).setResizable(false);
            usuariosTbl.getColumnModel().getColumn(1).setResizable(false);
            usuariosTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        nombreUsuario_OU_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreUsuario_OU_Lbl.setText("Nombre de usuario:");

        nombreUsuario_OU_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreUsuario_OU_TFd.setEnabled(false);

        buscar_OU_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscar_OU_Btn.setText("Buscar");

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

        opcionMsjLbl.setText("Ingrese el nombre para buscar la información especifica");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarTFd.setEnabled(false);

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre del Empleado:");

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionLbl)
                    .addComponent(opcionMsjLbl)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(agregarBtn)
                                .addGap(146, 146, 146)
                                .addComponent(buscarBtn))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(nombreBuscarLbl)
                                .addGap(18, 18, 18)
                                .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(nombreUsuario_OU_Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombreUsuario_OU_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscar_OU_Btn)
                                .addGap(21, 21, 21)))))
                .addContainerGap())
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(opcionLbl)
                .addGap(18, 18, 18)
                .addComponent(opcionMsjLbl)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreUsuario_OU_Lbl)
                            .addComponent(nombreUsuario_OU_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarBtn)
                            .addComponent(buscar_OU_Btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreBuscarLbl)
                            .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(767, 339));
        informacionPnl.setMinimumSize(new java.awt.Dimension(767, 339));

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre del Empleado:");

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.setEnabled(false);

        usuarioLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioLbl.setText("Nombre de usuario:");

        usuarioTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioTFd.setEnabled(false);

        contrasenaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contrasenaLbl.setText("Contraseña:");

        tipoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoLbl.setText("Tipo de cuenta:");

        tipoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Analista", "Secretaria" }));
        tipoCBx.setToolTipText("Seleccioné el tipo de usuario");
        tipoCBx.setEnabled(false);

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.setEnabled(false);
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        agregarMsjLbl.setText("Ingrese la información a almacenar");

        agregarLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLbl.setText("Agregar");

        segundoNombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        segundoNombreTFd.setEnabled(false);

        segundoNombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        segundoNombreLbl.setText("Segundo nombre:");

        apellidoPaternoTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellidoPaternoTFd.setEnabled(false);

        apellidoPaternoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellidoPaternoLbl.setText("Apellido paterno:");

        apellidoMaternoTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellidoMaternoTFd.setEnabled(false);

        apellidoMaternoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellidoMaternoLbl.setText("Apellido materno:");

        confirmarContrasenaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmarContrasenaLbl.setText("Confirmar Contraseña:");

        contrasenaPFd.setEnabled(false);

        confirmarContrasenaPFd.setEnabled(false);

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoLbl)
                            .addGroup(informacionPnlLayout.createSequentialGroup()
                                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreLbl)
                                    .addComponent(apellidoPaternoLbl))
                                .addGap(18, 18, 18)
                                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellidoPaternoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tipoCBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregarMsjLbl)
                            .addComponent(agregarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmarContrasenaLbl)
                            .addComponent(contrasenaLbl)
                            .addComponent(usuarioLbl)
                            .addComponent(apellidoMaternoLbl)
                            .addComponent(segundoNombreLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmarContrasenaPFd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(segundoNombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(apellidoMaternoTFd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(usuarioTFd)
                                    .addComponent(contrasenaPFd))))
                        .addGap(3, 3, 3)))
                .addGap(19, 19, 19))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(agregarLbl)
                .addGap(18, 18, 18)
                .addComponent(agregarMsjLbl)
                .addGap(28, 28, 28)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoNombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoNombreLbl))
                .addGap(18, 18, 18)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoPaternoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoPaternoLbl)
                    .addComponent(apellidoMaternoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoMaternoLbl))
                .addGap(40, 40, 40)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLbl))
                .addGap(18, 18, 18)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLbl)
                    .addComponent(tipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenaLbl)
                    .addComponent(contrasenaPFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmarContrasenaLbl)
                    .addComponent(confirmarContrasenaPFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(informacionPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        int renglon = usuariosTbl.getSelectedRow();
        if(renglon == -1) {
            guardarBtn.setText("Guardar");
        }else{
             int id = Integer.parseInt((String)model.getValueAt(renglon, 0));
            idUsuarioActual=id;
             control.buscar(id); 
            
            guardarBtn.setText("Modificar");
        }
        
        setEnabledPanelInformacion(true);
                                        
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if(nombreBuscarTFd.getText().equals("")==false)
            control.buscarPorNombre(nombreBuscarTFd.getText());        // TODO add your handling code here:
        else
            control.buscarTodos();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        
        if(nombreTFd.getText().equals("") ||
           segundoNombreTFd.getText().equals("")|| 
           apellidoPaternoTFd.getText().equals("")||
           apellidoMaternoTFd.getText().equals("")||
           usuarioTFd.getText().equals("")||
           tipoCBx.getSelectedItem().equals("")||
           contrasenaPFd.getText().equals("")||
           confirmarContrasenaPFd.getText().equals("") ) 
            setMensaje("Debe ingresar los datos solicitados");
        else 
            if( contrasenaPFd.getText().equals(confirmarContrasenaPFd.getText()) ){
                List<String> atr = new ArrayList<String>();
                atr.add(nombreTFd.getText()); //# En lista 0
                atr.add(segundoNombreTFd.getText());//# En lista 1
                atr.add(apellidoPaternoTFd.getText());//# En lista 2
                atr.add(apellidoMaternoTFd.getText());//# En lista 3
                atr.add(usuarioTFd.getText());//# En lista 4
                switch(String.valueOf(tipoCBx.getSelectedItem())){
                    case "Administrador": atr.add("1"); break;
                    case "Analista": atr.add("2"); break;
                    case "Secretaria": atr.add("3"); break;
                }
                atr.add(contrasenaPFd.getText());//# En lista 6
                if(!guardarBtn.getText().equalsIgnoreCase("Modificar")){
                    control.alta(HelperEntidad.getUsuario(atr));  
                }else{
                    atr.add(String.valueOf(idUsuarioActual));
                    control.modificacion(HelperEntidad.getUsuario(atr));
                }
        
                nombreTFd.setText("");
                segundoNombreTFd.setText("");
                apellidoPaternoTFd.setText("");
                apellidoMaternoTFd.setText("");
                usuarioTFd.setText("");
                contrasenaPFd.setText("");
                confirmarContrasenaPFd.setText("");
                guardarBtn.setText("Guardar");
            }else
                setMensaje("Usuario o Contraseña incorrectas");
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void usuariosTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosTblMouseClicked
        int row = usuariosTbl.rowAtPoint(evt.getPoint());
        int col = usuariosTbl.columnAtPoint(evt.getPoint());
        if(col == 3) {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == 0){
                int id = Integer.parseInt((String)model.getValueAt(row, 0));
                control.baja(id);
                control.buscarPorNombre(nombreBuscarTFd.getText());
            }
        }
    }//GEN-LAST:event_usuariosTblMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel agregarLbl;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JLabel apellidoMaternoLbl;
    private javax.swing.JTextField apellidoMaternoTFd;
    private javax.swing.JLabel apellidoPaternoLbl;
    private javax.swing.JTextField apellidoPaternoTFd;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton buscar_OU_Btn;
    private javax.swing.JLabel confirmarContrasenaLbl;
    private javax.swing.JPasswordField confirmarContrasenaPFd;
    private javax.swing.JLabel contrasenaLbl;
    private javax.swing.JPasswordField contrasenaPFd;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreBuscarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel nombreUsuario_OU_Lbl;
    private javax.swing.JTextField nombreUsuario_OU_TFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JLabel segundoNombreLbl;
    private javax.swing.JTextField segundoNombreTFd;
    private javax.swing.JComboBox tipoCBx;
    private javax.swing.JLabel tipoLbl;
    private javax.swing.JLabel usuarioLbl;
    private javax.swing.JTextField usuarioTFd;
    private javax.swing.JTable usuariosTbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
         JOptionPane.showMessageDialog(this, mensaje);
    }

    @Override
    public void setTabla(String[][] info) {
        if(info==null)
            setMensaje("No se encontraron coincidencias");
        else{
            model.setDataVector(info, titulosTabla);
            TableColumn tc = usuariosTbl.getColumnModel().getColumn(3);
            tc.setCellEditor(usuariosTbl.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(usuariosTbl.getDefaultRenderer(Boolean.class));
            tc = usuariosTbl.getColumnModel().getColumn(0);
        }
    }

    @Override
    public void setInfo(List info) {
        if(info==null)
            setMensaje("No se encontraron coincidencias");
        else{
            nombreTFd.setText(info.get(0).toString());
            segundoNombreTFd.setText(info.get(1).toString());
            apellidoPaternoTFd.setText(info.get(2).toString());
            apellidoMaternoTFd.setText(info.get(3).toString());
            usuarioTFd.setText(info.get(4).toString());
            tipoCBx.setSelectedItem(info.get(5).toString());
            contrasenaPFd.setText(info.get(6).toString());
            confirmarContrasenaPFd.setText(info.get(6).toString());
        }
    }

    @Override
    public void setLista(List info, int i) {
    }
    
    public void setEnabledPanelInformacion(boolean b){
        nombreTFd.setEnabled(b);
        apellidoPaternoTFd.setEnabled(b);
        segundoNombreTFd.setEnabled(b);
        apellidoMaternoTFd.setEnabled(b);
        usuarioTFd.setEnabled(b);
        tipoCBx.setEnabled(b);
        contrasenaPFd.setEnabled(b);
        confirmarContrasenaPFd.setEnabled(b);
        guardarBtn.setEnabled(b);
    }
}
