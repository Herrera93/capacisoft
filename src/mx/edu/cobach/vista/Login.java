package mx.edu.cobach.vista;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.vista.controlador.UsuarioControlador;

public class Login extends javax.swing.JFrame implements Comunicador{
    
    private UsuarioControlador control;
    private boolean habilitar=true;
    private KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    
    /**
     * Login, Se inicializan los componentes y se asigna el icono de la ventana.
     */
    public Login() {
        initComponents();
        setTitle("CapaciSoft - Login");
        setResizable(false);
        setLocationRelativeTo(null);
        control = new UsuarioControlador(this, Usuario.class);
        ImageIcon imageLogo = new ImageIcon(Capacisoft.class.getResource(
            "/mx/edu/cobach/"+ "vista/recursos/logo.png"));
        setIconImage(imageLogo.getImage());
        
        /**
         * Metodo que sirve para validar que solo se admitan letras mayusculas
         * en los campos de texto.
         */
        manager.addKeyEventDispatcher(new KeyEventDispatcher(){
            public boolean dispatchKeyEvent(KeyEvent e) {
                if(e.getID() == KeyEvent.KEY_TYPED){
                    if(e.getKeyChar() >= 'a' && e.getKeyChar() <= 'z'){
                        e.setKeyChar((char)(((int)e.getKeyChar()) - 32));
                    }
                }
                return false;
            }
        });
    }
    
    

//y enseguida registramos nuestro dispatcher
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresarBtn = new javax.swing.JButton();
        contrasenaPFd = new javax.swing.JPasswordField();
        contrasenaLbl = new javax.swing.JLabel();
        salirBtn = new javax.swing.JButton();
        usuarioLbl = new javax.swing.JLabel();
        usuarioTFd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingresarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresarBtn.setText("Ingresar");
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });

        contrasenaPFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contrasenaPFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contrasenaPFdKeyPressed(evt);
            }
        });

        contrasenaLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contrasenaLbl.setText("Contraseña:");

        salirBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        usuarioLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioLbl.setText("Usuario:");

        usuarioTFd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuarioTFd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioTFdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ingresarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contrasenaLbl)
                            .addComponent(usuarioLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasenaPFd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLbl)
                    .addComponent(usuarioTFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenaLbl)
                    .addComponent(contrasenaPFd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirBtn)
                    .addComponent(ingresarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Al accionar el boton de ingresar.
     */
    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
       validar();
    }//GEN-LAST:event_ingresarBtnActionPerformed

    /**
     * Al accionar el boton de salir.
     */
    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        System.exit(0);    
    }//GEN-LAST:event_salirBtnActionPerformed
    
    /**
     * Al precionar cualquier tecla en el campo de texto de usuario.
     * Se valida que la tecla precionada sea la tecla enter para poder validar
     * los campos de texto.
     */
    private void usuarioTFdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioTFdKeyPressed
        if(evt.getKeyCode() ==10)
            validar();
    }//GEN-LAST:event_usuarioTFdKeyPressed
    
    /**
     * Al precionar cualquier tecla en el campo de texto de contraseña.
     * Se valida que la tecla precionada sea la tecla enter para poder validar
     * los campos de texto.
     */
    private void contrasenaPFdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrasenaPFdKeyPressed
       if(evt.getKeyCode() ==10)
           validar();                      
        
    }//GEN-LAST:event_contrasenaPFdKeyPressed
    
    /**
     * validar, este metodo valida que los campo de texto contengan informacion
     * antes de poder ingresar al sistema.
     */
    public void validar(){
        if(usuarioTFd.getText().equals("") &&
            contrasenaPFd.getText().equals("")){
            setMensaje("No se ha ingresado el nombre de usuario ni la contraseña");
            usuarioTFd.grabFocus();
        }else 
            if(usuarioTFd.getText().equals("")){
                setMensaje("No se ha ingresado el nombre de usuario");
                usuarioTFd.grabFocus();
            }else        
                if(contrasenaPFd.getText().equals("")){
                    setMensaje("No se ha ingresado la contraseña");
                    contrasenaPFd.grabFocus();
                }else
                    if(usuarioTFd.getText().equals("") != true &&
                        contrasenaPFd.getText().equals("") != true)
                        ingresar();
    }
    
    /**
     * ingresar, este metodo deshabilita los campos de texto y los botones, para
     * que no puedan ser utilizados por el usuario mientras se esta buscando
     * el nombre de usuario en la base de datos.
     */
    private void ingresar(){
        if(habilitar==true){
            habilitar=false;
            ingresarBtn.setEnabled(false);
            salirBtn.setEnabled(false);  
            String usuario=usuarioTFd.getText();
            control.buscarPorUsuario(usuario);        
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contrasenaLbl;
    private javax.swing.JPasswordField contrasenaPFd;
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel usuarioLbl;
    private javax.swing.JTextField usuarioTFd;
    // End of variables declaration//GEN-END:variables

    /**
     * este metodo muestra un mensaje en pantalla con el contenido de 
     * mensaje.
     * @param String mensaje 
     */
    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    /**
     * Este metodo recibe la informacion del usuario que se haya obtenido de la
     * base de datos, si el usuario y contraseña son corectos entonces podra
     * ingresar al sistema, de lo contrario mostrara un mensaje y lo regresara
     * a modificar los datos ingresados.
     * @param String[][] info 
     */
    @Override
    public void setTabla(String[][] info) {
        String contrasena = String.valueOf(contrasenaPFd.getPassword());
        if(info==null){
            setMensaje("Nombre de usuario incorrecto");
            habilitar=true;
            ingresarBtn.setEnabled(true);
            salirBtn.setEnabled(true);
        }else{
            if(info[0][1].equals(contrasena)){      
                new Capacisoft(info[0][2]).setVisible(true);
                this.setVisible(false);
            }else{
                setMensaje("Contraseña incorrecta");
                habilitar=true;
                ingresarBtn.setEnabled(true);
                salirBtn.setEnabled(true);
                contrasenaPFd.grabFocus();
            }
        }
    }

    @Override
    public void setLista(List info, int i) {
    }

    @Override
    public void setInfo(List info) {
    }
}
