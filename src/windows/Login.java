package windows;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import classes.get_connection;

public class Login extends javax.swing.JFrame {

    public static String user = "";
    private String pass = "";

    public Login() {
        initComponents();
        setSize(500, 600);
        setResizable(false);
        setTitle("Inicio de Sesion.");
        setLocationRelativeTo(null);

        ImageIcon imag_1 = new ImageIcon("src/images/wallpaper.png");
        Icon ic_1 = new ImageIcon(imag_1.getImage().getScaledInstance(jlabel_wallpaper1.getWidth(),
                jlabel_wallpaper1.getHeight(), Image.SCALE_DEFAULT));

        ImageIcon imag_2 = new ImageIcon("src/images/sena_logo.png");
        Icon ic_2 = new ImageIcon(imag_2.getImage().getScaledInstance(jLabel_logoSena.getWidth(),
                jLabel_logoSena.getHeight(), Image.SCALE_DEFAULT));

        jlabel_wallpaper1.setIcon(ic_1);
        jLabel_logoSena.setIcon(ic_2);
        this.repaint();

    }

    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/Logo_icon2.png"));
        return retValue;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        copyright_SENA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel_password = new javax.swing.JLabel();
        jLabel_usuario = new javax.swing.JLabel();
        jPassword_1 = new javax.swing.JPasswordField();
        jTextField_usuario = new javax.swing.JTextField();
        jLabel_logoSena = new javax.swing.JLabel();
        jlabel_wallpaper1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        copyright_SENA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyright_SENA.setForeground(new java.awt.Color(255, 255, 255));
        copyright_SENA.setText("Servicio Nacional de Aprendizaje | Copyright ©");
        getContentPane().add(copyright_SENA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, 20));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Acceder");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 120, 40));

        jLabel_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("Password:");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jLabel_usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_usuario.setText("Usuario:");
        getContentPane().add(jLabel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jPassword_1.setBackground(new java.awt.Color(0, 255, 204));
        jPassword_1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPassword_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPassword_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 200, -1));

        jTextField_usuario.setBackground(new java.awt.Color(0, 255, 204));
        jTextField_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 200, -1));

        jLabel_logoSena.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_logoSena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -50, 340, 430));
        getContentPane().add(jlabel_wallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        user = jTextField_usuario.getText().trim();
        pass = jPassword_1.getText().trim();

        if (!user.equals("") & !pass.equals("")) {
            try {
                Connection gcn_1 = get_connection.connect();
                PreparedStatement pst = gcn_1.prepareStatement("select tipo_nivel, estatus from usuarios where username = '" + user
                + "' and password = '" + pass + "'");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    
                    String tv_1 = rs.getString("tipo_nivel");
                    String est_1 = rs.getString("estatus");
                    
                    if (tv_1.equals("Administrador") & est_1.equals("Activo")) {
                        dispose();
                        new Administrador().setVisible(true);
                        
                    } else if(tv_1.equals("Asistente") & est_1.equals("Activo")){
                        dispose();
                        new Asistente().setVisible(true);
                        
                        
                    } else if(tv_1.equals("Tecnico") & est_1.equals("Activo")){
                        dispose();
                        new tecnico().setVisible(true);
                        
                    }
                    
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos, compruebe nuevamente.");
                    jTextField_usuario.setText("");
                    jPassword_1.setText("");
                }
                

            } catch (SQLException e) {
                System.err.println("Error en el boton acceder!" + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesion, contacte al administrador");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los campos correctamente.");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel copyright_SENA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_logoSena;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPasswordField jPassword_1;
    private javax.swing.JTextField jTextField_usuario;
    private javax.swing.JLabel jlabel_wallpaper1;
    // End of variables declaration//GEN-END:variables
}
