/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import classes.get_connection;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.*;

/**
 *
 * @author pc
 */
public class Registro_de_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Registro_de_Clientes
     */
    public Registro_de_Clientes() {
        initComponents();
        setTitle("Registro de Clientes.");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        ImageIcon imag_1 = new ImageIcon("src/images/wallpaper2.png");
        
        Icon ic_1 = new ImageIcon(imag_1.getImage().getScaledInstance(jLabel_wallpaper4.getWidth(), 
                jLabel_wallpaper4.getHeight(), Image.SCALE_DEFAULT));
        
        jLabel_wallpaper4.setIcon(ic_1);
        
        this.repaint();
    }
    
    @Override
    public Image getIconImage(){
        
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel_copyright = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_AddressClient = new javax.swing.JTextField();
        jTextField_phoneClient = new javax.swing.JTextField();
        jTextField_emailClient = new javax.swing.JTextField();
        jTextField_nameClient = new javax.swing.JTextField();
        jLabel_wallpaper4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(530, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 235, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clients_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 130, 100));

        jLabel_copyright.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_copyright.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_copyright.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_copyright.setText("Creado por Miguel S.A ©");
        getContentPane().add(jLabel_copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jTextField_AddressClient.setBackground(new java.awt.Color(255, 204, 153));
        jTextField_AddressClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_AddressClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_AddressClientFocusGained(evt);
            }
        });
        getContentPane().add(jTextField_AddressClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 220, -1));

        jTextField_phoneClient.setBackground(new java.awt.Color(255, 204, 153));
        jTextField_phoneClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_phoneClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_phoneClientFocusGained(evt);
            }
        });
        getContentPane().add(jTextField_phoneClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 225, 220, -1));

        jTextField_emailClient.setBackground(new java.awt.Color(255, 204, 153));
        jTextField_emailClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_emailClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_emailClientFocusGained(evt);
            }
        });
        getContentPane().add(jTextField_emailClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 155, 220, -1));

        jTextField_nameClient.setBackground(new java.awt.Color(255, 204, 153));
        jTextField_nameClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_nameClient.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_nameClientFocusGained(evt);
            }
        });
        getContentPane().add(jTextField_nameClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, 220, -1));
        getContentPane().add(jLabel_wallpaper4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String name_client, e_client, p_client, addre_client;
        int validacion = 0;
        
        name_client = jTextField_nameClient.getText().trim();
        e_client = jTextField_emailClient.getText().trim();
        p_client = jTextField_phoneClient.getText().trim();
        addre_client = jTextField_AddressClient.getText().trim();
       
        
        if (name_client.equals("")) {
            
            jTextField_nameClient.setBackground(Color.PINK);
            validacion++;
            
        }
        
        if (e_client.equals("")) {
            
            jTextField_emailClient.setBackground(Color.PINK);
            validacion++;
            
        }
        
        if (p_client.equals("")) {
            
            jTextField_phoneClient.setBackground(Color.PINK);
            validacion++;
            
        }
        
        if (addre_client.equals("")) {
            
            jTextField_AddressClient.setBackground(Color.PINK);
            validacion++;
            
        }
        
        try {
            
            Connection cn_1 = get_connection.connect();
            PreparedStatement pst = cn_1.prepareStatement("select nombre_cliente from clientes where nombre_cliente = '" + name_client + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                jTextField_nameClient.setBackground(Color.PINK);
                JOptionPane.showMessageDialog(null, "Nombre de cliente no disponible para usar.");
                cn_1.close();
                
            }
            
            else {
                
                cn_1.close();
                
                if(validacion == 0) {
                    
                    try {
                        
                        Connection cn_2 = get_connection.connect();
                        PreparedStatement pst_2 = cn_2.prepareStatement("insert into clientes values(?,?,?,?,?,?,?)");
                        
                        
                        pst_2.setInt(1, 0);
                        pst_2.setString(2, name_client);
                        pst_2.setString(3, e_client);
                        pst_2.setString(4, p_client);
                        pst_2.setString(5, addre_client);
                        pst_2.setString(6, Login.user);
                        pst_2.setString(7, "omar");
                        
                        
                        
                        pst_2.executeUpdate();
                        cn_2.close();
                        
                        jTextField_nameClient.setBackground(new Color(51, 255, 51));
                        jTextField_emailClient.setBackground(new Color(51, 255, 51));
                        jTextField_phoneClient.setBackground(new Color(51, 255, 51));
                        jTextField_AddressClient.setBackground(new Color(51, 255, 51));
                        
                        
                        JOptionPane.showMessageDialog(null, "Registro de cliente exitoso.");
                        
                        this.dispose();
                        
                        
                    } catch (SQLException e) {
                        
                        System.out.println("SQL ERROR! " + e);
                    }
        
                    
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(null, "Llene todos los campos requeridos", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    
                }
            
            }
            
        } catch (HeadlessException | SQLException e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_nameClientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_nameClientFocusGained
        
        jTextField_nameClient.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jTextField_nameClientFocusGained

    private void jTextField_emailClientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_emailClientFocusGained
        
        jTextField_emailClient.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jTextField_emailClientFocusGained

    private void jTextField_phoneClientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_phoneClientFocusGained
        
        jTextField_phoneClient.setBackground(new Color(255,204,153));
        
    }//GEN-LAST:event_jTextField_phoneClientFocusGained

    private void jTextField_AddressClientFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_AddressClientFocusGained
        
        jTextField_AddressClient.setBackground(new Color(255,204,153));
        
    }//GEN-LAST:event_jTextField_AddressClientFocusGained

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
            java.util.logging.Logger.getLogger(Registro_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_de_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_copyright;
    private javax.swing.JLabel jLabel_wallpaper4;
    private javax.swing.JTextField jTextField_AddressClient;
    private javax.swing.JTextField jTextField_emailClient;
    private javax.swing.JTextField jTextField_nameClient;
    private javax.swing.JTextField jTextField_phoneClient;
    // End of variables declaration//GEN-END:variables
}