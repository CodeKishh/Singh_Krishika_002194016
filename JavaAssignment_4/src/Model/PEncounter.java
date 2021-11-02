/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;
import Model.Person;

/**
 *
 * @author Krish
 */
public class PEncounter {
    
    private PVitalSigns vits;
    private LocalDateTime dateStamp;
    private int patientID;
    private boolean patientIsNormal;
    public Person pID;

    public Person getpID() {
        return pID;
    }

    public void setpID(Person pID) {
        this.pID = pID;
    }

    
   

    public boolean isPatientIsNormal() {
        return patientIsNormal;
    }

    public void setPatientIsNormal(boolean patientIsNormal) {
        this.patientIsNormal = patientIsNormal;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

   
    
    
    public PEncounter(PVitalSigns vs){
    this.vits = vs;
    }

    public PVitalSigns getVits() {
        return vits;
    }

    public void setVits(PVitalSigns vits) {
        this.vits = vits;
    }

    public LocalDateTime getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(LocalDateTime dateStamp) {
        this.dateStamp = dateStamp;
    }

}
