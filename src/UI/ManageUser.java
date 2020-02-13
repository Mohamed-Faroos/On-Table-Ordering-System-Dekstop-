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
public class ManageUser extends javax.swing.JFrame {

    /**
     * Creates new form ManageUser
     */
    public ManageUser() {
        initComponents();
                txtMsg.setVisible(false);

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
        txtTitle = new javax.swing.JLabel();
        btnView = new javax.swing.JLabel();
        btnAddUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userTabPane = new javax.swing.JTabbedPane();
        addUser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cmbType = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtMsg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCpassword = new javax.swing.JPasswordField();
        Search = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 102, 153));
        mainPanel.setLayout(null);

        Heading.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Manage Users");
        mainPanel.add(Heading);
        Heading.setBounds(40, 90, 175, 29);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(260, 20, 12, 530);

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
        btnExit.setBounds(60, 320, 140, 38);

        txtFooter.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtFooter.setForeground(new java.awt.Color(255, 255, 255));
        txtFooter.setText("Designed & Developed by Mohamed Faroos");
        mainPanel.add(txtFooter);
        txtFooter.setBounds(33, 502, 209, 21);

        txtTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("On-Table Ordering System");
        mainPanel.add(txtTitle);
        txtTitle.setBounds(460, 10, 251, 30);

        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnView.setText("View & Update");
        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        mainPanel.add(btnView);
        btnView.setBounds(60, 250, 140, 38);

        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddUser.setText("Add User");
        btnAddUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
        });
        mainPanel.add(btnAddUser);
        btnAddUser.setBounds(60, 180, 140, 38);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        mainPanel.add(jPanel2);
        jPanel2.setBounds(270, 40, 640, 50);

        addUser.setBackground(new java.awt.Color(0, 102, 153));
        addUser.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add User");
        addUser.add(jLabel2);
        jLabel2.setBounds(250, 20, 71, 19);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User ID");
        addUser.add(jLabel1);
        jLabel1.setBounds(143, 62, 60, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Type");
        addUser.add(jLabel4);
        jLabel4.setBounds(140, 130, 80, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        addUser.add(jLabel5);
        jLabel5.setBounds(140, 190, 80, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        addUser.add(jLabel6);
        jLabel6.setBounds(140, 260, 80, 16);

        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addUser.add(txtId);
        txtId.setBounds(140, 80, 280, 30);

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an User Type", "Cashier", "Chef" }));
        addUser.add(cmbType);
        cmbType.setBounds(140, 150, 280, 30);

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addUser.add(txtName);
        txtName.setBounds(140, 210, 280, 30);

        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(51, 255, 204));
        btnSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        addUser.add(btnSubmit);
        btnSubmit.setBounds(220, 430, 110, 30);

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addUser.add(txtPassword);
        txtPassword.setBounds(140, 280, 280, 30);

        txtMsg.setForeground(new java.awt.Color(255, 255, 255));
        txtMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMsg.setText("Message");
        addUser.add(txtMsg);
        txtMsg.setBounds(50, 400, 460, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Comfirm Password");
        addUser.add(jLabel7);
        jLabel7.setBounds(140, 330, 130, 16);

        txtCpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addUser.add(txtCpassword);
        txtCpassword.setBounds(140, 350, 280, 30);

        userTabPane.addTab("", addUser);

        Search.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setText("tab2");

        javax.swing.GroupLayout SearchLayout = new javax.swing.GroupLayout(Search);
        Search.setLayout(SearchLayout);
        SearchLayout.setHorizontalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel3)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        SearchLayout.setVerticalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel3)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        userTabPane.addTab("", Search);

        mainPanel.add(userTabPane);
        userTabPane.setBounds(290, 41, 620, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
            userTabPane.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddUserMouseClicked

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
            userTabPane.setSelectedIndex(1);
    }//GEN-LAST:event_btnViewMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        
        txtMsg.setVisible(false);
        
        if(cmbType.getSelectedIndex()==0)
        {
            txtMsg.setVisible(true);
            txtMsg.setText("Error : Please Select an User-Type");
        }else
            if(txtName.getText().isEmpty())
            {
                txtMsg.setVisible(true);
                txtMsg.setText("Error : Please Enter Username");
            }else
                 if(txtPassword.getText().isEmpty())
                 {
                     txtMsg.setVisible(true);
                     txtMsg.setText("Error : Please Enter password");
                 }else
                     if(txtCpassword.getText().isEmpty())
                     {
                         txtMsg.setVisible(true);
                         txtMsg.setText("Error : Please Enter Confirm assword");
                     }else 
                         if(!txtPassword.getText().equals(txtCpassword.getText()))
                         {
                             txtMsg.setVisible(true);
                             txtMsg.setText("Error : Password Not Matched");
                         }else{
                             txtMsg.setVisible(true);
                             txtMsg.setText("Success : User Added Successfully");
                         }
    }//GEN-LAST:event_btnSubmitMouseClicked

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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel Search;
    private javax.swing.JPanel addUser;
    private javax.swing.JLabel btnAddUser;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnSubmit;
    private javax.swing.JLabel btnView;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField txtCpassword;
    private javax.swing.JLabel txtFooter;
    private javax.swing.JTextField txtId;
    private javax.swing.JLabel txtMsg;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JTabbedPane userTabPane;
    // End of variables declaration//GEN-END:variables
}
