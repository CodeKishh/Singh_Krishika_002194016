/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.VehicleInfoHistory;
import Model.VehicleInfo;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krish
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    VehicleInfoHistory history;
    VehicleInfoHistory tmpList;

    public SearchJPanel(VehicleInfoHistory history) {
        initComponents();

        this.history = history;
        this.tmpList = tmpList;

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
        tblMain = new javax.swing.JTable();
        txtCompany = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtMin = new javax.swing.JTextField();
        txtSN = new javax.swing.JTextField();
        lblCompany = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblSN = new javax.swing.JLabel();
        btnAvail = new javax.swing.JButton();
        btlCarnoAvail = new javax.swing.JButton();
        btlUnAvail1 = new javax.swing.JButton();
        lblAvailCars = new javax.swing.JTextField();
        lblunAvailCars = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        lblMN = new javax.swing.JLabel();
        txtMN = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtLUD = new javax.swing.JTextField();
        btnLUD = new javax.swing.JButton();
        btnUber = new javax.swing.JButton();
        btnED = new javax.swing.JButton();

        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Company", "MFR Year", "Model No.", "City", "Availability", "Uber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMainMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMain);

        txtCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompanyActionPerformed(evt);
            }
        });

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        txtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinActionPerformed(evt);
            }
        });

        txtSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSNActionPerformed(evt);
            }
        });

        lblCompany.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCompany.setText("Company");

        lblYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblYear.setText("Manufacturing Year");

        lblMin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMin.setText("Minimum Seat Capacity");

        lblSN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSN.setText("Serial Number");

        btnAvail.setText("Check Recent Availability");
        btnAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailActionPerformed(evt);
            }
        });

        btlCarnoAvail.setText("No. of Cars Available");
        btlCarnoAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlCarnoAvailActionPerformed(evt);
            }
        });

        btlUnAvail1.setText("No. of Cars Not Available");
        btlUnAvail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlUnAvail1ActionPerformed(evt);
            }
        });

        lblAvailCars.setEditable(false);

        lblunAvailCars.setEditable(false);

        lblMax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMax.setText("Maximum Seat Capacity");

        txtMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxActionPerformed(evt);
            }
        });

        lblMN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMN.setText("Model Number");

        txtMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMNActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCity.setText("City");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtLUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLUDActionPerformed(evt);
            }
        });

        btnLUD.setText("Last Updated");
        btnLUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLUDActionPerformed(evt);
            }
        });

        btnUber.setText("Uber Affiliated");
        btnUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUberActionPerformed(evt);
            }
        });

        btnED.setText("Expired Certificate");
        btnED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMin)
                                    .addComponent(lblSN)
                                    .addComponent(lblYear)
                                    .addComponent(lblCompany)
                                    .addComponent(lblMax)
                                    .addComponent(lblMN)
                                    .addComponent(lblCity))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSN, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMN, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btlCarnoAvail)
                                            .addComponent(btlUnAvail1))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAvailCars, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblunAvailCars, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnAvail))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnED)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLUD)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLUD, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnUber))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlCarnoAvail)
                    .addComponent(lblAvailCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLUD)
                    .addComponent(txtLUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlUnAvail1)
                    .addComponent(lblunAvailCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvail)
                    .addComponent(btnED))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMax, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMainMouseClicked
        //DefaultTableModel model = (DefaultTableModel) tblMain.getModel();
        //String date1 = (String) model.getValueAt(tblMain.getSelectedRow(),0);
        //txtDate.setText(date1);

        // TODO add your handling code here:
    }//GEN-LAST:event_tblMainMouseClicked

    private void btnAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailActionPerformed
        List<VehicleInfo> vehicleList = new ArrayList<VehicleInfo>();
        int indx = 0;

        Date flag = new Date();
        for (int i = 0; i < history.size(); i++) {
            Date userDate = new Date(history.get(i).getDate()); // attribute will change
            if (flag.after(userDate)) { // condition will change as per attribute
                indx = i;
                VehicleInfo vinfo = history.get(indx);
                vehicleList.add(vinfo);
            }
        }

        populateTable(vehicleList);

// TODO add your handling code here:
    }//GEN-LAST:event_btnAvailActionPerformed

    private void btlCarnoAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlCarnoAvailActionPerformed
        lblAvailCars.setText(String.valueOf(history.CntAvailCar()));
        //   populateTable(tmpList);


    }//GEN-LAST:event_btlCarnoAvailActionPerformed

    private void btlUnAvail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlUnAvail1ActionPerformed
        lblunAvailCars.setText(String.valueOf(history.CntUnavailabe()));
