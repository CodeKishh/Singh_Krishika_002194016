/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.FoodItems;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    
    int id =1;
    private String cusName;
    private String cususerName;
    private String cusPhone;
    private String cusEmail;
    private String cusLocation;
    private ArrayList<Order> ordersList;
    
    public void giveOrder (String restaurantName, String customerName, ArrayList<FoodItems> Order, String cost, String deliveryLocation){
    
    Order order = new Order();
    
    order.setOrderid(String.valueOf(id));
    order.setRestaurantName(restaurantName);
    order.setCustomerName(customerName);
    order.setOrder(Order);
    order.setCost(String.valueOf(cost));
    order.setDeliveryLocation(deliveryLocation);
    order.setStatus("New Order");
    ordersList.add(order);
    id++;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCususerName() {
        return cususerName;
    }

    public void setCususerName(String cususerName) {
        this.cususerName = cususerName;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusLocation() {
        return cusLocation;
    }

    public void setCusLocation(String cusLocation) {
        this.cusLocation = cusLocation;
    }

    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(ArrayList<Order> ordersList) {
        this.ordersList = ordersList;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
        
    }
    
    public Customer(String userName){
    this.cususerName=cususerName;
    ordersList = new ArrayList<Order>();
    
    }
    
    
    
    }
    
    
    

