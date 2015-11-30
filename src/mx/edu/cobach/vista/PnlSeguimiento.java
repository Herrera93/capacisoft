/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
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
    private final DefaultTableModel eventosTblModel, modelEmpleado, modelAspecto;
    //Modelo del combo box donde se asignan los eventos
    private final DefaultComboBoxModel eventosCBxModel;
    //Titulo de tabla eventos
    private final String[] titulosTabla = {"ID", "FechaInicial", "Nombre del evento",
        "Estado"};
    private String[] titulosTablaEm = {"Numero",
        "Nombre del Empleado"};
    private String[] titulosTablaAs = {"ID", "Aspecto"};
    //Panel donde se muestran los empleados
    private PnlEncuestaResultado resultadoPnl;
    //Indice para detectar el tab actual
    private int tabIndice;
    //Ventana principal
    private Capacisoft capacisoft;
    //Informacion de evento asociado a la encuesta
    private String[] evento;
    
    /**
     * Se construye el panel, iniciando los componentes y se le da la configuracion
     * inicial a las tablas y  sus modelos.
     * 
     * @param capacisoft Ventana principal
     */
    public PnlSeguimiento(Capacisoft capacisoft) {
        initComponents();
        agregar();
        this.capacisoft = capacisoft;
        control = new EncuestaControlador(this);
        
        eventosTblModel = new DefaultTableModel(titulosTabla, 0) {
            @Override
            public boolean isCellEditable(int renglon, int columna){
                return false;
            }
        };
        
        modelEmpleado = new DefaultTableModel(titulosTablaEm, 0){
            @Override
            public boolean isCellEditable(int renglon, int columna){
                return false;
            }
        };
        empleadosTbl.setModel(modelEmpleado);
        empleadosTbl.setColumnSelectionAllowed(false);
        empleadosTbl.setDragEnabled(false);
        
        modelAspecto = new DefaultTableModel(titulosTablaAs, 0){
            @Override
            public boolean isCellEditable(int renglon, int columna){
                return false;
            }
        };
        aspectosTbl.setModel(modelAspecto);
        aspectosTbl.setColumnSelectionAllowed(false);
        aspectosTbl.setDragEnabled(false);
        
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
        tc = eventosResultadoTbl.getColumnModel().getColumn(2);
        eventosResultadoTbl.getColumnModel().removeColumn(tc);
        
        tabIndice = 0;
    }

    /**
     * En este metodos agregamos y configuramos lo paneles de Realizar Encuesta y
     * de Resultados. Este metodo se ejecuta al llamar el constructor.
     */
    private void agregar(){
        resultadoPnl = new PnlEncuestaResultado();
        
        resultadoPnl.setLocation(396,0);
        resultadoPnl.setSize(785,589);
        resultadoPnl.setVisible(false);
        add(resultadoPnl);
    }
    
    /**
    * Este metodo es utilizado para llenar las listas con la informacion de la 
    * base de datos. Se ejecuta antes de entrar al panel para que una vez que se
    * entre se mostrara todos los datos correspondientes.
    */
    public void llenarTodo(){
        limpiar();
        control.setClass(Evento.class);
        control.buscarTodosLista(1);
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
        notaBusLbl = new javax.swing.JLabel();
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
        notaBusLbl1 = new javax.swing.JLabel();
        informacionTBn = new javax.swing.JTabbedPane();
        aspectosPnl = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        aspectosTbl = new javax.swing.JTable();
        siguienteBtn = new javax.swing.JButton();
        agregarLALbl1 = new javax.swing.JLabel();
        nota_LI_Lbl1 = new javax.swing.JLabel();
        seleccionLALbl1 = new javax.swing.JLabel();
        listaAspectosBtn = new javax.swing.JButton();
        listaAsistenciaLALbl1 = new javax.swing.JLabel();
        cancelarLABtn = new javax.swing.JButton();
        totalAspectosLbl = new javax.swing.JLabel();
        empleadosPnl = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        empleadosTbl = new javax.swing.JTable();
        enviarBtn = new javax.swing.JButton();
        agregarLALbl = new javax.swing.JLabel();
        nota_LI_Lbl = new javax.swing.JLabel();
        seleccionLALbl = new javax.swing.JLabel();
        listaEmpleadosBtn = new javax.swing.JButton();
        listaAsistenciaLALbl = new javax.swing.JLabel();
        cancelarLEBtn = new javax.swing.JButton();
        regresarBtn = new javax.swing.JButton();
        totalEmpleadosLbl = new javax.swing.JLabel();

        seguimientoTpnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        realizarEncuestaPnl.setPreferredSize(new java.awt.Dimension(392, 571));
        realizarEncuestaPnl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                realizarEncuestaPnlComponentShown(evt);
            }
        });

        disenarEncuestaTltLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disenarEncuestaTltLbl.setText("Opciones");

        disenarEncuestaInsLbl.setText("<html>Para seleccionar un evento seleccione la fecha o nombre del evento asociado con la encuesta a realizar.</html>");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setLabelFor(eventoCBx);
        jLabel1.setText("Nombre del evento:");

        eventoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        eventoCBx.setMaximumSize(new java.awt.Dimension(56, 32767));

        deFechaDCh.setDateFormatString("dd/MM/yyyy");
        deFechaDCh.setFocusable(false);
        deFechaDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                deFechaDChPropertyChange(evt);
            }
        });

        deFechaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deFechaLbl.setText("Fecha del evento:");

        aFechaDCh.setDateFormatString("dd/MM/yyyy");
        aFechaDCh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                aFechaDChPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Hasta:");

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
        eventosTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventosTblMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(eventosTbl);
        if (eventosTbl.getColumnModel().getColumnCount() > 0) {
            eventosTbl.getColumnModel().getColumn(0).setResizable(false);
            eventosTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        notaBusLbl.setText("<html>Ingrese el nombre o la fecha del evento para buscar la información<br>especifica");

        javax.swing.GroupLayout realizarEncuestaPnlLayout = new javax.swing.GroupLayout(realizarEncuestaPnl);
        realizarEncuestaPnl.setLayout(realizarEncuestaPnlLayout);
        realizarEncuestaPnlLayout.setHorizontalGroup(
            realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                        .addComponent(notaBusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                        .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarEncuestaPnlLayout.createSequentialGroup()
                                .addComponent(deFechaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(disenarEncuestaTltLbl)
                            .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eventoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(disenarEncuestaInsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, realizarEncuestaPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarBtn)))
                .addContainerGap())
        );
        realizarEncuestaPnlLayout.setVerticalGroup(
            realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realizarEncuestaPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(disenarEncuestaTltLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaBusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eventoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deFechaLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(realizarEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(aFechaDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disenarEncuestaInsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        seguimientoTpnl.addTab("<html>Dise&ntilde;ar encuesta</html>", realizarEncuestaPnl);

        resultadoEncuestaPnl.setPreferredSize(new java.awt.Dimension(392, 571));
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

        disenarEncuestaInsLbl1.setText("<html>Para seleccionar un evento seleccione la fecha o nombre del evento asociado con la encuesta que se desean ver sus resultados.</html> ");

        disenarEncuestaTltLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        disenarEncuestaTltLbl1.setText("Opciones");

        eventoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoLbl.setLabelFor(eventoCBx);
        eventoLbl.setText("Nombre del evento:");

        eventoResultadoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoResultadoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        deFechaLbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deFechaLbl1.setText("Fecha del evento:");

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
        jLabel5.setText("Hasta:");

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

        notaBusLbl1.setText("<html>Ingrese el nombre o la fecha del evento para buscar la información<br>especifica");

        javax.swing.GroupLayout resultadoEncuestaPnlLayout = new javax.swing.GroupLayout(resultadoEncuestaPnl);
        resultadoEncuestaPnl.setLayout(resultadoEncuestaPnlLayout);
        resultadoEncuestaPnlLayout.setHorizontalGroup(
            resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultadoEncuestaPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(disenarEncuestaInsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultadoEncuestaPnlLayout.createSequentialGroup()
                                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eventoLbl)
                                    .addComponent(deFechaLbl1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aFechaResultadoDCh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deFechaResultadoDCh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(eventoResultadoCBx, 0, 180, Short.MAX_VALUE)))
                            .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(notaBusLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disenarEncuestaTltLbl1))
                                .addGap(0, 47, Short.MAX_VALUE))
                            .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                                .addComponent(resultadosBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscarResultadoBtn)))))
                .addContainerGap())
        );
        resultadoEncuestaPnlLayout.setVerticalGroup(
            resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(disenarEncuestaTltLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaBusLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventoLbl)
                    .addComponent(eventoResultadoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deFechaResultadoDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deFechaLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(resultadoEncuestaPnlLayout.createSequentialGroup()
                        .addComponent(aFechaResultadoDCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(resultadoEncuestaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarResultadoBtn)
                            .addComponent(resultadosBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disenarEncuestaInsLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        seguimientoTpnl.addTab("Resultados", resultadoEncuestaPnl);

        informacionTBn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                informacionTBnStateChanged(evt);
            }
        });

        aspectosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero del empleado", "Nombre del empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        aspectosTbl.setEnabled(false);
        jScrollPane7.setViewportView(aspectosTbl);

        siguienteBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        siguienteBtn.setText("Siguiente");
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBtnActionPerformed(evt);
            }
        });

        agregarLALbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLALbl1.setText("Registro");

        nota_LI_Lbl1.setText("<html>Ingrese la información a almacenar, para salir o cancelar el registro presione el botón \"Cancelar\"</html>");

        seleccionLALbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccionLALbl1.setText("Seleccione la opcion de \"Generar lista de aspectos\" para agregar los aspectos a evaluar en la encuesta.");

        listaAspectosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaAspectosBtn.setText("Generar lista de aspectos");
        listaAspectosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAspectosBtnActionPerformed(evt);
            }
        });

        listaAsistenciaLALbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaAsistenciaLALbl1.setText("Lista de aspectos");

        cancelarLABtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarLABtn.setText("Cancelar");
        cancelarLABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLABtnActionPerformed(evt);
            }
        });

        totalAspectosLbl.setText("Total de aspectos en la lista:");

        javax.swing.GroupLayout aspectosPnlLayout = new javax.swing.GroupLayout(aspectosPnl);
        aspectosPnl.setLayout(aspectosPnlLayout);
        aspectosPnlLayout.setHorizontalGroup(
            aspectosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aspectosPnlLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(aspectosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aspectosPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarLABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(aspectosPnlLayout.createSequentialGroup()
                        .addGroup(aspectosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalAspectosLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE))))
            .addGroup(aspectosPnlLayout.createSequentialGroup()
                .addGroup(aspectosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aspectosPnlLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(aspectosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nota_LI_Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarLALbl1)
                            .addComponent(seleccionLALbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaAspectosBtn)))
                    .addGroup(aspectosPnlLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(listaAsistenciaLALbl1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aspectosPnlLayout.setVerticalGroup(
            aspectosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aspectosPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(agregarLALbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_LI_Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seleccionLALbl1)
                .addGap(18, 18, 18)
                .addComponent(listaAspectosBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(listaAsistenciaLALbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalAspectosLbl)
                .addGap(12, 12, 12)
                .addGroup(aspectosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarLABtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        informacionTBn.addTab("Aspectos", aspectosPnl);

        empleadosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero del empleado", "Nombre del empleado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empleadosTbl.setEnabled(false);
        jScrollPane6.setViewportView(empleadosTbl);

        enviarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enviarBtn.setText("Enviar");
        enviarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnActionPerformed(evt);
            }
        });

        agregarLALbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLALbl.setText("Registro");

        nota_LI_Lbl.setText("<html>Ingrese la información a almacenar, para salir o cancelar el registro presione el botón \"Cancelar\"</html>");

        seleccionLALbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccionLALbl.setText("<html>Seleccione la opci&oacute;n de \"Generar lista de empleados\" para agregar a los empleados cuyos jefes inmediatos<br>recibiran la encuesta.</html>");

        listaEmpleadosBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaEmpleadosBtn.setText("Generar lista de empleados");
        listaEmpleadosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEmpleadosBtnActionPerformed(evt);
            }
        });

        listaAsistenciaLALbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listaAsistenciaLALbl.setText("Lista de empleados");

        cancelarLEBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarLEBtn.setText("Cancelar");
        cancelarLEBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLEBtnActionPerformed(evt);
            }
        });

        regresarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regresarBtn.setText("Regresar");
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        totalEmpleadosLbl.setText("Total de empleados en la lista:");

        javax.swing.GroupLayout empleadosPnlLayout = new javax.swing.GroupLayout(empleadosPnl);
        empleadosPnl.setLayout(empleadosPnlLayout);
        empleadosPnlLayout.setHorizontalGroup(
            empleadosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadosPnlLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(empleadosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empleadosPnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarLEBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(empleadosPnlLayout.createSequentialGroup()
                        .addGroup(empleadosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalEmpleadosLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE))))
            .addGroup(empleadosPnlLayout.createSequentialGroup()
                .addGroup(empleadosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empleadosPnlLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(empleadosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nota_LI_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarLALbl)
                            .addComponent(seleccionLALbl, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaEmpleadosBtn)))
                    .addGroup(empleadosPnlLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(listaAsistenciaLALbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        empleadosPnlLayout.setVerticalGroup(
            empleadosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadosPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(agregarLALbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nota_LI_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seleccionLALbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaEmpleadosBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(listaAsistenciaLALbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalEmpleadosLbl)
                .addGap(12, 12, 12)
                .addGroup(empleadosPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarLEBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        informacionTBn.addTab("Empleados", empleadosPnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(seguimientoTpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(informacionTBn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seguimientoTpnl)
            .addComponent(informacionTBn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que se ejecuta al mostrarse el panel de tab diseno de encuesta, en este
     * metodo se remueve el panel de resultados y anadimos los de empleados y
     * aspectos. Esto se hace para evitar el problema de sobreposicion de paneles.
     * @param evt Evento de componente
     */
    private void realizarEncuestaPnlComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_realizarEncuestaPnlComponentShown
        resultadoPnl.setVisible(false);
        remove(resultadoPnl);
        add(informacionTBn);
        tabIndice = 0;
        eventosTblModel.setNumRows(0);
    }//GEN-LAST:event_realizarEncuestaPnlComponentShown

    /**
     * Metodo que se ejecuta al mostrarse el panel de tab resultados de encuesta, en este
     * metodo se remueven los paneles de empleados y aspectos y anadimos el de resultado
     * aspectos. Esto se hace para evitar el problema de sobreposicion de paneles.
     * @param evt Evento de componente
     */
    private void resultadoEncuestaPnlComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_resultadoEncuestaPnlComponentShown
        if (informacionTBn.isVisible()) {
            if (JOptionPane.showConfirmDialog(this, "La información que"
                    + " esta modificando se perdera ¿Aun así desea cancelarla?",
                    "Precaucion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE) == 0) {
                limpiar();
                remove(informacionTBn);
                add(resultadoPnl);
                tabIndice = 1;
                eventosTblModel.setNumRows(0);                
            }
        }else{
            limpiar();
            remove(informacionTBn);
            add(resultadoPnl);
            tabIndice = 1;
            eventosTblModel.setNumRows(0);                            
        }
    }//GEN-LAST:event_resultadoEncuestaPnlComponentShown

    /**
     * Metodo que se ejecuta al hacer click el boton buscar. Se toma el elemento
     * del combo box y las fechas y se busca con estas. 
     * @param evt Evento de hacer click
     */
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        Object evento = eventoCBx.getSelectedItem();
        Date de = deFechaDCh.getDate();
        Date hasta = aFechaDCh.getDate();
        if(eventoCBx.getSelectedIndex() == 0){
            control.buscarImplementacion(null, de, hasta);
        }else{
            control.buscarImplementacion(evento, de, hasta);
        }
        
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
        if(eventoCBx.getSelectedIndex() == 0){
            control.buscarImplementacionResultado(null, de, hasta);
        }else{
            control.buscarImplementacionResultado(evento, de, hasta);
        }
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
        
        if(columna == 0 || columna == 1){
            resultadoPnl.limpiar();
            resultadoPnl.buscarEmpleados((String) eventosTblModel
                    .getValueAt(renglon, 0));
            resultadoPnl.setVisible(true);
        }
    }//GEN-LAST:event_eventosResultadoTblMouseClicked

    private void resultadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosBtnActionPerformed
        control.guardarResultados();
        JOptionPane.showMessageDialog(this, "Se han guardado los resultados exitosamente",
        "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_resultadosBtnActionPerformed

    private void eventosTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventosTblMouseClicked
        Point punto = evt.getPoint();
        int renglon = eventosTbl.rowAtPoint(punto);
        int columna = eventosTbl.columnAtPoint(punto);
        
        if(columna == 0 || columna == 1){
            if (informacionTBn.isVisible()) {
                if (JOptionPane.showConfirmDialog(this, "La información que"
                        + " esta modificando se perdera ¿Aun así desea cancelarla?",
                        "Precaucion", JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE) == 0) {
                    int opcion = JOptionPane.showConfirmDialog(this, "Desea "
                            + "agregar lista de asistencia?", 
                        "Confirmacion", JOptionPane.YES_NO_OPTION);
                    limpiar();
                    if(opcion == JOptionPane.YES_OPTION){
                        int id = Integer.parseInt((String) eventosTblModel.getValueAt(renglon, 0));
                        control.buscarEmpleados(id);
                    }
                    evento = new String[3];
                    for(int i = 0; i < 3; i++){
                        evento[i] = (String) eventosTblModel
                            .getValueAt(renglon, i);
                    }
                    informacionTBn.setVisible(true);
                }
            }else{
                int opcion = JOptionPane.showConfirmDialog(this, "Desea "
                        + "agregar lista de asistencia?", 
                    "Confirmacion", JOptionPane.YES_NO_OPTION);
                limpiar();
                if(opcion == JOptionPane.YES_OPTION){
                    int id = Integer.parseInt((String) eventosTblModel.getValueAt(renglon, 0));
                    control.buscarEmpleados(id);
                }
                evento = new String[3];
                for(int i = 0; i < 3; i++){
                    evento[i] = (String) eventosTblModel
                        .getValueAt(renglon, i);
                }
                informacionTBn.setVisible(true);
            }
        }
    }//GEN-LAST:event_eventosTblMouseClicked

    /**
     * Metodo que se ejecuta al presionar el boton enviar. Este metodo toma
     * el padre de esta panel y ejecuta el metodo enviarEncuesta();
     * @param evt Evento ejecutado
     */
    private void enviarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnActionPerformed
        enviarEncuesta();
    }//GEN-LAST:event_enviarBtnActionPerformed

    private void listaEmpleadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEmpleadosBtnActionPerformed
        ListaAsistencia lista = new ListaAsistencia(this);
        capacisoft.setEnabled(false);
        lista.setVisible(true);
        String[][] matriz = new String[modelEmpleado.
                getRowCount()][modelEmpleado.getColumnCount()];
        for (int k = 0; k < modelEmpleado.getRowCount(); k++) {
            for (int j = 0; j < modelEmpleado.getColumnCount(); j++) {
                matriz[k][j] = modelEmpleado.getValueAt(k, j) + "";
            }
        }
        if (empleadosTbl.getRowCount() > 0) {
            lista.mandarTabla(matriz);
        }
    }//GEN-LAST:event_listaEmpleadosBtnActionPerformed

    private void cancelarLEBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLEBtnActionPerformed
        int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea cancelar el "
                + " el diseno de la encuesta?", "Precaucion",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(opcion == 0){
            limpiar();
        }
    }//GEN-LAST:event_cancelarLEBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        informacionTBn.setEnabledAt(0, true);
        informacionTBn.setEnabledAt(1, false);
        informacionTBn.setSelectedIndex(0);
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void informacionTBnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_informacionTBnStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_informacionTBnStateChanged

    /**
     * Evento ejecutado al hacer click en el boton "Siguiente" que avanza
     * a la siguiente pestana
     *
     * @param evt Evento al presionar el boton
     */
    private void siguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBtnActionPerformed
        informacionTBn.setEnabledAt(0, false);
        informacionTBn.setEnabledAt(1, true);
        informacionTBn.setSelectedIndex(1);
    }//GEN-LAST:event_siguienteBtnActionPerformed

    private void listaAspectosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAspectosBtnActionPerformed
        ListaAspectos lista = new ListaAspectos(this);
        capacisoft.setEnabled(false);
        lista.setVisible(true);
        String[][] matriz = new String[modelAspecto.
                getRowCount()][modelAspecto.getColumnCount()];
        for (int k = 0; k < modelAspecto.getRowCount(); k++) {
            for (int j = 0; j < modelAspecto.getColumnCount(); j++) {
                matriz[k][j] = modelAspecto.getValueAt(k, j) + "";
            }
        }
        if (aspectosTbl.getRowCount() > 0) {
            lista.mandarTabla(matriz);
        }
    }//GEN-LAST:event_listaAspectosBtnActionPerformed

    private void cancelarLABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLABtnActionPerformed
        int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea cancelar el "
                + " el diseno de la encuesta?", "Precaucion",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(opcion == 0){
            limpiar();
        }
    }//GEN-LAST:event_cancelarLABtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser aFechaDCh;
    private com.toedter.calendar.JDateChooser aFechaResultadoDCh;
    private javax.swing.JLabel agregarLALbl;
    private javax.swing.JLabel agregarLALbl1;
    private javax.swing.JPanel aspectosPnl;
    private javax.swing.JTable aspectosTbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton buscarResultadoBtn;
    private javax.swing.JButton cancelarLABtn;
    private javax.swing.JButton cancelarLEBtn;
    private com.toedter.calendar.JDateChooser deFechaDCh;
    private javax.swing.JLabel deFechaLbl;
    private javax.swing.JLabel deFechaLbl1;
    private com.toedter.calendar.JDateChooser deFechaResultadoDCh;
    private javax.swing.JLabel disenarEncuestaInsLbl;
    private javax.swing.JLabel disenarEncuestaInsLbl1;
    private javax.swing.JLabel disenarEncuestaTltLbl;
    private javax.swing.JLabel disenarEncuestaTltLbl1;
    private javax.swing.JPanel empleadosPnl;
    private javax.swing.JTable empleadosTbl;
    private javax.swing.JButton enviarBtn;
    private javax.swing.JComboBox eventoCBx;
    private javax.swing.JLabel eventoLbl;
    private javax.swing.JComboBox eventoResultadoCBx;
    private javax.swing.JTable eventosResultadoTbl;
    private javax.swing.JTable eventosTbl;
    private javax.swing.JTabbedPane informacionTBn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel listaAsistenciaLALbl;
    private javax.swing.JLabel listaAsistenciaLALbl1;
    private javax.swing.JButton listaAspectosBtn;
    private javax.swing.JButton listaEmpleadosBtn;
    private javax.swing.JLabel notaBusLbl;
    private javax.swing.JLabel notaBusLbl1;
    private javax.swing.JLabel nota_LI_Lbl;
    private javax.swing.JLabel nota_LI_Lbl1;
    public javax.swing.JPanel realizarEncuestaPnl;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JPanel resultadoEncuestaPnl;
    private javax.swing.JButton resultadosBtn;
    private javax.swing.JTabbedPane seguimientoTpnl;
    private javax.swing.JLabel seleccionLALbl;
    private javax.swing.JLabel seleccionLALbl1;
    private javax.swing.JButton siguienteBtn;
    private javax.swing.JLabel totalAspectosLbl;
    private javax.swing.JLabel totalEmpleadosLbl;
    // End of variables declaration//GEN-END:variables

    public void limpiar(){
        modelAspecto.setRowCount(0);
        modelEmpleado.setRowCount(0);
        informacionTBn.setVisible(false);
        totalAspectosLbl.setText("Total de aspectos en la lista: " + 
                    modelAspecto.getRowCount() + "");
        totalEmpleadosLbl.setText("Total de empleados en la lista: " + 
                    modelEmpleado.getRowCount() + "");
    }
    
    /**
     * En este metodo se manda el evento, los aspectos y empleados para la creacion
     * y envio de encuesta.
     */
    public void enviarEncuesta(){
        List<Integer> aspectos = getAspectos();
        List<String> empleados = getEmpleados();
        if(aspectos.isEmpty())
            setMensaje("No se han agregado aspectos a la encuesta");
        else if(empleados.isEmpty())
            setMensaje("No se han agregado empleados a evaluar");
        else{
            //Se envian los datos y se verifica el exito del envio
            boolean exito  = control.enviarEncuesta(getAspectos(), 
                getEmpleados(), evento);
            if(exito){
                JOptionPane.showMessageDialog(this, "Se ha creado y mandado la encuesta exitosamente",
                        "Exito", JOptionPane.INFORMATION_MESSAGE);
                eventosTblModel.setNumRows(0);
                limpiar();
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
        if( info[0][0].contains("TLA1")){
            info[0][0] = info[0][0].replaceAll("TLA1", "");
            modelAspecto.setDataVector(info, titulosTablaAs);
            TableColumn tc = aspectosTbl.getColumnModel().getColumn(0);
            aspectosTbl.getColumnModel().removeColumn(tc);
            totalAspectosLbl.setText("Total de aspectos en la lista: " + 
                    modelAspecto.getRowCount() + "");
        }else if (info[0][0].contains("TLE1")) {
            info[0][0] = info[0][0].replaceAll("TLE1", "");
            modelEmpleado.setDataVector(info, titulosTablaEm);
            totalEmpleadosLbl.setText("Total de empleados en la lista: " + 
                    modelEmpleado.getRowCount() + "");
        }else{
            eventosTblModel.setDataVector(info, titulosTabla);
            TableColumn tc;
            switch(tabIndice){
                case 0:
                    tc = eventosTbl.getColumnModel().getColumn(0);
                    eventosTbl.getColumnModel().removeColumn(tc);
                break;
                case 1:
                    tc = eventosResultadoTbl.getColumnModel().getColumn(0);
                    eventosResultadoTbl.getColumnModel().removeColumn(tc);
                break;
            }
        }
    }

    /**
     * Metodo para habilitar la ventana principal
     * @param info 
     */
    @Override
    public void setInfo(List info) {
        if (info != null && info.get(0).equals("Desbloquear")) {
            capacisoft.setEnabled(true);
            capacisoft.setVisible(true);
        }
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
        eventosCBxModel.insertElementAt("BUSCAR TODOS", 0);
        eventoCBx.setSelectedIndex(0);
    }
    
    @Override
    public void llenarDatos(Object implementacionEvento){
        System.out.println("Encuesta");
        llenarTodo();
        this.setVisible(true);
        System.out.println(((ImplementacionEvento) implementacionEvento)
                .getEvento().getNombre());
        //deFechaDCh.setDate(((ImplementacionEvento) implementacionEvento).getFechaInicial());
        //aFechaDCh.setDate(((ImplementacionEvento) implementacionEvento).getFechaFinal());
        eventoCBx.setSelectedIndex(((ImplementacionEvento) implementacionEvento)
                .getEvento().getId());
        this.realizarEncuestaPnlComponentShown(null);
        realizarEncuestaPnl.updateUI();
        this.updateUI();
    }
    
    /**
     * Obtiene una lista de los identificadores de los empleados agregados.
     * @return Lista con los identificadores.
     */
    public List<String> getEmpleados(){
        List<String> empleadosIds = new ArrayList();
        for(int i = 0; i < modelEmpleado.getRowCount(); i++){
            String numero = (String) modelEmpleado.getValueAt(i, 0);
            empleadosIds.add(numero);
        }
        return empleadosIds;
    }
    
    /**
     * Obtiene una lista de los identificadores de los aspectos agregados.
     * @return Lista con los identificadores.
     */
    public List<Integer> getAspectos(){
        List<Integer> aspectosIds = new ArrayList();
        for(int i = 0; i < modelAspecto.getRowCount(); i++){
            String id = (String) modelAspecto.getValueAt(i, 0);
            aspectosIds.add(Integer.parseInt(id));
        }
        return aspectosIds;
    }
}
