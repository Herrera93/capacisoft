 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.dto.DataTable;
import mx.edu.cobach.vista.controlador.DataHelper;
import mx.edu.cobach.vista.controlador.PuestoControlador;

/**
 *
 * @author Fernando
 */
public class PnlPuestos extends javax.swing.JPanel implements Comunicador {

    private final DefaultTableModel model;
    private String[] titulosTabla = {"ID", "Nombre", "Eliminar"};
    private final PuestoControlador control;
    private int idPuesto;
    private final Border BORDER_ORIGINAL;
    private boolean almacenando = false;
    private boolean problema = false;
    private boolean buscando = false;

    /**
     * Constructor del PnlPuesto e instancia la clase PuestoControlador. Se crea
     * modelo de la tabla y se realiza la busqueda
     */
    public PnlPuestos() {
        initComponents();
        model = new DefaultTableModel(titulosTabla, 10) {
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
        control = new PuestoControlador(this);

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
        nombreBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        tablaMsjLbl = new javax.swing.JLabel();
        puestosSPn = new javax.swing.JScrollPane();
        puestosTbl = new javax.swing.JTable();
        informacionPnl = new javax.swing.JPanel();
        nombreLbl = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        nombreTFd = new javax.swing.JTextField();
        registroLBl = new javax.swing.JLabel();
        registroMsjLbl = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JButton();
        validNomLbl = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1181, 587));
        setMinimumSize(new java.awt.Dimension(1181, 587));
        setPreferredSize(new java.awt.Dimension(1181, 587));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setPreferredSize(new java.awt.Dimension(408, 587));

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre del puesto:");

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

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

        opcionMsjLbl.setText("<html>Seleccione el botón \"Agregar\" para habilitar la sección de registro,<br>si desea  realizar una búsqueda seleccione el botón \"Buscar\"</html>");

        tablaMsjLbl.setText("<html>Para Modificar seleccione un nombre del puesto de la columna<br> \"Nombre\", para eliminar selecciona el cuadro eliminar de la columna Eliminar del usuario que desee</html> ");

        puestosTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        puestosTbl.setMaximumSize(new java.awt.Dimension(225, 64));
        puestosTbl.setMinimumSize(new java.awt.Dimension(225, 64));
        puestosTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puestosTblMouseClicked(evt);
            }
        });
        puestosSPn.setViewportView(puestosTbl);

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(opcionMsjLbl)
                                .addGap(11, 11, 11))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(nombreBuscarLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(opcionLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(agregarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(puestosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreBuscarLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBtn)
                    .addComponent(agregarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaMsjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(puestosSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setMaximumSize(new java.awt.Dimension(726, 587));
        informacionPnl.setMinimumSize(new java.awt.Dimension(726, 587));

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre del puesto:");

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        registroLBl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registroLBl.setText("Registro");

        registroMsjLbl.setText("Ingrese la información a almacenar, para salir o cancelar el registro presione el botón Cancelar");

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        validNomLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validNomLbl.setForeground(new java.awt.Color(213, 216, 222));
        validNomLbl.setText("Este campo es obligatorio");

        javax.swing.GroupLayout informacionPnlLayout = new javax.swing.GroupLayout(informacionPnl);
        informacionPnl.setLayout(informacionPnlLayout);
        informacionPnlLayout.setHorizontalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registroMsjLbl)
                    .addComponent(registroLBl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(informacionPnlLayout.createSequentialGroup()
                        .addComponent(nombreLbl)
                        .addGap(18, 18, 18)
                        .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validNomLbl)
                            .addComponent(nombreTFd, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        informacionPnlLayout.setVerticalGroup(
            informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(registroLBl)
                .addGap(11, 11, 11)
                .addComponent(registroMsjLbl)
                .addGap(18, 18, 18)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validNomLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        almacenando = true;
        if (nombreTFd.getText().equals("")) {
            //Mensaje de Campos vacíos.
            JOptionPane.showMessageDialog(this, "El campo esta vacio");
        } else {
            buscando = true;
            problema = false;
            control.buscarTodos();
            if (!problema) {
                if (guardarBtn.getText().equals("Guardar")) {
                    /*Se agregan los valores de los campos a la Lista, 
                     se mandan al metodo control.alta.*/
                    List<String> atr = new ArrayList<String>();
                    atr.add(nombreTFd.getText());
                    control.alta("puesto", DataHelper.getPuesto(atr));
                } else if (guardarBtn.getText().equals("Modificar")) {
                    /*Se ejecute el en caso de que no tenga el boton el texto "Guardar"
                     /*Se agregan los valores de los campos a la Lista,se mandan 
                     al metodo control.modificacion*/
                    List<String> atr = new ArrayList<String>();
                    
                    atr.add(nombreTFd.getText());
                    HashMap<String, Object> condicion = new HashMap<>();
                    condicion.put("id", idPuesto);

                    DataTable dtPuesto = DataHelper.getPuesto(atr);

                    //Quitar la columna de id
                    dtPuesto = dtPuesto.removerColumnas(new String[]{"id"});

                    control.modificacion("puesto", dtPuesto, condicion);
                }
                limpiar();
                control.buscarTodos();
            }
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
        //Se verifica que el campo este vacio, de ser así se realiza una 
        //busqueda general.
        if (!nombreBuscarTFd.getText().equals("")) {
            HashMap<String, Object> condiciones = new HashMap<>();
            condiciones.put("nombre LIKE", "%" + nombreBuscarTFd.getText() + "%");

            control.buscarPor("puesto", condiciones);
        } else {
            control.buscarTodos("puesto");
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

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
        System.out.println(puestosTbl.getRowCount());
    }//GEN-LAST:event_agregarBtnActionPerformed

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
            validNomLbl.setText("Este campo es obligatorio");
            validNomLbl.setForeground(new Color(255, 0, 0));
        } else if (problema) {
            nombreTFd.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL));
            validNomLbl.setText("El nombre del puesto ya existe");
            validNomLbl.setForeground(new Color(255, 0, 0));
        }
    }//GEN-LAST:event_nombreTFdFocusLost

    /**
     * Evento ejecutado al hace click en la tabla, se calcula en que columna y
     * renglon se llevo a cabo el click, en caso de ser en la columna eliminar
     * se presentara la opcion de eliminar el registro correspondiente al
     * renglon.
     *
     * @param evt Evento al hacer click
     */
    private void puestosTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puestosTblMouseClicked
        int row = puestosTbl.rowAtPoint(evt.getPoint());
        int col = puestosTbl.columnAtPoint(evt.getPoint());
        if (col == 0) {
            if (informacionPnl.isVisible()) {
                if (JOptionPane.showConfirmDialog(this, "La información que"
                        + " esta modificando se perdera ¿Aun así desea cancelarla?",
                        "Precaucion", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE) == 0) {
                    int id = Integer.parseInt((String) model.getValueAt(row, 0));
                    limpiar();
                    control.buscar("puesto", "id", id);
                    this.idPuesto = id;
                    guardarBtn.setText("Modificar");
                    puestosTbl.clearSelection();
                    informacionPnl.setVisible(true);
                }
            } else {
                int id = Integer.parseInt((String) model.getValueAt(row, 0));
                limpiar();
                control.buscar("puesto", "id", id);
                this.idPuesto = id;
                guardarBtn.setText("Modificar");
                puestosTbl.clearSelection();
                informacionPnl.setVisible(true);
            }
        } else if (col == 1) {
            int id = Integer.parseInt((String) model.getValueAt(row, 0));
            if (control.buscarEmpleados(id)) {
                setMensaje("No se puede eliminar un puesto que contenga empleados");
                model.setValueAt(false, row, 2);
                puestosTbl.clearSelection();
            } else if (guardarBtn.getText().equals("Modificar") && idPuesto == id) {
                JOptionPane.showMessageDialog(this, "No se puede eliminar el puesto que esta"
                        + " modificando actualmente.", "Precaución", JOptionPane.ERROR_MESSAGE);
                model.setValueAt(false, row, 2);
                puestosTbl.clearSelection();
            } else if (JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este registro?",
                    "Precaución", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
                HashMap<String, Object> condiciones = new HashMap<>();
                condiciones.put("id", id);
                control.baja("puesto", condiciones);
                control.buscarTodos();
            } else {
                model.setValueAt(false, row, 2);
                puestosTbl.clearSelection();
            }
        }
    }//GEN-LAST:event_puestosTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JLabel nombreBuscarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JScrollPane puestosSPn;
    private javax.swing.JTable puestosTbl;
    private javax.swing.JLabel registroLBl;
    private javax.swing.JLabel registroMsjLbl;
    private javax.swing.JLabel tablaMsjLbl;
    private javax.swing.JLabel validNomLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que limpa los campos y realiza la busqueda general de los puestos
     */
    public void llenarTodo() {
        nombreBuscarTFd.setText("");
        limpiar();
        control.buscarTodos();
    }

    /**
     * Metódo que se utiliza para limpiar el campo del panel direccionPnl, deja
     * la configuración inicial del panel mencionado anteriormente.
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
        if (buscando) {
            buscando = false;
            if (info != null) {
                for (int x = 0; x < info.length; x++) {
                    if (info[x][1].equals(nombreTFd.getText())) {
                        if (almacenando) {
                            setMensaje("Ya existe un puesto con ese nombre.\n"
                                    + info[x][1]);
                        }
                        problema = true;
                        break;
                    }
                }
            }
        } else if (info == null) {
            model.setRowCount(0);
            setMensaje("No se encontraron coincidencias");
        } else {
            model.setRowCount(0);
            model.setDataVector(info, titulosTabla);
            TableColumn tc = puestosTbl.getColumnModel().getColumn(2);
            tc.setCellEditor(puestosTbl.getDefaultEditor(Boolean.class));
            tc.setCellRenderer(puestosTbl.getDefaultRenderer(Boolean.class));
            tc = puestosTbl.getColumnModel().getColumn(0);
            puestosTbl.getColumnModel().removeColumn(tc);
            puestosTbl.getColumnModel().getColumn(0).setPreferredWidth(300);
        }
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
        nombreTFd.setText(info.get(1).toString());
        idPuesto = Integer.parseInt(info.get(0).toString());
        guardarBtn.setText("Modificar");
    }

    /**
     * Metodo sobrescrito de la clase comunicador que recibe un objeto con la
     * los resultados de una busqueda especifica, que no tiene ninguna
     * funcionalidad en este componente.
     *
     * @param evento Objecto de la entidad de tipo evento
     */
    @Override
    public void llenarDatos(Object implementacionEvento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
