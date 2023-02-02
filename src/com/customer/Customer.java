/**
 * 
 */
package com.customer;

import java.util.Scanner;

import com.order.Order;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class Customer {
	private String customerName;
	public Order order;
	Scanner sc = new Scanner(System.in);
	
	public Customer() {
		super();
		System.out.println("Hello, what's your name?");
		setCustomerName(sc.next());
		order = new Order();
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Order orderingItems() {
		System.out.println(customerName + " is giving the order...");
		System.out.println("Please enter number of items:");
		order.setNumOfItems(sc.nextInt());
		for(int i = 0; i < order.getNumOfItems(); i++) {
			System.out.println("Please enter the item number");
			order.Items[i][0] = sc.nextInt();
			System.out.println("Please enter the quantity");
			order.Items[i][1] = sc.nextInt();
		}
		
		return order;
	}
	
	public void eat() {
		System.out.println(customerName + " is eating...");
	}
	
}
