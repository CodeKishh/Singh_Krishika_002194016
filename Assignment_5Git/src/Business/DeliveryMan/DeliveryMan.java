/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.FoodItems;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
   String id;
   String deliveryUserName;
   String cusName;
   String deliveryLocation;
   String status;
   ArrayList<Order> orderList = new ArrayList<Order>();
   
  public void addOrder(String restaurantName, String customerName, ArrayList<FoodItems> Order, String cost, String deliveryLocation){
     Order order = new Order();
     order.setCustomerName(customerName);
     order.setRestaurantName(restaurantName);
     order.setOrder(Order);
     order.setCost(cost);
     order.setDeliveryLocation(deliveryLocation);
     order.setStatus("New Order received");
     orderList.add(order);
      
  }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeliveryUserName() {
        return deliveryUserName;
    }

    public void setDeliveryUserName(String deliveryUserName) {
        this.deliveryUserName = deliveryUserName;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
        
        
    }
    
    public DeliveryMan(String delName){
    this.deliveryUserName= delName;
    orderList = new ArrayList<Order>();
    
    }
    
    @Override
    public String toString(){
     return deliveryUserName;   
    }
    
    }
    
    

