/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author liuts
 */
public class Capacisoft extends javax.swing.JFrame implements CapaciSoftInt{// implements ActionListener{
    /**
     * Creates new form Capacisoft
     */
    

    private PnlAlertas alertasPnl;
    private PnlSeguimiento seguimientoPnl;
    private PnlProgramarEvento programarPnl;
    private PnlUsuarios usuarioPnl;
    private PnlPlantel plantelPnl;
    private PnlDepartamento departamentoPnl;
    private PnlPuestos puestoPnl;
    private PnlSede sedePnl;
    private PnlProveedor proveedorPnl;
    private PnlEmpleadoAdministrativo empleadoPnl;
    private PnlRegistrarEvento cursoPnl;
    private PnlKardex kardexPnl;
    private PnlReporteEvento reporteCursoPnl;
    private PnlListaAsistencia listaAsistenciaPnl;
    private final ImageIcon imageLogo;
    private int idTipo;
    
    public Capacisoft(String tipo) {
        imageLogo = new ImageIcon(Capacisoft.class.getResource("/mx/edu/cobach/"
                + "vista/recursos/logo.png"));
        setTitle("CapaciSoft");
        
        //this.tipo=tipo;
        getIdTipo(tipo);
        initComponents();
        setLayout(new BorderLayout());
        agregar();
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(imageLogo.getImage());
        apagarLogin(true);
    }
    
    private void getIdTipo(String tipo){
        switch(tipo){
            case "Administrador": idTipo=1; break;
            case "Analista": idTipo=2; break;
            case "Secretaria": idTipo=3; break;
            default : idTipo=3; break;
        }      
        //System.out.println("tipo: "+idTipo);
    
    }
    /*
        Se agregan las instancias de las clases, hacen invisible los paneles
        se le da tamano y se agregan al frame
    */
   private void agregar(){
        //Mantenimientos
        usuarioPnl = new PnlUsuarios();
        usuarioPnl.setVisible(false);
        usuarioPnl.setSize(1181,587);
        //if(idTipo==1)
            add(usuarioPnl);
        
        plantelPnl = new PnlPlantel();
        plantelPnl.setVisible(false);
        plantelPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(plantelPnl);
        
        departamentoPnl = new PnlDepartamento();
        departamentoPnl.setVisible(false);
        departamentoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(departamentoPnl);
        
        puestoPnl = new PnlPuestos();
        puestoPnl.setVisible(false);
        puestoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(puestoPnl);
        
        sedePnl = new PnlSede();
        sedePnl.setVisible(false);
        sedePnl.setSize(1181,587);
        //if(idTipo!=3)
            add(sedePnl);
        
        proveedorPnl = new PnlProveedor();
        proveedorPnl.setVisible(false);
        proveedorPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(proveedorPnl);
        
        empleadoPnl = new PnlEmpleadoAdministrativo();
        empleadoPnl.setVisible(false);
        empleadoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(empleadoPnl);
        
        cursoPnl = new PnlRegistrarEvento();
        cursoPnl.setVisible(false);
        cursoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(cursoPnl);
        
        //Kardex
        kardexPnl = new PnlKardex();
        kardexPnl.setVisible(false);
        kardexPnl.setSize(1181,587);
        
        add(kardexPnl);
        
        reporteCursoPnl = new PnlReporteEvento();
        reporteCursoPnl.setVisible(false);
        reporteCursoPnl.setSize(1181,587);
        add(reporteCursoPnl);
        
        listaAsistenciaPnl = new PnlListaAsistencia();
        listaAsistenciaPnl.setVisible(false);
        listaAsistenciaPnl.setSize(1181,587);
        add(listaAsistenciaPnl);
        
        //Procesos
        alertasPnl = new PnlAlertas();
        alertasPnl.setVisible(false);
        alertasPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(alertasPnl);
        
        seguimientoPnl = new PnlSeguimiento();
        seguimientoPnl.setVisible(false);
        seguimientoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(seguimientoPnl);/*preguntar*/
        
        programarPnl = new PnlProgramarEvento();
        programarPnl.setVisible(false);
        programarPnl.setSize(1181,587);
       // if(idTipo!=3)
            add(programarPnl); 
        
        if(idTipo==2 || idTipo==3)
            usuario_MIt.setVisible(false);
        if(idTipo==3){
            mantenimientoCurso_Mn.setVisible(false);
            procesos_Mn.setVisible(false);
        }
    }
    
