/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import javafx.scene.layout.Border;

/**
 *
 * @author Faroos
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnUser = new javax.swing.JLabel();
        btnProducts = new javax.swing.JLabel();
        btnTab = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnTab1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(null);

        Heading.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Admin Panel");
        mainPanel.add(Heading);
        Heading.setBounds(150, 60, 120, 30);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(410, 20, 12, 533);

        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/user.png"))); // NOI18N
        btnUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });
        mainPanel.add(btnUser);
        btnUser.setBounds(480, 130, 127, 139);

        btnProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnProducts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/foods.png"))); // NOI18N
        btnProducts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductsMouseClicked(evt);
            }
        });
        mainPanel.add(btnProducts);
        btnProducts.setBounds(730, 130, 125, 139);

        btnTab.setForeground(new java.awt.Color(255, 255, 255));
        btnTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/tablet.png"))); // NOI18N
        btnTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainPanel.add(btnTab);
        btnTab.setBounds(480, 330, 122, 139);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Designed & Developed by Mohamed Faroos");
        mainPanel.add(jLabel7);
        jLabel7.setBounds(90, 520, 209, 21);

        btnTab1.setForeground(new java.awt.Color(255, 255, 255));
        btnTab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTab1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/prediction.png"))); // NOI18N
        btnTab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnTab1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainPanel.add(btnTab1);
        btnTab1.setBounds(730, 330, 122, 139);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("On-Table Ordering System");
        mainPanel.add(jLabel1);
        jLabel1.setBounds(550, 30, 251, 22);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Logo.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        mainPanel.add(jLabel9);
        jLabel9.setBounds(0, 160, 380, 210);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Logout");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        mainPanel.add(jLabel2);
        jLabel2.setBounds(150, 460, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        ManageUser mu=new ManageUser();
        mu.setVisible(true);
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseClicked
        ManageFood mf=new ManageFood();
        mf.setVisible(true);
    }//GEN-LAST:event_btnProductsMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel btnProducts;
    private javax.swing.JLabel btnTab;
    private javax.swing.JLabel btnTab1;
    private javax.swing.JLabel btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
