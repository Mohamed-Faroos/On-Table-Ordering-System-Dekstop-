/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.DBTablet;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import main.Tablet;

/**
 *
 * @author Faroos
 */
public class ManageTablet extends javax.swing.JFrame {

    /**
     * Creates new form ManageTablet
     */
    public ManageTablet() {
        initComponents();
        
        txttmsg.setVisible(false);
        txttmsg1.setVisible(false);
        getLastID();
        getAllTablets();
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
        btnUpdateTablet = new javax.swing.JLabel();
        btnAddTablet = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tabletTab = new javax.swing.JTabbedPane();
        addTablet = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JLabel();
        txttmsg = new javax.swing.JLabel();
        txtcpassword = new javax.swing.JPasswordField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        updateTablet = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablet = new javax.swing.JTable();
        btnViewUser = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTid1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtpassword1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcpassword1 = new javax.swing.JPasswordField();
        cmbStatus1 = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JLabel();
        txttmsg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(null);

        Heading.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("Manage Tablets");
        mainPanel.add(Heading);
        Heading.setBounds(30, 90, 200, 29);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(260, 20, 12, 560);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(255, 255, 51));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
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
        txtFooter.setBounds(30, 540, 209, 21);

        txtTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("On-Table Ordering System");
        mainPanel.add(txtTitle);
        txtTitle.setBounds(470, 10, 251, 30);

