/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Evento;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.vista.controlador.EncuestaControlador;

/**
 * Vista del seguimiento, que contiene dos paneles para la seleccion de eventos
 * uno para el disenar encuetsa y otro para mostrar los resultados. Ademas se
 * cuenta con con los paneles para mostrar los resultados y los que permiten
 * el diseno (seleccion de empleados y aspectos).
 */
public class PnlSeguimiento extends javax.swing.JPanel implements Comunicador{

    //Controlador para la interaccion con las capas bajas
    private final EncuestaControlador control;
    //Modelo de la tabla de eventos a mostrar
    private final DefaultTableModel eventosTblModel;
    //Modelo del combo box donde se asignan los eventos
    private final DefaultComboBoxModel eventosCBxModel;
    //Titulo de tabla eventos
    private final String[] titulosTabla = {"ID", "FechaInicial", "Nombre del evento",
        "Estado", "Seleccion"};
    //Panel donde se muestran los empleados
    private PnlEncuestaResultado resultadoPnl;
    //Panel para agregar aspectos
    private PnlAgregarAspectos agregarAspectosPnl;
    //Panel para agregar empleados
    private PnlAgregarEmpleados agregarEmpleadosPnl;
    //Indice para detectar el tab actual
    private int tabIndice;
    
    /**
     * Se construye el panel, iniciando los componentes y se le da la configuracion
     * inicial a las tablas y  sus modelos.
     */
    public PnlSeguimiento() {
        initComponents();
        agregar();
        control = new EncuestaControlador(this);
        
        eventosTblModel = new DefaultTableModel(titulosTabla, 0) {
            private boolean bandera = false;
            
            //Se hace solo editable la columna 4
            @Override
            public boolean isCellEditable(int renglon, int columna){
                return columna == 4;
            }
            
            //Permite solo la seleccion de un checkbox por tabla
            @Override
            public void setValueAt(Object valor, int renglon, int columna){
                if(columna == 4){
                    if(!bandera){
                        bandera = true;
                        Boolean bol = (Boolean) valor;
                        super.setValueAt(valor, renglon, columna);
                        if(bol){
                            for(int i = 0; i < this.getRowCount(); i++){
                                if(i != renglon){
                                    super.setValueAt(!bol, i, columna);
                                }
                            }
                        }
                        bandera = false;
                    }
                }else{
                    super.setValueAt(valor, renglon, columna);
                }
            }
        };
        
        //Se asignan modelos
        eventosTbl.setModel(eventosTblModel);
        eventosResultadoTbl.setModel(eventosTblModel);
        
        eventosCBxModel = new DefaultComboBoxModel();
        eventoCBx.setModel(eventosCBxModel);
        eventoResultadoCBx.setModel(eventosCBxModel);
        
        //Se esconde la columna de la tabla correspondiente al ID
        TableColumn tc = eventosTbl.getColumnModel().getColumn(0);
        eventosTbl.getColumnModel().removeColumn(tc);
        tc = eventosResultadoTbl.getColumnModel().getColumn(0);
        eventosResultadoTbl.getColumnModel().removeColumn(tc);
        
        tabIndice = 0;
    }

