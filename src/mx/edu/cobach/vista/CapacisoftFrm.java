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
public class CapacisoftFrm extends javax.swing.JFrame implements CapaciSoftInt{// implements ActionListener{
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
    private PnlDireccion direccionPnl;
    private PnlSede sedePnl;
    private PnlProveedor proveedorPnl;
    private PnlEmpleadoAdministrativo empleadoPnl;
    private PnlRegistrarEvento eventoPnl;
    private PnlKardex kardexPnl;
    private PnlReporteEvento reporteCursoPnl;
    private PnlListaAsistencia listaAsistenciaPnl;
    private final ImageIcon imageLogo;
    private int idTipo;
    private final String usuario;
    
    public CapacisoftFrm(String tipo, String usuario) {
        imageLogo = new ImageIcon(CapacisoftFrm.class.getResource("/mx/edu/cobach/"
                + "vista/recursos/logo.png"));
        setTitle("CapaciSoft");
        
        //this.tipo=tipo;
        getIdTipo(tipo);
        this.usuario = usuario;
        initComponents();
        setLayout(new BorderLayout());
        agregar();
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(imageLogo.getImage());
        apagarLogin(true);
        
        if(idTipo != 3){
            this.setTitle("Capacisoft - Administar Alertas");
            ocultarPaneles();
            alertasPnl.setVisible(true);
        }
    }
    
    private void getIdTipo(String tipo){
        switch(tipo){
            case "ADMINISTRADOR": idTipo=1; break;
            case "ANALISTA": idTipo=2; break;
            case "SECRETARIA": idTipo=3; break;
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
        usuarioPnl = new PnlUsuarios(usuario);
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
            
        direccionPnl = new PnlDireccion();
        direccionPnl.setVisible(false);
        direccionPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(direccionPnl);
        
        sedePnl = new PnlSede();
        sedePnl.setVisible(false);
        sedePnl.setSize(1181,587);
        //if(idTipo!=3)
            add(sedePnl);
        
        proveedorPnl = new PnlProveedor(this);
        proveedorPnl.setVisible(false);
        proveedorPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(proveedorPnl);
        
        empleadoPnl = new PnlEmpleadoAdministrativo();
        empleadoPnl.setVisible(false);
        empleadoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(empleadoPnl);
        
        eventoPnl = new PnlRegistrarEvento();
        eventoPnl.setVisible(false);
        eventoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(eventoPnl);
        
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
        
        seguimientoPnl = new PnlSeguimiento(this);
        seguimientoPnl.setVisible(false);
        seguimientoPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(seguimientoPnl);/*preguntar*/
            
        
        programarPnl = new PnlProgramarEvento(this);
        programarPnl.setVisible(false);
        programarPnl.setSize(1181,587);
       // if(idTipo!=3)
            add(programarPnl); 
        
        alertasPnl = new PnlAlertas(programarPnl, seguimientoPnl);
        alertasPnl.setVisible(false);
        alertasPnl.setSize(1181,587);
        //if(idTipo!=3)
            add(alertasPnl);
        if(idTipo==2 || idTipo==3)
            usuarioMIt.setVisible(false);
        if(idTipo==3){
            mantenimientoMn.setVisible(false);
            procesosMn.setVisible(false);
        }
    }
    
    @Override
    public void apagarLogin(boolean valor){
        if(valor==true){
            mantenimientoMn.setEnabled(true);
            reportesMn.setEnabled(true);
            procesosMn.setEnabled(true);
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
        mantenimientoMn = new javax.swing.JMenu();
        usuarioMIt = new javax.swing.JMenuItem();
        plantelesMIt = new javax.swing.JMenuItem();
        departamentosMIt = new javax.swing.JMenuItem();
        puestosMIt = new javax.swing.JMenuItem();
        direccionMIt = new javax.swing.JMenuItem();
        sedesMIt = new javax.swing.JMenuItem();
        proveedoresMIt = new javax.swing.JMenuItem();
        empleadoMIt = new javax.swing.JMenuItem();
        eventoMIt = new javax.swing.JMenuItem();
        reportesMn = new javax.swing.JMenu();
        kardexMIt = new javax.swing.JMenuItem();
        reporteEventoMIt = new javax.swing.JMenuItem();
        listaMIt = new javax.swing.JMenuItem();
        procesosMn = new javax.swing.JMenu();
        programarEventoMIt = new javax.swing.JMenuItem();
        encuestaMIt = new javax.swing.JMenuItem();
        alertasMIt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        barraMenu.setToolTipText("");
        barraMenu.setAlignmentY(0.5F);
        barraMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barraMenu.setMaximumSize(new java.awt.Dimension(300, 32769));
        barraMenu.setMinimumSize(new java.awt.Dimension(50, 21));
        barraMenu.setPreferredSize(new java.awt.Dimension(300, 25));

        mantenimientoMn.setBorder(null);
        mantenimientoMn.setText("Mantenimiento");
        mantenimientoMn.setEnabled(false);
        mantenimientoMn.setIconTextGap(20);
        mantenimientoMn.setPreferredSize(new java.awt.Dimension(120, 19));

        usuarioMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/usuario.png"))); // NOI18N
        usuarioMIt.setText("Usuarios");
        usuarioMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(usuarioMIt);

        plantelesMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plantelesMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/plantel.png"))); // NOI18N
        plantelesMIt.setText("Planteles");
        plantelesMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantelesMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(plantelesMIt);

        departamentosMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamentosMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/departamento.png"))); // NOI18N
        departamentosMIt.setText("Departamentos");
        departamentosMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentosMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(departamentosMIt);

        puestosMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        puestosMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/puesto.png"))); // NOI18N
        puestosMIt.setText("Puestos");
        puestosMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestosMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(puestosMIt);

        direccionMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        direccionMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/departamento.png"))); // NOI18N
        direccionMIt.setText("Direcciones");
        direccionMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(direccionMIt);

        sedesMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sedesMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/sede.png"))); // NOI18N
        sedesMIt.setText("Sedes");
        sedesMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedesMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(sedesMIt);

        proveedoresMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proveedoresMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/proveedor.png"))); // NOI18N
        proveedoresMIt.setText("Proveedores");
        proveedoresMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(proveedoresMIt);

        empleadoMIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        empleadoMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empleadoMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/empleado.png"))); // NOI18N
        empleadoMIt.setText("Empleado Administrativo");
        empleadoMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(empleadoMIt);

        eventoMIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        eventoMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/curso.png"))); // NOI18N
        eventoMIt.setText("Evento de capacitación");
        eventoMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoMItActionPerformed(evt);
            }
        });
        mantenimientoMn.add(eventoMIt);