        btnUpdateTablet.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateTablet.setForeground(new java.awt.Color(255, 255, 51));
        btnUpdateTablet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdateTablet.setText("View & Update");
        btnUpdateTablet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        btnUpdateTablet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateTablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateTabletMouseClicked(evt);
            }
        });
        mainPanel.add(btnUpdateTablet);
        btnUpdateTablet.setBounds(60, 250, 140, 38);

        btnAddTablet.setBackground(new java.awt.Color(255, 255, 255));
        btnAddTablet.setForeground(new java.awt.Color(255, 255, 51));
        btnAddTablet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddTablet.setText("Add Tablet");
        btnAddTablet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        btnAddTablet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddTablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddTabletMouseClicked(evt);
            }
        });
        mainPanel.add(btnAddTablet);
        btnAddTablet.setBounds(60, 180, 140, 38);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        mainPanel.add(jPanel2);
        jPanel2.setBounds(270, 40, 670, 50);

        addTablet.setBackground(new java.awt.Color(51, 51, 51));
        addTablet.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tablet ID");
        addTablet.add(jLabel1);
        jLabel1.setBounds(160, 60, 57, 16);

        txtTid.setEditable(false);
        addTablet.add(txtTid);
        txtTid.setBounds(160, 80, 280, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        addTablet.add(jLabel2);
        jLabel2.setBounds(160, 130, 70, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Status");
        addTablet.add(jLabel3);
        jLabel3.setBounds(160, 270, 39, 16);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        addTablet.add(cmbStatus);
        cmbStatus.setBounds(160, 290, 280, 27);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");
        addTablet.add(jLabel4);
        jLabel4.setBounds(160, 200, 120, 16);

        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 204, 0));
        btnSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        addTablet.add(btnSubmit);
        btnSubmit.setBounds(260, 380, 90, 40);

        txttmsg.setForeground(new java.awt.Color(255, 255, 255));
        txttmsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txttmsg.setText("msg");
        addTablet.add(txttmsg);
        txttmsg.setBounds(150, 340, 320, 16);
        addTablet.add(txtcpassword);
        txtcpassword.setBounds(160, 220, 280, 30);
        addTablet.add(txtpassword);
        txtpassword.setBounds(160, 150, 280, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add Tablet");
        addTablet.add(jLabel6);
        jLabel6.setBounds(260, 10, 90, 30);

        tabletTab.addTab("tab1", addTablet);

        updateTablet.setBackground(new java.awt.Color(51, 51, 51));
        updateTablet.setLayout(null);

        tblTablet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tablet ID", "Availability"
            }
        ));
        jScrollPane1.setViewportView(tblTablet);

        updateTablet.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 420, 240);

        btnViewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnViewUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViewUser.setText("View ");
        btnViewUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnViewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewUserMouseClicked(evt);
            }
        });
        updateTablet.add(btnViewUser);
        btnViewUser.setBounds(470, 110, 90, 30);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tablet ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 20, 57, 16);

        txtTid1.setEditable(false);
        jPanel1.add(txtTid1);
        txtTid1.setBounds(30, 40, 240, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 90, 70, 16);
        jPanel1.add(txtpassword1);
        txtpassword1.setBounds(30, 110, 240, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(300, 90, 39, 16);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirm Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 20, 120, 16);
        jPanel1.add(txtcpassword1);
        txtcpassword1.setBounds(300, 40, 240, 30);

        cmbStatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        jPanel1.add(cmbStatus1);
        cmbStatus1.setBounds(300, 110, 240, 27);

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 204, 0));
        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0)));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(240, 180, 90, 30);

        txttmsg1.setForeground(new java.awt.Color(255, 255, 255));
        txttmsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txttmsg1.setText("msg");
        jPanel1.add(txttmsg1);
        txttmsg1.setBounds(130, 150, 320, 20);

        updateTablet.add(jPanel1);
        jPanel1.setBounds(20, 280, 570, 220);

        tabletTab.addTab("tab2", updateTablet);

        mainPanel.add(tabletTab);
        tabletTab.setBounds(290, 41, 630, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnUpdateTabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateTabletMouseClicked
        tabletTab.setSelectedIndex(1);
        getAllTablets();
    }//GEN-LAST:event_btnUpdateTabletMouseClicked

    private void btnAddTabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTabletMouseClicked
        tabletTab.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddTabletMouseClicked

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        if(txtpassword.getText().isEmpty())
        {
            txttmsg.setVisible(true);
            txttmsg.setText("Error : Please Enter Password");
        }else if(txtpassword.getText().length()<8)
        {
            txttmsg.setVisible(true);
            txttmsg.setText("Error : Password Must be more than 8 characters");
            
        }else if(txtcpassword.getText().isEmpty())
        {
            txttmsg.setVisible(true);
            txttmsg.setText("Error : Please Enter Confirm Password");
            
        }else if(!txtpassword.getText().equals(txtcpassword.getText()))
        {
            txttmsg.setVisible(true);
            txttmsg.setText("Error : Please Enter Password");
            
        }else{
            String ID=txtTid.getText();
            String password=txtpassword.getText();
            int status=cmbStatus.getSelectedIndex();
            
            Tablet tb=new Tablet(ID, password, status,0);
            
            DBTablet dbt=new DBTablet();
            boolean rs=dbt.addTablet(tb);
            
            if(rs){
                
            txttmsg.setVisible(true);
            txttmsg.setText("Error : Tablet Details Added Successfully");
            
            getLastID();
            txtpassword.setText("");
            txtcpassword.setText("");
            cmbStatus.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnViewUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewUserMouseClicked
        int row = tblTablet.getSelectedRow();

        String ID=tblTablet.getValueAt(row, 0).toString();

        DBTablet dbu=new DBTablet();
        Tablet us=dbu.getTablet(ID);

        txtTid1.setText(ID);
        txtpassword1.setText(us.getPassword());
        txtcpassword1.setText(us.getPassword());
        cmbStatus1.setSelectedIndex(us.getStatus());
    }//GEN-LAST:event_btnViewUserMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        if(txtpassword1.getText().isEmpty())
        {
            txttmsg1.setVisible(true);
            txttmsg1.setText("Error : Please Enter Password");
        }else if(txtpassword1.getText().length()<8)
        {
            txttmsg1.setVisible(true);
            txttmsg1.setText("Error : Password Must be more than 8 characters");
            
        }else if(txtcpassword1.getText().isEmpty())
        {
            txttmsg1.setVisible(true);
            txttmsg1.setText("Error : Please Enter Confirm Password");
            
        }else if(!txtpassword1.getText().equals(txtcpassword1.getText()))
        {
            txttmsg1.setVisible(true);
            txttmsg1.setText("Error : Please Enter Password");
            
        }else{
            String ID=txtTid1.getText();
            String password=txtpassword1.getText();
            int status=cmbStatus1.getSelectedIndex();
            
            Tablet tb=new Tablet(ID, password, status,0);
            
            DBTablet dbt=new DBTablet();
            boolean rs=dbt.updateTablet(tb);
            
            if(rs){
                
            txttmsg1.setVisible(true);
            txttmsg1.setText("Error : Tablet Details Updated Successfully");
            
            getAllTablets();
            txtpassword1.setText("");
            txtcpassword1.setText("");
            cmbStatus1.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    public void getAllTablets()
    {
        DBTablet dbu=new DBTablet();
       
        List<Tablet> al= dbu.getAllTablets();
        
        DefaultTableModel model=(DefaultTableModel)tblTablet.getModel();
            model.setRowCount(0);
            Object[] row=new Object[2];
            
            for(int i=0;i<al.size();i++)
                {
                    row[0]=al.get(i).getTid();

                    if(al.get(i).getStatus()==0){

                        row[1]="Active";
                    }else{
                        
                        row[1]="Inactive";
                    }
                    
                    
                    model.addRow(row);
                }
          
    }
    
    public void getLastID()
    {
        DBTablet dbt=new DBTablet();
        String ID=dbt.lastID();
        
        txtTid.setText(ID);
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
            java.util.logging.Logger.getLogger(ManageTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageTablet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel addTablet;
    private javax.swing.JLabel btnAddTablet;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnSubmit;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel btnUpdateTablet;
    private javax.swing.JLabel btnViewUser;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbStatus1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTabbedPane tabletTab;
    private javax.swing.JTable tblTablet;
    private javax.swing.JLabel txtFooter;
    private javax.swing.JTextField txtTid;
    private javax.swing.JTextField txtTid1;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JPasswordField txtcpassword;
    private javax.swing.JPasswordField txtcpassword1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtpassword1;
    private javax.swing.JLabel txttmsg;
    private javax.swing.JLabel txttmsg1;
    private javax.swing.JPanel updateTablet;
    // End of variables declaration//GEN-END:variables
}
