/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import mx.edu.cobach.vista.controlador.AlertaControlador;
import mx.edu.cobach.persistencia.entidades.Alerta;
import mx.edu.cobach.persistencia.entidades.ImplementacionEvento;
import mx.edu.cobach.vista.controlador.ImplementarEventoControlador;

/**
 *
 * @author Melissa Ferrer
 */
public final class PnlAlertas extends javax.swing.JPanel implements Comunicador{// class

    private AlertaControlador control;
    // matriz con el tipo de alerta correspondiente
    private int[][] tipoAlertas;
    // matriz en representación de páginas de alertas
    private ImplementacionEvento[][] implementaciones;
    // opción previamente seleccionada al actualizar periodo
    private String[] periodoAnt;
    // largo predefinido de las alertas
    private final int WIDTH1 = 800;
    // panel de programacion de eventos
    private final PnlProgramarEvento eventoPnl;
    // panel de realizacion de encuesta
    private final PnlSeguimiento encuestaPnl;
    
    /**
     * Crea un nuevo panel PnlAlertas y en caso de ser inicio de semestre se
     * programan alertas de implementaciones anteriores.
     * 
     * @param eventoPnl
     * @param encuestaPnl
     */
    public PnlAlertas(PnlProgramarEvento eventoPnl, PnlSeguimiento encuestaPnl){// method
        initComponents();
        this.eventoPnl = eventoPnl;
        this.encuestaPnl = encuestaPnl;
        control = new AlertaControlador(this, Alerta.class);
        periodoAnt = new String[4];
        
        periodoPnl.setLocation(55, 79);
        cancelarBtn.setSize(cancelarBtn.getSize().width, 25);
        aceptarBtn.setSize(aceptarBtn.getSize().width, 25);
        informacionPnl.setSize(WIDTH, 600);
        alertasSPn.setSize( WIDTH, 600);
        alertasPnl.setSize(WIDTH - 10, 595);
        alertasSPn.setViewportView(alertasPnl);
        alertasSPn.setSize(750, 585);
        
        alerta1Pnl.setVisible(false);
        alerta2Pnl.setVisible(false);
        alerta3Pnl.setVisible(false);
        alerta4Pnl.setVisible(false);
        anteriorBtn.setEnabled(false);
        siguienteBtn.setEnabled(false);
        
        verificarImplementaciones();
        
        // Semestre -1
        try {//try
            ImplementarEventoControlador control1 = eventoPnl.control;
            Date actual = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String[] fecha = sdf.format(actual).split("/");
            // Linea para probar el alta de alertas de eventos programados.
//            Date programacion = actual;
            Date programacion = sdf.parse("15/01/" + fecha[2]);
            if(actual.equals(programacion)){//if
                
                List<Object> programar = control1.buscarTodosLista();
                List<Object> auxiliar = new ArrayList();
                Date inicio = sdf.parse("15/08/" + (Integer.parseInt(fecha[2]) - 1));
                Date fin = sdf.parse("14/01/" + (Integer.parseInt(fecha[2])));
                for(Object o : programar){//for
                    ImplementacionEvento ie = (ImplementacionEvento) o;
                    if((ie.getFechaInicial().after(inicio)
                            || ie.getFechaInicial().equals(inicio))
                            &&(ie.getFechaFinal().after(fin)
                            || ie.getFechaFinal().equals(fin))
                            && !ie.isActivo()){//if
                        auxiliar.add(o);
                    }//if
                }//for
                programar = auxiliar;
                
                if(programar.size() > 0){//if
                    Object[] objetos = new Object[programar.size()];
                    int i = 0;
                    for(Object obj : programar){//for
                        ImplementacionEvento e = (ImplementacionEvento) obj;
                        e.setId(null);
                        e.setFechaInicial(actual);
                        e.setFechaFinal(actual);
                        e.setActivo(true);

                        Set<Alerta> alertas = new HashSet();
                        Alerta a = new Alerta();
                        a.setId(1);
                        alertas.add(a);
                        e.setAlertas(alertas);
                        objetos[i] = e;
                        i++;
                    }//for
                    control1.alta(objetos);
                }//if
            }//if
            else{//else
                // Linea para probar el alta de alertas de eventos programados.
//                programacion = actual;
                programacion = sdf.parse("15/08/" + fecha[2]);
                if(actual.equals(programacion)){//if
                    // semestre -2
                    List<Object> programar = control1.buscarTodosLista();
                    List<Object> auxiliar = new ArrayList();
                    Date inicio = sdf.parse("15/01/" + (Integer.parseInt(fecha[2])));
                    Date fin = sdf.parse("14/08/" + (Integer.parseInt(fecha[2])));
                    for(Object o : programar){//for
                        ImplementacionEvento ie = (ImplementacionEvento) o;
                        if((ie.getFechaInicial().after(inicio)
                                || ie.getFechaInicial().equals(inicio))
                                &&(ie.getFechaFinal().after(fin)
                                || ie.getFechaFinal().equals(fin))
                                && !ie.isActivo()){//if
                            auxiliar.add(o);
                        }//if
                    }//for
                    programar = auxiliar;

                    if(programar.size() > 0){//if
                        for(Object obj : programar){//for
                            ImplementacionEvento e = (ImplementacionEvento) obj;
                            e.setId(null);
                            e.setFechaInicial(actual);
                            e.setFechaFinal(actual);
                            e.setActivo(true);

                            Set<Alerta> alertas = new HashSet();
                            Alerta a = new Alerta();
                            a.setId(1);
                            alertas.add(a);
                            e.setAlertas(alertas);
                            control1.alta(e);
                        }//for
                    }//if
                }//if
            }//else
        }//try
        catch (ParseException ex) {//catch
//            setMensaje("Ocurrió un error inesperado al convertir la fecha."
//                    + "/Error/" + JOptionPane.ERROR_MESSAGE);
        }//catch
        
        consultarAlerta();
    }// method

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionPnl = new javax.swing.JPanel();
        tipoLbl = new javax.swing.JLabel();
        seleccionCBx = new javax.swing.JComboBox();
        periodoPnl = new javax.swing.JPanel();
        eventoLbl = new javax.swing.JLabel();
        informacionLbl = new javax.swing.JLabel();
        encuestaLbl = new javax.swing.JLabel();
        eventoSpn = new javax.swing.JSpinner();
        informacionSpn = new javax.swing.JSpinner();
        encuestaSpn = new javax.swing.JSpinner();
        eventoCBx = new javax.swing.JComboBox();
        informacionCBx = new javax.swing.JComboBox();
        encuestaCBx = new javax.swing.JComboBox();
        cancelarBtn = new javax.swing.JButton();
        aceptarBtn = new javax.swing.JButton();
        periodoBtn = new javax.swing.JButton();
        descripcionLbl = new javax.swing.JLabel();
        informacionPnl = new javax.swing.JPanel();
        alertasSPn = new javax.swing.JScrollPane();
        alertasPnl = new javax.swing.JPanel();
        alerta1Pnl = new javax.swing.JPanel();
        tipoAlerta1Lbl = new javax.swing.JLabel();
        inicio1Lbl = new javax.swing.JLabel();
        fin1Lbl = new javax.swing.JLabel();
        inicio1Txf = new javax.swing.JTextField();
        fin1Txf = new javax.swing.JTextField();
        nombre1Lbl = new javax.swing.JLabel();
        sede1Lbl = new javax.swing.JLabel();
        nombreSede1Lbl = new javax.swing.JLabel();
        resolver1Btn = new javax.swing.JButton();
        instruc1Lbl = new javax.swing.JLabel();
        alerta2Pnl = new javax.swing.JPanel();
        nombre2Lbl = new javax.swing.JLabel();
        inicio2Lbl = new javax.swing.JLabel();
        tipoAlerta2Lbl = new javax.swing.JLabel();
        inicio2Txf = new javax.swing.JTextField();
        sede2Lbl = new javax.swing.JLabel();
        fin2Txf = new javax.swing.JTextField();
        nombreSede2Lbl = new javax.swing.JLabel();
        fin2Lbl = new javax.swing.JLabel();
        resolver2Btn = new javax.swing.JButton();
        instruc2Lbl = new javax.swing.JLabel();
        alerta3Pnl = new javax.swing.JPanel();
        nombre3Lbl = new javax.swing.JLabel();
        tipoAlerta3Lbl = new javax.swing.JLabel();
        sede3Lbl = new javax.swing.JLabel();
        nombreSede3Lbl = new javax.swing.JLabel();
        instruc3Lbl = new javax.swing.JLabel();
        resolver3Btn = new javax.swing.JButton();
        inicio3Lbl = new javax.swing.JLabel();
        inicio3Txf = new javax.swing.JTextField();
        fin3Lbl = new javax.swing.JLabel();
        fin3Txf = new javax.swing.JTextField();
        alerta4Pnl = new javax.swing.JPanel();
        nombre4Lbl = new javax.swing.JLabel();
        inicio4Lbl = new javax.swing.JLabel();
        fin4Lbl = new javax.swing.JLabel();
        inicio4Txf = new javax.swing.JTextField();
        fin4Txf = new javax.swing.JTextField();
        tipoAlerta4Lbl = new javax.swing.JLabel();
        sede4Lbl = new javax.swing.JLabel();
        nombreSede4Lbl = new javax.swing.JLabel();
        instruc4Lbl = new javax.swing.JLabel();
        resolver4Btn = new javax.swing.JButton();
        anteriorBtn = new javax.swing.JButton();
        siguienteBtn = new javax.swing.JButton();
        paginasLbl = new javax.swing.JLabel();

        opcionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoLbl.setText("Tipo de anuncio:");

        seleccionCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seleccionCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alertas recientes", "Evento programado", "Evento diagnosticado", "Información pendiente", "Encuesta pendiente" }));
        seleccionCBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionCBxActionPerformed(evt);
            }
        });

        eventoLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoLbl.setText("Evento programado/diagnosticado");

        informacionLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        informacionLbl.setText("Información pendiente");

        encuestaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        encuestaLbl.setText("Encuesta pendiente");

        eventoSpn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoSpn.setEnabled(false);
        eventoSpn.setValue(1);
        eventoSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                eventoSpnStateChanged(evt);
            }
        });

        informacionSpn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        informacionSpn.setEnabled(false);
        informacionSpn.setValue(1);
        informacionSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                informacionSpnStateChanged(evt);
            }
        });

        encuestaSpn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        encuestaSpn.setEnabled(false);
        encuestaSpn.setValue(1);
        encuestaSpn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                encuestaSpnStateChanged(evt);
            }
        });

        eventoCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventoCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Día", "Semana", "Mes" }));
        eventoCBx.setEnabled(false);

        informacionCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        informacionCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Día", "Semana", "Mes" }));
        informacionCBx.setEnabled(false);

        encuestaCBx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        encuestaCBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Día", "Semana", "Mes" }));
        encuestaCBx.setEnabled(false);

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setEnabled(false);
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        aceptarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aceptarBtn.setText("Aceptar");
        aceptarBtn.setEnabled(false);
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout periodoPnlLayout = new javax.swing.GroupLayout(periodoPnl);
        periodoPnl.setLayout(periodoPnlLayout);
        periodoPnlLayout.setHorizontalGroup(
            periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(periodoPnlLayout.createSequentialGroup()
                .addGroup(periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventoLbl)
                    .addComponent(informacionLbl)
                    .addGroup(periodoPnlLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(cancelarBtn))
                    .addComponent(encuestaLbl))
                .addGap(18, 18, 18)
                .addGroup(periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informacionSpn, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(encuestaSpn)
                    .addComponent(eventoSpn))
                .addGap(18, 18, 18)
                .addGroup(periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventoCBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informacionCBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encuestaCBx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(periodoPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptarBtn)
                .addGap(79, 79, 79))
        );
        periodoPnlLayout.setVerticalGroup(
            periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(periodoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventoLbl)
                    .addComponent(eventoSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventoCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(informacionLbl)
                    .addComponent(informacionSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informacionCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encuestaLbl)
                    .addComponent(encuestaSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encuestaCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(periodoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aceptarBtn)
                    .addComponent(cancelarBtn))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        periodoBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        periodoBtn.setText("Actualizar periodo");
        periodoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoBtnActionPerformed(evt);
            }
        });

        descripcionLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descripcionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcionLbl.setText("Consulta todas las alertas pendientes");
        descripcionLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout opcionPnlLayout = new javax.swing.GroupLayout(opcionPnl);
        opcionPnl.setLayout(opcionPnlLayout);
        opcionPnlLayout.setHorizontalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(periodoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(periodoBtn))
                    .addGroup(opcionPnlLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descripcionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(opcionPnlLayout.createSequentialGroup()
                                .addComponent(tipoLbl)
                                .addGap(18, 18, 18)
                                .addComponent(seleccionCBx, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        opcionPnlLayout.setVerticalGroup(
            opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionPnlLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(opcionPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(descripcionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(periodoBtn)
                .addGap(54, 54, 54)
                .addComponent(periodoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        informacionPnl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        informacionPnl.setToolTipText("");
        informacionPnl.setLayout(null);

        alertasPnl.setLayout(null);

        alerta1Pnl.setBackground(new java.awt.Color(255, 255, 255));
        alerta1Pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        tipoAlerta1Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoAlerta1Lbl.setText("Tipo de alerta");

        inicio1Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio1Lbl.setText("Fecha de inicio:");

        fin1Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin1Lbl.setText("Fecha de fin:");

        inicio1Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio1Txf.setText("dd/mm/yy");
        inicio1Txf.setBorder(null);

        fin1Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin1Txf.setText("dd/mm/yy");
        fin1Txf.setBorder(null);

        nombre1Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre1Lbl.setText("Nombre del evento");

        sede1Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sede1Lbl.setText("Lugar:");

        nombreSede1Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreSede1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreSede1Lbl.setText("Nombre de la sede");
        nombreSede1Lbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        resolver1Btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resolver1Btn.setText("Resolver");
        resolver1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverBtnActionPerformed(evt);
            }
        });

        instruc1Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruc1Lbl.setText("<html>Seleccione el botón \"Resolver\" para programar el evento</html>");
        instruc1Lbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout alerta1PnlLayout = new javax.swing.GroupLayout(alerta1Pnl);
        alerta1Pnl.setLayout(alerta1PnlLayout);
        alerta1PnlLayout.setHorizontalGroup(
            alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alerta1PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alerta1PnlLayout.createSequentialGroup()
                        .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(tipoAlerta1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inicio1Lbl)
                            .addComponent(fin1Lbl))
                        .addGap(18, 18, 18)
                        .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inicio1Txf, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(fin1Txf))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(alerta1PnlLayout.createSequentialGroup()
                        .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alerta1PnlLayout.createSequentialGroup()
                                .addComponent(sede1Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(nombreSede1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 213, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alerta1PnlLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(instruc1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resolver1Btn)
                        .addGap(22, 22, 22))))
        );
        alerta1PnlLayout.setVerticalGroup(
            alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alerta1PnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(alerta1PnlLayout.createSequentialGroup()
                        .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inicio1Lbl)
                            .addComponent(inicio1Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fin1Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fin1Lbl))
                        .addGap(9, 9, 9))
                    .addGroup(alerta1PnlLayout.createSequentialGroup()
                        .addComponent(nombre1Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipoAlerta1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreSede1Lbl)
                    .addComponent(sede1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(alerta1PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instruc1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolver1Btn))
                .addContainerGap())
        );

        alertasPnl.add(alerta1Pnl);
        alerta1Pnl.setBounds(0, 0, 740, 130);

        alerta2Pnl.setBackground(new java.awt.Color(255, 255, 255));
        alerta2Pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        nombre2Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre2Lbl.setText("Nombre del evento");

        inicio2Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio2Lbl.setText("Fecha de inicio:");

        tipoAlerta2Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoAlerta2Lbl.setText("Tipo de alerta");

        inicio2Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio2Txf.setText("dd/mm/yy");
        inicio2Txf.setBorder(null);

        sede2Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sede2Lbl.setText("Lugar:");

        fin2Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin2Txf.setText("dd/mm/yy");
        fin2Txf.setBorder(null);

        nombreSede2Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreSede2Lbl.setText("Nombre de la sede");
        nombreSede2Lbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        fin2Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin2Lbl.setText("Fecha de fin:");

        resolver2Btn.setText("Resolver");
        resolver2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverBtnActionPerformed(evt);
            }
        });

        instruc2Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruc2Lbl.setText("<html>Seleccione el botón \"Resolver\" para programar el evento</html>");
        instruc2Lbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout alerta2PnlLayout = new javax.swing.GroupLayout(alerta2Pnl);
        alerta2Pnl.setLayout(alerta2PnlLayout);
        alerta2PnlLayout.setHorizontalGroup(
            alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alerta2PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alerta2PnlLayout.createSequentialGroup()
                        .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alerta2PnlLayout.createSequentialGroup()
                                .addComponent(nombre2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inicio2Lbl))
                            .addGroup(alerta2PnlLayout.createSequentialGroup()
                                .addComponent(tipoAlerta2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fin2Lbl)))
                        .addGap(27, 27, 27)
                        .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inicio2Txf, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(fin2Txf)))
                    .addGroup(alerta2PnlLayout.createSequentialGroup()
                        .addComponent(sede2Lbl)
                        .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alerta2PnlLayout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(instruc2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resolver2Btn))
                            .addGroup(alerta2PnlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nombreSede2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        alerta2PnlLayout.setVerticalGroup(
            alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alerta2PnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre2Lbl)
                    .addGroup(alerta2PnlLayout.createSequentialGroup()
                        .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inicio2Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicio2Lbl))
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoAlerta2Lbl)
                    .addComponent(fin2Lbl)
                    .addComponent(fin2Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombreSede2Lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sede2Lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(alerta2PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resolver2Btn)
                    .addComponent(instruc2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        alertasPnl.add(alerta2Pnl);
        alerta2Pnl.setBounds(0, 130, 740, 130);

        alerta3Pnl.setBackground(new java.awt.Color(255, 255, 255));
        alerta3Pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        nombre3Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre3Lbl.setText("Nombre del evento");

        tipoAlerta3Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoAlerta3Lbl.setText("Tipo de alerta");

        sede3Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sede3Lbl.setText("Lugar:");

        nombreSede3Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreSede3Lbl.setText("Nombre de la sede");

        instruc3Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruc3Lbl.setText("Seleccione el botón \"Resolver\" para programar el evento");

        resolver3Btn.setText("Resolver");
        resolver3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverBtnActionPerformed(evt);
            }
        });

        inicio3Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio3Lbl.setText("Fecha de inicio:");

        inicio3Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio3Txf.setText("dd/mm/yy");
        inicio3Txf.setBorder(null);

        fin3Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin3Lbl.setText("Fecha de fin:");

        fin3Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin3Txf.setText("dd/mm/yy");
        fin3Txf.setBorder(null);

        javax.swing.GroupLayout alerta3PnlLayout = new javax.swing.GroupLayout(alerta3Pnl);
        alerta3Pnl.setLayout(alerta3PnlLayout);
        alerta3PnlLayout.setHorizontalGroup(
            alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alerta3PnlLayout.createSequentialGroup()
                .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alerta3PnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alerta3PnlLayout.createSequentialGroup()
                                .addComponent(sede3Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(nombreSede3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alerta3PnlLayout.createSequentialGroup()
                                .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoAlerta3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inicio3Lbl)
                                    .addComponent(fin3Lbl))
                                .addGap(28, 28, 28)
                                .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inicio3Txf, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(fin3Txf)))))
                    .addGroup(alerta3PnlLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(instruc3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resolver3Btn)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        alerta3PnlLayout.setVerticalGroup(
            alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alerta3PnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(alerta3PnlLayout.createSequentialGroup()
                        .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inicio3Lbl)
                            .addComponent(inicio3Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fin3Lbl)
                            .addComponent(fin3Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resolver3Btn)
                            .addComponent(instruc3Lbl)))
                    .addGroup(alerta3PnlLayout.createSequentialGroup()
                        .addComponent(nombre3Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tipoAlerta3Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alerta3PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sede3Lbl)
                            .addComponent(nombreSede3Lbl))
                        .addGap(26, 26, 26)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        alertasPnl.add(alerta3Pnl);
        alerta3Pnl.setBounds(0, 260, 740, 130);

        alerta4Pnl.setBackground(new java.awt.Color(255, 255, 255));
        alerta4Pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        nombre4Lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre4Lbl.setText("Nombre del evento");

        inicio4Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio4Lbl.setText("Fecha de inicio:");

        fin4Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin4Lbl.setText("Fecha de fin:");

        inicio4Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inicio4Txf.setText("dd/mm/yy");
        inicio4Txf.setBorder(null);

        fin4Txf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fin4Txf.setText("dd/mm/yy");
        fin4Txf.setBorder(null);

        tipoAlerta4Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoAlerta4Lbl.setText("Tipo de alerta");

        sede4Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sede4Lbl.setText("Lugar:");

        nombreSede4Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombreSede4Lbl.setText("Nombre de la sede");

        instruc4Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instruc4Lbl.setText("Seleccione el botón \"Resolver\" para programar el evento");

        resolver4Btn.setText("Resolver");
        resolver4Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alerta4PnlLayout = new javax.swing.GroupLayout(alerta4Pnl);
        alerta4Pnl.setLayout(alerta4PnlLayout);
        alerta4PnlLayout.setHorizontalGroup(
            alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alerta4PnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alerta4PnlLayout.createSequentialGroup()
                        .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre4Lbl)
                            .addComponent(tipoAlerta4Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alerta4PnlLayout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(fin4Lbl)
                                .addGap(18, 18, 18)
                                .addComponent(fin4Txf, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alerta4PnlLayout.createSequentialGroup()
                                .addComponent(inicio4Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inicio4Txf))))
                    .addGroup(alerta4PnlLayout.createSequentialGroup()
                        .addComponent(sede4Lbl)
                        .addGap(18, 18, 18)
                        .addComponent(nombreSede4Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alerta4PnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(instruc4Lbl)))
                .addGap(18, 18, 18)
                .addComponent(resolver4Btn)
                .addGap(18, 18, 18))
        );
        alerta4PnlLayout.setVerticalGroup(
            alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alerta4PnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resolver4Btn)
                    .addGroup(alerta4PnlLayout.createSequentialGroup()
                        .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inicio4Lbl)
                                .addComponent(inicio4Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombre4Lbl))
                        .addGap(18, 18, 18)
                        .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fin4Txf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fin4Lbl)
                            .addComponent(tipoAlerta4Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alerta4PnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sede4Lbl)
                            .addComponent(nombreSede4Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instruc4Lbl)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        alertasPnl.add(alerta4Pnl);
        alerta4Pnl.setBounds(0, 390, 740, 130);

        anteriorBtn.setText("Anterior");
        anteriorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaActionPerformed(evt);
            }
        });
        alertasPnl.add(anteriorBtn);
        anteriorBtn.setBounds(200, 530, 80, 30);

        siguienteBtn.setText("Siguiente");
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaActionPerformed(evt);
            }
        });
        alertasPnl.add(siguienteBtn);
        siguienteBtn.setBounds(410, 530, 80, 30);

        paginasLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paginasLbl.setText("1/1");
        alertasPnl.add(paginasLbl);
        paginasLbl.setBounds(330, 540, 40, 20);

        alertasSPn.setViewportView(alertasPnl);

        informacionPnl.add(alertasSPn);
        alertasSPn.setBounds(0, 0, 740, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opcionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(informacionPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que consulta las alertas al seleccionar un tipo de alerta.
     * 
     * @param evt Evento al seleccionar un tipo de alerta a consultar.
     */
    private void seleccionCBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCBxActionPerformed
        consultarAlerta();
    }//GEN-LAST:event_seleccionCBxActionPerformed

    /**
     * Método que consulta el tipo de alerta especificada y procede a generar
     * los paneles de alerta con los datos de los eventos y en caso de no haber
     * alertas programas por el momento lo notifica al usuario mediante un
     * mensaje.
     */
    public void consultarAlerta(){
        switch(seleccionCBx.getSelectedIndex()){//switch
            case 0:// alertas recientes
                descripcionLbl.setText("<html>Consulta todas las alertas "
                        + "pendientes.</html>");
                break;
            case 1:// evento programado
                descripcionLbl.setText("<html>Consulta todas las alertas"
                        + " de los eventos programados.</html>");
                break;
            case 2:// evento diagnosticado
                descripcionLbl.setText("<html>Consulta todas las alertas de "
                        + "empleados diagnosticados con necesidades de "
                        + "capacitación.</html>");
                break;
            case 3:// información pendiente
                descripcionLbl.setText("<html>Consulta todas las alertas "
                        + "programadas de eventos con información pendiente "
                        + "por llenar.</html>");
                break;
            case 4:// encuesta pendiente
                descripcionLbl.setText("<html>Consulta todas las alertas pro"
                        + "gramadas de eventos con encuestas pendientes por rea"
                        + "lizar o resultados pendientes por revisar</html>");
                break;
        }//switch
        eventoSpn.setEnabled(false);
        encuestaSpn.setEnabled(false);
        informacionSpn.setEnabled(false);
        aceptarBtn.setEnabled(false);
        eventoCBx.setEnabled(false);
        encuestaCBx.setEnabled(false);
        informacionCBx.setEnabled(false);
        cancelarBtn.setEnabled(false);
        alertasPnl.setVisible(true);
        List<Object> lista = new ArrayList();
        Set<ImplementacionEvento> eventos;
        Object obj;
        boolean ban = false;
        switch(seleccionCBx.getSelectedIndex()){// switch
            case 0:// Alertas recientes
                control.buscarTodasLista(0);
                ban = true;
                break;
            case 1:// Evento programado
                obj = control.buscarAlerta(1);
                eventos = ((Alerta) obj).getImplementacionEventos();
                if(!eventos.isEmpty()){// if
                    lista.add(obj);
                    generarPanelAlerta(lista, false);
                    ban = true;
                }// if
                else{// else
                    setMensaje("No existen alertas de evento programado por el"
                            + " momento.",null,JOptionPane.INFORMATION_MESSAGE);
                    ban = false;
                }// else
                break;
            case 2:// Evento diagnosticado
                obj = control.buscarAlerta(2);
                eventos = ((Alerta) obj).getImplementacionEventos();
                if(!eventos.isEmpty()){// if
                    lista.add(obj);
                    generarPanelAlerta(lista, false);
                    ban = true;
                }// if
                else{// else
                    setMensaje("No existen alertas de evento diagnosticado por "
                            + "el momento.",null,JOptionPane.INFORMATION_MESSAGE);
                    ban = false;
                }// else
                break;
            case 3:// Informacion pendiente
                obj = control.buscarAlerta(3);
                eventos = ((Alerta) obj).getImplementacionEventos();
                if(!eventos.isEmpty()){// if
                    lista.add(obj);
                    generarPanelAlerta(lista, false);
                    ban = true;
                }// if
                else{// else
                    setMensaje("No existen eventos con informacion pendiente"
                            + " por el momento.", null, 
                            JOptionPane.INFORMATION_MESSAGE);
                    ban = false;
                }// else
                break;
            case 4:// Encuesta pendiente
                obj = control.buscarAlerta(4);
                eventos = ((Alerta) obj).getImplementacionEventos();
                if(!eventos.isEmpty()){// if
                    lista.add(obj);
                    generarPanelAlerta(lista, false);
                    ban = true;
                }// if
                else{// else
                    setMensaje("No existen eventos con encuestas pendiente "
                            + "por el momento." , null,
                            JOptionPane.INFORMATION_MESSAGE);
                    ban = false;
                }// else
                break;
        }// switch
        
        if(!ban){// if
            alerta1Pnl.setVisible(false);
            alerta2Pnl.setVisible(false);
            alerta3Pnl.setVisible(false);
            alerta4Pnl.setVisible(false);
            anteriorBtn.setEnabled(false);
            siguienteBtn.setEnabled(false);
        }// if
    }
    
    /**
     * Método que consulta los periodos actuales en que se generarán las alertas
     * permitiendo al usuario modificarlos.
     * @param evt Evento generado al presionar el botón para actualizar los 
     * periodos de las alertas.
     */
    private void periodoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoBtnActionPerformed
        alerta1Pnl.setVisible(false);
        alerta2Pnl.setVisible(false);
        alerta3Pnl.setVisible(false);
        alerta4Pnl.setVisible(false);
        
        eventoSpn.setEnabled(true);
        encuestaSpn.setEnabled(true);
        informacionSpn.setEnabled(true);
        aceptarBtn.setEnabled(true);
        eventoCBx.setEnabled(true);
        encuestaCBx.setEnabled(true);
        informacionCBx.setEnabled(true);
        cancelarBtn.setEnabled(true);
        
        periodoAnt[0] = "";
        periodoAnt[1] = "";
        periodoAnt[2] = "";
        periodoAnt[3] = "";
        
        control.buscarTodosLista(1);
    }//GEN-LAST:event_periodoBtnActionPerformed

    /**
     * Método que al cambiar de valor, valida que este no sea menor a 1.
     * 
     * @param evt Evento generado al cambiar de valor en el periodo de la alerta
     * de evento programado o evento diagnosticado.
     */
    private void eventoSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_eventoSpnStateChanged
        if(Integer.parseInt(eventoSpn.getValue().toString()) < 1){// if
            setMensaje("El periodo no puede ser menor a 1.","Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            eventoSpn.setValue(1);
        }// if
    }//GEN-LAST:event_eventoSpnStateChanged

    /**
     * Método que al cambiar de valor, valida que este no sea menor a 1.
     * 
     * @param evt Evento generado al cambiar de estado en el tipo de alerta de
     * información pendiente.
     */
    private void informacionSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_informacionSpnStateChanged
        if(Integer.parseInt(informacionSpn.getValue().toString()) < 1){// if
            setMensaje("El periodo no puede ser menor a 1.", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            informacionSpn.setValue(1);
        }// if
    }//GEN-LAST:event_informacionSpnStateChanged

    /**
     * Método que al cambiar de valor, valida que este no sea menor a 1.
     * 
     * @param evt Evento generado al cambiar de estado en el tipo de alerta de
     * encuesta pendiente.
     */
    private void encuestaSpnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_encuestaSpnStateChanged
        if(Integer.parseInt(encuestaSpn.getValue().toString()) < 1){// if
            setMensaje("El periodo no puede ser menor a 1.", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
            encuestaSpn.setValue(1);
        }// if
    }//GEN-LAST:event_encuestaSpnStateChanged

    /**
     * Método que cancela la modificación de los periodos de activación de los
     * tipos de alerta, mostrándo primero un mensaje de confirmación.
     * 
     * @param evt Evento generado al presionar el botón de cancelar.
     */
    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
         int respuesta = JOptionPane.showConfirmDialog(null, 
                "Si continua los cambios se perderan.", "Advertencia", 
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(respuesta == 0){// if
            eventoSpn.setValue(1);
            encuestaSpn.setValue(1);
            informacionSpn.setValue(1);
            
            eventoSpn.setEnabled(false);
            encuestaSpn.setEnabled(false);
            informacionSpn.setEnabled(false);
            aceptarBtn.setEnabled(false);
            eventoCBx.setEnabled(false);
            encuestaCBx.setEnabled(false);
            informacionCBx.setEnabled(false);
            cancelarBtn.setEnabled(false);
        }// if
    }//GEN-LAST:event_cancelarBtnActionPerformed

    /**
     * Método que guarda los cambios realizados en los periodos de activación
     * de los tipos de alertas, mostrándo primero un mensaje de confirmación al
     * usuario, haciéndole saber como se almacenarán los periodos en el sistema.
     * 
     * @param evt Evento generado al presionar el botón de aceptar.
     */
    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        if(Integer.parseInt(eventoSpn.getValue().toString()) >= 1 
                && Integer.parseInt(encuestaSpn.getValue().toString()) >= 1
                && Integer.parseInt(informacionSpn.getValue().toString()) >= 1)
        {// if
            int evto = Integer.parseInt(eventoSpn.getValue().toString());
            int info = Integer.parseInt(informacionSpn.getValue().toString());
            int encuesta1 = Integer.parseInt(encuestaSpn.getValue().toString());

            switch(eventoCBx.getSelectedItem().toString()){//switch
                case "Mes":
                    evto = evto * 30;
                    break;
                case "Semana":
                    evto = evto * 7;
                    break;
            }//switch
            
            switch(informacionCBx.getSelectedItem().toString()){//switch
                case "Mes":
                    info = info * 30;
                    break;
                case "Semana":
                    info = info * 7;
                    break;
            }//switch
            
            switch(encuestaCBx.getSelectedItem().toString()){//switch
                case "Mes":
                    encuesta1 = encuesta1 * 30;
                    break;
                case "Semana":
                    encuesta1 = encuesta1 * 7;
                    break;
            }//switch
            
            int respuesta = JOptionPane.showConfirmDialog(this, "<html>Los pe"
                    +"riodos se almacenarán de la siguiente manera:<br>Evento "
                    +"programado/diagnosticado: " + evto + " dias.<br>Informa"
                    +"ción pendiente: " + info + " dias.<br>Encuesta pen"+
                    "diente: " +  encuesta1 + " dias.</html>", "Confimación",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            if(respuesta == 0){//if
                List<Object> periodos = control.buscarTodas();
                
                ((Alerta) periodos.get(0)).setPeriodo(evto);
                ((Alerta) periodos.get(1)).setPeriodo(evto);
                ((Alerta) periodos.get(2)).setPeriodo(info);
                ((Alerta) periodos.get(3)).setPeriodo(encuesta1);
                
                control.modificar(periodos);
            }//if
            
            eventoSpn.setValue(1);
            encuestaSpn.setValue(1);
            informacionSpn.setValue(1);
            
            eventoSpn.setEnabled(false);
            encuestaSpn.setEnabled(false);
            informacionSpn.setEnabled(false);
            aceptarBtn.setEnabled(false);
            eventoCBx.setEnabled(false);
            encuestaCBx.setEnabled(false);
            informacionCBx.setEnabled(false);
            cancelarBtn.setEnabled(false);
        }// if
    }//GEN-LAST:event_aceptarBtnActionPerformed

    /**
     * Método que es llamado al presionar el botón de resolver de alguna alerta
     * realizando la transición entre la consulta de alertas y la resolución 
     * de estas, activando el panel correspondiente (PnlSeguimiento o 
     * PnlProgramarEvento) y vaciando los datos en él.
     * 
     * @param evt, Evento generado al presionar el botón de resolver en
     * cualquiera de los paneles de las alertas consultadas.
     */
    private void resolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolverBtnActionPerformed
        ImplementacionEvento e;
        int alerta;
        if(evt.getSource().equals(resolver1Btn)){//if
            e = implementaciones[Integer.parseInt(resolver1Btn.getName())][0];
            alerta = tipoAlertas[Integer.parseInt(resolver1Btn.getName())][0];
            switch(alerta){//switch
                case 1:// evento programado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 2:// evento diagnosticado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 3:// información pendiente
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 4:// encuesta pendiente
                    this.setVisible(false);
                    encuestaPnl.setVisible(true);
                    encuestaPnl.llenarDatos(e);
                    break;
            }//switch
        }//if
        if(evt.getSource().equals(resolver2Btn)){//if
            e = implementaciones[Integer.parseInt(resolver1Btn.getName())][1];
            alerta = tipoAlertas[Integer.parseInt(resolver1Btn.getName())][1];
            switch(alerta){//switch
                case 0:// evento programado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 1:// evento diagnosticado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 2:// información pendiente
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 4:// encuesta pendiente
                    this.setVisible(false);
                    encuestaPnl.setVisible(true);
                    encuestaPnl.llenarDatos(e);
                    break;
            }//switch
        }//if
        if(evt.getSource().equals(resolver3Btn)){//if
            e = implementaciones[Integer.parseInt(resolver1Btn.getName())][2];
            alerta = tipoAlertas[Integer.parseInt(resolver1Btn.getName())][2];
            switch(alerta){//switch
                case 0:// evento programado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 1:// evento diagnosticado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 2:// información pendiente
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 4:// encuesta pendiente
                    this.setVisible(false);
                    encuestaPnl.setVisible(true);
                    encuestaPnl.llenarDatos(e);
                    break;
            }//switch
        }//if
        if(evt.getSource().equals(resolver4Btn)){//if
            e = implementaciones[Integer.parseInt(resolver1Btn.getName())][3];
            alerta = tipoAlertas[Integer.parseInt(resolver1Btn.getName())][3];
            switch(alerta){//switch
                case 0:// evento programado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 1:// evento diagnosticado
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 2:// información pendiente
                    this.setVisible(false);
                    eventoPnl.setVisible(true);
                    eventoPnl.llenarDatos(e);
                    break;
                case 4:// encuesta pendiente
                    this.setVisible(false);
                    encuestaPnl.setVisible(true);
                    encuestaPnl.llenarDatos(e);
                    break;
            }//switch
        }//if
    }//GEN-LAST:event_resolverBtnActionPerformed

    /**
     * Método que cambia la página de alertas consultadas dependiendo del botón
     * que ha sido seleccionado.
     * 
     * @param evt, Evento generado al presionar el botón de siguiente o 
     * anterior de la consulta a alertas.
     */
    private void paginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaActionPerformed
        if(evt.getSource().equals(anteriorBtn)){//if
            cambioPagina(Integer.parseInt(anteriorBtn.getName()));
        }//if
        else{//else
            cambioPagina(Integer.parseInt(siguienteBtn.getName()));
        }//else
    }//GEN-LAST:event_paginaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JPanel alerta1Pnl;
    private javax.swing.JPanel alerta2Pnl;
    private javax.swing.JPanel alerta3Pnl;
    private javax.swing.JPanel alerta4Pnl;
    private javax.swing.JPanel alertasPnl;
    private javax.swing.JScrollPane alertasSPn;
    private javax.swing.JButton anteriorBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel descripcionLbl;
    private javax.swing.JComboBox encuestaCBx;
    private javax.swing.JLabel encuestaLbl;
    private javax.swing.JSpinner encuestaSpn;
    private javax.swing.JComboBox eventoCBx;
    private javax.swing.JLabel eventoLbl;
    private javax.swing.JSpinner eventoSpn;
    private javax.swing.JLabel fin1Lbl;
    private javax.swing.JTextField fin1Txf;
    private javax.swing.JLabel fin2Lbl;
    private javax.swing.JTextField fin2Txf;
    private javax.swing.JLabel fin3Lbl;
    private javax.swing.JTextField fin3Txf;
    private javax.swing.JLabel fin4Lbl;
    private javax.swing.JTextField fin4Txf;
    private javax.swing.JComboBox informacionCBx;
    private javax.swing.JLabel informacionLbl;
    private javax.swing.JPanel informacionPnl;
    private javax.swing.JSpinner informacionSpn;
    private javax.swing.JLabel inicio1Lbl;
    private javax.swing.JTextField inicio1Txf;
    private javax.swing.JLabel inicio2Lbl;
    private javax.swing.JTextField inicio2Txf;
    private javax.swing.JLabel inicio3Lbl;
    private javax.swing.JTextField inicio3Txf;
    private javax.swing.JLabel inicio4Lbl;
    private javax.swing.JTextField inicio4Txf;
    private javax.swing.JLabel instruc1Lbl;
    private javax.swing.JLabel instruc2Lbl;
    private javax.swing.JLabel instruc3Lbl;
    private javax.swing.JLabel instruc4Lbl;
    private javax.swing.JLabel nombre1Lbl;
    private javax.swing.JLabel nombre2Lbl;
    private javax.swing.JLabel nombre3Lbl;
    private javax.swing.JLabel nombre4Lbl;
    private javax.swing.JLabel nombreSede1Lbl;
    private javax.swing.JLabel nombreSede2Lbl;
    private javax.swing.JLabel nombreSede3Lbl;
    private javax.swing.JLabel nombreSede4Lbl;
    private javax.swing.JPanel opcionPnl;
    private javax.swing.JLabel paginasLbl;
    private javax.swing.JButton periodoBtn;
    private javax.swing.JPanel periodoPnl;
    private javax.swing.JButton resolver1Btn;
    private javax.swing.JButton resolver2Btn;
    private javax.swing.JButton resolver3Btn;
    private javax.swing.JButton resolver4Btn;
    private javax.swing.JLabel sede1Lbl;
    private javax.swing.JLabel sede2Lbl;
    private javax.swing.JLabel sede3Lbl;
    private javax.swing.JLabel sede4Lbl;
    private javax.swing.JComboBox seleccionCBx;
    private javax.swing.JButton siguienteBtn;
    private javax.swing.JLabel tipoAlerta1Lbl;
    private javax.swing.JLabel tipoAlerta2Lbl;
    private javax.swing.JLabel tipoAlerta3Lbl;
    private javax.swing.JLabel tipoAlerta4Lbl;
    private javax.swing.JLabel tipoLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que recibe un mensaje y lo muestra al usuario en una ventana
     * emergente.
     * 
     * @param mensaje, Mensaje que será mostrado al usuario.
     */
    @Override
    public void setMensaje(String mensaje) {// method
        JOptionPane.showMessageDialog(null, mensaje);
    }// method
    
    /**
     * 
     */
    public void setMensaje(String mensaje, String cabecera, int tipoMensaje){//method
        JOptionPane.showMessageDialog(null, mensaje, cabecera, tipoMensaje);
    }//method

    /**
     * Método no implementado.
     * @param info 
     */
    @Override
    public void setTabla(String[][] info) {// method
        throw new UnsupportedOperationException("Not supported.");
    }// method

    /**
     * Método no implementado.
     * @param info 
     */
    @Override
    public void setInfo(List info) {// method
        throw new UnsupportedOperationException("Not supported.");
    }// method

    /**
     * Método que al recibir las alertas, extrae los datos necesarios para
     * realizar el proceso correspondiente, ya sea una consulta de cualquier
     * tipo de alerta o una consulta de los periodos.
     * 
     * @param info, Lista que contiene la alerta a consultar.
     * @param i, Entero que indica al ser su valor 1 indica que se han 
     * consultado los periodos, de lo contrario, la consulta es de alertas.
     */
    @Override
    public void setLista(List info, int i) {
        alerta1Pnl.setVisible(false);
        alerta2Pnl.setVisible(false);
        alerta3Pnl.setVisible(false);
        alerta4Pnl.setVisible(false);
        anteriorBtn.setEnabled(false);
        siguienteBtn.setEnabled(false);
        
        if(info != null){//if
            // actualizar periodos
            if(i == 1){// if
                eventoSpn.setValue(((Alerta) info.get(0)).getPeriodo());
                informacionSpn.setValue(((Alerta) info.get(2)).getPeriodo());
                encuestaSpn.setValue(((Alerta) info.get(3)).getPeriodo());
            }// if
            else{//else
                // Alertas recientes
                if(((Alerta) info.get(0)).getImplementacionEventos().size() > 0
                    || ((Alerta) info.get(1)).getImplementacionEventos()
                            .size() > 0 || ((Alerta) info.get(2))
                                    .getImplementacionEventos().size() > 0
                    || ((Alerta) info.get(3)).getImplementacionEventos()
                            .size()> 0)
                {// if
                    // consulta de alertas recientes
                    generarPanelAlerta(info, true);
                }// if
                // no existen alertas
                else{// else
                    setMensaje("No existen alertas por el momento.", null,
                    JOptionPane.INFORMATION_MESSAGE);
                }// else
            }//else
        }//if
        else{//else
            setMensaje("No hay tipo de alertas en la base de datos.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }//else
    }// method
    
    /**
     * Método que al recibir la página que ha sido solicitada, procede a mostrar
     * las alertas correspondientes a dicha página.
     * 
     * @param pagina, Indica la página a la que se ha cambiado.
     */
    private void cambioPagina(int pagina){//method
        ImplementacionEvento e1,e2 = null,e3 = null,e4 = null;
        e1 = implementaciones[pagina][0];
        nombre1Lbl.setText(e1.getEvento().getNombre());
        inicio1Txf.setText(e1.getFechaInicial().toString());
        fin1Txf.setText(e1.getFechaFinal().toString());
        switch(tipoAlertas[pagina][0]){//switch
            case 1:// evento programado
                tipoAlerta1Lbl.setText("Evento programado");
                break;
            case 2:// evento diagnosticado
                tipoAlerta1Lbl.setText("Evento diagnosticado");
                break;
            case 3:// información pendiente
                tipoAlerta1Lbl.setText("Información pendiente");
                break;
            case 4:// encuesta pendiente
                tipoAlerta1Lbl.setText("Encuesta pendiente");
                break;
        }//switch
        if(e1.getSede() != null){//if
            nombreSede1Lbl.setText(e1.getSede().getNombre());
        }//if
        else{//else
            nombreSede1Lbl.setText(null);
        }//else
        resolver1Btn.setName(pagina + "");
        alerta1Pnl.setVisible(true);

        if(implementaciones[pagina][1] != null){//if
            e2 = implementaciones[pagina][1];
            nombre2Lbl.setText(e2.getEvento().getNombre());
            inicio2Txf.setText(e2.getFechaInicial().toString());
            fin2Txf.setText(e2.getFechaFinal().toString());
            switch(tipoAlertas[pagina][1]){//switch
                case 1:// evento programado
                    tipoAlerta2Lbl.setText("Evento programado");
                    break;
                case 2:// evento diagnosticado
                    tipoAlerta2Lbl.setText("Evento diagnosticado");
                    break;
                case 3:// información pendiente
                    tipoAlerta2Lbl.setText("Información pendiente");
                    break;
                case 4:// encuesta pendiente
                    tipoAlerta2Lbl.setText("Encuesta pendiente");
                    break;
            }//switch
            if(e2.getSede() != null){//if
                nombreSede2Lbl.setText(e2.getSede().getNombre());
            }//if
            else{//else
                nombreSede2Lbl.setText(null);
            }//else
            resolver2Btn.setName(pagina + "");
            alerta2Pnl.setVisible(true);
        }//if
        else{//else
            alerta2Pnl.setVisible(false);
        }//else

        if(implementaciones[pagina][2] != null){//if
            e3 = implementaciones[pagina][2];
            nombre3Lbl.setText(e3.getEvento().getNombre());
            inicio3Txf.setText(e3.getFechaInicial().toString());
            fin3Txf.setText(e3.getFechaFinal().toString());
            switch(tipoAlertas[pagina][2]){//switch
                case 1:// evento programado
                    tipoAlerta3Lbl.setText("Evento programado");
                    break;
                case 2:// evento diagnosticado
                    tipoAlerta3Lbl.setText("Evento diagnosticado");
                    break;
                case 3:// información pendiente
                    tipoAlerta3Lbl.setText("Información pendiente");
                    break;
                case 4:// encuesta pendiente
                    tipoAlerta3Lbl.setText("Encuesta pendiente");
                    break;
            }//switch
            if(e3.getSede() != null){//if
                nombreSede3Lbl.setText(e3.getSede().getNombre());
            }//if
            else{//else
                nombreSede3Lbl.setText(null);
            }//else
            resolver3Btn.setName(pagina + "");
            alerta3Pnl.setVisible(true);
        }//if
        else{//else
            alerta3Pnl.setVisible(false);
        }//else

        if(implementaciones[pagina][3] != null){//if
            e4 = implementaciones[pagina][3];
            nombre4Lbl.setText(e4.getEvento().getNombre());
            inicio4Txf.setText(e4.getFechaInicial().toString());
            fin4Txf.setText(e4.getFechaFinal().toString());
            switch(tipoAlertas[pagina][3]){//switch
                case 1:// evento programado
                    tipoAlerta4Lbl.setText("Evento programado");
                    break;
                case 2:// evento diagnosticado
                    tipoAlerta4Lbl.setText("Evento diagnosticado");
                    break;
                case 3:// información pendiente
                    tipoAlerta4Lbl.setText("Información pendiente");
                    break;
                case 4:// encuesta pendiente
                    tipoAlerta4Lbl.setText("Encuesta pendiente");
                    break;
            }//switch
            if(e4.getSede() != null){//if
                nombreSede4Lbl.setText(e4.getSede().getNombre());
            }//if
            else{//else
                nombreSede4Lbl.setText(null);
            }//else
            resolver4Btn.setName(pagina + "");
            alerta4Pnl.setVisible(true);
        }//if
        else{//else
            alerta4Pnl.setVisible(false);
        }//else

        if(pagina > 0){//if
           anteriorBtn.setEnabled(true);
           
        }//if
        else{//else
            if(pagina == 0){//if
                anteriorBtn.setEnabled(false);
                siguienteBtn.setEnabled(true);
            }//if
        }//else

        String[] auxPag = paginasLbl.getText().split("/");
        if(pagina == (Integer.parseInt(auxPag[1]) - 1)){//if
            siguienteBtn.setEnabled(false);
            siguienteBtn.setName(auxPag[1]);
        }//if
        else{//else
            if(pagina == 0){//if
                anteriorBtn.setEnabled(false);
                anteriorBtn.setName("0");
            }//if
            else{//else
                anteriorBtn.setEnabled(true);
            }//else
            siguienteBtn.setEnabled(true);
        }//else
        anteriorBtn.setName((pagina - 1) + "");
        siguienteBtn.setName((pagina + 1) + "");
        paginasLbl.setText((pagina + 1) + "/" + auxPag[1]);
    }//method
    
    /**
     * Método que genera los paneles de alerta consultadas.
     * 
     * @param info, Lista de objetos que contienen las alertas de las cuales se
     * obtendrán las implementaciones.
     * @param recientes, Booleano que al ser verdadero indica si se generarán 
     * los paneles de Alertas recientes y al ser falso indica que se genearán
     * paneles para una alerta específica.
     */
     private void generarPanelAlerta(List<Object> info, boolean recientes){//method
        int totalPag;
        List<ImplementacionEvento> eventosAux = ordenarImplementaciones(info);
        int[][] tipoAlerta = tipoAlertas;
        tipoAlertas = new int[tipoAlerta.length][4];
        if(recientes){//if
            totalPag = Math.round(eventosAux.size()/4);
            if((eventosAux.size()%4) != 0 || eventosAux.size() < 4){//if
                totalPag = totalPag + 1;
            }//if
            implementaciones = new ImplementacionEvento[totalPag][4];
            tipoAlertas = new int[totalPag][4];
            int z = 0;
            for(int x = 0; x < totalPag; x++){//for
                for(int y = 0; y < 4; y++){//for
                    if(z < eventosAux.size() && eventosAux.get(z) != null){//if
                        implementaciones[x][y] = eventosAux.get(z);
                        tipoAlertas[x][y] = tipoAlerta[z][0];
                        z++;
                    }//if
                    else{//else
                        y= 4;
                        x= totalPag + 1;
                    }//else
                }//for
            }//for
        }//if
        else{//else
            totalPag = Math.round(eventosAux.size()/4);
            if(((eventosAux.size()%4) != 0 || eventosAux.size() < 4)
                    && eventosAux.size() > 0){//if
                totalPag = totalPag + 1;
            }//if
            implementaciones = new ImplementacionEvento[totalPag][4];
            tipoAlertas = new int[totalPag][4];
            int z = 0;
            for(int x = 0; x < totalPag; x++){//for
                for(int y = 0; y < 4; y++){//for
                    if(z < eventosAux.size() && eventosAux.get(z) != null){//if
                        implementaciones[x][y] = eventosAux.get(z);
                        tipoAlertas[x][y] = tipoAlerta[z][0];
                        z++;
                    }//if
                    else{//else
                        y= 4;
                        x= totalPag + 1;
                    }//else
                }//for
            }//for
        }//else
        anteriorBtn.setName("0");
        siguienteBtn.setName("1");
        paginasLbl.setText("0/" + totalPag);
        
        if(totalPag > 0){//if
            cambioPagina(0);
        }//if
    }//method

     /**
      * Método no implementado
      * @param implementacionEvento 
      */
    @Override
    public void llenarDatos(Object implementacionEvento) {//method
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//method
    
    /**
     * Método que ordena los eventos con respecto a la fecha de 
     * terminación de su implementación.
     * 
     * @param info, Lista de implementaciones sin ordenar.
     * @return Lista de implementaciones de eventos ordenadas.
     */
    private List<ImplementacionEvento> ordenarImplementaciones(List<Object> info){//method
        List<ImplementacionEvento> eventos = new ArrayList();
        List<Alerta> alertas = new ArrayList();
        int x = 0;
        
        for(Object o : info){//for
            Alerta a = (Alerta) o;
            for(ImplementacionEvento ie : a.getImplementacionEventos()){//for
                x ++;
            }//for
        }//for
        
        tipoAlertas = new int[x][1];
        x = 0;
        for(int l = 0; l < info.size(); l++){// for
            Alerta a = (Alerta) info.get(l);
            // if(a.getImplementaciones().size() > 0){
            if(!alertas.contains(a)){//if
                alertas.add(a);
                for (Iterator<ImplementacionEvento> it = a.getImplementacionEventos().iterator(); it.hasNext();) {
                    ImplementacionEvento obj = it.next();
                    //for
                    eventos.add(obj);
                    x++;
                } // for
            }//if
        }// for
        Collections.sort(eventos, new Comparator<ImplementacionEvento>(){

            @Override
            public int compare(ImplementacionEvento o1, ImplementacionEvento o2)
            {
                Date primera, segunda;
                Calendar cal = Calendar.getInstance();
                cal.setTime(o1.getFechaFinal());
                for(int i = 0; i < alertas.size(); i++){
                    Alerta a = alertas.get(i);
                    if(a.getImplementacionEventos().contains(o1))
                        cal.add(Calendar.DATE, -a.getPeriodo());
                }
                primera = cal.getTime();
                cal.setTime(o2.getFechaFinal());
                for(int i = 0; i < alertas.size(); i++){
                    Alerta a = alertas.get(i);
                    if(a.getImplementacionEventos().contains(o2))
                        cal.add(Calendar.DATE, -a.getPeriodo());
                }
                segunda = cal.getTime();
                return primera.compareTo(segunda);
            }
            
        });
        
        boolean band = false;
        int i = 0;
        for(ImplementacionEvento e : eventos){//for
            if(seleccionCBx.getSelectedIndex() == 0){//if
                if(e.getAlertas().size() > 1){//if
                    if(!band){//if
                        Object[] setAlertas = e.getAlertas().toArray();
                        tipoAlertas[i][0] = ((Alerta) setAlertas[0]).getId();
                        i ++;
                        band = true;
                    }//if
                    else{//else
                        Object[] setAlertas = e.getAlertas().toArray();
                        tipoAlertas[i][0] = ((Alerta) setAlertas[1]).getId();
                        i ++;
                        band = false;
                    }//else
                }//if
                else{//else
                    Object[] setAlertas = e.getAlertas().toArray();
                    tipoAlertas[i][0] = ((Alerta) setAlertas[0]).getId();
                    i ++;
                }//else
            }//if
            else{//else
                    Object[] setAlertas = e.getAlertas().toArray();
                    int temporal = ((Alerta) setAlertas[0]).getId();
                if(temporal == seleccionCBx.getSelectedIndex()){//if
                    tipoAlertas[i][0] = temporal;
                    i ++;
                }//if
            }//else
        }//for
        
        return eventos;
    }// method

    public void verificarImplementaciones() {
        control.verificarImplementaciones();
    }
    
}// class
