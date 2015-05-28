/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.vista.controlador.EncuestaControlador;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *  Clase con los resultados de la encuesta de un evento determinado.
 */
public class PnlEncuestaResultado extends javax.swing.JPanel implements Comunicador{

    //Titulos de tabla de empleados
    private final String[] titulosTabla = {"ID", "Numero", "Nombre", "Seleccion"};
    //Modelo de tabla de empleados
    private final DefaultTableModel empleadosTblModel;
    //Controlador que permite la interaccion con capas bajas
    private final EncuestaControlador control;
    //Identificador de la implementaciona actual
    private int idImplementacion;
    
    /**
     * Se inicializa la configuracion de los componentes y la de los atributos.
     */
    public PnlEncuestaResultado() {
        initComponents();
        idImplementacion = -1;
        control = new EncuestaControlador(this);
        
        empleadosTblModel = new DefaultTableModel(titulosTabla, 0) {
            private boolean bandera = false;
            
            @Override
            public boolean isCellEditable(int renglon, int columna){
                return columna == 3;
            }
            
            @Override
            public void setValueAt(Object valor, int renglon, int columna){
                if(columna == 3){
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
        empleadosTbl.setModel(empleadosTblModel);        
        
        TableColumn tc = empleadosTbl.getColumnModel().getColumn(0);
        empleadosTbl.getColumnModel().removeColumn(tc);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        empleadosTbl = new javax.swing.JTable();
        antesGraficaPnl = new javax.swing.JPanel();
        despuesGraficaPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        empleadosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre Completo", "Puesto", "Correo electrónico ", "Plantel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empleadosTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleadosTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empleadosTbl);
        if (empleadosTbl.getColumnModel().getColumnCount() > 0) {
            empleadosTbl.getColumnModel().getColumn(0).setResizable(false);
            empleadosTbl.getColumnModel().getColumn(1).setResizable(false);
            empleadosTbl.getColumnModel().getColumn(2).setResizable(false);
            empleadosTbl.getColumnModel().getColumn(3).setResizable(false);
            empleadosTbl.getColumnModel().getColumn(4).setResizable(false);
        }

        antesGraficaPnl.setPreferredSize(new java.awt.Dimension(340, 255));

        javax.swing.GroupLayout antesGraficaPnlLayout = new javax.swing.GroupLayout(antesGraficaPnl);
        antesGraficaPnl.setLayout(antesGraficaPnlLayout);
        antesGraficaPnlLayout.setHorizontalGroup(
            antesGraficaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        antesGraficaPnlLayout.setVerticalGroup(
            antesGraficaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout despuesGraficaPnlLayout = new javax.swing.GroupLayout(despuesGraficaPnl);
        despuesGraficaPnl.setLayout(despuesGraficaPnlLayout);
        despuesGraficaPnlLayout.setHorizontalGroup(
            despuesGraficaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        despuesGraficaPnlLayout.setVerticalGroup(
            despuesGraficaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Resultado de encuestas");

        jLabel2.setText("Seleccionar un empleado de la tabla para mostrar sus encuestas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(antesGraficaPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(despuesGraficaPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(despuesGraficaPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(antesGraficaPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo ejecutado al hacer click en la tabla de empleados. Este metodo
     * se asegura de detectar al hacer click en el check box para mostrar las
     * graficas del empleado seleccionado.
     * @param evt Evento ejecutado
     */
    private void empleadosTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empleadosTblMouseClicked
        Point punto = evt.getPoint();
        int renglon = empleadosTbl.rowAtPoint(punto);
        int columna = empleadosTbl.columnAtPoint(punto);
        
        if(columna == 2){
            boolean valor = (boolean) empleadosTbl.getValueAt(renglon, columna);
            empleadosTblModel.setValueAt(valor, renglon, (columna + 1));
            if(valor)
                mostrarGraficas((String) empleadosTblModel.getValueAt(renglon, 0));
            else
                limpiar();
        }
    }//GEN-LAST:event_empleadosTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel antesGraficaPnl;
    private javax.swing.JPanel despuesGraficaPnl;
    private javax.swing.JTable empleadosTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo limpia la tabla de empleados y borra los registros.
     */
    public void limpiar() {
        empleadosTblModel.setDataVector(new String[3][0], titulosTabla);
        idImplementacion = -1;
    }

    /**
     * Busca los empleados de la implementacion enviada.
     * @param idImplementacion Identificador de implementacion
     */
    public void buscarEmpleados(String idImplementacion) {
        this.idImplementacion = Integer.parseInt(idImplementacion);
        control.buscarEmpleados(this.idImplementacion);
    }

    /**
     * Metodo para mostrar un mensaje de advertencia por medio del JOptionPane.
     * @param mensaje Mensaje a mostrar.
     */
    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Advertencia", 
                JOptionPane.WARNING_MESSAGE);    
    }
    
    /**
     * Metodo asignar la informacion a la tabla de empleados.
     * @param info Matriz con la informacion a asignar.
     */
    @Override
    public void setTabla(String[][] info) {
        empleadosTblModel.setDataVector(info, titulosTabla);
        TableColumn tc = empleadosTbl.getColumnModel().getColumn(3);
        tc.setCellEditor(empleadosTbl.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(empleadosTbl.getDefaultRenderer(Boolean.class));
        tc = empleadosTbl.getColumnModel().getColumn(0);
        empleadosTbl.getColumnModel().removeColumn(tc);
    }

    /**
     * Metodo no implementado.
     * @param info 
     */
    @Override
    public void setInfo(List info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * El metodo asigna la lista de informacion al combo box determinado.
     * @param info Lista con la informacion
     * @param i Indice de identificacion de combo box
     */
    @Override
    public void setLista(List info, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Se generan y  muestran las graficas del empleado enviado.
     * @param idEmpleado Identificador de empleado
     */
    private void mostrarGraficas(String idEmpleado) {
        //Se obtienen las respuestas del empleado
        List<Object> respuestas = control.resultados(Integer.parseInt(idEmpleado),
            idImplementacion);
        
        //Se genera la grafica con las respuestas antes del evento
        JFreeChart graficaAntes = ChartFactory.createBarChart(
            "Antes de la encuesta",
            "Aspectos",
            "Escala",
            crearConjuntos(respuestas)[0],
            PlotOrientation.VERTICAL,true, true, false);
        //Se genera la grafica con las respuestas despues del evento
        JFreeChart graficaDespues = ChartFactory.createBarChart(
            "Despues de la encuesta",
            "Aspectos",
            "Escala",
            crearConjuntos(respuestas)[1],
            PlotOrientation.VERTICAL, true, true, false);
        //Se agregan las graficas a los paneles de graficas
        ChartPanel panelGraficaAntes = new ChartPanel(graficaAntes);
        panelGraficaAntes.setPopupMenu(null);
        ChartPanel panelGraficaDespues = new ChartPanel(graficaDespues);
        panelGraficaDespues.setPopupMenu(null);
        
        //Se asigna la panel de graficas a los paneles
        antesGraficaPnl.setLayout(new BorderLayout());
        antesGraficaPnl.setPreferredSize(new Dimension(340, 255));
        antesGraficaPnl.add(panelGraficaAntes);
        
        despuesGraficaPnl.setLayout(new BorderLayout());
        despuesGraficaPnl.setPreferredSize(new Dimension(340, 255));
        despuesGraficaPnl.add(panelGraficaDespues);
        revalidate();
    }
    
    /**
     * Se crean dos conjuntos de datos a partir de la lista con las respuestas,
     * estos conjuntos son utilizados para la creacion de graficas.
     * @param respuestas Lista con las respuestas, con el siguiente formato: 
     * [respuesta antes | respuesta despues | aspecto evaluar ]
     * @return Regresa un arreglo con ambos conjuntos
     */
    private CategoryDataset[] crearConjuntos(List<Object> respuestas){
        DefaultCategoryDataset[] conjuntos = new DefaultCategoryDataset[2];
        conjuntos[0] = new DefaultCategoryDataset();
        conjuntos[1] = new DefaultCategoryDataset();
        for(int i = 0; i < respuestas.size(); i += 3)
            conjuntos[0].addValue((Integer) respuestas.get(i + 1), 
                    (String) respuestas.get(i), "Resultado");
        for(int i = 0; i < respuestas.size(); i += 3)
            conjuntos[1].addValue((Integer) respuestas.get(i + 2), 
                    (String) respuestas.get(i), "Resultado");
        return conjuntos; 
    }

    @Override
    public void llenarDatos(Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
