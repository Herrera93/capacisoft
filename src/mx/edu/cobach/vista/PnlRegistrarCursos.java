/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Curso;
import mx.edu.cobach.vista.controlador.CursoControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author liuts
 */
public class PnlRegistrarCursos extends javax.swing.JPanel implements Comunicador{
    
    private CursoControlador control;
    private DefaultTableModel model;
    private String[] titulosTabla = {"ID","Nombre","Tipo","Eliminar"};
    private int id;

    /**
     * Se crea la configuracion inicial del Panel
     */
    public PnlRegistrarCursos() {
        initComponents();
        control = new CursoControlador(this, Curso.class);
        model = new DefaultTableModel(titulosTabla, 4);
        cursosTbl.setModel(model);
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
        informacionCurso_Pnl = new javax.swing.JPanel();
        tipoLbl = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        descripcionSPn = new javax.swing.JScrollPane();
        descripcionTAa = new javax.swing.JTextArea();
        nombreTFd = new javax.swing.JTextField();
        tipoCBx = new javax.swing.JComboBox();
        nombreLbl = new javax.swing.JLabel();
        descripcionLbl = new javax.swing.JLabel();
        agregarLbl = new javax.swing.JLabel();
        agregarMsjLbl = new javax.swing.JLabel();

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipoBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoBuscarLbl.setText("Tipo de curso:");

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
                false, false, false
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

        tipoBuscarCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoBuscarCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Todos", "Conferencia", "Taller" }));

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones");

        opcionMsjLbl.setText("Seleccione un tipo de curso para realizar una busqueda especifica");

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionMsjLbl)
                            .addComponent(opcionLbl)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(tipoBuscarLbl)
                                .addGap(32, 32, 32)
                                .addComponent(tipoBuscarCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cursoSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(agregarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionMsjLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoBuscarLbl)
                    .addComponent(tipoBuscarCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarBtn)
                    .addComponent(agregarBtn))
                .addGap(27, 27, 27)
                .addComponent(cursoSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        informacionCurso_Pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        descripcionTAa.setColumns(20);
        descripcionTAa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionTAa.setRows(5);
        descripcionTAa.setEnabled(false);
        descripcionTAa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionTAaKeyTyped(evt);
            }
        });
        descripcionSPn.setViewportView(descripcionTAa);

        nombreTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTFd.setEnabled(false);
        nombreTFd.addFocusListener(new java.awt.event.FocusAdapter() {
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

        agregarLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLbl.setText("Agregar");

        agregarMsjLbl.setText("Ingrese la información a Almacenar");

        javax.swing.GroupLayout informacionCurso_PnlLayout = new javax.swing.GroupLayout(informacionCurso_Pnl);
        informacionCurso_Pnl.setLayout(informacionCurso_PnlLayout);
        informacionCurso_PnlLayout.setHorizontalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionCurso_PnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregarMsjLbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarLbl, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informacionCurso_PnlLayout.createSequentialGroup()
                        .addComponent(descripcionLbl)
                        .addGap(39, 39, 39)
                        .addComponent(descripcionSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informacionCurso_PnlLayout.createSequentialGroup()
                        .addComponent(nombreLbl)
                        .addGap(28, 28, 28)
                        .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(tipoLbl)
                        .addGap(28, 28, 28)
                        .addComponent(tipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        informacionCurso_PnlLayout.setVerticalGroup(
            informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionCurso_PnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(agregarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarMsjLbl)
                .addGap(85, 85, 85)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLbl)
                    .addComponent(nombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLbl)
                    .addComponent(tipoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(informacionCurso_PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionLbl)
                    .addComponent(descripcionSPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacionCurso_Pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento ejecutado al hacer click en el boton,obteniendo el texto de los 
     * campos validando que estos no esten vacios, manda llamar un metodo 
     * dependiendo del texto asignado al boton.
     * @param evt Evento al presionar el boton 
     */
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        if(guardarBtn.getText().equals("Guardar")){     
            if(nombreTFd.getText().isEmpty() || 
                    descripcionLbl.getText().isEmpty()){
                //Mensaje de Campos vacíos.
                JOptionPane.showMessageDialog(null, "Dejo Campos Vacíos");
            /*Se agregan los valores de los campos a la Lista, 
            se mandan al metodo control.alta.*/
            }else{
            List<Object> atr =  new ArrayList<>();
            atr.add(tipoCBx.getSelectedIndex()+1);
            atr.add(nombreTFd.getText());
            atr.add(descripcionTAa.getText());
            control.alta(HelperEntidad.getCurso(atr));
            }
            /*Se ejecute el en caso de que no tenga el boton el texto "Guardar"
            /*Se agregan los valores de los campos a la Lista,se mandan 
            al metodo control.modificacion*/
        }else{
            List<Object> atr =  new ArrayList<>();
            atr.add(tipoCBx.getSelectedIndex()+1);
            atr.add(nombreTFd.getText());
            atr.add(descripcionTAa.getText());
            atr.add(id);
            control.modificacion(HelperEntidad.getCurso(atr));
        }
        /*Se selecciona por un ComboBox el Tipo de Valor que se utilizo para 
        guardar o modificar la información, para actualizar la tabla */
        if(tipoBuscarCBx.getSelectedIndex()== 0){
            control.buscarTodos();
        }else if(tipoBuscarCBx.getSelectedIndex() != 0){
            control.buscarTipoCurso(tipoBuscarCBx.getSelectedIndex());
        }
            nombreTFd.setText("");
            descripcionTAa.setText("");
            tipoCBx.setSelectedIndex(0);
    }//GEN-LAST:event_guardarBtnActionPerformed

    /**
     * Evento ejecutado al seleccionar el boton, Obteniendo un tipo de busqueda
     * de un combobox, mandando llamar el metodo buscarTipoCurso o buscarTodos.
     * @param evt Evento al presionar el boton
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        //Se valida que no exista información en los campos antes de realizar la busqueda.
        if(nombreTFd.getText().isEmpty() || descripcionTAa.getText().
                isEmpty()){
            if(tipoBuscarCBx.getSelectedIndex()== 0){
                control.buscarTodos();
            }else if(tipoBuscarCBx.getSelectedIndex() != 0){
                control.buscarTipoCurso(tipoBuscarCBx.getSelectedIndex());
            }
        //Se manda el mensaje que existe información en los campos
        }else{
            int op = JOptionPane.showConfirmDialog(this, "Tienes Informacion en "
                    + "los campos deseas continuar?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.
                            WARNING_MESSAGE);
            if(op == 0){
                nombreTFd.setText("");
                descripcionTAa.setText("");
                tipoCBx.setSelectedIndex(0);
                
                if(tipoBuscarCBx.getSelectedIndex()== 0){
                    control.buscarTodos();
                }else if(tipoBuscarCBx.getSelectedIndex() != 0){
                    control.buscarTipoCurso(tipoBuscarCBx.getSelectedIndex());
                }
            }
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    /**
     * Evento ejecutado al presionar el botón, habilita y limpia los campos para 
     * realizar un nuevo registro, modifica el texto contenido en los labels.
     * @param evt Evento al presionar el botón
     */
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        nombreTFd.setText("");
        descripcionTAa.setText("");
        tipoCBx.setSelectedIndex(0);
        guardarBtn.setEnabled(true);
        guardarBtn.setText("Guardar");
        agregarLbl.setText("Agregar");
        agregarMsjLbl.setText("Ingrese la información a Almacenar");
        nombreTFd.setEnabled(true);
        descripcionTAa.setEnabled(true);
        tipoCBx.setEnabled(true);
        guardarBtn.setEnabled(true);
    }//GEN-LAST:event_agregarBtnActionPerformed

    /**
     * Evento que se activa cuando se escribre sobre el campo, validando
     * que no se ingresen, delimitando el maximo de caracteres y permitir 
     * letras con tilde.
     * @param evt Evento al teclar sobre el campo
     */
    private void nombreTFdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFdKeyTyped
       
       char car = evt.getKeyChar();
       if(nombreTFd.getText().length()>=20) evt.consume();
       if((car<'a' || car>'z') && (car<'A' || car>'Z')             
            && car !='á' //Minúsculas             
            && car !='é'            
            && car !='í'            
            && car !='ó'           
            && car !='ú'   
            && car !='Á' //Mayúsculas             
            && car !='É'            
            && car !='Í'            
            && car !='Ó'           
            && car !='Ú'
            && car !='ñ'           
            && car !='Ñ'
            && (car!=(char)KeyEvent.VK_SPACE))
        {      
          evt.consume();   
        }
    }//GEN-LAST:event_nombreTFdKeyTyped

    /**
     * Evento que se activa cuando se escribre sobre el campo, validando
     * que no se ingresen, delimitando el maximo de caracteres y permitir 
     * letras con tilde.
     * @param evt Evento al teclar sobre el campo
     */
    private void descripcionTAaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionTAaKeyTyped
       char car = evt.getKeyChar();
       if(descripcionTAa.getText().length()>=20) evt.consume();
       if((car<'a' || car>'z') && (car<'A' || car>'Z')             
            && car !='á' //Minúsculas             
            && car !='é'            
            && car !='í'            
            && car !='ó'           
            && car !='ú'   
            && car !='Á' //Mayúsculas             
            && car !='É'            
            && car !='Í'            
            && car !='Ó'           
            && car !='Ú'
            && car !='ñ'           
            && car !='Ñ'
            && (car!=(char)KeyEvent.VK_SPACE))
        {      
          evt.consume();   
        }
    }//GEN-LAST:event_descripcionTAaKeyTyped

    private void nombreTFdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFdFocusLost
        JOptionPane.showMessageDialog(this, "dfsadfsdfsdf");
    }//GEN-LAST:event_nombreTFdFocusLost

    /**
     * Evento ejecutado al hace click en la tabla, se calcula en que columna y 
     * renglon se llevo a cabo el click, en caso de ser en la columna eliminar
     * se presentara la opcion de eliminar el registro correspondiente al
     * renglon.
     * @param evt Evento al hacer click
     */
    private void cursosTblMouseClicked(java.awt.event.MouseEvent evt) {                                       
        //Obtenelos el renglon y columna donde se hizo click
        int row = cursosTbl.rowAtPoint(evt.getPoint());
        int col = cursosTbl.columnAtPoint(evt.getPoint());
        if(col == 0){
            //Se obtiene el id de la columna no visible para realizar una 
            //busqueda especifica.
            int id = Integer.parseInt((String)model.getValueAt(row, 0));
            control.buscar(id);
        //Manda un mensaje de Confirmación sobre la eliminacion
        }else if(col == 2) {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == 0){
                //Obtenemos ID de la columna escondida
                int id = Integer.parseInt((String)model.getValueAt(row, 0));
                control.baja(id);
                control.buscarTodos();
            }else{
                model.setValueAt(false, row, 3);
            }
        }
    }                                     

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel agregarLbl;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JScrollPane cursoSPn;
    private javax.swing.JTable cursosTbl;
    private javax.swing.JLabel descripcionLbl;
    private javax.swing.JScrollPane descripcionSPn;
    private javax.swing.JTextArea descripcionTAa;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacionCurso_Pnl;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JTextField nombreTFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JComboBox tipoBuscarCBx;
    private javax.swing.JLabel tipoBuscarLbl;
    private javax.swing.JComboBox tipoCBx;
    private javax.swing.JLabel tipoLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo sobrescrito de la clase comunicador mensaje de confirmación de 
     * registro exitoso.
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
        eliminarTbc.setCellRenderer (cursosTbl.getDefaultRenderer(Boolean.class));
    }

    /**
     * Metodo sobrescrito de la clase Comunicador
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
     * @param info Lista de Objeto con información de búsqueda.
     */
    @Override
    public void setInfo(List info) {
        id = (int) info.get(0);
        System.out.println(id + "info");
        nombreTFd.setText((String) info.get(1));
        descripcionTAa.setText((String) info.get(2));
        if(info.get(3).equals("conferencia")){
            tipoCBx.setSelectedIndex(0);
        }else{
            tipoCBx.setSelectedIndex(1);
        }
        agregarLbl.setText("Modificar");
        agregarMsjLbl.setText("Ingrese la información a modificar");
        nombreTFd.setEnabled(true);
        descripcionTAa.setEnabled(true);
        tipoCBx.setEnabled(true);
        guardarBtn.setText("Modificar");
        guardarBtn.setEnabled(true);
    }
}
