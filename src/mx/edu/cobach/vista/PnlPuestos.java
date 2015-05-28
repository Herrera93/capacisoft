 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.controlador.HelperEntidad;
import mx.edu.cobach.vista.controlador.PuestoControlador;

/**
 *
 * @author liuts
 */
public class PnlPuestos extends javax.swing.JPanel implements Comunicador {

    private DefaultTableModel model;
    private String[] titulosTabla = {"ID", "Nombre", "Eliminar"};
    private PuestoControlador puestoControl;
    private int idPuesto;

    /**
     * Creates new form PnlPuestos
     */
    public PnlPuestos() {
        initComponents();
        model = new DefaultTableModel(titulosTabla, 4) {
            @Override
            public boolean isCellEditable(int row, int col) {
                if (col == 2) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        puestosTbl.setModel(model);
        puestosTbl.setColumnSelectionAllowed(false);
        puestosTbl.setDragEnabled(false);
        puestosTbl.setModel(model);
        puestoControl = new PuestoControlador(this);
        puestoControl.buscarTodos();
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
        nombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        tablaSPn = new javax.swing.JScrollPane();
        puestosTbl = new javax.swing.JTable();
        buscarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        nombreTFd = new javax.swing.JTextField();
        registroLBl = new javax.swing.JLabel();
        registroMsjLbl = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));
        setPreferredSize(new java.awt.Dimension(1181, 587));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre del puesto:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarTFd.setEnabled(false);

        puestosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        puestosTbl.setColumnSelectionAllowed(true);
        puestosTbl.setEnabled(false);
        puestosTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        puestosTbl.getTableHeader().setReorderingAllowed(false);
        puestosTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puestosTblMouseClicked(evt);
            }
        });
        tablaSPn.setViewportView(puestosTbl);
        puestosTbl.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (puestosTbl.getColumnModel().getColumnCount() > 0) {
            puestosTbl.getColumnModel().getColumn(0).setResizable(false);
            puestosTbl.getColumnModel().getColumn(1).setResizable(false);
        }

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

        jLabel1.setText("<html>Para Modificar seleccione un puesto de la columna \"Nombre\", para eliminar <br>seleccione el cuadro de la columna Eliminar del puesto que desea</html> ");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(opcionMsjLbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, opcionPnlLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregarBtn)
                                    .addComponent(opcionLbl)
                                    .addGroup(opcionPnlLayout.createSequentialGroup()
                                        .addComponent(nombreBuscarLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreBuscarLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBtn)
                    .addComponent(agregarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(726, 587));
        informacionPnl.setMinimumSize(new java.awt.Dimension(726, 587));

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre del puesto:");

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

        registroLBl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registroLBl.setText("Registro");

        registroMsjLbl.setText("Ingrese la información a almacenar, para salir o cancelar el registro presione el botón Cancelar");

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
                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registroMsjLbl)
                    .addComponent(registroLBl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addComponent(nombreLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreTFd)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(registroLBl)
                .addGap(18, 18, 18)
                .addComponent(registroMsjLbl)
                .addGap(22, 22, 22)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (nombreTFd.getText().equals("")) {
            //Mensaje de Campos vacíos.
            JOptionPane.showMessageDialog(this, "El campo esta vacio");
        } else {
            if (guardarBtn.getText().equals("Guardar")) {
                /*Se agregan los valores de los campos a la Lista, 
                 se mandan al metodo control.alta.*/
                List<String> atr = new ArrayList<String>();
                atr.add(nombreTFd.getText());
                puestoControl.alta(HelperEntidad.getPuesto(atr, "Guardar"));

            } else if (guardarBtn.getText().equals("Modificar")) {
                /*Se ejecute el en caso de que no tenga el boton el texto "Guardar"
                 /*Se agregan los valores de los campos a la Lista,se mandan 
                 al metodo control.modificacion*/
                List<String> atr = new ArrayList<String>();
                atr.add(idPuesto + "");
                atr.add(nombreTFd.getText());
                puestoControl.modificacion(HelperEntidad.getPuesto(atr, "Mod/Eli"));
            }
            nombreTFd.setEnabled(true);
            guardarBtn.setEnabled(true);
            cancelarBtn.setEnabled(true);
            nombreTFd.setText("");
            registroLBl.setText("Registro");
            guardarBtn.setText("Guardar");
            agregarBtn.setEnabled(false);
            buscarBtn.setEnabled(false);
            nombreTFd.setText("");
            puestoControl.buscarTodos();
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    /**
     * Evento ejecutado al seleccionar el boton, Obteniendo un tipo de busqueda
     * de un combobox, mandando llamar el metodo buscarTipoCurso o buscarTodos.
     *
     * @param evt Evento al presionar el boton
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        nombreTFd.setEnabled(false);
        guardarBtn.setEnabled(false);
        //Se verifica que el campo este activo para agregar datos
        if (nombreBuscarTFd.isEnabled() == false) {
            nombreBuscarTFd.setEnabled(true);
            opcionMsjLbl.setText("<html> Ingrese el Puesto a buscar"
                    + "y presione el boton Buscar para <br>"
                    + " mostrar"
                    + " la coincidencia en la tabla </html>");
            //Se verifica que el campo este vacio, de ser así se realiza una 
            //busqueda general.
        } else if (nombreBuscarTFd.getText().equals("")) {
            puestoControl.buscarTodos();
        } else {
                //Se verifico el campo y se encontraron caracteres se obtienen
            // para mandarse por un metodo de busqueda especifica.
            puestoControl.buscar(nombreBuscarTFd.getText());
            nombreBuscarTFd.setText("");
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    /**
     * Evento ejecutado al presionar el botón, habilita y limpia los campos para
     * realizar un nuevo registro, modifica el texto contenido en los labels.
     *
     * @param evt Evento al presionar el botón
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        nombreTFd.setEnabled(true);
        guardarBtn.setEnabled(true);
        cancelarBtn.setEnabled(true);
        nombreTFd.setText("");
        registroLBl.setText("Registro");
        guardarBtn.setText("Guardar");
        agregarBtn.setEnabled(false);
        buscarBtn.setEnabled(false);

    }//GEN-LAST:event_agregarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        nombreTFd.setText("");
        registroLBl.setText("Registro");
        nombreTFd.setEnabled(false);
        guardarBtn.setEnabled(false);
        cancelarBtn.setEnabled(false);
        buscarBtn.setEnabled(true);
        agregarBtn.setEnabled(true);
        nombreBuscarTFd.setEnabled(false);
        opcionMsjLbl.setText("<html>Seleccione el botón \"Agregar\" para "
                + "habilitar la sección de registro,<br>si desea  realizar "
                + "una búsqueda seleccione el botón \"Buscar\"</html>");
    }//GEN-LAST:event_cancelarBtnActionPerformed

    /**
     * Evento ejecutado al hace click en la tabla, se calcula en que columna y
     * renglon se llevo a cabo el click, en caso de ser en la columna eliminar
     * se presentara la opcion de eliminar el registro correspondiente al
     * renglon.
     *
     * @param evt Evento al hacer click
     */
    private void puestosTblMouseClicked(java.awt.event.MouseEvent evt) {
        //Obtenelos el renglon y columna donde se hizo click
        int row = puestosTbl.rowAtPoint(evt.getPoint());
        int col = puestosTbl.columnAtPoint(evt.getPoint());
        if (col == 0) {
            //Se obtiene el id de la columna no visible para realizar una 
            //busqueda especifica.
            int id = Integer.parseInt((String) model.getValueAt(row, 0));
            puestoControl.buscarMod(id);
            //Manda un mensaje de Confirmación sobre la eliminacion
        } else if (col == 1) {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (op == 0) {
                //Obtenemos ID de la columna escondida
                int id = Integer.parseInt((String) model.getValueAt(row, 0));
                puestoControl.baja(id);
                puestoControl.buscarTodos();
                model.getDataVector().removeAllElements();
                nombreBuscarTFd.setEnabled(false);
                nombreTFd.setEnabled(false);
                nombreTFd.setText("");
                guardarBtn.setEnabled(false);
            } else {
                model.setValueAt(false, row, 2);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton cancelarBtn;
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
    private javax.swing.JTable puestosTbl;
    private javax.swing.JLabel registroLBl;
    private javax.swing.JLabel registroMsjLbl;
    private javax.swing.JScrollPane tablaSPn;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo sobrescrito de la clase comunicador mensaje de confirmación de
     * registro exitoso.
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
        puestosTbl.setEnabled(true);
        model.setDataVector(info, titulosTabla);
        //Esconder columna ID
        TableColumn tc = puestosTbl.getColumnModel().getColumn(2);
        tc.setCellEditor(puestosTbl.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(puestosTbl.getDefaultRenderer(Boolean.class));
        tc = puestosTbl.getColumnModel().getColumn(0);
        puestosTbl.getColumnModel().removeColumn(tc);
        puestosTbl.getColumnModel().getColumn(0).setPreferredWidth(300);
    }

    /**
     * Metodo sobrescrito de la clase Comunicador
     *
     * @param info
     * @param i
     */
    @Override
    public void setLista(List info, int i) {
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
        nombreTFd.setText(info.get(0).toString());
        idPuesto = Integer.parseInt(info.get(1).toString());
        nombreTFd.setEnabled(true);
        guardarBtn.setEnabled(true);
        guardarBtn.setText("Modificar");
        registroLBl.setText("Modificar");
        cancelarBtn.setEnabled(true);
    }
}
