/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import mx.edu.cobach.persistencia.entidades.Adscripcion;
import mx.edu.cobach.persistencia.entidades.Departamento;
import mx.edu.cobach.persistencia.entidades.Empleado;
import mx.edu.cobach.persistencia.entidades.Plantel;
import mx.edu.cobach.persistencia.entidades.Puesto;
import mx.edu.cobach.vista.controlador.EmpleadoControlador;
import mx.edu.cobach.vista.controlador.HelperEntidad;

/**
 *
 * @author liuts
 */
public class PnlEmpleadoAdministrativo extends javax.swing.JPanel implements
        Comunicador{
    
    private final DefaultTableModel model;
    private final DefaultComboBoxModel puestoModel, plantelModel, dptoModel,
            adscripModel;
    private final String[] titulosTabla;
    private final EmpleadoControlador control;
    private int idEmpleadoActual;
    /**
     * Creates new form PnlEmpleadoAdministrativo
     */
    public PnlEmpleadoAdministrativo() {
        this.titulosTabla = new String[]{"ID","Numero", "Nombre", "Eliminar"};
        initComponents();
        model = new DefaultTableModel(titulosTabla, 5);
        tablaTbl.setModel(model);
        tablaTbl.setColumnSelectionAllowed(false);
        tablaTbl.setDragEnabled(false);
        control = new EmpleadoControlador(this, Empleado.class);
        puestoModel = new DefaultComboBoxModel();
        plantelModel = new DefaultComboBoxModel();
        dptoModel = new DefaultComboBoxModel();
        adscripModel = new DefaultComboBoxModel();
        puestoCBx.setModel(puestoModel);
        plantelCBx.setModel(plantelModel);
        departamentoCBx.setModel(dptoModel);
        adscCBx.setModel(adscripModel);
        adscBuscarCBx.setModel(adscripModel);
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
        adscBuscarLbl = new javax.swing.JLabel();
        nombreBuscarTFd = new javax.swing.JTextField();
        tablaSPn = new javax.swing.JScrollPane();
        tablaTbl = new javax.swing.JTable();
        buscarBtn = new javax.swing.JButton();
        agregarBtn = new javax.swing.JButton();
        adscBuscarCBx = new javax.swing.JComboBox();
        opcionMsjLbl = new javax.swing.JLabel();
        opcionLbl = new javax.swing.JLabel();
        informacioPnl = new javax.swing.JPanel();
        puestoLbll = new javax.swing.JLabel();
        plantelLbl = new javax.swing.JLabel();
        numeroLbl = new javax.swing.JLabel();
        correoELbl = new javax.swing.JLabel();
        adscLbl = new javax.swing.JLabel();
        departamentoLbl = new javax.swing.JLabel();
        numeroTFd = new javax.swing.JTextField();
        correoElectronico_IE_TFd = new javax.swing.JTextField();
        puestoCBx = new javax.swing.JComboBox();
        plantelCBx = new javax.swing.JComboBox();
        adscCBx = new javax.swing.JComboBox();
        departamentoCBx = new javax.swing.JComboBox();
        guardarBtn = new javax.swing.JButton();
        primerNombreLbl = new javax.swing.JLabel();
        primerNombreTFd = new javax.swing.JTextField();
        segNombreTFd = new javax.swing.JTextField();
        segNombreLbl = new javax.swing.JLabel();
        segApellidoTFd = new javax.swing.JTextField();
        segApellidoLbl = new javax.swing.JLabel();
        primerApellidoTFd = new javax.swing.JTextField();
        primerApellidoLbl = new javax.swing.JLabel();
        agregarLbl = new javax.swing.JLabel();
        agregarMsjLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        opcionPnl.setMaximumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setMinimumSize(new java.awt.Dimension(408, 587));
        opcionPnl.setPreferredSize(new java.awt.Dimension(408, 587));

        nombreBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarLbl.setText("Nombre del empledo:");

        adscBuscarLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adscBuscarLbl.setText("Adscripción del empleado:");

        nombreBuscarTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreBuscarTFd.setEnabled(false);

        tablaTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Eliminar"
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

        adscBuscarCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adscBuscarCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plantel", "Departamento" }));
        adscBuscarCBx.setEnabled(false);

        opcionMsjLbl.setText("Ingrese el nombre para buscar la información especifica");

        opcionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        opcionLbl.setText("Opciones ");

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
                        .addGap(9, 9, 9)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agregarBtn)
                                    .addComponent(adscBuscarLbl)
                                    .addComponent(nombreBuscarLbl))
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(opcionPnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                                .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                                .addComponent(adscBuscarCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(61, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))))
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcionLbl)
                                    .addComponent(opcionMsjLbl))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(opcionLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionMsjLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreBuscarTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreBuscarLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adscBuscarLbl)
                    .addComponent(adscBuscarCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBtn)
                    .addComponent(buscarBtn))
                .addGap(18, 18, 18)
                .addComponent(tablaSPn, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        informacioPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        puestoLbll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puestoLbll.setText("Puesto:");

        plantelLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plantelLbl.setText("Plantel:");

        numeroLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroLbl.setText("Num. Empleado:");

        correoELbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correoELbl.setText("Correo electrónico :");

        adscLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adscLbl.setText("Adscripción: ");

        departamentoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamentoLbl.setText("Departamento:");

        numeroTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeroTFd.setEnabled(false);

        correoElectronico_IE_TFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        correoElectronico_IE_TFd.setEnabled(false);

        puestoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puestoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        puestoCBx.setToolTipText("Seleccioné el puesto que esta asigando el empleado");
        puestoCBx.setEnabled(false);

        plantelCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plantelCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        plantelCBx.setToolTipText("Seleccioné el plantel que esta asigando el empleado");
        plantelCBx.setEnabled(false);

        adscCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adscCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plantel", "Departamento" }));
        adscCBx.setToolTipText("Seleccioné la  adscripción que esta asigando el empleado");
        adscCBx.setEnabled(false);

        departamentoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamentoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departamentoCBx.setToolTipText("Seleccioné el departamento que esta asigando el empleado");
        departamentoCBx.setEnabled(false);

        guardarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.setEnabled(false);
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        primerNombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primerNombreLbl.setText("Primer nombre:");

        primerNombreTFd.setEnabled(false);

        segNombreTFd.setEnabled(false);

        segNombreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        segNombreLbl.setText("Segundo nombre:");

        segApellidoTFd.setEnabled(false);

        segApellidoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        segApellidoLbl.setText("Segundo apellido:");

        primerApellidoTFd.setEnabled(false);

        primerApellidoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        primerApellidoLbl.setText("Primer apellido:");

        agregarLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarLbl.setText("Agregar");

        agregarMsjLbl.setText("Ingrese la información a almacenar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("@cobachbc.edu.mx");

        javax.swing.GroupLayout informacioPnlLayout = new javax.swing.GroupLayout(informacioPnl);
        informacioPnl.setLayout(informacioPnlLayout);
        informacioPnlLayout.setHorizontalGroup(
            informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacioPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(informacioPnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(informacioPnlLayout.createSequentialGroup()
                            .addComponent(puestoLbll)
                            .addGap(82, 82, 82)
                            .addComponent(puestoCBx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(informacioPnlLayout.createSequentialGroup()
                            .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(primerNombreLbl)
                                .addComponent(primerApellidoLbl)
                                .addComponent(numeroLbl)
                                .addComponent(correoELbl)
                                .addComponent(adscLbl))
                            .addGap(8, 8, 8)
                            .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(informacioPnlLayout.createSequentialGroup()
                                    .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(correoElectronico_IE_TFd)
                                        .addComponent(primerApellidoTFd)
                                        .addComponent(primerNombreTFd)
                                        .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(informacioPnlLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(segNombreLbl)
                                                .addComponent(segApellidoLbl))
                                            .addGap(18, 18, 18)
                                            .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(segNombreTFd)
                                                .addComponent(segApellidoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(informacioPnlLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacioPnlLayout.createSequentialGroup()
                                                    .addComponent(departamentoLbl)
                                                    .addGap(25, 25, 25)))
                                            .addComponent(departamentoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(adscCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(plantelCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(38, 38, 38)))
                    .addComponent(agregarMsjLbl)
                    .addComponent(agregarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plantelLbl))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        informacioPnlLayout.setVerticalGroup(
            informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacioPnlLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(agregarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarMsjLbl)
                .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacioPnlLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(segNombreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(segNombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(primerNombreTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(informacioPnlLayout.createSequentialGroup()
                        .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroLbl)
                            .addComponent(numeroTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(primerNombreLbl)
                        .addGap(35, 35, 35)
                        .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(primerApellidoLbl)
                            .addComponent(segApellidoLbl)
                            .addComponent(primerApellidoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segApellidoTFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puestoLbll)
                    .addComponent(puestoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoELbl)
                    .addComponent(correoElectronico_IE_TFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adscLbl)
                    .addComponent(adscCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(informacioPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plantelLbl)
                    .addComponent(plantelCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departamentoLbl)
                    .addComponent(departamentoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacioPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(informacioPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento ejecutado al hacer click en el boton,obteniendo el texto de los 
     * campos validando que estos no esten vacios, manda llamar un metodo 
     * dependiendo del texto asignado al boton.
     * @param evt Evento al presionar el boton 
     */
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        //Se añaden la informacion de los campos a la lista de objetos
        List<Object> atributos = new ArrayList<>();
        atributos.add(numeroTFd.getText());
        atributos.add(primerNombreTFd.getText());
        atributos.add(segNombreTFd.getText());
        atributos.add(primerApellidoTFd.getText());
        atributos.add(segApellidoTFd.getText());
        atributos.add(puestoCBx.getSelectedItem());
        atributos.add(correoElectronico_IE_TFd.getText());
        atributos.add(adscCBx.getSelectedItem());
        atributos.add(plantelCBx.getSelectedItem());
        atributos.add(departamentoCBx.getSelectedItem());
        
        //Se limpian los campos
        numeroTFd.setText("");
        primerNombreTFd.setText("");
        segNombreTFd.setText("");
        primerApellidoTFd.setText("");
        segApellidoTFd.setText("");
        correoElectronico_IE_TFd.setText("");        
        
        //Se selecciona el metodo que se va manadar llamar, obteniendo el texto 
        //contenido en el boton.
        if(!guardarBtn.getText().equalsIgnoreCase("modificar"))
            control.alta(HelperEntidad.getEmpleado(atributos));
        else{
            atributos.add(idEmpleadoActual);
            control.modificacion(HelperEntidad.getEmpleado(atributos));
        }
        
        control.buscarTodos();
    }//GEN-LAST:event_guardarBtnActionPerformed

     
    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        int renglon = tablaTbl.getSelectedRow();
        if(renglon == -1) {
            //Activar el panel
            setEnabledPanelInformacion(true);
        }else{
            //Llenar el panel
            int id = Integer.parseInt((String)model.getValueAt(renglon, 0));
            control.buscar(id);            
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    /**
     * Evento ejecutado al hace click en la tabla, se calcula en que columna y 
     * renglon se llevo a cabo el click, en caso de ser en la columna eliminar
     * se presentara l
     * a opcion de eliminar el registro correspondiente al
     * renglon.
     * @param evt Evento al hacer click
     */
    private void tablaTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTblMouseClicked
        //Obtenelos el renglon y columna donde se hizo click
        int row = tablaTbl.rowAtPoint(evt.getPoint());
        int col = tablaTbl.columnAtPoint(evt.getPoint());
        if(col == 2) {
            //System.out.println("ID: " + model.getValueAt(row, 0));
            //Preguntamos si esta seguro de la eliminacion
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar este registro?",
                    "Precaucion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(op == 0){
                //System.out.println("BORRAR");
                //Obtenemos ID de la columna escondida
                int id = Integer.parseInt((String)model.getValueAt(row, 0));
                control.baja(id);
                control.buscarTodos();
            }else{
                model.setValueAt(false, row, 3);
            }
        }
    }//GEN-LAST:event_tablaTblMouseClicked

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adscBuscarCBx;
    private javax.swing.JLabel adscBuscarLbl;
    private javax.swing.JComboBox adscCBx;
    private javax.swing.JLabel adscLbl;
    private javax.swing.JButton agregarBtn;
    private javax.swing.JLabel agregarLbl;
    private javax.swing.JLabel agregarMsjLbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JLabel correoELbl;
    private javax.swing.JTextField correoElectronico_IE_TFd;
    private javax.swing.JComboBox departamentoCBx;
    private javax.swing.JLabel departamentoLbl;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JPanel informacioPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombreBuscarLbl;
    private javax.swing.JTextField nombreBuscarTFd;
    private javax.swing.JLabel numeroLbl;
    private javax.swing.JTextField numeroTFd;
    private javax.swing.JLabel opcionLbl;
    private javax.swing.JLabel opcionMsjLbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JComboBox plantelCBx;
    private javax.swing.JLabel plantelLbl;
    private javax.swing.JLabel primerApellidoLbl;
    private javax.swing.JTextField primerApellidoTFd;
    private javax.swing.JLabel primerNombreLbl;
    private javax.swing.JTextField primerNombreTFd;
    private javax.swing.JComboBox puestoCBx;
    private javax.swing.JLabel puestoLbll;
    private javax.swing.JLabel segApellidoLbl;
    private javax.swing.JTextField segApellidoTFd;
    private javax.swing.JLabel segNombreLbl;
    private javax.swing.JTextField segNombreTFd;
    private javax.swing.JScrollPane tablaSPn;
    private javax.swing.JTable tablaTbl;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje,
                "Informacion", JOptionPane.INFORMATION_MESSAGE);
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
        TableColumn tc = tablaTbl.getColumnModel().getColumn(3);
        tc.setCellEditor(tablaTbl.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tablaTbl.getDefaultRenderer(Boolean.class));
        //Esconder columna ID
        tc = tablaTbl.getColumnModel().getColumn(0);
        tablaTbl.getColumnModel().removeColumn(tc);
    }

    @Override
    public void setLista(List info, int i) {
        if(info.isEmpty()) return;
        switch(i){
            case 1:
                puestoModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  puestoModel.addElement(info.get(j));
                }
                break;
            case 2:
                plantelModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  plantelModel.addElement(info.get(j));
                }
                break;
            case 3:
                dptoModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  dptoModel.addElement(info.get(j));
                }
                break;
            case 4:
                adscripModel.removeAllElements();
                for(int j = 0; j < info.size(); j++){
                  adscripModel.addElement(info.get(j));
                }
                break;                
        }
    }
    
    public void llenarTodo(){
//        control.buscarTodos();
        control.setClass(Puesto.class);
        control.buscarTodosLista(1);
//        control.setClass(Plantel.class);
//        control.buscarTodosLista(2);
//        control.setClass(Departamento.class);
//        control.buscarTodosLista(3);
//        control.setClass(Adscripcion.class);
//        control.buscarTodosLista(4);
//        control.setClass(Empleado.class);
        setEnabledPanelInformacion(false);
        
    }
    
    // Metodo que hace visibles o invisibles los campos del panel informacion
    private void setEnabledPanelInformacion(boolean b){
        numeroTFd.setEnabled(b);
        primerNombreTFd.setEnabled(b);
        segNombreTFd.setEnabled(b);
        primerApellidoTFd.setEnabled(b);
        segApellidoTFd.setEnabled(b);
        correoElectronico_IE_TFd.setEnabled(b);
        puestoCBx.setEnabled(b);
        plantelCBx.setEnabled(b);
        adscCBx.setEnabled(b);
        departamentoCBx.setEnabled(b);
        guardarBtn.setEnabled(b);
    }

    /**
     * Metodo sobrescrito de la clase comunicador que recibe una Lista con la 
     * los resultados de una busqueda especifica y vaciarlo en los campos y 
     * checkbox
     * @param info Lista de Objeto con información de búsqueda.
     */
    @Override
    public void setInfo(List info) {
        setEnabledPanelInformacion(true);
        idEmpleadoActual = (int) info.get(0);
        numeroTFd.setText((String) info.get(1));
        primerNombreTFd.setText((String) info.get(2));
        segNombreTFd.setText((String) info.get(3));
        primerApellidoTFd.setText((String) info.get(4));
        segApellidoTFd.setText((String) info.get(5));
        correoElectronico_IE_TFd.setText((String) info.get(6));
        puestoModel.setSelectedItem(info.get(7));
        plantelModel.setSelectedItem(info.get(8));
        adscripModel.setSelectedItem(info.get(9));
        dptoModel.setSelectedItem(info.get(10));
        guardarBtn.setText("Modificar");
    }

}
