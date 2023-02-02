/**
 * 
 */
package com.waiter;

import java.util.Scanner;

import com.bill.BILL;
import com.chef.NonVegChef;
import com.chef.VegChef;
import com.customer.Customer;
import com.order.Order;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class WAITER {
	String listItems[] = {"1.Full Meals \t\t -- 100", "2.Gobi Nudles \t\t -- 50", "3.Chicken Biriyani \t -- 200", "4.Chicken \t\t -- 200"
			, "5.Chicken Curry \t -- 100", "6.Chicken Manchuria \t -- 150", "7.Veg Rice \t\t -- 50", "8.Veg Palav \t\t -- 100", 
			"9.Veg Manchuria \t -- 50", "10.Veg Biriyani \t -- 150"};
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("--------------");
		for(String i: listItems) {
			System.out.println(i);
		}
		System.out.println("--------------");
	}
	
	public void takeOrder(Customer c) {
		System.out.println("Welcome to the restaurant " + c.getCustomerName() + ". Here's the menu. What would you like to order?");
		menu();
		Order order = c.orderingItems();
		placeOrderToChef(order);
		c.eat();
		BILL bill = new BILL();
		bill.generateBill(c);
	}
	
	public void placeOrderToChef(Order order) {
		VegChef vc = new VegChef();
		NonVegChef nvc= new NonVegChef();
		
		for(int i = 0; i < order.getNumOfItems(); i++) {
			if(order.Items[i][0] < 7) {
				nvc.nonVegSection(order);
			} else {
				vc.vegSection(order);
			}
		}
	}
}
