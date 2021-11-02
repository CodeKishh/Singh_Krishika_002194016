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
public class PEncounterHistory {
    
    private ArrayList<PEncounter> encList;
    
    public PEncounterHistory(){
        encList = new ArrayList<>();
    }
    public ArrayList<PEncounter> getEncounterList(){
        return encList;
    }
    
    public void addPEncounter(PEncounter e){
        this.encList.add(e);
    }
}
