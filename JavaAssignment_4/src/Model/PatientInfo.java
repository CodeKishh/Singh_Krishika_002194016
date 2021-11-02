/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Krish
 */
public class PatientInfo extends Person {
    
    private PVitalSigns vs;
    private int patientId;

    public int getPatientId() {
        return patientId;
    }
boolean patientIsNormal;

    public boolean isPatientIsNormal() {
        return patientIsNormal;
    }

    public void setPatientIsNormal(boolean patientIsNormal) {
        this.patientIsNormal = patientIsNormal;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public PVitalSigns getVs() {
        return vs;
    }

    public void setVs(PVitalSigns vs) {
        this.vs = vs;
    }
    
 
        public PatientInfo (String personNm, String personID, int Age, int contactNo, PHouse house, PVitalSigns vs){
        
        super(personNm, personID, Age, contactNo, house);
        this.vs = vs;
        }
        
        public boolean patientIsNormal(int Age){
            boolean patientIsNormal = true;
            if(Age<55){
                if(vs.getBp()<80 || vs.getBp()>120){
                    return false;
                }
            }
            
            else{
                if(vs.getBp()<75 || vs.getBp()>130){
                return false;
            }
            }
            return true;
        
        
        }
       }

