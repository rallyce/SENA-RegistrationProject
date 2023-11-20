/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import windows.Info_Clientes;

import java.sql.*;
import classes.get_connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JOptionPane;




public class Informacion_equipos_Tecnico extends javax.swing.JFrame {
    

    

    
    
    public Informacion_equipos_Tecnico() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Informacion de equipos.");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        

        jComboBox_typeInfo.removeAllItems();
        jComboBox_typeInfo.addItem("---");
        jComboBox_typeInfo.addItem("Laptop");
        jComboBox_typeInfo.addItem("Escritorio");
        jComboBox_typeInfo.addItem("Todo en uno");

        jComboBox_marcaInfo.removeAllItems();
        jComboBox_marcaInfo.addItem("---");
        jComboBox_marcaInfo.addItem("Acer");
        jComboBox_marcaInfo.addItem("Lenovo");
        jComboBox_marcaInfo.addItem("Hp");
        jComboBox_marcaInfo.addItem("Dell");
        jComboBox_marcaInfo.addItem("Apple");

        jComboBox_estatusInfo.removeAllItems();
        jComboBox_estatusInfo.addItem("Nuevo Ingreso");
        jComboBox_estatusInfo.addItem("En mantenimiento");
        jComboBox_estatusInfo.addItem("Reparado");
        jComboBox_estatusInfo.addItem("Entregado");

        ImageIcon imag_1 = new ImageIcon("src/images/wallpaper2.png");

        Icon ic_1 = new ImageIcon(imag_1.getImage().getScaledInstance(jLabel_wallpaper4.getWidth(),
                jLabel_wallpaper4.getHeight(), Image.SCALE_DEFAULT));

        jLabel_wallpaper4.setIcon(ic_1);

