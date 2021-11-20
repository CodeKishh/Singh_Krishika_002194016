/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.FoodItems;
import java.util.ArrayList;

/**
 *
 * @author Krish
 */
public class Order {
    
    private String orderid; //can be alphanumeric 
    private String restaurantName;
    private String customerName;
    private String deliveryManName;
    private ArrayList<FoodItems> Order;
    private String cost; //can have 25 dollars so can be alphanumeric
    private String status;
    private String deliveryLocation;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    

    
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public ArrayList<FoodItems> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<FoodItems> Order) {
        this.Order = Order;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    
   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
    
 
    
    @Override
    public String toString() {
        return orderid;
    }
    
    
    
}