// TODO add your handling code here:
    }//GEN-LAST:event_btlUnAvail1ActionPerformed

    private void txtCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompanyActionPerformed

        List<VehicleInfo> outputList = new ArrayList<VehicleInfo>();
        int indx = 0;
        for (int i = 0; i < history.size(); i++) {
            String company = history.get(i).getCompany(); // attribute will change
            if (company.equalsIgnoreCase(txtCompany.getText())) { // condition will change as per attribute
                indx = i;
                VehicleInfo vinfo = history.get(indx);
                outputList.add(vinfo);
            }
        }
        populateTable(outputList);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanyActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed

        List<VehicleInfo> yearOutput = new ArrayList<VehicleInfo>();

        for (int i = 0; i < history.size(); i++) {

            String year = history.get(i).getManufacturingYear();
            if (year.equalsIgnoreCase(txtYear.getText())) {

                VehicleInfo vinfo = history.get(i);
                yearOutput.add(vinfo);
            }
            populateTable(yearOutput);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinActionPerformed

        List<VehicleInfo> output = new ArrayList<VehicleInfo>();

        for (int i = 0; i < history.size(); i++) {
            String min = history.get(i).getMinSeat();

            if ((Integer.parseInt(min) >= Integer.parseInt(txtMin.getText()))) {
                VehicleInfo vinfo = history.get(i);
                output.add(vinfo);
            }
            populateTable(output);
        }

    }//GEN-LAST:event_txtMinActionPerformed

    private void txtSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSNActionPerformed

        List<VehicleInfo> sn = new ArrayList<VehicleInfo>();

        for (int i = 0; i < history.size(); i++) {
            String sno = history.get(i).getSerialNumber();

            if (sno.equalsIgnoreCase(txtSN.getText())) {

                VehicleInfo vinfo = history.get(i);
                sn.add(vinfo);

// TODO add your handling code here:
    }//GEN-LAST:event_txtSNActionPerformed
            populateTable(sn);

        }
    }


    private void txtMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxActionPerformed
        List<VehicleInfo> output = new ArrayList<VehicleInfo>();
        for (int i = 0; i < history.size(); i++) {
            String max = history.get(i).getMaxSeat();

            if (Integer.parseInt(max) <= Integer.parseInt(txtMax.getText())) {
                VehicleInfo vinfo = history.get(i);
                output.add(vinfo);

            }
            populateTable(output);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txtMaxActionPerformed

    private void txtMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMNActionPerformed
        List<VehicleInfo> mn = new ArrayList<VehicleInfo>();
        for (int i = 0; i < history.size(); i++) {
            String mno = history.get(i).getModelNumber();

            if ((mno.equalsIgnoreCase(txtMN.getText()))) {

                VehicleInfo vinfo = history.get(i);
                mn.add(vinfo);// TODO add your handling code here:
    }//GEN-LAST:event_txtMNActionPerformed
            populateTable(mn);
        }
    }

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        List<VehicleInfo> city = new ArrayList<VehicleInfo>();
        for (int i = 0; i < history.size(); i++) {
            String city1 = history.get(i).getModelNumber();

            if ((city1.equalsIgnoreCase(txtMN.getText()))) {

                VehicleInfo vinfo = history.get(i);
                city.add(vinfo);// TODO add your handling code here:
            }
            populateTable(city);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtLUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLUDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLUDActionPerformed

    private void btnLUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLUDActionPerformed
        // TODO add your handling code here:
        txtLUD.setText(String.valueOf(history.getUpDT()));
    }//GEN-LAST:event_btnLUDActionPerformed

    private void btnUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUberActionPerformed
        // TODO add your handling code here:
        List<String> manufacturersList = new ArrayList<String>();
        for (int i = 0; i < history.size(); i++) {
            VehicleInfo vinfo = history.get(i);
            if (vinfo.isUberCar()) {
                if (!manufacturersList.contains(vinfo.getCompany())) {
                    manufacturersList.add(vinfo.getCompany());
                }
            }
        }
        populateCompanyTable(manufacturersList);
    }//GEN-LAST:event_btnUberActionPerformed

    private void btnEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEDActionPerformed
      List<VehicleInfo> vehicleList = new ArrayList<VehicleInfo>();
        int indx = 0;

        Date flag = new Date();
        for (int i = 0; i < history.size(); i++) {
            Date userDate = new Date(history.get(i).getExpirydate()); // attribute will change
            if (userDate.before(flag)) { // condition will change as per attribute
                indx = i;
                VehicleInfo vinfo = history.get(indx);
                vehicleList.add(vinfo);
            }
        }

        populateTable(vehicleList);  // TODO add your handling code here:
    }//GEN-LAST:event_btnEDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlCarnoAvail;
    private javax.swing.JButton btlUnAvail1;
    private javax.swing.JButton btnAvail;
    private javax.swing.JButton btnED;
    private javax.swing.JButton btnLUD;
    private javax.swing.JButton btnUber;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblAvailCars;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblMN;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSN;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField lblunAvailCars;
    private javax.swing.JTable tblMain;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtLUD;
    private javax.swing.JTextField txtMN;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtSN;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void populateTable(List<VehicleInfo> vl) {

        DefaultTableModel model = (DefaultTableModel) tblMain.getModel();
        model.setRowCount(0);

        for (VehicleInfo vi : vl) {

            Object[] row = new Object[7];

            row[0] = vi;
            row[1] = vi.getCompany();
            row[2] = vi.getManufacturingYear();

            row[3] = vi.getModelNumber();
            row[4] = vi.getCity();
            // row[6] = vi.isAvailability();
            if (vi.isAvailability() == true) {
                row[5] = "Available";
            } else {
                row[5] = "Not Available";
            }

            if (vi.isUberCar() == true) {
                row[6] = "Yes";

            } else {
                row[6] = "No";

            }
            model.addRow(row);

        }
    }

    private void populateCompanyTable(List<String> vl) {

        DefaultTableModel model = (DefaultTableModel) tblMain.getModel();
        model.setRowCount(0);

        for (String vi : vl) {

            Object[] row = new Object[7];

            //row[0] = vi;
            row[1] = vi;
            model.addRow(row);

        }
    }

}
