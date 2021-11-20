/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */


public class CustomerDirectory {
    
    private Customer customer;
    
    public Customer addCustomer(String cusName){
   
   customer = new Customer(cusName);
   customerList.add(customer);
   return customer;
   } 
    
    public void deleteCustomer(String cususerName){
     customerList.remove(cususerName);
        
    }
    
    
   ArrayList<Customer> customerList = new ArrayList<Customer>();

    public ArrayList<Customer> getCuslist() {
        return customerList;
    }

    public void setCuslist(ArrayList<Customer> cuslist) {
        this.customerList = cuslist;
    }
    
   
    
}
