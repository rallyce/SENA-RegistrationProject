/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import java.sql.*;

import classes.get_connection;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

/**
 *
 * @author pc
 */
public class Grafica_de_estatus extends javax.swing.JFrame {

    int en_mante, reparado, entregado, nuevo_ing;

    String[] vector_nombre = new String[5];
    int[] vector_cantidad = new int[5];
    
    

    public Grafica_de_estatus() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Grafica de datos del estatus.");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon imag_1 = new ImageIcon("src/images/wallpaper2.png");

        Icon ic_1 = new ImageIcon(imag_1.getImage().getScaledInstance(jLabel1.getWidth(),
                jLabel1.getHeight(), Image.SCALE_DEFAULT));

        jLabel1.setIcon(ic_1);

        try {

            Connection cn = get_connection.connect();
            PreparedStatement pst = cn.prepareStatement(
                    "select estatus, count(estatus) as Cantidad from equipos group by estatus");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                int i = 0;

                do {

                    vector_nombre[i] = rs.getString(1);
                    vector_cantidad[i] = rs.getInt(2);

                    if (vector_nombre[i].equalsIgnoreCase("En mantenimiento")) {
                        en_mante = vector_cantidad[i];

                    } else if (vector_nombre[i].equalsIgnoreCase("Reparado")) {
                        reparado = vector_cantidad[i];

                    } else if (vector_nombre[i].equalsIgnoreCase("Entregado")) {
                        entregado = vector_cantidad[i];

                    } else if (vector_nombre[i].equalsIgnoreCase("Nuevo ingreso")) {
                        nuevo_ing = vector_cantidad[i];

                    }

                    i++;

                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println("Error en la conexion con la base de datos " + e);
            JOptionPane.showMessageDialog(null, "Error! Contacte al administrador", "Error!", JOptionPane.ERROR_MESSAGE);
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

        jLabel_copyright = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_copyright.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_copyright.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_copyright.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_copyright.setText("Creado por Miguel S.A ©");
        getContentPane().add(jLabel_copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos generales de estatus");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Grafica_de_estatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica_de_estatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica_de_estatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica_de_estatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                new Grafica_de_estatus().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_copyright;
    // End of variables declaration//GEN-END:variables

    public int Estatus_mayor(int Nuevo_ingreso, int en_mante, int reparado, int entregado) {

        if (Nuevo_ingreso > en_mante & Nuevo_ingreso > reparado & Nuevo_ingreso > entregado) {
            return Nuevo_ingreso;

        } else if (en_mante > reparado & en_mante > entregado) {
            return en_mante;

        } else if (reparado > entregado) {

            return reparado;

        } else {

            return entregado;

        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int estatus_mayor = Estatus_mayor(nuevo_ing, en_mante, reparado, entregado);

        int long_nuevoingreso = (400 * nuevo_ing) / estatus_mayor;
        int long_enMante = (400 * en_mante) / estatus_mayor;
        int long_reparado = (400 * reparado) / estatus_mayor;
        int long_entregado = (400 * entregado) / estatus_mayor;

        g.setColor(new Color(204, 204, 255));
        g.setFont(new Font("Pt Sans", 1, 12));
        g.fillRect(100, 100, long_nuevoingreso, 40);
        g.drawString("Nuevo ingreso", 10, 118);
        g.drawString("Cantidad: " + nuevo_ing, 10, 133);
        
        g.setColor(new Color(255, 204, 0));
        g.setFont(new Font("Pt Sans", 1, 12));
        g.fillRect(100, 150, long_enMante, 40);
        g.drawString("En Manteni...", 10, 168);
        g.drawString("Cantidad: " + en_mante, 10, 183);
        
        g.setColor(new Color(102, 254, 0));
        g.setFont(new Font("Pt Sans", 1, 12));
        g.fillRect(100, 200, long_reparado, 40);
        g.drawString("Reparado: ", 10, 218);
        g.drawString("Cantidad: " + reparado, 10, 233);
        
        g.setColor(new Color(0, 255, 204));
        g.setFont(new Font("Pt Sans", 1, 12));
        g.fillRect(100, 250, long_entregado, 40);
        g.drawString("Entregado", 10, 268);
        g.drawString("Cantidad: " + entregado, 10, 283);

    }

}