        try {
            
            String dia_info, mes_info, annio_info;
          
       
            

            Connection cn_1 = get_connection.connect();
            PreparedStatement pst = cn_1.prepareStatement("select tipo_equipo, marca, modelo, num_serie, dia_ingreso, mes_ingreso, annio_ingreso, observaciones, estatus, ultima_modificacion, comentarios_tecnicos from equipos where id_equipo = '" + Gestion_de_equipos.ID_E_2 + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                

                jComboBox_typeInfo.setSelectedItem(rs.getString("tipo_equipo"));
                jComboBox_marcaInfo.setSelectedItem(rs.getString("marca"));
                jComboBox_estatusInfo.setSelectedItem(rs.getString("estatus"));

                jTextField_modeloInfo.setText(rs.getString("modelo"));
                jTextField_numInfo.setText(rs.getString("num_serie"));
                jTextField_modyInfo.setText(rs.getString("ultima_modificacion"));
                
                dia_info = Integer.toString(rs.getInt("dia_ingreso"));
                mes_info = Integer.toString(rs.getInt("mes_ingreso"));
                annio_info = Integer.toString(rs.getInt("annio_ingreso"));
                          
                jTextField_EnterDate.setText(dia_info + "/" + mes_info + "/" + annio_info);
                
                jTextPane_ObsInfo.setText(rs.getString("observaciones"));
                jTextPane_Comentariostec.setText(rs.getString("comentarios_tecnicos"));

            }

        } catch (SQLException e) {
            System.out.println("SQL ERROR!" + e);
        }
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

        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_EnterDate = new javax.swing.JTextField();
        jTextField_modyInfo = new javax.swing.JTextField();
        jTextField_numInfo = new javax.swing.JTextField();
        jTextField_nameforclient = new javax.swing.JTextField();
        jComboBox_marcaInfo = new javax.swing.JComboBox<>();
        jComboBox_typeInfo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_Comentariostec = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_ObsInfo = new javax.swing.JTextPane();
        jTextField_modeloInfo = new javax.swing.JTextField();
        jComboBox_estatusInfo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel_wallpaper4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Comentarios y actualizacion del tecnico:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Daño reportado y obervaciones:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estatus:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de ingreso:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ultima modificacion hecha por:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de serie:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modelo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de computador:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informacion del equipo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jTextField_EnterDate.setEditable(false);
        jTextField_EnterDate.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_EnterDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_EnterDate.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField_EnterDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 85, 190, -1));

        jTextField_modyInfo.setEditable(false);
        jTextField_modyInfo.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_modyInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_modyInfo.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField_modyInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, -1));

        jTextField_numInfo.setBackground(new java.awt.Color(255, 204, 153));
        jTextField_numInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_numInfo.setForeground(new java.awt.Color(153, 0, 51));
        jTextField_numInfo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_numInfoFocusGained(evt);
            }
        });
        getContentPane().add(jTextField_numInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 365, 210, -1));

        jTextField_nameforclient.setEditable(false);
        jTextField_nameforclient.setBackground(new java.awt.Color(204, 204, 204));
        jTextField_nameforclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_nameforclient.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField_nameforclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 210, -1));

        jComboBox_marcaInfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_marcaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 225, 110, -1));

        jComboBox_typeInfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_typeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 120, -1));

        jScrollPane2.setViewportView(jTextPane_Comentariostec);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 350, 140));

        jTextPane_ObsInfo.setEditable(false);
        jScrollPane1.setViewportView(jTextPane_ObsInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 350, 140));

        jTextField_modeloInfo.setBackground(new java.awt.Color(255, 204, 153));
        jTextField_modeloInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_modeloInfo.setForeground(new java.awt.Color(153, 51, 0));
        jTextField_modeloInfo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_modeloInfoFocusGained(evt);
            }
        });
        getContentPane().add(jTextField_modeloInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 295, 210, -1));

        jComboBox_estatusInfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_estatusInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 85, 120, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Creado por Miguel S.A ©");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 545, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Comentar y enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));
        getContentPane().add(jLabel_wallpaper4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String comentarios_tec, estatus, tecnico;
        
        estatus = jComboBox_estatusInfo.getSelectedItem().toString();
        comentarios_tec = jTextPane_Comentariostec.getText().trim();
        tecnico = Login.user;
        
        try {
            
            Connection cn = get_connection.connect();
            PreparedStatement pst = cn.prepareStatement("update equipos set estatus = ?, comentarios_tecnicos = ?, revision_tecnica = ? where id_equipo = '" + Gestion_de_equipos.ID_E_2 +  "'");
            
            pst.setString(1, estatus);
            pst.setString(2, comentarios_tec);
            pst.setString(3, tecnico);
            
            pst.executeUpdate();
            cn.close();
            
            jTextField_modeloInfo.setBackground(new Color(51, 255, 51));
            jTextField_numInfo.setBackground(new Color(51, 255, 51));
            
            JOptionPane.showMessageDialog(null, "Actualizacion de datos del equipo exitosa.");
            
            this.dispose();
                    
            
        } catch (SQLException e) {
            System.out.println("SQL ERROR! " + e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_modeloInfoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_modeloInfoFocusGained
        jTextField_modeloInfo.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jTextField_modeloInfoFocusGained

    private void jTextField_numInfoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_numInfoFocusGained
        jTextField_numInfo.setBackground(new Color(255,204,153));
    }//GEN-LAST:event_jTextField_numInfoFocusGained

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
            java.util.logging.Logger.getLogger(Informacion_equipos_Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_equipos_Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_equipos_Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_equipos_Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion_equipos_Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox_estatusInfo;
    private javax.swing.JComboBox<String> jComboBox_marcaInfo;
    private javax.swing.JComboBox<String> jComboBox_typeInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_EnterDate;
    private javax.swing.JTextField jTextField_modeloInfo;
    private javax.swing.JTextField jTextField_modyInfo;
    private javax.swing.JTextField jTextField_nameforclient;
    private javax.swing.JTextField jTextField_numInfo;
    private javax.swing.JTextPane jTextPane_Comentariostec;
    private javax.swing.JTextPane jTextPane_ObsInfo;
    // End of variables declaration//GEN-END:variables

     
}