/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    
    ArrayList<DeliveryMan> dMD = new ArrayList<DeliveryMan>();

    public ArrayList<DeliveryMan> getdMD() {
        return dMD;
    }

    public void setdMD(ArrayList<DeliveryMan> dMD) {
        this.dMD = dMD;
    }
    
    private DeliveryMan dMen;

    public DeliveryMan getdMen() {
        return dMen;
    }

    public void setdMen(DeliveryMan dMen) {
        this.dMen = dMen;
    }
    
    
    
}