    @Override
    public void apagarLogin(boolean valor){
        if(valor==true){
            mantenimientoCurso_Mn.setEnabled(true);
            reportes_Mn.setEnabled(true);
            procesos_Mn.setEnabled(true);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        mantenimientoCurso_Mn = new javax.swing.JMenu();
        usuario_MIt = new javax.swing.JMenuItem();
        planteles_MIt = new javax.swing.JMenuItem();
        departamentos_MIt = new javax.swing.JMenuItem();
        puestos_MIt = new javax.swing.JMenuItem();
        sedes_MIt = new javax.swing.JMenuItem();
        proveedores_MIt = new javax.swing.JMenuItem();
        empleado_MIt = new javax.swing.JMenuItem();
        curso_MIt = new javax.swing.JMenuItem();
        reportes_Mn = new javax.swing.JMenu();
        kardex_MIt = new javax.swing.JMenuItem();
        registroCurso_MIt = new javax.swing.JMenuItem();
        evaluacionProveedor_MIt = new javax.swing.JMenuItem();
        lista_MIt = new javax.swing.JMenuItem();
        procesos_Mn = new javax.swing.JMenu();
        programarEvento_MIt = new javax.swing.JMenuItem();
        encuesta_MIt = new javax.swing.JMenuItem();
        alertas_MIt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraMenu.setToolTipText("");
        barraMenu.setAlignmentY(0.5F);
        barraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraMenu.setMaximumSize(new java.awt.Dimension(300, 32769));
        barraMenu.setMinimumSize(new java.awt.Dimension(50, 21));
        barraMenu.setPreferredSize(new java.awt.Dimension(300, 25));

        mantenimientoCurso_Mn.setBorder(null);
        mantenimientoCurso_Mn.setText("Mantenimiento");
        mantenimientoCurso_Mn.setEnabled(false);
        mantenimientoCurso_Mn.setIconTextGap(20);
        mantenimientoCurso_Mn.setPreferredSize(new java.awt.Dimension(120, 19));

        usuario_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/usuario.png"))); // NOI18N
        usuario_MIt.setText("Usuarios");
        usuario_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(usuario_MIt);

        planteles_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        planteles_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/plantel.png"))); // NOI18N
        planteles_MIt.setText("Planteles");
        planteles_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planteles_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(planteles_MIt);

        departamentos_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamentos_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/departamento.png"))); // NOI18N
        departamentos_MIt.setText("Departamentos");
        departamentos_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentos_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(departamentos_MIt);

        puestos_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puestos_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/puesto.png"))); // NOI18N
        puestos_MIt.setText("Puestos");
        puestos_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestos_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(puestos_MIt);

        sedes_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedes_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/sede.png"))); // NOI18N
        sedes_MIt.setText("Sedes");
        sedes_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedes_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(sedes_MIt);

        proveedores_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proveedores_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/proveedor.png"))); // NOI18N
        proveedores_MIt.setText("Proveedores");
        proveedores_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedores_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(proveedores_MIt);

        empleado_MIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        empleado_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empleado_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/empleado.png"))); // NOI18N
        empleado_MIt.setText("Empleado Administrativo");
        empleado_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleado_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(empleado_MIt);

        curso_MIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        curso_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        curso_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/curso.png"))); // NOI18N
        curso_MIt.setText("Cursos de capacitación");
        curso_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curso_MItActionPerformed(evt);
            }
        });
        mantenimientoCurso_Mn.add(curso_MIt);

        barraMenu.add(mantenimientoCurso_Mn);

        reportes_Mn.setText("Reportes");
        reportes_Mn.setEnabled(false);
        reportes_Mn.setIconTextGap(20);
        reportes_Mn.setPreferredSize(new java.awt.Dimension(100, 19));

        kardex_MIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK));
        kardex_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kardex_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/kardex.png"))); // NOI18N
        kardex_MIt.setText("Kardex");
        kardex_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kardex_MItActionPerformed(evt);
            }
        });
        reportes_Mn.add(kardex_MIt);

        registroCurso_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registroCurso_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/curso.png"))); // NOI18N
        registroCurso_MIt.setText("Cursos de capacitación");
        registroCurso_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroCurso_MItActionPerformed(evt);
            }
        });
        reportes_Mn.add(registroCurso_MIt);

        evaluacionProveedor_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        evaluacionProveedor_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/listaproveedor.png"))); // NOI18N
        evaluacionProveedor_MIt.setText("Evaluación proveedores");
        evaluacionProveedor_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluacionProveedor_MItActionPerformed(evt);
            }
        });
        reportes_Mn.add(evaluacionProveedor_MIt);

        lista_MIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        lista_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lista_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/listasistencia.png"))); // NOI18N
        lista_MIt.setText("Lista de asistencia");
        lista_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_MItActionPerformed(evt);
            }
        });
        reportes_Mn.add(lista_MIt);

        barraMenu.add(reportes_Mn);

        procesos_Mn.setText("Procesos");
        procesos_Mn.setEnabled(false);
        procesos_Mn.setIconTextGap(20);
        procesos_Mn.setPreferredSize(new java.awt.Dimension(80, 19));

        programarEvento_MIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        programarEvento_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        programarEvento_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/Calendar.png"))); // NOI18N
        programarEvento_MIt.setText("Programar Evento");
        programarEvento_MIt.setPreferredSize(new java.awt.Dimension(100, 22));
        programarEvento_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programarEvento_MItActionPerformed(evt);
            }
        });
        procesos_Mn.add(programarEvento_MIt);

        encuesta_MIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        encuesta_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        encuesta_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/encuesta.png"))); // NOI18N
        encuesta_MIt.setText("Realizar Encuesta");
        encuesta_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encuesta_MItActionPerformed(evt);
            }
        });
        procesos_Mn.add(encuesta_MIt);

        alertas_MIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        alertas_MIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alertas_MIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/alerta.png"))); // NOI18N
        alertas_MIt.setText("Administrar Alertas");
        alertas_MIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertas_MItActionPerformed(evt);
            }
        });
        procesos_Mn.add(alertas_MIt);

        barraMenu.add(procesos_Mn);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encuesta_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encuesta_MItActionPerformed
        this.setTitle("Capacisoft - Realizar Encuesta");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(true);
        alertasPnl.setVisible(false);
        seguimientoPnl.llenarTodo();
    }//GEN-LAST:event_encuesta_MItActionPerformed

    private void kardex_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kardex_MItActionPerformed
        this.setTitle("Capacisoft - Kardex");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(true);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_kardex_MItActionPerformed

    private void registroCurso_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroCurso_MItActionPerformed
        this.setTitle("Capacisoft - Evento de capacitación");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(true);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
        reporteCursoPnl.llenarTodo();
    }//GEN-LAST:event_registroCurso_MItActionPerformed

    private void lista_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_MItActionPerformed
        this.setTitle("Capacisoft - Lista de asistencia");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(true);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_lista_MItActionPerformed

    private void alertas_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertas_MItActionPerformed
        this.setTitle("Capacisoft - Administar Alertas");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(true);
    }//GEN-LAST:event_alertas_MItActionPerformed

    private void programarEvento_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programarEvento_MItActionPerformed
        this.setTitle("Capacisoft - Programar Evento");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(true);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
        programarPnl.llenarTodo();
    }//GEN-LAST:event_programarEvento_MItActionPerformed

    private void curso_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curso_MItActionPerformed
        this.setTitle("Capacisoft - Curso de capacitación");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(true);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_curso_MItActionPerformed

    private void empleado_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleado_MItActionPerformed
        this.setTitle("Capacisoft - Empleado Administrativo");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(true);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
        empleadoPnl.llenarTodo();
    }//GEN-LAST:event_empleado_MItActionPerformed

    private void proveedores_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedores_MItActionPerformed
        this.setTitle("Capacisoft - Proveedor");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(true);
        empleadoPnl.setVisible(false);
        cursoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_proveedores_MItActionPerformed

    private void sedes_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedes_MItActionPerformed
        this.setTitle("Capacisoft - Sede");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(true);
        proveedorPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        cursoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_sedes_MItActionPerformed

    private void puestos_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestos_MItActionPerformed
        this.setTitle("Capacisoft - Puesto");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(true);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        cursoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_puestos_MItActionPerformed

    private void departamentos_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentos_MItActionPerformed
        this.setTitle("Capacisoft - Departamento");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(true);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        cursoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_departamentos_MItActionPerformed

    private void planteles_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planteles_MItActionPerformed
        this.setTitle("Capacisoft - Plantel");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(true);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        cursoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_planteles_MItActionPerformed

    private void usuario_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_MItActionPerformed
        this.setTitle("Capacisoft - Usuario");
        usuarioPnl.setVisible(true);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        cursoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_usuario_MItActionPerformed

    private void evaluacionProveedor_MItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluacionProveedor_MItActionPerformed
        this.setTitle("Capacisoft - Evaluación de proveedores");
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        cursoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }//GEN-LAST:event_evaluacionProveedor_MItActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       // try {
       //     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
      //          if ("Nimbus".equals(info.getName())) {
      //              javax.swing.UIManager.setLookAndFeel(info.getClassName());
      //              break;
      //          }
      //      }
      //  } catch (ClassNotFoundException ex) {
      //      java.util.logging.Logger.getLogger(Capacisoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  } catch (InstantiationException ex) {
     //       java.util.logging.Logger.getLogger(Capacisoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  } catch (IllegalAccessException ex) {
      //      java.util.logging.Logger.getLogger(Capacisoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      //      java.util.logging.Logger.getLogger(Capacisoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
   //     java.awt.EventQueue.invokeLater(new Runnable() {
   //         public void run() {
    //            new Capacisoft().setVisible(true);
    //        }
    //    });
    //}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alertas_MIt;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem curso_MIt;
    private javax.swing.JMenuItem departamentos_MIt;
    private javax.swing.JMenuItem empleado_MIt;
    private javax.swing.JMenuItem encuesta_MIt;
    private javax.swing.JMenuItem evaluacionProveedor_MIt;
    private javax.swing.JMenuItem kardex_MIt;
    private javax.swing.JMenuItem lista_MIt;
    private javax.swing.JMenu mantenimientoCurso_Mn;
    private javax.swing.JMenuItem planteles_MIt;
    private javax.swing.JMenu procesos_Mn;
    private javax.swing.JMenuItem programarEvento_MIt;
    private javax.swing.JMenuItem proveedores_MIt;
    private javax.swing.JMenuItem puestos_MIt;
    private javax.swing.JMenuItem registroCurso_MIt;
    private javax.swing.JMenu reportes_Mn;
    private javax.swing.JMenuItem sedes_MIt;
    private javax.swing.JMenuItem usuario_MIt;
    // End of variables declaration//GEN-END:variables

}
