/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.vista.controlador.DepartamentoControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author Fernando
 */
public class PnlDepartamento extends javax.swing.JPanel implements Comunicador {

    private final DepartamentoControlador control;
    private final DefaultTableModel model;
    private final String[] titulosTabla;
    private int id;
    private final Border BORDER_ORIGINAL;
    private boolean almacenando = false;
    private boolean problema = false;
    private boolean buscando = false;

    /**
     * Constructor, se instancia la clase DepartamentoControolador. Se crea
     * modelo de la tabla y se realiza la busqueda
     */
    public PnlDepartamento() {
        initComponents();
        control = new DepartamentoControlador(this, Departamento.class);
        this.titulosTabla = new String[]{"ID", "Nombre", "Eliminar"};
        model = new DefaultTableModel(titulosTabla, 10) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return col == 2;
            }
        };
        departamentoTbl.setModel(model);
        departamentoTbl.setColumnSelectionAllowed(false);
        departamentoTbl.setDragEnabled(false);
        BORDER_ORIGINAL = nombreTFd.getBorder();
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
        departamentoSPn = new javax.swing.JScrollPane();
        departamentoTbl = new javax.swing.JTable();
        nombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        opcionTltLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        tablaMsjLbl = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        nombreTFd = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        registroMsjLbl = new javax.swing.JLabel();
        registroLbl = new javax.swing.JLabel();
        validNomLbl = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setPreferredSize(new java.awt.Dimension(408, 566));

        departamentoTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Dirección", "Eliminar"
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
        departamentoTbl.setMaximumSize(new java.awt.Dimension(225, 64));
        departamentoTbl.setMinimumSize(new java.awt.Dimension(225, 64));
        departamentoTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departamentoTblMouseClicked(evt);
            }
        });
        departamentoSPn.setViewportView(departamentoTbl);
        if (departamentoTbl.getColumnModel().getColumnCount() > 0) {
            departamentoTbl.getColumnModel().getColumn(0).setResizable(false);
            departamentoTbl.getColumnModel().getColumn(1).setResizable(false);
            departamentoTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre del departamento:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        opcionTltLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionTltLbl.setText("Opciones ");

        opcionMsjLbl.setText("<html>Seleccione el botón \"Agregar\" para habilitar la sección de registro,<br>si desea  realizar una búsqueda seleccione el botón \"Buscar\"</html>");

        tablaMsjLbl.setText("<html>Para Modificar seleccione un número del usuario de la columna<br> \"Numero\", para eliminar selecciona el cuadro eliminar de la columna Eliminar del usuario que desee</html> ");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departamentoSPn, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(opcionPnlLayout.createSequentialGroup()
                                        .addComponent(agregarBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(opcionPnlLayout.createSequentialGroup()
                                        .addComponent(nombreBuscarLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(opcionPnlLayout.createSequentialGroup()
                                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(opcionTltLbl)
                                            .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addComponent(tablaMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opcionTltLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBuscarLbl)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBtn)
                    .addComponent(buscarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departamentoSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setEnabled(false);
        informacionPnl.setFocusCycleRoot(true);
        informacionPnl.setMaximumSize(new java.awt.Dimension(767, 587));
        informacionPnl.setMinimumSize(new java.awt.Dimension(767, 587));
        informacionPnl.setPreferredSize(new java.awt.Dimension(767, 587));

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre del departamento:");

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombreTFd.setPreferredSize(new java.awt.Dimension(167, 23));
        nombreTFd.setVerifyInputWhenFocusTarget(false);
        nombreTFd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreTFdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTFdFocusLost(evt);
            }
        });
        nombreTFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTFdKeyTyped(evt);
            }
        });

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        registroMsjLbl.setText("Ingrese la información a almacenar, para salir o cancelar el registro presione el botón Cancelar");

        registroLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registroLbl.setText("Registro");

        validNomLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validNomLbl.setForeground(new java.awt.Color(213, 216, 222));
        validNomLbl.setText("Este campo es obligatorio");

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addComponent(nombreLbl)
                        .addGap(18, 18, 18)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validNomLbl)
                            .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(registroMsjLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registroLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(registroLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registroMsjLbl)
                .addGap(18, 18, 18)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validNomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
            .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento ejecutado al hacer click en el boton,obteniendo el texto de los
     * campos validando que estos no esten vacios, manda llamar un metodo
     * dependiendo del texto asignado al boton.
     *
     * @param evt Evento al presionar el boton
     */
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        almacenando = true;
        if (nombreTFd.getText().equals("")) {
                //Mensaje de Campos vacíos.
                setMensaje("Dejo campos vacíos");
        } else {
            List<Object> atr = new ArrayList<>();
            atr.add(nombreTFd.getText());
            buscando = true;
            problema = false;
            control.buscarTodos();
            if(!problema){
                if(guardarBtn.getText().equals("Guardar")){
                    control.alta(HelperEntidad.getDepartamento(atr));
                }else{
                    atr.add(id);
                    control.modificacion(HelperEntidad.getDepartamento(atr));
                }
            }
            limpiar();
            control.buscarTodos();            
        }
        almacenando = false;
    }//GEN-LAST:event_guardarBtnActionPerformed

    /**
     * Evento ejecutado al seleccionar el boton, Obteniendo un tipo de busqueda
     * de un combobox, mandando llamar el metodo buscarTipoCurso o buscarTodos.
     *
     * @param evt Evento al presionar el boton
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if (!nombreBuscarTFd.getText().equals("")) {
            control.buscarPorNombre(nombreBuscarTFd.getText(), 1);
        } else {
            control.buscarTodos();
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    /**
     * Evento ejecutado al hace click en la tabla, se calcula en que columna y
     * renglon se llevo a cabo el click, en caso de ser en la columna eliminar
     * se presentara la opcion de eliminar el registro correspondiente al
     * renglon.
     *
     * @param evt Evento al hacer click
     */
    private void departamentoTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departamentoTblMouseClicked
        //Obtenelos el renglon y columna donde se hizo click
        int row = departamentoTbl.rowAtPoint(evt.getPoint());
        int col = departamentoTbl.columnAtPoint(evt.getPoint());
        if (col == 0) {
            if (informacionPnl.isVisible()) {
                if (JOptionPane.showConfirmDialog(this, "La información que"
                        + " esta modificando se perdera ¿Aun así desea cancelarla?",
                        "Precaucion", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE) == 0) {
                    //Se obtiene el id de la columna no visible para realizar una 
                    //busqueda especifica.
                    int id = Integer.parseInt((String) model.getValueAt(row, 0));
                    limpiar();
                    control.buscar(id);
                    guardarBtn.setText("Modificar");
                    departamentoTbl.clearSelection();
                    informacionPnl.setVisible(true);
                }
            } else {
                int id = Integer.parseInt((String) model.getValueAt(row, 0));
                limpiar();
                control.buscar(id);
                guardarBtn.setText("Modificar");
                departamentoTbl.clearSelection();
                informacionPnl.setVisible(true);
            }
            //Manda un mensaje de Confirmación sobre la eliminacion
        } else if (col == 1) {
            int id = Integer.parseInt((String)model.getValueAt(row, 0));
            if(control.buscarEmpleados(id)){
                setMensaje("No se puede eliminar un departamento que contenga empleados");
                model.setValueAt(false, row, 2);
                departamentoTbl.clearSelection();
            }else if(guardarBtn.getText().equals("Modificar") && this.id == id){
                JOptionPane.showMessageDialog(this, "No se puede eliminar el usuario que esta"
                    + " modificando actualmente.","Precaución", JOptionPane.ERROR_MESSAGE);
                model.setValueAt(false, row, 2);
                departamentoTbl.clearSelection();
            } else if (JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este registro?",
                    "Precaución", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                //Obtenemos ID de la columna escondida
                control.baja(id);
                control.buscarTodos();
            } else {
                model.setValueAt(false, row, 2);
                departamentoTbl.clearSelection();
            }
        }
    }//GEN-LAST:event_departamentoTblMouseClicked

    /**
     * Evento ejecutado al presionar el botón, habilita y limpia los campos para
     * realizar un nuevo registro, modifica el texto contenido en los labels.
     *
     * @param evt Evento al presionar el botón
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        if (informacionPnl.isVisible()) {
            if (JOptionPane.showConfirmDialog(this, "La información que"
                    + " esta modificando se perdera,¿Aun así desea cancelarla?",
                    "Precaucion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE) == 0) {
                limpiar();
                informacionPnl.setVisible(true);
                guardarBtn.setText("Guardar");
            }
        } else {
            limpiar();
            guardarBtn.setText("Guardar");
            informacionPnl.setVisible(true);
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    /**
     * Evento ejecutado al perder un campo el foco, donde manda cambiar el borde
     * de color a rojo y colocando un mensaje para indicando que el campo es
     * obligatorio
     *
     * @param evt Evento al perder foco
     */
    private void nombreTFdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusLost
        buscando = true;
        problema = false;
        control.buscarTodos();
        if (nombreTFd.getText().isEmpty()) {
            nombreTFd.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL));
            validNomLbl.setText("Esta campo es obligatorio");
            validNomLbl.setForeground(new Color(255, 0, 0));
        }else if(problema){
            nombreTFd.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL));
            validNomLbl.setText("El nombre del departamento ya existe");
            validNomLbl.setForeground(new Color(255, 0, 0));
        }
    }//GEN-LAST:event_nombreTFdFocusLost

    /**
     * Evento ejecutado al ganar un campo el foco, donde manda cambiar el borde
     * a la configuracion inicial.
     *
     * @param evt Evento al perder foco
     */
    private void nombreTFdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusGained
        nombreTFd.setBorder(BORDER_ORIGINAL);
        validNomLbl.setForeground(new Color(213, 216, 222));
    }//GEN-LAST:event_nombreTFdFocusGained

    /**
     * Evento ejecutado cuando se presiona el botón ejecutar, mandando el
     * mensaje de confirmacion para cancelar el registro o modificación. Se
     * manda a llamar el metódo Limpiar.
     *
     * @param evt Evento al presionar el botón
     */
    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        if (JOptionPane.showConfirmDialog(this, "La información que"
                + " esta modificando se perdera,¿Aun así desea cancelarla?",
                "Precaucion", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE) == 0) {
            limpiar();
        }
    }//GEN-LAST:event_cancelarBtnActionPerformed

    /**
     * Evento ejecutado cuando se escribe sobre un campo, validando que no se
     * permita el ingreso del número. Limitando el número de caracteres a $5.
     *
     * @param evt Evento al presionar el botón
     */
    private void nombreTFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFdKeyTyped
        char car = evt.getKeyChar();
        if (nombreTFd.getText().length() >= 45) {
            evt.consume();
        }
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á' //Minúsculas             
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á' //Mayúsculas             
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && car != 'ñ'
                && car != 'Ñ'
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreTFdKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JScrollPane departamentoSPn;
    private javax.swing.JTable departamentoTbl;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JLabel nombreBuscarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JLabel opcionTltLbl;
    private javax.swing.JLabel registroLbl;
    private javax.swing.JLabel registroMsjLbl;
    private javax.swing.JLabel tablaMsjLbl;
    private javax.swing.JLabel validNomLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metódo que se utiliza para realizar una búsqueda general de los
     * departamentos registrados en la base de datos.
     */
    public void llenarTodo() {
        nombreBuscarTFd.setText("");
        limpiar();
        control.buscarTodos();
    }

    /**
     * Metódo que se utiliza para limpiar el campo del panel departamentoPnl,
     * deja la configuración inicial del panel mencionado anteriormente.
     */
    private void limpiar() {
        nombreTFd.setText("");
        nombreTFd.setBorder(BORDER_ORIGINAL);
        validNomLbl.setForeground(new Color(213, 216, 222));
        guardarBtn.setText("Guardar");
        informacionPnl.setVisible(false);
    }

    /**
     * Metodo sobrescrito de la clase comunicador mensaje de confirmación de
     * registro exitoso.
     *
     * @param mensaje String con mensaje de confirmacion de registro.
     */
    @Override
    public void setMensaje(String mensaje) {
        if (!mensaje.equals("Este departamento ya esta registrado")) {
            JOptionPane.showMessageDialog(this, mensaje,
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            nombreTFd.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL));
            validNomLbl.setText(mensaje);
            validNomLbl.setForeground(new Color(240, 0, 20));
        }
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
        if(buscando){
            buscando = false;
             for(int x=0;x<info.length;x++){
                 if(guardarBtn.getText().equals("Modificar") &&
                        info[x][0].equals(String.valueOf(id))){
                        continue;
                    }
                if(info[x][1].equals(nombreTFd.getText())){
                    if(almacenando){
                        setMensaje("Ya existe un departamento con ese nombre.\n"
                            + info[x][1]);
                    }
                    problema = true;
                    break;
                }
             }
        }else if(info == null){
            model.setRowCount(0);
            setMensaje("No se encontraron coincidencias");
        }else{
            model.setRowCount(0);
            model.setDataVector(info, titulosTabla);
            TableColumn tc = departamentoTbl.getColumnModel().getColumn(2);
            tc.setCellEditor(departamentoTbl.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(departamentoTbl.getDefaultRenderer(Boolean.class));
            //Esconder columna ID
            tc = departamentoTbl.getColumnModel().getColumn(0);
            departamentoTbl.getColumnModel().removeColumn(tc);
            departamentoTbl.getColumnModel().getColumn(0).setPreferredWidth(210);
            departamentoTbl.getColumnModel().getColumn(1).setPreferredWidth(140);
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
    public void setInfo(List info) {
        id = (int) info.get(0);
        System.out.println(id + "info");
        nombreTFd.setText((String) info.get(1));
    }

    /**
     * Metodo sobrescrito de la clase comunicador que recibe una Lista con la
     * los resultados de una busqueda especifica, que no tiene ninguna
     * funcionalidad en este componente.
     *
     * @param info Lista de Objeto con información de búsqueda.
     * @param i Número entero para indicar el tipo de objeto que esta regresando
     */
    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo sobrescrito de la clase comunicador que recibe un objeto con la
     * los resultados de una busqueda especifica, que no tiene ninguna
     * funcionalidad en este componente.
     *
     * @param evento Objecto de la entidad de tipo evento
     */
    @Override
    public void llenarDatos(Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
