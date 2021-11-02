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
public class Person {
    
    private String personNm;
    private String personID;
    private int Age;
    private int contactNo;
    PHouse house;
    
    
    public Person(String personNm, String personID, int Age, int contactNo, PHouse house){
        
        this.personNm = personNm;
        this.personID = personID;
        this.Age = Age;
        this.contactNo = contactNo ;
        this.house = house;
    
    
    }

    public PHouse getHouse() {
        return house;
    }

    public void setHouse(PHouse house) {
        this.house = house;
    }
    
    
    public Person(PHouse hs){
        this.house = hs;
    }

    public String getPersonNm() {
        return personNm;
    }

    public void setPersonNm(String personNm) {
        this.personNm = personNm;
    }
@Override
    public String toString(){
    return personNm;
            
            }
    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public int getAge() {
        
   
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
    
    

}