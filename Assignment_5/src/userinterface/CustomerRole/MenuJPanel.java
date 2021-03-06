/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.FoodItems;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krish
 */
public class MenuJPanel extends javax.swing.JPanel {
    private UserAccount user;
    private JPanel userProcessContainer;
    int sum=0;
    EcoSystem ecosystem;
    Restaurant restaurant;
    
    
    ArrayList<FoodItems> items=new ArrayList<FoodItems>();
    /**
     * Creates new form MenuJPanel
     */
    public MenuJPanel(JPanel userProcessContainer, UserAccount user,EcoSystem ecosystem,Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
       this.ecosystem=ecosystem;
        this.user = user;
        this.restaurant=restaurant;
        populateTable();
        lblTotal.setText(Integer.toString(sum));
        jRadioButton1.setSelected(true);
        
    }

    
    public void populateTable(){
            DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        
            model.setRowCount(0);
                Object[] row = new Object[3];
                
                for(FoodItems food:restaurant.getFoodMenu()){
                     row[0] = food.getFoodName();
                     row[1] = food.getFoodDesc();
                     row[2] = food.getFoodPrice();
                     if(row[1]!=null){
                     model.addRow(row);}
                }  
    }
    
    
    public void populateCart(FoodItems foodItem){
        DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
        
         items.add(foodItem);
         Object[] row = new Object[3];
                for(FoodItems food:items){
                     row[0] = food;
                     row[1] = food.getFoodDesc();
                     row[2] = food.getFoodPrice();
                     
                     model.addRow(row);
                }
                sum = 0;
     for(int i=0;i<cartTable.getRowCount();i++){
        //System.out.println(cartTable.getValueAt(i, 2)+" "+cartTable.getRowCount());
      
        sum=sum+Integer.parseInt((String) cartTable.getValueAt(i, 2));
        
        }
//                                jLabel1.setText(Integer.toString(sum));

sum = 0;
for(int i=0;i<cartTable.getRowCount();i++){
    sum=sum+Integer.parseInt((String) cartTable.getValueAt(i, 2));
}
lblTotal.setText(Integer.toString(sum));
     }
    
    
     
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        cardBtn = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        RemoveBtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        orderBtn1 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        lblCart = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuTable);

        cardBtn.setBackground(new java.awt.Color(153, 255, 153));
        cardBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cardBtn.setText("Add Dish");
        cardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardBtnActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel1.setText("Your Cart");

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        RemoveBtn.setBackground(new java.awt.Color(255, 204, 204));
        RemoveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RemoveBtn.setText("Remove Dish");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        orderBtn1.setBackground(new java.awt.Color(102, 255, 102));
        orderBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderBtn1.setText("Order");
        orderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtn1ActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterpriseLabel.setText("Enter Address:");

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jRadioButton1.setForeground(new java.awt.Color(255, 153, 153));
        jRadioButton1.setText("Cash On Delivery");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        lblCart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCart.setText("Cart Total");

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(cardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton1)
                                        .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(65, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(backJButton)
                        .addGap(35, 35, 35)
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(orderBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardBtn)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(RemoveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderBtn1))
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardBtnActionPerformed

        int selectedRow = menuTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            String d = (String)menuTable.getValueAt(selectedRow, 0);
            FoodItems foodItem = restaurant.searchDish(d);
            populateCart(foodItem);

        }

    }//GEN-LAST:event_cardBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = cartTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            FoodItems item=(FoodItems)cartTable.getValueAt(selectedRow, 0);
            items.remove(item);
            DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for(FoodItems food:items){
                row[0] = food;
                row[1] = food.getFoodDesc();
                row[2] = food.getFoodPrice();

                model.addRow(row);
            }
            sum = 0;
            for(int i=0;i<cartTable.getRowCount();i++){
                //System.out.println(cartTable.getValueAt(i, 2)+" "+cartTable.getRowCount());

                sum=sum+Integer.parseInt((String) cartTable.getValueAt(i, 2));
                // jLabel1.setText(Integer.toString(sum));
            }
//            jLabel1.setText(Integer.toString(sum));
        }

    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void orderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtn1ActionPerformed
        // TODO add your handling code here:
        String address=addressTxt.getText();

        restaurant.addOrder(restaurant.getRestaurantName(), user.getUsername(), null, items, String.valueOf(sum) , address);
        for(Customer cust:ecosystem.getCustomerDirectory().getCuslist()){
            if(user.getUsername().equals(cust.getCususerName())){
          cust.giveOrder(restaurant.getRestaurantName(), user.getUsername(), null,items, String.valueOf(sum), address);
            }
        }
    }//GEN-LAST:event_orderBtn1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel cusJPanel = (CustomerAreaJPanel) component;
        cusJPanel.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cardBtn;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton orderBtn1;
    // End of variables declaration//GEN-END:variables
}
