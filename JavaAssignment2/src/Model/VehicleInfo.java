/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krish
 */
public class VehicleInfo {

    private boolean availability;
    private String date;
    private String company;
    private String manufacturingYear;
    private String minSeat;
    private String maxSeat;
    private String serialNumber;
    private String modelNumber;
    private boolean uberCar;
    private String lastUpdatedDate;
    private String city;
    private String expirydate;

//Availability
//Date
//Company
//Manufacturing year
// seatCapacity
// Serial number
//model number
//UberCars
//LastUpdated/date
//City
//Expiry date
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getDate() {
//        try {
//            String sDate1="31/12/1998";
//            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//            return date1;
//        } catch (ParseException ex) {
//            Logger.getLogger(VehicleInfo.class.getName()).log(Level.SEVERE, null, ex);
//                    System.out.println("Put valid date format - dd/MM/yyyy");
//        }
//
//
        return date;
    }

    public String getDates() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getMinSeat() {
        return minSeat;
    }

    public void setMinSeat(String minSeat) {
        this.minSeat = minSeat;
    }

    public String getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(String maxSeat) {
        this.maxSeat = maxSeat;
    }

    

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public boolean isUberCar() {
        return uberCar;
    }

    public void setUberCar(boolean uberCar) {
        this.uberCar = uberCar;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    @Override
    public String toString() {
        return date;
    }
}
