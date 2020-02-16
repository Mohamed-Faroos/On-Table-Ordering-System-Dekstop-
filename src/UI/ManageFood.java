/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Faroos
 */
public class ManageFood extends javax.swing.JFrame {

    /**
     * Creates new form ManageFood
     */
    public ManageFood() {
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
        btnExit = new javax.swing.JLabel();
        txtFooter = new javax.swing.JLabel();
        btnUpdateCategory = new javax.swing.JLabel();
        btnAddcategory = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userTabPane = new javax.swing.JTabbedPane();
        addCategory = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        updateCategory = new javax.swing.JPanel();
        txtTitle2 = new javax.swing.JLabel();
        addFood = new javax.swing.JPanel();
        txtTitle3 = new javax.swing.JLabel();
        updateFood = new javax.swing.JPanel();
        txtTitle4 = new javax.swing.JLabel();
        Heading1 = new javax.swing.JLabel();
        Heading2 = new javax.swing.JLabel();
        btnAddFood = new javax.swing.JLabel();
        btnUpdateFoods = new javax.swing.JLabel();
        txtTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 102, 153));
        mainPanel.setLayout(null);

        Heading.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("&");
        mainPanel.add(Heading);
        Heading.setBounds(120, 70, 20, 29);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(250, 20, 12, 580);

        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        mainPanel.add(btnExit);
        btnExit.setBounds(60, 460, 140, 38);

        txtFooter.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtFooter.setForeground(new java.awt.Color(255, 255, 255));
        txtFooter.setText("Designed & Developed by Mohamed Faroos");
        mainPanel.add(txtFooter);
        txtFooter.setBounds(30, 560, 209, 21);

        btnUpdateCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdateCategory.setText("Update Category");
        btnUpdateCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnUpdateCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateCategoryMouseClicked(evt);
            }
        });
        mainPanel.add(btnUpdateCategory);
        btnUpdateCategory.setBounds(60, 250, 140, 38);

        btnAddcategory.setForeground(new java.awt.Color(255, 255, 255));
        btnAddcategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddcategory.setText("Add Category");
        btnAddcategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAddcategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddcategoryMouseClicked(evt);
            }
        });
        mainPanel.add(btnAddcategory);
        btnAddcategory.setBounds(60, 180, 140, 38);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        mainPanel.add(jPanel2);
        jPanel2.setBounds(270, 60, 670, 30);

        addCategory.setBackground(new java.awt.Color(0, 102, 153));

        txtTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("Add Category");

        javax.swing.GroupLayout addCategoryLayout = new javax.swing.GroupLayout(addCategory);
        addCategory.setLayout(addCategoryLayout);
        addCategoryLayout.setHorizontalGroup(
            addCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCategoryLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(txtTitle)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        addCategoryLayout.setVerticalGroup(
            addCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCategoryLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        userTabPane.addTab("tab1", addCategory);

        updateCategory.setBackground(new java.awt.Color(0, 102, 153));

        txtTitle2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTitle2.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle2.setText("Edit Category");

        javax.swing.GroupLayout updateCategoryLayout = new javax.swing.GroupLayout(updateCategory);
        updateCategory.setLayout(updateCategoryLayout);
        updateCategoryLayout.setHorizontalGroup(
            updateCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateCategoryLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(txtTitle2)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        updateCategoryLayout.setVerticalGroup(
            updateCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateCategoryLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        userTabPane.addTab("tab2", updateCategory);

        addFood.setBackground(new java.awt.Color(0, 102, 153));

        txtTitle3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTitle3.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle3.setText("Add Product");

        javax.swing.GroupLayout addFoodLayout = new javax.swing.GroupLayout(addFood);
        addFood.setLayout(addFoodLayout);
        addFoodLayout.setHorizontalGroup(
            addFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFoodLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(txtTitle3)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        addFoodLayout.setVerticalGroup(
            addFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFoodLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        userTabPane.addTab("tab3", addFood);

        updateFood.setBackground(new java.awt.Color(0, 102, 153));

        txtTitle4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTitle4.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle4.setText("View Product");

        javax.swing.GroupLayout updateFoodLayout = new javax.swing.GroupLayout(updateFood);
        updateFood.setLayout(updateFoodLayout);
        updateFoodLayout.setHorizontalGroup(
            updateFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateFoodLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(txtTitle4)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        updateFoodLayout.setVerticalGroup(
            updateFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateFoodLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        userTabPane.addTab("tab4", updateFood);

        mainPanel.add(userTabPane);
        userTabPane.setBounds(260, 41, 680, 570);

        Heading1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        Heading1.setForeground(new java.awt.Color(255, 255, 255));
        Heading1.setText("Category");
        mainPanel.add(Heading1);
        Heading1.setBounds(70, 100, 120, 29);

        Heading2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        Heading2.setForeground(new java.awt.Color(255, 255, 255));
        Heading2.setText("Manage Foods");
        mainPanel.add(Heading2);
        Heading2.setBounds(40, 40, 190, 29);

        btnAddFood.setForeground(new java.awt.Color(255, 255, 255));
        btnAddFood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddFood.setText("Add Food");
        btnAddFood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAddFood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddFoodMouseClicked(evt);
            }
        });
        mainPanel.add(btnAddFood);
        btnAddFood.setBounds(60, 320, 140, 38);

        btnUpdateFoods.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateFoods.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdateFoods.setText("Update Food");
        btnUpdateFoods.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnUpdateFoods.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateFoods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateFoodsMouseClicked(evt);
            }
        });
        mainPanel.add(btnUpdateFoods);
        btnUpdateFoods.setBounds(60, 390, 140, 38);

        txtTitle1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtTitle1.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle1.setText("On-Table Ordering System");
        mainPanel.add(txtTitle1);
        txtTitle1.setBounds(460, 10, 251, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnUpdateCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCategoryMouseClicked
        userTabPane.setSelectedIndex(1);
        
    }//GEN-LAST:event_btnUpdateCategoryMouseClicked

    private void btnAddcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddcategoryMouseClicked
        userTabPane.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddcategoryMouseClicked

    private void btnAddFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddFoodMouseClicked
        userTabPane.setSelectedIndex(2);
    }//GEN-LAST:event_btnAddFoodMouseClicked

    private void btnUpdateFoodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateFoodsMouseClicked
        userTabPane.setSelectedIndex(3);
    }//GEN-LAST:event_btnUpdateFoodsMouseClicked

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
            java.util.logging.Logger.getLogger(ManageFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel Heading1;
    private javax.swing.JLabel Heading2;
    private javax.swing.JPanel addCategory;
    private javax.swing.JPanel addFood;
    private javax.swing.JLabel btnAddFood;
    private javax.swing.JLabel btnAddcategory;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnUpdateCategory;
    private javax.swing.JLabel btnUpdateFoods;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel txtFooter;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtTitle1;
    private javax.swing.JLabel txtTitle2;
    private javax.swing.JLabel txtTitle3;
    private javax.swing.JLabel txtTitle4;
    private javax.swing.JPanel updateCategory;
    private javax.swing.JPanel updateFood;
    private javax.swing.JTabbedPane userTabPane;
    // End of variables declaration//GEN-END:variables
}
