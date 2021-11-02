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
public class PCity {
    
    private String City;
    private ArrayList<PCommunity> communityInfo ;

    public ArrayList<PCommunity> getCommunityInfo() {
        return communityInfo;
    }
    
    public void addPCommunity(PCommunity p){
        this.communityInfo.add(p);
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
    
}