        barraMenu.add(mantenimientoMn);

        reportesMn.setText("Reportes");
        reportesMn.setEnabled(false);
        reportesMn.setIconTextGap(20);
        reportesMn.setPreferredSize(new java.awt.Dimension(100, 19));

        kardexMIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK));
        kardexMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kardexMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/kardex.png"))); // NOI18N
        kardexMIt.setText("Kardex");
        kardexMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kardexMItActionPerformed(evt);
            }
        });
        reportesMn.add(kardexMIt);

        reporteEventoMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reporteEventoMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/curso.png"))); // NOI18N
        reporteEventoMIt.setText("Evento de capacitación");
        reporteEventoMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteEventoMItActionPerformed(evt);
            }
        });
        reportesMn.add(reporteEventoMIt);

        listaMIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        listaMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/listasistencia.png"))); // NOI18N
        listaMIt.setText("Lista de asistencia");
        listaMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMItActionPerformed(evt);
            }
        });
        reportesMn.add(listaMIt);

        barraMenu.add(reportesMn);

        procesosMn.setText("Procesos");
        procesosMn.setEnabled(false);
        procesosMn.setIconTextGap(20);
        procesosMn.setPreferredSize(new java.awt.Dimension(80, 19));

        programarEventoMIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        programarEventoMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        programarEventoMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/Calendar.png"))); // NOI18N
        programarEventoMIt.setText("Programar Evento");
        programarEventoMIt.setPreferredSize(new java.awt.Dimension(100, 22));
        programarEventoMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programarEventoMItActionPerformed(evt);
            }
        });
        procesosMn.add(programarEventoMIt);

        encuestaMIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        encuestaMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        encuestaMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/encuesta.png"))); // NOI18N
        encuestaMIt.setText("Realizar Encuesta");
        encuestaMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encuestaMItActionPerformed(evt);
            }
        });
        procesosMn.add(encuestaMIt);

        alertasMIt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        alertasMIt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alertasMIt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/edu/cobach/vista/recursos/alerta.png"))); // NOI18N
        alertasMIt.setText("Administrar Alertas");
        alertasMIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertasMItActionPerformed(evt);
            }
        });
        procesosMn.add(alertasMIt);

        barraMenu.add(procesosMn);

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

    private void encuestaMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encuestaMItActionPerformed
        this.setTitle("Capacisoft - Realizar Encuesta");
        ocultarPaneles();
        seguimientoPnl.setVisible(true);
        seguimientoPnl.llenarTodo();
    }//GEN-LAST:event_encuestaMItActionPerformed

    public void visualizarEncuesta(){
        encuestaMItActionPerformed(null);
    }
    
    private void kardexMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kardexMItActionPerformed
        this.setTitle("Capacisoft - Kardex");
        ocultarPaneles();
        kardexPnl.setVisible(true);
    }//GEN-LAST:event_kardexMItActionPerformed

    private void listaMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMItActionPerformed
        this.setTitle("Capacisoft - Lista de asistencia");
        ocultarPaneles();
        listaAsistenciaPnl.setVisible(true);
    }//GEN-LAST:event_listaMItActionPerformed

    private void alertasMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertasMItActionPerformed
        this.setTitle("Capacisoft - Administar Alertas");
        ocultarPaneles();
        alertasPnl.setVisible(true);
    }//GEN-LAST:event_alertasMItActionPerformed

    private void programarEventoMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programarEventoMItActionPerformed
        this.setTitle("Capacisoft - Programar Evento");
        ocultarPaneles();
        programarPnl.setVisible(true);
        programarPnl.llenarTodo();
    }//GEN-LAST:event_programarEventoMItActionPerformed

    private void eventoMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoMItActionPerformed
        this.setTitle("Capacisoft - Evento de capacitación");
        ocultarPaneles();
        eventoPnl.setVisible(true);
        eventoPnl.llenarTodo();
    }//GEN-LAST:event_eventoMItActionPerformed

    public void visualizarEvento(){
        this.eventoMItActionPerformed(null);
    }
    
    private void empleadoMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoMItActionPerformed
        this.setTitle("Capacisoft - Empleado Administrativo");
        ocultarPaneles();
        empleadoPnl.setVisible(true);
        empleadoPnl.llenarTodo();
    }//GEN-LAST:event_empleadoMItActionPerformed

    private void proveedoresMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresMItActionPerformed
        this.setTitle("Capacisoft - Proveedor");
        ocultarPaneles();
        proveedorPnl.setVisible(true);
        proveedorPnl.llenarTodo();
    }//GEN-LAST:event_proveedoresMItActionPerformed

    private void sedesMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedesMItActionPerformed
        this.setTitle("Capacisoft - Sede");
        ocultarPaneles();
        sedePnl.setVisible(true);
        sedePnl.llenarTodo();
    }//GEN-LAST:event_sedesMItActionPerformed

    private void puestosMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestosMItActionPerformed
        this.setTitle("Capacisoft - Puesto");
        ocultarPaneles();
        puestoPnl.setVisible(true);
        puestoPnl.llenarTodo();
    }//GEN-LAST:event_puestosMItActionPerformed

    private void departamentosMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentosMItActionPerformed
        this.setTitle("Capacisoft - Departamento");
        ocultarPaneles();
        departamentoPnl.setVisible(true);
        departamentoPnl.llenarTodo();
    }//GEN-LAST:event_departamentosMItActionPerformed

    private void plantelesMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantelesMItActionPerformed
        this.setTitle("Capacisoft - Plantel");
        ocultarPaneles();
        plantelPnl.setVisible(true);
        plantelPnl.llenarTodo();
    }//GEN-LAST:event_plantelesMItActionPerformed

    private void usuarioMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioMItActionPerformed
        this.setTitle("Capacisoft - Usuario");
        ocultarPaneles();
        usuarioPnl.setVisible(true);
        usuarioPnl.llenarTodo();
    }//GEN-LAST:event_usuarioMItActionPerformed

    private void reporteEventoMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteEventoMItActionPerformed
        this.setTitle("Capacisoft - Evento de capacitación");
        ocultarPaneles();
        reporteCursoPnl.setVisible(true);
        reporteCursoPnl.llenarTodo();
    }//GEN-LAST:event_reporteEventoMItActionPerformed

    private void direccionMItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionMItActionPerformed
       this.setTitle("Capacisoft - Direcciones");
        ocultarPaneles();
        direccionPnl.setVisible(true);
        direccionPnl.llenarTodo();
    }//GEN-LAST:event_direccionMItActionPerformed

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
    private javax.swing.JMenuItem alertasMIt;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem departamentosMIt;
    private javax.swing.JMenuItem direccionMIt;
    private javax.swing.JMenuItem empleadoMIt;
    public javax.swing.JMenuItem encuestaMIt;
    private javax.swing.JMenuItem eventoMIt;
    private javax.swing.JMenuItem kardexMIt;
    private javax.swing.JMenuItem listaMIt;
    private javax.swing.JMenu mantenimientoMn;
    private javax.swing.JMenuItem plantelesMIt;
    private javax.swing.JMenu procesosMn;
    private javax.swing.JMenuItem programarEventoMIt;
    private javax.swing.JMenuItem proveedoresMIt;
    private javax.swing.JMenuItem puestosMIt;
    private javax.swing.JMenuItem reporteEventoMIt;
    private javax.swing.JMenu reportesMn;
    private javax.swing.JMenuItem sedesMIt;
    private javax.swing.JMenuItem usuarioMIt;
    // End of variables declaration//GEN-END:variables

    
    private void ocultarPaneles(){
        usuarioPnl.setVisible(false);
        plantelPnl.setVisible(false);
        departamentoPnl.setVisible(false);
        puestoPnl.setVisible(false);
        direccionPnl.setVisible(false);
        sedePnl.setVisible(false);
        proveedorPnl.setVisible(false);
        eventoPnl.setVisible(false);
        empleadoPnl.setVisible(false);
        kardexPnl.setVisible(false);
        reporteCursoPnl.setVisible(false);
        listaAsistenciaPnl.setVisible(false);
        programarPnl.setVisible(false);
        seguimientoPnl.setVisible(false);
        alertasPnl.setVisible(false);
    }
}
