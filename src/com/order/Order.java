/**
 * 
 */
package com.order;


/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class Order {
	static int orderNumber;
	public int Items[][];
	public int numOfItems;
	
	public String menuItems[] = {"Full Meals", "Gobi Nudles", "Chicken Biriyani", "Chicken", "Chicken Curry", "Chicken Manchuria",
			"Veg Rice", "Veg Palav", "Veg Manchuria", "Veg Biriyani"};
	
	public int menuPrices[]= {100,50,200,200,100,150,50,100,50,150};
	
	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
		Items = new int[numOfItems][2];
		orderNumber++;
	}
	
	public int getNumOfItems() {
		return numOfItems;
	}
	
}