    /**
     * En este metodos agregamos y configuramos lo paneles de Realizar Encuesta y
     * de Resultados. Este metodo se ejecuta al llamar el constructor.
     */
    private void agregar(){
        resultadoPnl = new PnlEncuestaResultado();
        
        resultadoPnl.setLocation(408,0);
        resultadoPnl.setSize(773,589);
        resultadoPnl.setVisible(false);
        add(resultadoPnl);
        
        agregarAspectosPnl = new PnlAgregarAspectos();
        agregarAspectosPnl.setLocation(408,0);
        agregarAspectosPnl.setSize(773,589);
        agregarAspectosPnl.setVisible(true);
        add(agregarAspectosPnl);
        
        agregarEmpleadosPnl = new PnlAgregarEmpleados();
        agregarEmpleadosPnl.setLocation(408,0);
        agregarEmpleadosPnl.setSize(773,589);
        agregarEmpleadosPnl.setVisible(false);
        add(agregarEmpleadosPnl);
        
        resultadoPnl = new PnlEncuestaResultado();
        resultadoPnl.setLocation(408,0);
        resultadoPnl.setSize(773,589);
        resultadoPnl.setVisible(false);
        add(resultadoPnl);
        
        /*
        Este metodo nos permite esconder el panel de empleados al esconderse el 
        el panel de aspectos
        */
        agregarAspectosPnl.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentShown(ComponentEvent e){                
            }
            
            @Override
            public void componentHidden(ComponentEvent e){
                agregarEmpleadosPnl.setVisible(true);
            }
        });
        
        /*
        Este metodo nos permite esconder el panel de aspectos al esconderse el 
        el panel de empleados
        */
        agregarEmpleadosPnl.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentShown(ComponentEvent e){                
            }
            
            @Override
            public void componentHidden(ComponentEvent e){
                agregarAspectosPnl.setVisible(true);
            }
        });
    }
    
    /**
    * Este metodo es utilizado para llenar las listas con la informacion de la 
    * base de datos. Se ejecuta antes de entrar al panel para que una vez que se
    * entre se mostrara todos los datos correspondientes.
    */
    public void llenarTodo(){
        control.setClass(Evento.class);
        control.buscarTodosLista(1);
        agregarAspectosPnl.llenarTodo();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seguimientoTpnl = new javax.swing.JTabbedPane();
        realizarEncuestaPnl = new javax.swing.JPanel();
        disenarEncuestaTltLbl = new javax.swing.JLabel();
        disenarEncuestaInsLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eventoCBx = new javax.swing.JComboBox();
        deFechaDCh = new com.toedter.calendar.JDateChooser();
        deFechaLbl = new javax.swing.JLabel();
        aFechaDCh = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        buscarBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        eventosTbl = new javax.swing.JTable();
        resultadoEncuestaPnl = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        eventosResultadoTbl = new javax.swing.JTable();
        disenarEncuestaInsLbl1 = new javax.swing.JLabel();
        disenarEncuestaTltLbl1 = new javax.swing.JLabel();
        eventoLbl = new javax.swing.JLabel();
        eventoResultadoCBx = new javax.swing.JComboBox();
        deFechaLbl1 = new javax.swing.JLabel();
        deFechaResultadoDCh = new com.toedter.calendar.JDateChooser();
        aFechaResultadoDCh = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        buscarResultadoBtn = new javax.swing.JButton();
        resultadosBtn = new javax.swing.JButton();

        seguimientoTpnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        realizarEncuestaPnl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                realizarEncuestaPnlComponentShown(evt);
            }
        });

        disenarEncuestaTltLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disenarEncuestaTltLbl.setText("<html>Selecci&oacute;n de evento</html>");

        disenarEncuestaInsLbl.setText("<html>Seleccionar el evento asociado con la encuesta a realizar y<br> la fecha en la que este se llevar&aacute; a cabo. Se mostraran<br>los eventos que aun no tengan encuestas asignadas.</html>");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setLabelFor(eventoCBx);
        jLabel1.setText("Evento:");

        eventoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        deFechaDCh.setDateFormatString("dd/MM/yyyy");
        deFechaDCh.setFocusable(false);
        deFechaDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                deFechaDChPropertyChange(evt);
            }
        });

        deFechaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deFechaLbl.setText("De:");

        aFechaDCh.setDateFormatString("dd/MM/yyyy");
        aFechaDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                aFechaDChPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("A:");

        buscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        eventosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fecha Inicial", "Nombre del curso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventosTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(eventosTbl);
        if (eventosTbl.getColumnModel().getColumnCount() > 0) {
            eventosTbl.getColumnModel().getColumn(0).setResizable(false);
            eventosTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout realizarEncuestaPnlLayout = new javax.swing.GroupLayout(realizarEncuestaPnl);
        realizarEncuestaPnl.setLayout(realizarEncuestaPnlLayout);
        realizarEncuestaPnlLayout.setHorizontalGroup(
            realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buscarBtn)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, realizarEncuestaPnlLayout.createSequentialGroup()
                        .addComponent(deFechaLbl)
                        .addGap(18, 18, 18)
                        .addComponent(deFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(aFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(disenarEncuestaInsLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disenarEncuestaTltLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, realizarEncuestaPnlLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(eventoCBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        realizarEncuestaPnlLayout.setVerticalGroup(
            realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(disenarEncuestaTltLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(disenarEncuestaInsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eventoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(deFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deFechaLbl))
                .addGap(18, 18, 18)
                .addComponent(buscarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        seguimientoTpnl.addTab("<html>Dise&ntilde;ar encuesta</html>", realizarEncuestaPnl);

        resultadoEncuestaPnl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                resultadoEncuestaPnlComponentShown(evt);
            }
        });

        eventosResultadoTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha Inicial", "Nombre del curso", "Sede", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventosResultadoTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventosResultadoTblMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(eventosResultadoTbl);
        if (eventosResultadoTbl.getColumnModel().getColumnCount() > 0) {
            eventosResultadoTbl.getColumnModel().getColumn(0).setResizable(false);
            eventosResultadoTbl.getColumnModel().getColumn(1).setResizable(false);
            eventosResultadoTbl.getColumnModel().getColumn(2).setResizable(false);
            eventosResultadoTbl.getColumnModel().getColumn(2).setHeaderValue("Sede");
            eventosResultadoTbl.getColumnModel().getColumn(3).setResizable(false);
            eventosResultadoTbl.getColumnModel().getColumn(3).setHeaderValue("Estado");
        }

        disenarEncuestaInsLbl1.setText("<html>Seleccionar el evento asociado con la encuesta y<br> la fecha en la que este se llevar&aacute; o llevo a cabo. Seleccionar el<br>evento para mostrar los empleados en la siguiente secci&oacute;n.</html>");

        disenarEncuestaTltLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disenarEncuestaTltLbl1.setText("<html>Selecci&oacute;n de evento</html>");

        eventoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoLbl.setLabelFor(eventoCBx);
        eventoLbl.setText("Evento:");

        eventoResultadoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        deFechaLbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deFechaLbl1.setText("De:");

        deFechaResultadoDCh.setDateFormatString("dd/MM/yyyy");
        deFechaResultadoDCh.setFocusable(false);
        deFechaResultadoDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                deFechaResultadoDChPropertyChange(evt);
            }
        });

        aFechaResultadoDCh.setDateFormatString("dd/MM/yyyy");
        aFechaResultadoDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                aFechaResultadoDChPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("A:");

        buscarResultadoBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarResultadoBtn.setText("Buscar");
        buscarResultadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarResultadoBtnActionPerformed(evt);
            }
        });

        resultadosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultadosBtn.setText("Obtener Resultados");
        resultadosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultadoEncuestaPnlLayout = new javax.swing.GroupLayout(resultadoEncuestaPnl);
        resultadoEncuestaPnl.setLayout(resultadoEncuestaPnlLayout);
        resultadoEncuestaPnlLayout.setHorizontalGroup(
            resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                        .addComponent(resultadosBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarResultadoBtn))
                    .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                            .addComponent(deFechaLbl1)
                            .addGap(18, 18, 18)
                            .addComponent(deFechaResultadoDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)
                            .addGap(8, 8, 8)
                            .addComponent(aFechaResultadoDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(disenarEncuestaInsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(disenarEncuestaTltLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                            .addComponent(eventoLbl)
                            .addGap(18, 18, 18)
                            .addComponent(eventoResultadoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultadoEncuestaPnlLayout.setVerticalGroup(
            resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(disenarEncuestaTltLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(disenarEncuestaInsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventoLbl)
                    .addComponent(eventoResultadoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(deFechaResultadoDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aFechaResultadoDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deFechaLbl1))
                .addGap(18, 18, 18)
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarResultadoBtn)
                    .addComponent(resultadosBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        seguimientoTpnl.addTab("Resultados", resultadoEncuestaPnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(seguimientoTpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 720, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seguimientoTpnl)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que se ejecuta al mostrarse el panel de tab diseno de encuesta, en este
     * metodo se remueve el panel de resultados y anadimos los de empleados y
     * aspectos. Esto se hace para evitar el problema de sobreposicion de paneles.
     * @param evt Evento de componente
     */
    private void realizarEncuestaPnlComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_realizarEncuestaPnlComponentShown
        agregarAspectosPnl.setVisible(true);
        add(agregarAspectosPnl);
        add(agregarEmpleadosPnl);
        resultadoPnl.setVisible(false);
        remove(resultadoPnl);
        tabIndice = 0;
        eventosTblModel.setDataVector(new String[0][4], titulosTabla);
    }//GEN-LAST:event_realizarEncuestaPnlComponentShown

    /**
     * Metodo que se ejecuta al mostrarse el panel de tab resultados de encuesta, en este
     * metodo se remueven los paneles de empleados y aspectos y anadimos el de resultado
     * aspectos. Esto se hace para evitar el problema de sobreposicion de paneles.
     * @param evt Evento de componente
     */
    private void resultadoEncuestaPnlComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_resultadoEncuestaPnlComponentShown
        resultadoPnl.setVisible(true);
        add(resultadoPnl);
        agregarAspectosPnl.setVisible(false);
        agregarEmpleadosPnl.setVisible(false);
        remove(agregarAspectosPnl);
        remove(agregarEmpleadosPnl);
        tabIndice = 1;
        eventosTblModel.setDataVector(new String[0][4], titulosTabla);
    }//GEN-LAST:event_resultadoEncuestaPnlComponentShown

    /**
     * Metodo que se ejecuta al hacer click el boton buscar. Se toma el elemento
     * del combo box y las fechas y se busca con estas. Si no se han seleccionado
     * las fechas ni un evento se mostrara un mensaje de error, solo se necesita el
     * ingreso de un elemento para hacer la busqueda. 
     * @param evt Evento de hacer click
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        Object evento = eventoCBx.getSelectedItem();
        Date de = deFechaDCh.getDate();
        Date hasta = aFechaDCh.getDate();
        if(eventoCBx.getSelectedIndex() == 0 && de == null && hasta == null)
            setMensaje("No se ha ingresado una manera de buscar la implementacion");
        else
            control.buscarImplementacion(evento, de, hasta);
        
    }//GEN-LAST:event_buscarBtnActionPerformed

    /**
     * Metodo que se ejecuta al cambiar la fecha del componente deFechaDCh. Se ajusta
     * la fecha minima del componente aFechaDCh y se ajusta si esta ya es menor que
     * la actual.
     * @param evt Evento de cambio de propiedad
     */
    private void deFechaDChPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_deFechaDChPropertyChange
        Date deFecha = deFechaDCh.getDate();
        if(deFecha != null){
            aFechaDCh.setMinSelectableDate(deFecha);
            if(aFechaDCh.getDate() != null && aFechaDCh.getDate().before(deFecha))
                aFechaDCh.setDate(deFecha);
        }
    }//GEN-LAST:event_deFechaDChPropertyChange

    /**
     * Metodo que se ejecuta al cambiar la fecha del componente aFechaDCh. Se ajusta
     * la fecha maxima del componente deFechaDCh y se ajusta si esta ya es mayor que
     * la actual.
     * @param evt Evento de cambio de propiedad
     */
    private void aFechaDChPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_aFechaDChPropertyChange
        Date aFecha = aFechaDCh.getDate();
        if(aFecha != null){
            deFechaDCh.setMaxSelectableDate(aFecha);
            if(deFechaDCh.getDate() != null && deFechaDCh.getDate().after(aFecha))
                deFechaDCh.setDate(aFecha);
        }
    }//GEN-LAST:event_aFechaDChPropertyChange

    /**
     * Metodo que se ejecuta al cambiar la fecha del componente deFechaResultadoDCh. Se ajusta
     * la fecha minima del componente aFechaResultadoDCh y se ajusta si esta ya es menor que
     * la actual.
     * @param evt Evento de cambio de propiedad
     */
    private void deFechaResultadoDChPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_deFechaResultadoDChPropertyChange
        Date deFecha = deFechaResultadoDCh.getDate();
        if(deFecha != null){
            aFechaResultadoDCh.setMinSelectableDate(deFecha);
            if(aFechaResultadoDCh.getDate() != null && aFechaResultadoDCh.getDate().before(deFecha))
                aFechaResultadoDCh.setDate(deFecha);
        }
    }//GEN-LAST:event_deFechaResultadoDChPropertyChange

    /**
     * Metodo que se ejecuta al cambiar la fecha del componente aFechaResultadoDCh. Se ajusta
     * la fecha maxima del componente deFechaResultadoDCh y se ajusta si esta ya es mayor que
     * la actual.
     * @param evt Evento de cambio de propiedad
     */
    private void aFechaResultadoDChPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_aFechaResultadoDChPropertyChange
        Date aFecha = aFechaResultadoDCh.getDate();
        if(aFecha != null){
            deFechaResultadoDCh.setMaxSelectableDate(aFecha);
            if(deFechaResultadoDCh.getDate() != null && deFechaResultadoDCh.getDate().after(aFecha))
                deFechaResultadoDCh.setDate(aFecha);
        }
    }//GEN-LAST:event_aFechaResultadoDChPropertyChange

    /**
     * Metodo que se ejecuta al hacer click el boton buscar. Se toma el elemento
     * del combo box y las fechas y se busca con estas. Si no se han seleccionado
     * las fechas ni un evento se mostrara un mensaje de error, solo se necesita el
     * ingreso de un elemento para hacer la busqueda. 
     * @param evt Evento de hacer click
     */
    private void buscarResultadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarResultadoBtnActionPerformed
        Object evento = eventoCBx.getSelectedItem();
        Date de = deFechaDCh.getDate();
        Date hasta = aFechaDCh.getDate();
        if(eventoCBx.getSelectedIndex() == 0 && de == null && hasta == null)
            setMensaje("No se ha ingresado una manera de buscar la implementacion");
        else
            control.buscarImplementacionResultado(evento, de, hasta);
    }//GEN-LAST:event_buscarResultadoBtnActionPerformed

    /**
     * Metodo que se ejecuta al hacer click sobre la tabla de eventos resultado.
     * Este metodo nos permite detectar  que renglon se ha seleccionado para mostrar
     * los empleados del evento seleccionado.
     * @param evt Evento de mouse al hacer click
     */
    private void eventosResultadoTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventosResultadoTblMouseClicked
        Point punto = evt.getPoint();
        int renglon = eventosResultadoTbl.rowAtPoint(punto);
        int columna = eventosResultadoTbl.columnAtPoint(punto);
        
        if(columna == 3){
            boolean valor = (boolean) eventosResultadoTbl.getValueAt(renglon, columna);
            eventosTblModel.setValueAt(valor, renglon, (columna + 1));
            if(valor)
                resultadoPnl.buscarEmpleados((String) eventosTblModel
                        .getValueAt(renglon, 0));
            else
                resultadoPnl.limpiar();
        }
    }//GEN-LAST:event_eventosResultadoTblMouseClicked

    private void resultadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosBtnActionPerformed
        control.guardarResultados();
            JOptionPane.showMessageDialog(this, "Se han guardado los resultados exitosamente",
            "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_resultadosBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser aFechaDCh;
    private com.toedter.calendar.JDateChooser aFechaResultadoDCh;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton buscarResultadoBtn;
    private com.toedter.calendar.JDateChooser deFechaDCh;
    private javax.swing.JLabel deFechaLbl;
    private javax.swing.JLabel deFechaLbl1;
    private com.toedter.calendar.JDateChooser deFechaResultadoDCh;
    private javax.swing.JLabel disenarEncuestaInsLbl;
    private javax.swing.JLabel disenarEncuestaInsLbl1;
    private javax.swing.JLabel disenarEncuestaTltLbl;
    private javax.swing.JLabel disenarEncuestaTltLbl1;
    private javax.swing.JComboBox eventoCBx;
    private javax.swing.JLabel eventoLbl;
    private javax.swing.JComboBox eventoResultadoCBx;
    private javax.swing.JTable eventosResultadoTbl;
    private javax.swing.JTable eventosTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JPanel realizarEncuestaPnl;
    private javax.swing.JPanel resultadoEncuestaPnl;
    private javax.swing.JButton resultadosBtn;
    private javax.swing.JTabbedPane seguimientoTpnl;
    // End of variables declaration//GEN-END:variables

    /**
     * En este metodo se manda el evento, los aspectos y empleados para la creacion
     * y envio de encuesta.
     */
    public void enviarEncuesta(){
        //Se obtiene la informacion del evento
        String[] evento = new String[3];
        for(int i = 0; i < eventosTblModel.getRowCount(); i++){
            System.out.println(eventosTblModel.getValueAt(i, 4));
            if((Boolean) eventosTblModel.getValueAt(i, 4)){
                evento[0] = (String) eventosTblModel.getValueAt(i, 0);
                evento[1] = (String) eventosTblModel.getValueAt(i, 1);
                evento[2] = (String) eventosTblModel.getValueAt(i, 2);
                break;
            }
            if(i == eventosTblModel.getRowCount() - 1){
                setMensaje("No se ha seleccionado un evento");
                return;                
            }
        }
        List<Integer> aspectos = agregarAspectosPnl.getAspectos();
        List<Integer> empleados = agregarEmpleadosPnl.getEmpleados();
        if(evento[0].isEmpty())
            setMensaje("No se ha seleccionado un evento");
        else if(aspectos.isEmpty())
            setMensaje("No se han agregado aspectos a la encuesta");
        else if(empleados.isEmpty())
            setMensaje("No se han agregado empleados a evaluar");
        else{
            //Se envian los datos y se verifica el exito del envio
            boolean exito  = control.enviarEncuesta(agregarAspectosPnl.getAspectos(), 
                agregarEmpleadosPnl.getEmpleados(), evento);
            if(exito){
                JOptionPane.showMessageDialog(this, "Se ha creado y mandado la encuesta exitosamente",
                        "Exito", JOptionPane.INFORMATION_MESSAGE);
                eventosTblModel.setDataVector(new String[0][4], titulosTabla);
                agregarAspectosPnl.limpiar();
                agregarEmpleadosPnl.limpiar();
            }else
                setMensaje("Hubo problemas con la conexión a internet");
        }
    }
    
    /**
     * Metodo muestra un opcion pane de advertencia
     * @param mensaje Mensaje a mostrar
     */
    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
    }

    /**
     * El metodo asigna la informacion a la tabla correspondiente al indice de tab
     * @param info Informacion a poner en la tabla
     */
    @Override
    public void setTabla(String[][] info) {
        eventosTblModel.setDataVector(info, titulosTabla);
        TableColumn tc;
        switch(tabIndice){
            case 0:
                tc = eventosTbl.getColumnModel().getColumn(4);
                tc.setCellEditor(eventosTbl.getDefaultEditor(Boolean.class));
                tc.setCellRenderer(eventosTbl.getDefaultRenderer(Boolean.class));
                tc = eventosTbl.getColumnModel().getColumn(0);
                eventosTbl.getColumnModel().removeColumn(tc);
            break;
            case 1:
                tc = eventosResultadoTbl.getColumnModel().getColumn(4);
                tc.setCellEditor(eventosResultadoTbl.getDefaultEditor(Boolean.class));
                tc.setCellRenderer(eventosResultadoTbl.getDefaultRenderer(Boolean.class));
                tc = eventosResultadoTbl.getColumnModel().getColumn(0);
                eventosResultadoTbl.getColumnModel().removeColumn(tc);
            break;
        }
    }

    /**
     * Metodo no implementado.
     * @param info 
     */
    @Override
    public void setInfo(List info) {
        throw new UnsupportedOperationException("Not supported.");
    }

    /**
     * Metodo asigna la lista al combo box correspondiente.
     * @param info Lista de informacion para combo box
     * @param i Indice de combo box a asignar
     */
    @Override
    public void setLista(List info, int i) {
        eventosCBxModel.removeAllElements();
        for(int j = 0; j < info.size(); j++){
            eventosCBxModel.addElement(info.get(j));
        }
        eventosCBxModel.insertElementAt(new Evento(), 0);
        eventoCBx.setSelectedIndex(0);
    }
    
    @Override
    public void llenarDatos(Object evento){
        System.out.println("Alta encuesta");
        llenarTodo();
        this.setVisible(true);
        System.out.println(((ImplementacionEvento) evento)
                .getEvento().getNombre());
        deFechaDCh.setDate(((ImplementacionEvento) evento).getFechaInicial());
        aFechaDCh.setDate(((ImplementacionEvento) evento).getFechaFinal());
        eventoCBx.setSelectedIndex(((ImplementacionEvento) evento)
                .getEvento().getId());
        this.realizarEncuestaPnlComponentShown(null);
        realizarEncuestaPnl.updateUI();
        this.updateUI();
    }
}
