/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author Krish
 */
public class FoodItems {
    
    private String foodName;
    private String foodCategory;
    private String foodDesc;
    private String foodPrice;//since food can have dollars written in it as well
    //particular food item ordered how many times and its history
    

    public String getFoodName() {
        System.out.println("Food Name "+foodName);
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
    
    public FoodItems(String foodName, String foodDesc, String foodPrice){
        
        this.foodName = foodName;
//        this.foodCategory = foodCategory;
        this.foodDesc = foodDesc;
        this.foodPrice = foodPrice;
    
    }
    
@Override   
public String toString(){
    return foodName;
    
    }

}
