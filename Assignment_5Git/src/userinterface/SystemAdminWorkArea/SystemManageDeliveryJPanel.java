/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

/**
 *
 * @author Krish
 */


import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.time.Clock.system;
import static java.time.InstantSource.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class SystemManageDeliveryJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount user;

    /**
     * Creates new form deliveryManage
     */
    public SystemManageDeliveryJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateDeliveryTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDeliveryMan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDel = new javax.swing.JTable();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        txtUN = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDeliveryMan.setText("ALL Delivery Men Information");
        add(lblDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 160, 30));

        tblDel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "UserName", "Password", "Name"
            }
        ));
        jScrollPane1.setViewportView(tblDel);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 570, 110));

        lblUserName.setText("USER NAME");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 40));

        lblPassword.setText("PASSWORD");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 70, 20));

        lblName1.setText("NAME");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 40, 20));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 100, 30));

        btnAdd.setText("ADD NEW CUSTOMER");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        txtUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUNActionPerformed(evt);
            }
        });
        add(txtUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 120, -1));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 110, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 120, -1));

        btnBack.setText("GO BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String uNM= txtUN.getText();
        String pwd= txtPass.getText();
        String name = txtName.getText();
        

        if(name.equalsIgnoreCase("")||uNM.equalsIgnoreCase("")||pwd.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Pls, Fill data Correctly!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        else{
            ecosystem.getUserAccountDirectory().updateUserAccount(user, name, uNM, pwd);
            populateDeliveryTable();
            JOptionPane.showMessageDialog(null, "Update Successful!");
        }

        txtUN.setText("");
        txtPass.setText("");
        txtName.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        String uNM = txtUN.getText();
        String pss = txtPass.getText();
        String nm = txtName.getText();
        //        String phone = txtPhone.getName();

        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(nm,uNM, pss, null, new DeliverManRole());
        DeliveryMan delMen = ecosystem.getDeliveryManDirectory().adddeliveryMan(uNM);
        populateDeliveryTable();
        txtUN.setText("");
        txtPass.setText("");
        txtName.setText("");
        //        txtPhone.setText("");

    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = tblDel.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Sure to Delete User: "+tblDel.getValueAt(selectedRow, 0)+" ??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblDel.getValueAt(selectedRow, 0);
                String pwd= (String) tblDel.getValueAt(selectedRow, 1);
                UserAccount user= ecosystem.getUserAccountDirectory().authenticateUser(username, pwd);

                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                ecosystem.getUserAccountDirectory().deleteUser(user);
                ecosystem.getCustomerDirectory().deleteCustomer(user.getUsername());
                populateDeliveryTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select a Customer to delete!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectRow = tblDel.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblDel.getValueAt(selectRow, 0);
            String pwd= (String) tblDel.getValueAt(selectRow, 1);
            String nm= (String) tblDel.getValueAt(selectRow, 2);

            user = ecosystem.getUserAccountDirectory().authenticateUser(username, pwd);

            txtUN.setText(user.getUsername()+"");
            txtPass.setText(user.getPassword()+"");
            txtName.setText(user.getName()+"");
            // system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    
    
    
    private void populateDeliveryTable() {
        DefaultTableModel model = (DefaultTableModel) tblDel.getModel();
        model.setRowCount(0);
        
        for (UserAccount user : ecosystem.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.DeliverManRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];
               
                row[0] = user.getUsername();
                row[1] = user.getPassword();
                row[2] = user.getName();
                
                
                model.addRow(row);
            }
            
        }
        
    }
    
    private void txtUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUNActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        //        Component[] componentArray = userProcessContainer.getComponents();
        //        Component component = componentArray[componentArray.length -1];
        //        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeliveryMan;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblDel;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}