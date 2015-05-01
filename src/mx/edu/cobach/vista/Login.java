/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.vista;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mx.edu.cobach.persistencia.entidades.Usuario;
import mx.edu.cobach.vista.controlador.UsuarioControlador;

/**
 *
 * @author SALB
 */
public class Login extends javax.swing.JFrame implements Comunicador{

    /**
     * Creates new form Login
     */
    private UsuarioControlador control;
    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        control = new UsuarioControlador(this,Usuario.class);
        
        ImageIcon imageLogo = new ImageIcon(Capacisoft.class.getResource("/mx/edu/cobach/"
                + "vista/recursos/logo.png"));
        setIconImage(imageLogo.getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingresar_OL_Btn = new javax.swing.JButton();
        Contrasena_IL_Pfd = new javax.swing.JPasswordField();
        Contrasena_IL_Lbl = new javax.swing.JLabel();
        Salir_OL_Btn = new javax.swing.JButton();
        Usuario_IL_Lbl = new javax.swing.JLabel();
        Usuario_IL_Tfd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ingresar_OL_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ingresar_OL_Btn.setText("Ingresar");
        Ingresar_OL_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_OL_BtnActionPerformed(evt);
            }
        });

        Contrasena_IL_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Contrasena_IL_Lbl.setText("Contraseña:");

        Salir_OL_Btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salir_OL_Btn.setText("Salir");

        Usuario_IL_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuario_IL_Lbl.setText("Usuario:");

        Usuario_IL_Tfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_IL_TfdActionPerformed(evt);
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
                        .addComponent(Contrasena_IL_Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(Contrasena_IL_Pfd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Salir_OL_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ingresar_OL_Btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Usuario_IL_Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Usuario_IL_Tfd, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario_IL_Lbl)
                    .addComponent(Usuario_IL_Tfd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contrasena_IL_Pfd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contrasena_IL_Lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir_OL_Btn)
                    .addComponent(Ingresar_OL_Btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ingresar_OL_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_OL_BtnActionPerformed
       
       control.buscarPorNombre(Usuario_IL_Tfd.getText());
        
    }//GEN-LAST:event_Ingresar_OL_BtnActionPerformed

    private void Usuario_IL_TfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_IL_TfdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario_IL_TfdActionPerformed

/****/
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contrasena_IL_Lbl;
    private javax.swing.JPasswordField Contrasena_IL_Pfd;
    private javax.swing.JButton Ingresar_OL_Btn;
    private javax.swing.JButton Salir_OL_Btn;
    private javax.swing.JLabel Usuario_IL_Lbl;
    private javax.swing.JTextField Usuario_IL_Tfd;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTabla(String[][] info) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void setInfo(String[][] info) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLogin(String[][] login) {
        //System.out.println("contraseña  -> "+login[0][1]);
      if(login[0][1].equals(Contrasena_IL_Pfd.getText())){
          
          new Capacisoft(login[0][2]).setVisible(true);
          this.setVisible(false);
      }else
          setMensaje("Usuario o Contraseña incorrectas");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLista(List info, int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInfo(List info) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
