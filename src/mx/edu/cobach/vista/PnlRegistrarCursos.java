/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.vista.controlador.CursoControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author liuts
 */
public class PnlRegistrarCursos extends javax.swing.JPanel implements Comunicador {

    private CursoControlador controlCursos;
    private DefaultTableModel model;
    private String[] titulosTabla = {"ID", "Nombre", "Tipo", "Eliminar"};
    private int id;
    private boolean ban = false;
    private final Border BORDER_ORIGINAL_NOMBRE, BORDER_ORIGINAL_DESCRP;
    private final Dimension DIMENSION_ORIGINAL;

    ;

    /**
     * Se crea la configuracion inicial del Panel
     */
    public PnlRegistrarCursos() {
        initComponents();
        controlCursos = new CursoControlador(this);
        model = new DefaultTableModel(titulosTabla, 4) {
            @Override
            public boolean isCellEditable(int row, int col) {
                if (col == 3) {
                    return true;
                } else {
                    return false;
                }
            }

        };
        cursosTbl.setModel(model);
        BORDER_ORIGINAL_NOMBRE = nombreTFd.getBorder();
        BORDER_ORIGINAL_DESCRP = descripcionSPn.getBorder();
        DIMENSION_ORIGINAL = nombreTFd.getPreferredSize();
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
        tipoBuscarLbl = new javax.swing.JLabel();
        cursoSPn = new javax.swing.JScrollPane();
        cursosTbl = new javax.swing.JTable();
        agregarBtn = new javax.swing.JButton();
        buscarBtn = new javax.swing.JButton();
        tipoBuscarCBx = new javax.swing.JComboBox();
        opcionLbl = new javax.swing.JLabel();
        opcionMsjLbl = new javax.swing.JLabel();
        modificarMsjLbl = new javax.swing.JLabel();
        informacionCurso_Pnl = new javax.swing.JPanel();
        tipoLbl = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        descripcionSPn = new javax.swing.JScrollPane();
        descripcionTAa = new javax.swing.JTextArea();
        nombreTFd = new javax.swing.JTextField();
        tipoCBx = new javax.swing.JComboBox();
        nombreLbl = new javax.swing.JLabel();
        descripcionLbl = new javax.swing.JLabel();
        registroLbl = new javax.swing.JLabel();
        registroMsjLbl = new javax.swing.JLabel();
        cancelarBtn = new javax.swing.JButton();
        validNombLbl = new javax.swing.JLabel();
        validDescrpLbl = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipoBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoBuscarLbl.setText("Tipo de curso:");
        opcionPnl.add(tipoBuscarLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 97, -1, -1));

        cursosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cursosTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cursosTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cursosTbl.getTableHeader().setReorderingAllowed(false);
        cursosTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursosTblMouseClicked(evt);
            }
        });
        cursoSPn.setViewportView(cursosTbl);
        if (cursosTbl.getColumnModel().getColumnCount() > 0) {
            cursosTbl.getColumnModel().getColumn(0).setResizable(false);
            cursosTbl.getColumnModel().getColumn(0).setPreferredWidth(100);
            cursosTbl.getColumnModel().getColumn(1).setResizable(false);
            cursosTbl.getColumnModel().getColumn(1).setPreferredWidth(60);
            cursosTbl.getColumnModel().getColumn(2).setResizable(false);
            cursosTbl.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        opcionPnl.add(cursoSPn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, 330));

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });
        opcionPnl.add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 145, -1, -1));

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        opcionPnl.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 145, 81, -1));

        tipoBuscarCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoBuscarCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Todos", "Conferencia", "Taller" }));
        tipoBuscarCBx.setEnabled(false);
        opcionPnl.add(tipoBuscarCBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 94, 153, -1));

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones");
        opcionPnl.add(opcionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, -1, -1));

        opcionMsjLbl.setText("<html>Seleccione el botón \"Agregar\" para habilitar la sección de registro,<br>si desea  realizar una búsqueda seleccione el botón \"Buscar\"</html>");
        opcionPnl.add(opcionMsjLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        modificarMsjLbl.setText("<html>Para Modificar seleccione un nombre de curso de la columna \"Nombre\", para<br> eliminar seleccione el cuadro de la columna Eliminar del puesto que desea</html> ");
        opcionPnl.add(modificarMsjLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 380, 80));

        tipoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoLbl.setText("Tipo de curso:");

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.setEnabled(false);
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        descripcionSPn.setFocusable(false);
        descripcionSPn.setPreferredSize(new java.awt.Dimension(250, 85));

        descripcionTAa.setColumns(20);
        descripcionTAa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionTAa.setRows(5);
        descripcionTAa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        descripcionTAa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descripcionTAa.setEnabled(false);
        descripcionTAa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descripcionTAaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descripcionTAaFocusLost(evt);
            }
        });
        descripcionSPn.setViewportView(descripcionTAa);

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreTFd.setEnabled(false);
        nombreTFd.setMinimumSize(new java.awt.Dimension(6, 29));
        nombreTFd.setName(""); // NOI18N
        nombreTFd.setPreferredSize(new java.awt.Dimension(195, 28));
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

        tipoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Conferencia ", "Taller" }));
        tipoCBx.setEnabled(false);

        nombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreLbl.setText("Nombre del Curso:");

        descripcionLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionLbl.setText("Descripción del curso:");

        registroLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registroLbl.setText("Registro");

        registroMsjLbl.setText("Ingrese la información a Almacenar");

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setEnabled(false);
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        validNombLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validNombLbl.setForeground(new java.awt.Color(213, 216, 222));
        validNombLbl.setText("Este campo es obligatorio");
        validNombLbl.setPreferredSize(new java.awt.Dimension(140, 23));
        validNombLbl.setRequestFocusEnabled(false);

        validDescrpLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        validDescrpLbl.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout informacionCurso_PnlLayout = new javax.swing.GroupLayout(informacionCurso_Pnl);
        informacionCurso_Pnl.setLayout(informacionCurso_PnlLayout);
        informacionCurso_PnlLayout.setHorizontalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionCurso_PnlLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                        .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(registroMsjLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(registroLbl, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informacionCurso_PnlLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(descripcionLbl)
                                .addComponent(nombreLbl))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(validDescrpLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descripcionSPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                                    .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(validNombLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreTFd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                    .addComponent(tipoLbl)
                                    .addGap(28, 28, 28)
                                    .addComponent(tipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(80, 80, 80))
        );
        informacionCurso_PnlLayout.setVerticalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(registroLbl)
                .addGap(13, 13, 13)
                .addComponent(registroMsjLbl)
                .addGap(85, 85, 85)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(tipoLbl)
                    .addComponent(tipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validNombLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionLbl)
                    .addComponent(descripcionSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validDescrpLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            if (nombreTFd.getText().isEmpty()
                    || descripcionLbl.getText().isEmpty()) {
                //Mensaje de Campos vacíos.
                JOptionPane.showMessageDialog(null, "Dejo Campos Vacíos");
                /*Se agregan los valores de los campos a la Lista, 
                 se mandan al metodo control.alta.*/
            } else {
                List<Object> atr = new ArrayList<>();
                atr.add(tipoCBx.getSelectedIndex() + 1);
                atr.add(nombreTFd.getText());
                atr.add(descripcionTAa.getText());
                controlCursos.alta(HelperEntidad.getCurso(atr));
            }
            /*Se ejecute el en caso de que no tenga el boton el texto "Guardar"
             /*Se agregan los valores de los campos a la Lista,se mandan 
             al metodo control.modificacion*/
        } else {
            List<Object> atr = new ArrayList<>();
            atr.add(tipoCBx.getSelectedIndex() + 1);
            atr.add(nombreTFd.getText());
            atr.add(descripcionTAa.getText());
            atr.add(id);
            controlCursos.modificacion(HelperEntidad.getCurso(atr));
        }
        /*Se selecciona por un ComboBox el Tipo de Valor que se utilizo para 
         guardar o modificar la información, para actualizar la tabla */
        if (tipoBuscarCBx.getSelectedIndex() == 0) {
            controlCursos.buscarTodos();
        } else if (tipoBuscarCBx.getSelectedIndex() != 0) {
            controlCursos.buscarTipoCurso(tipoBuscarCBx.getSelectedIndex());
        }
        nombreTFd.setText("");
        descripcionTAa.setText("");
        tipoCBx.setSelectedIndex(0);
        agregarBtn.setEnabled(true);
    }//GEN-LAST:event_guardarBtnActionPerformed

    /**
     * Evento ejecutado al seleccionar el boton, Obteniendo un tipo de busqueda
     * de un combobox, mandando llamar el metodo buscarTipoCurso o buscarTodos.
     *
     * @param evt Evento al presionar el boton
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        if (!tipoBuscarCBx.isEnabled()) {
            tipoBuscarCBx.setEnabled(true);
            opcionMsjLbl.setText("<html> Seleccione el tipo de "
                    + "curso y presione el boton buscar para <br>"
                    + " mostrar"
                    + " la coincidencia en la tabla </html>");
        } else {
            if (tipoBuscarCBx.getSelectedIndex() == 0) {
                controlCursos.buscarTodos();
            } else if (tipoBuscarCBx.getSelectedIndex() != 0) {
                controlCursos.buscarTipoCurso(tipoBuscarCBx.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

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
        tipoBuscarCBx.setEnabled(false);
        buscarBtn.setEnabled(false);
        agregarBtn.setEnabled(false);
        nombreTFd.setText("");
        descripcionTAa.setText("");
        tipoCBx.setSelectedIndex(0);
        guardarBtn.setEnabled(true);
        guardarBtn.setText("Guardar");
        registroLbl.setText("Agregar");
        registroMsjLbl.setText("Ingrese la información a Almacenar");
        nombreTFd.setEnabled(true);
        descripcionTAa.setEnabled(true);
        tipoCBx.setEnabled(true);
        guardarBtn.setEnabled(true);
        cancelarBtn.setEnabled(true);
    }//GEN-LAST:event_agregarBtnActionPerformed

    /**
     * Evento que se activa cuando se escribre sobre el campo, validando que no
     * se ingresen, delimitando el maximo de caracteres y permitir letras con
     * tilde.
     *
     * @param evt Evento al teclar sobre el campo
     */
    private void nombreTFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFdKeyTyped

        char car = evt.getKeyChar();
        if (nombreTFd.getText().length() >= 20) {
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

    private void nombreTFdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusLost
        if (nombreTFd.getText().isEmpty()) {
            nombreTFd.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL_NOMBRE));
            validNombLbl.setForeground(new Color(240, 0, 0));
            validNombLbl.setText("Este campo es obligatorio");
        } else {
            controlCursos.buscarPorNombre(nombreTFd.getText());
        }
    }//GEN-LAST:event_nombreTFdFocusLost

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        buscarBtn.setEnabled(true);
        nombreTFd.setText("");
        descripcionTAa.setText("");
        tipoCBx.setSelectedIndex(0);
        guardarBtn.setText("Guardar");
        registroLbl.setText("Agregar");
        registroMsjLbl.setText("Ingrese la información a Almacenar");
        guardarBtn.setEnabled(false);
        agregarBtn.setEnabled(true);
        nombreTFd.setEnabled(false);
        descripcionTAa.setEnabled(false);
        tipoCBx.setEnabled(false);
        guardarBtn.setEnabled(false);
        cancelarBtn.setEnabled(false);
        opcionMsjLbl.setText("<html>Seleccione el botón Agregar "
                + "para habilitar la sección de registro,<br>si desea  realizar "
                + "una búsqueda seleccione el botón Buscar</html>");
        nombreTFd.setBorder(BORDER_ORIGINAL_NOMBRE);
        descripcionSPn.setBorder(BORDER_ORIGINAL_DESCRP);
        validNombLbl.setForeground(new Color(213, 216, 222));
        validDescrpLbl.setForeground(new Color(213, 216, 222));
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void nombreTFdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusGained
        nombreTFd.setBorder(BORDER_ORIGINAL_NOMBRE);
        validNombLbl.setForeground(new Color(213, 216, 222));
    }//GEN-LAST:event_nombreTFdFocusGained

    private void descripcionTAaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionTAaFocusGained
        descripcionSPn.setBorder(BORDER_ORIGINAL_DESCRP);
        validDescrpLbl.setForeground(new Color(213, 216, 222));
    }//GEN-LAST:event_descripcionTAaFocusGained

    private void descripcionTAaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionTAaFocusLost
        if (descripcionTAa.getText().isEmpty()) {
            descripcionSPn.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL_DESCRP));
            validDescrpLbl.setText("Este campo es obligatorio");
            validDescrpLbl.setForeground(new Color(240, 0, 0));
        }
    }//GEN-LAST:event_descripcionTAaFocusLost

    /**
     * Evento ejecutado al hace click en la tabla, se calcula en que columna y
     * renglon se llevo a cabo el click, en caso de ser en la columna eliminar
     * se presentara la opcion de eliminar el registro correspondiente al
     * renglon.
     *
     * @param evt Evento al hacer click
     */
    private void cursosTblMouseClicked(java.awt.event.MouseEvent evt) {
        //Obtenelos el renglon y columna donde se hizo click
        int row = cursosTbl.rowAtPoint(evt.getPoint());
        int col = cursosTbl.columnAtPoint(evt.getPoint());
        if (col == 0) {
            //Se obtiene el id de la columna no visible para realizar una 
            //busqueda especifica.
            int id = Integer.parseInt((String) model.getValueAt(row, 0));
            controlCursos.buscar(id);
            cursosTbl.clearSelection();
            //Manda un mensaje de Confirmación sobre la eliminacion
        } else if (col == 2) {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            nombreTFd.setText("");
            descripcionTAa.setText("");
            tipoCBx.setSelectedIndex(0);
            if (op == 0) {
                //Obtenemos ID de la columna escondida
                int id = Integer.parseInt((String) model.getValueAt(row, 0));
                controlCursos.baja(id);
                controlCursos.buscarTodos();
            } else {
                cursosTbl.clearSelection();
                model.setValueAt(false, row, 3);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JScrollPane cursoSPn;
    private javax.swing.JTable cursosTbl;
    private javax.swing.JLabel descripcionLbl;
    private javax.swing.JScrollPane descripcionSPn;
    private javax.swing.JTextArea descripcionTAa;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionCurso_Pnl;
    private javax.swing.JLabel modificarMsjLbl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JLabel registroLbl;
    private javax.swing.JLabel registroMsjLbl;
    private javax.swing.JComboBox tipoBuscarCBx;
    private javax.swing.JLabel tipoBuscarLbl;
    private javax.swing.JComboBox tipoCBx;
    private javax.swing.JLabel tipoLbl;
    private javax.swing.JLabel validDescrpLbl;
    private javax.swing.JLabel validNombLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo sobrescrito de la clase comunicador mensaje de confirmación de
     * registro exitoso.
     *
     * @param mensaje String con mensaje de confirmacion de registro.
     */
    @Override
    public void setMensaje(String mensaje) {
        if (!mensaje.equals("El Nombre del Curso ya Existe")) {
            JOptionPane.showMessageDialog(this, mensaje);
        } else {
            validNombLbl.setText("Este curso ya esta registrado");
            validNombLbl.setForeground(new Color(240, 0, 0));
            nombreTFd.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(255, 106, 106)),
                    BORDER_ORIGINAL_NOMBRE));
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
        //Esconder columna ID
        TableColumn idTbc = cursosTbl.getColumnModel().getColumn(0);
        cursosTbl.getColumnModel().removeColumn(idTbc);
        cursosTbl.getColumnModel().getColumn(0).setPreferredWidth(170);
        TableColumn eliminarTbc = cursosTbl.getColumnModel().getColumn(2);
        eliminarTbc.setCellEditor(cursosTbl.getDefaultEditor(Boolean.class));
        eliminarTbc.setCellRenderer(cursosTbl.getDefaultRenderer(Boolean.class));
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
        id = (int) info.get(0);
        System.out.println(id + "info");
        nombreTFd.setText((String) info.get(1));
        descripcionTAa.setText((String) info.get(2));
        if (info.get(3).equals("conferencia")) {
            tipoCBx.setSelectedIndex(0);
        } else {
            tipoCBx.setSelectedIndex(1);
        }
        registroLbl.setText("Modificar");
        registroMsjLbl.setText("Ingrese la información a modificar");
        nombreTFd.setEnabled(true);
        descripcionTAa.setEnabled(true);
        tipoCBx.setEnabled(true);
        guardarBtn.setText("Modificar");
        guardarBtn.setEnabled(true);
        buscarBtn.setEnabled(false);
        cancelarBtn.setEnabled(true);
        agregarBtn.setEnabled(false);
        
    }
}
