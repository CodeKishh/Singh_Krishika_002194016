/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;
import Business.Restaurant.Restaurant;
import static java.awt.SystemColor.menu;
import static java.time.Clock.system;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
//    ArrayList <Order> orderL =new ArrayList <Order>();
    ArrayList <FoodItems> foodL = new ArrayList <FoodItems>();
    private Restaurant restaurantName;
    private FoodItems foodMenu;
ArrayList<Restaurant> restaurantL = new ArrayList<Restaurant> ();


 public Restaurant addRestaurantProfile (String resName){
//        Restaurant res = new Restaurant(resName);
restaurantName = new Restaurant(resName);
restaurantL.add(restaurantName);

return restaurantName;
    
    }
    public ArrayList<FoodItems> getFoodL() {
        return foodL;
    }

    public void setFoodL(ArrayList<FoodItems> foodL) {
        this.foodL = foodL;
    }

    public Restaurant getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(Restaurant restaurantName) {
        this.restaurantName = restaurantName;
    }

    public FoodItems getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodItems foodMenu) {
        this.foodMenu = foodMenu;
    }

    public ArrayList<Restaurant> getRestaurant() {
        return restaurantL;
    }

    public void setRestaurant(ArrayList<Restaurant> restaurant) {
        this.restaurantL = restaurant;
    }
    
public Restaurant searchProduct(String id) {
        for (Restaurant product : restaurantL) {
            //System.out.print(product.getName());
            if (product.getRestaurantName().equals(id)) {
                return product;
            }
        }
        return null;
    }
    
    
   public void removeRestaurant(String resName){
   
   for(int j=0; j<restaurantL.size(); j++){
   if(restaurantL.get(j).getRestaurantName().equals(resName)){
   restaurantL.remove(j);
   }
   
   }
   
   }
    
    public void updateRestaurant(String name, String phone, String location, Restaurant restname){
    restname.setRestaurantName(name);
    restname.setPhone(phone);
    restname.setRestaurantLocation(location);
    }
    
    
    public void removeFoodItem(Restaurant restname, FoodItems foodItem){
    
    restname.removeItem(foodItem);
    
    }
    
    public void addFoodItems(Restaurant restname, FoodItems foodItem){
    
    restname.addFood(foodItem);
    
    }
    
    public FoodItems AddMenuFood(Restaurant rest,String name,String desc,String cost){
        foodMenu = new FoodItems(name,desc,cost);
        rest.addFood(foodMenu);
        return foodMenu;
    }
    public void updateMenu(FoodItems menu, String name, String desc, String cost){
        
    menu.setFoodName(name);
    menu.setFoodDesc(desc);
    menu.setFoodPrice(cost);
   // dB4OUtil.storeSystem(ecosystem);
    
    }
//    public void updateFoodItems()-- update pending
    // viewRestInfo --pending
    
}
