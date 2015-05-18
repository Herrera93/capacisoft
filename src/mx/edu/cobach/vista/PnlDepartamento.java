/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.vista.controlador.BaseControlador;
import mx.edu.cobach.vista.controlador.DepartamentoControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author liuts
 */
public class PnlDepartamento extends javax.swing.JPanel implements Comunicador {

    DepartamentoControlador control;
    private final DefaultTableModel model;
    private final String[] titulosTabla;
    private int id;
    private final Border BORDER_ORIGINAL;

    /**
     * Creates new form PnlDepartamento
     */
    public PnlDepartamento() {
        initComponents();
        control = new DepartamentoControlador(this, Departamento.class);
        this.titulosTabla = new String[]{"ID", "Nombre", "Direccion", "Eliminar"};
        model = new DefaultTableModel(titulosTabla, 10) {
            @Override
            public boolean isCellEditable(int row, int col) {
                if (col == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaTbl.setModel(model);
        BORDER_ORIGINAL = nombreTFd.getBorder();
        control.buscarTodos();
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
        tablaSPn = new javax.swing.JScrollPane();
        tablaTbl = new javax.swing.JTable();
        nombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        nombreTFd = new javax.swing.JTextField();
        direccionLbl = new javax.swing.JLabel();
        direccionCBx = new javax.swing.JComboBox();
        guardarBtn = new javax.swing.JButton();
        agregarMsjLbl = new javax.swing.JLabel();
        registroLbl = new javax.swing.JLabel();
        validNomLbl = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setEnabled(false);
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));

        tablaTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaTbl.setMaximumSize(new java.awt.Dimension(225, 64));
        tablaTbl.setMinimumSize(new java.awt.Dimension(225, 64));
        tablaTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTblMouseClicked(evt);
            }
        });
        tablaSPn.setViewportView(tablaTbl);
        if (tablaTbl.getColumnModel().getColumnCount() > 0) {
            tablaTbl.getColumnModel().getColumn(0).setResizable(false);
            tablaTbl.getColumnModel().getColumn(1).setResizable(false);
            tablaTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre del departamento:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarTFd.setEnabled(false);

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

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

        opcionMsjLbl.setText("<html>Seleccione el botón \"Agregar\" para habilitar la sección de registro,<br>si desea  realizar una búsqueda seleccione el botón \"Buscar\"</html>");

        jLabel1.setText("<html>Para Modificar seleccione un nombre de curso de la columna \"Nombre\"</html> ");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addComponent(tablaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(agregarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscarBtn)
                                .addGap(18, 18, 18))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcionLbl)
                                    .addGroup(opcionPnlLayout.createSequentialGroup()
                                        .addComponent(nombreBuscarLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                    .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 57, Short.MAX_VALUE))))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBuscarLbl)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBtn)
                    .addComponent(buscarBtn))
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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
        nombreTFd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreTFd.setEnabled(false);
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

        direccionLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direccionLbl.setText("Dirección:");

        direccionCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direccionCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Finanzas", "Administrativa", "Planeación", "Servicios Educativos", "General" }));
        direccionCBx.setToolTipText("Seleccioné la zona del plantel");
        direccionCBx.setEnabled(false);

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.setEnabled(false);
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        agregarMsjLbl.setText("Ingrese la información a almacenar");

        registroLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registroLbl.setText("Registro");

        validNomLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validNomLbl.setForeground(new java.awt.Color(213, 216, 222));
        validNomLbl.setText("Este campo es obligatorio");

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setEnabled(false);
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarMsjLbl)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLbl)
                            .addComponent(direccionLbl))
                        .addGap(18, 18, 18)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(direccionCBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validNomLbl)
                            .addComponent(nombreTFd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(registroLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(registroLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarMsjLbl)
                .addGap(34, 34, 34)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validNomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionLbl)
                    .addComponent(direccionCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(272, 272, 272)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (guardarBtn.getText().equals("Guardar")) {
            if (nombreTFd.getText().equals("")) {
                //Mensaje de Campos vacíos.
                JOptionPane.showMessageDialog(null, "Dejo Campos Vacíos");
            } else {
                List<Object> atr = new ArrayList<>();
                atr.add(direccionCBx.getSelectedIndex() + 1);
                atr.add(nombreTFd.getText());
                control.alta(HelperEntidad.getDepartamento(atr));
            }
        } else {
            /*Se ejecute el en caso de que no tenga el boton el texto "Guardar"
             /*Se agregan los valores de los campos a la Lista,se mandan 
             al metodo control.modificacion*/
            List<Object> atr = new ArrayList<>();
            atr.add(direccionCBx.getSelectedIndex() + 1);
            atr.add(nombreTFd.getText());
            atr.add(id);
            control.modificacion(HelperEntidad.getDepartamento(atr));
        }
        nombreTFd.setText("");
        direccionCBx.setSelectedIndex(0);
        control.buscarTodos();
    }//GEN-LAST:event_guardarBtnActionPerformed

    /**
     * Evento ejecutado al seleccionar el boton, Obteniendo un tipo de busqueda
     * de un combobox, mandando llamar el metodo buscarTipoCurso o buscarTodos.
     *
     * @param evt Evento al presionar el boton
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if (!nombreBuscarTFd.isEnabled()) {
            nombreBuscarTFd.setEnabled(true);
            opcionMsjLbl.setText("<html> Ingrese el departamento a buscar"
                    + "y presione el boton Buscar para <br>"
                    + " mostrar"
                    + " la coincidencia en la tabla </html>");
        } else {
            //Se valida que no exista información en los campos antes de realizar la busqueda.        
            if (nombreBuscarTFd.getText().equals("")) {
                control.buscarTodos();
            } else {
                control.buscarPorNombre(nombreBuscarTFd.getText(), 1);
            }
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
    private void tablaTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTblMouseClicked
        //Obtenelos el renglon y columna donde se hizo click
        int row = tablaTbl.rowAtPoint(evt.getPoint());
        int col = tablaTbl.columnAtPoint(evt.getPoint());
        if (col == 0) {
            //Se obtiene el id de la columna no visible para realizar una 
            //busqueda especifica.
            int id = Integer.parseInt((String) model.getValueAt(row, 0));
            control.buscar(id);
            tablaTbl.clearSelection();
            //Manda un mensaje de Confirmación sobre la eliminacion
        } else if (col == 2) {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (op == 0) {
                
                //Obtenemos ID de la columna escondida
                int id = Integer.parseInt((String) model.getValueAt(row, 0));
                control.baja(id);
                nombreTFd.setText("");
                direccionCBx.setSelectedIndex(0);
                control.buscarTodos();
            } else {
                model.setValueAt(false, row, 3);
                tablaTbl.clearSelection();
            }
        }
    }//GEN-LAST:event_tablaTblMouseClicked

    /**
     * Evento ejecutado al presionar el botón, habilita y limpia los campos para
     * realizar un nuevo registro, modifica el texto contenido en los labels.
     *
     * @param evt Evento al presionar el botón
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        opcionMsjLbl.setText("<html>Seleccione el botón \"Agregar\" para habilitar "
                + "la sección de registro,<br>si desea  realizar una búsqueda "
                + "seleccione el botón \"Buscar\"</html>");
        nombreBuscarTFd.setEnabled(false);
        nombreBuscarTFd.setText("");
        buscarBtn.setEnabled(false);
        agregarBtn.setEnabled(false);
        nombreTFd.setText("");
        direccionCBx.setSelectedIndex(0);
        guardarBtn.setEnabled(true);
        guardarBtn.setText("Guardar");
        registroLbl.setText("Agregar");
        agregarMsjLbl.setText("Ingrese la información a Almacenar");
        nombreTFd.setEnabled(true);
        direccionCBx.setEnabled(true);
        guardarBtn.setEnabled(true);
        cancelarBtn.setEnabled(true);
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void nombreTFdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusLost
        if (nombreTFd.getText().isEmpty()) {
            nombreTFd.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL));
            validNomLbl.setText("Esta campo es obligatorio");
            validNomLbl.setForeground(new Color(255, 0, 0));
        } else {
            control.buscarPorNombre(nombreTFd.getText(), 2);
        }
    }//GEN-LAST:event_nombreTFdFocusLost

    private void nombreTFdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusGained
        nombreTFd.setBorder(BORDER_ORIGINAL);
        validNomLbl.setForeground(new Color(213, 216, 222));
    }//GEN-LAST:event_nombreTFdFocusGained

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        nombreTFd.setText("");
        nombreTFd.setBorder(BORDER_ORIGINAL);
        validNomLbl.setForeground(new Color(213, 216, 222));
        nombreTFd.setEnabled(false);
        direccionCBx.setEnabled(false);
        cancelarBtn.setEnabled(false);
        agregarBtn.setEnabled(true);
        guardarBtn.setEnabled(false);
        buscarBtn.setEnabled(true);
        guardarBtn.setText("Guardar");
    }//GEN-LAST:event_cancelarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JComboBox direccionCBx;
    private javax.swing.JLabel direccionLbl;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombreBuscarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JLabel registroLbl;
    private javax.swing.JScrollPane tablaSPn;
    private javax.swing.JTable tablaTbl;
    private javax.swing.JLabel validNomLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo sobrescrito de la clase comunicador mensaje de confirmación de
     * registro exitoso.
     *
     * @param mensaje String con mensaje de confirmacion de registro.
     */
    @Override
    public void setMensaje(String mensaje) {
        if (!mensaje.equals("Este puesto ya esta registrado")) {
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
        model.setDataVector(info, titulosTabla);
        TableColumn tc = tablaTbl.getColumnModel().getColumn(3);
        tc.setCellEditor(tablaTbl.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tablaTbl.getDefaultRenderer(Boolean.class));
        //Esconder columna ID
        tc = tablaTbl.getColumnModel().getColumn(0);
        tablaTbl.getColumnModel().removeColumn(tc);
        tablaTbl.getColumnModel().getColumn(0).setPreferredWidth(210);
        tablaTbl.getColumnModel().getColumn(1).setPreferredWidth(140);

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
        direccionCBx.setSelectedItem(info.get(2));
        nombreTFd.setEnabled(true);
        direccionCBx.setEnabled(true);
        guardarBtn.setEnabled(true);
        registroLbl.setText("Modificar");
        agregarMsjLbl.setText("Ingrese la información a modificar");
        guardarBtn.setText("Modificar");
        cancelarBtn.setEnabled(true);
    }

    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
