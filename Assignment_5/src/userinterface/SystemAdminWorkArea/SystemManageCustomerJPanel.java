/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krish
 */
public class SystemManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerManage
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    public SystemManageCustomerJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
//        System.out.println("userProcessContainer");
//        System.out.println(userProcessContainer);
//        System.out.println(system);
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateNetworkTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCus = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "UserName", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblCus);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 90));

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(viewTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 690, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) tblCus.getModel();
        model.setRowCount(0);
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.CustomerRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[2];
               
                row[0] = user.getUsername();
                row[1] = user.getPassword();
                
                
                model.addRow(row);
            }
            
        }
        
    }

//    private void viewTable(){
//    
//    
//    DefaultTableModel model = (DefaultTableModel) viewTable.getModel();
//    int selectedRowIndex = viewTable.getSelectedRow();
//        model.setRowCount(0);
//        
//        if (selectedRowIndex < 0) {
//            JOptionPane.showMessageDialog(this, "Please select a row to view");
//            return;
//        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
//           
//            if ("Business.Role.CustomerRole".equals(user.getRole().getClass().getName())) {
//                Object[] row = new Object[2];
//               
//                row[0] = user.getUsername();
//                row[1] = user.getPassword();
//                
//                
//                model.addRow(row);
//            }
//            
//        }
    
    
    
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCus;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables
}
