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
public class PHouse {
    
    private int residenceNumber;
    private String addressln1;
    private String addressln2;
    private int pinCode;
    private String communityNm;
    private String cityNm;

    public int getResidenceNumber() {
        return residenceNumber;
    }

    public void setResidenceNumber(int residenceNumber) {
        this.residenceNumber = residenceNumber;
    }

    public String getAddressln1() {
        return addressln1;
    }

    public void setAddressln1(String addressln1) {
        this.addressln1 = addressln1;
    }

    public String getAddressln2() {
        return addressln2;
    }

    public void setAddressln2(String addressln2) {
        this.addressln2 = addressln2;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCommunityNm() {
        return communityNm;
    }

    public void setCommunityNm(String communityNm) {
        this.communityNm = communityNm;
    }

    public String getCityNm() {
        return cityNm;
    }

    public void setCityNm(String cityNm) {
        this.cityNm = cityNm;
    }
    
   
}
