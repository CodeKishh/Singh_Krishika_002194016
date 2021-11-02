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
public class PCommunity {
    
    private String communityNm;
    private String cityNm; 
    private ArrayList<PHouse> houselist = new ArrayList<PHouse>();
    
    public ArrayList<PHouse> getHouseInfo() {
        return houselist;
    }
 public void addHouse(PHouse h) {
        this.houselist.add(h);
    }
 
    public String getCommunityNm() {
        return communityNm;
    }

    public void setCommunityNm(String communityNm) {
        this.communityNm = communityNm;
    }
    
    
    
}
