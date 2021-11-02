/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Krish
 */
public class PatientInfoHistory {
    
    private ArrayList<PatientInfo> PatientInfoHistory = new ArrayList<PatientInfo>();

    public ArrayList<PatientInfo> getPatientInfoHistory() {
        return PatientInfoHistory;
    }
public void addPatient(PatientInfo pt){
    this.PatientInfoHistory.add(pt);
}
    
    }
    

