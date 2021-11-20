/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String restaurantName;
    private String restaurantLocation;
    private String phone;
    private ArrayList<FoodItems> foodMenu = new ArrayList<FoodItems>();
    
    private ArrayList<Order> orderList = new ArrayList<Order>();
    int resId =1;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<FoodItems> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(ArrayList<FoodItems> foodMenu) {
        this.foodMenu = foodMenu;
    }

//    public String getResUserId() {
//        return resUserId;
//    }
//
//    public void setResUserId(String resUserId) {
//        this.resUserId = resUserId;
//    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    
    
    
//   public FoodItems searchF(String id) {
//   
//   for(FoodItems food : foodMenu){
//   
//   if()
//   }
   
    
   public void addOrder(String restaurantName, String cusName, String deliveryManName, ArrayList<FoodItems> Order, String cost, String deliveryLocation) {
       
   Order order = new Order();
   
   order.setCustomerName(cusName);
   order.setRestaurantName(restaurantName);
   order.setOrderid(String.valueOf(resId));
   order.setDeliveryManName(deliveryManName);
   order.setDeliveryLocation(deliveryLocation);
   order.setCost(cost);
   order.setOrder(Order);
   order.setStatus("New order Received");
   orderList.add(order);
   resId++;
       
   }
   
   @Override
   public String toString(){
   return restaurantName;
   }
    
    
    
    
}
