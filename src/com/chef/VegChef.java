/**
 * 
 */
package com.chef;

import com.order.Order;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class VegChef extends Chef{
	
	public void vegSection(Order order) {
		System.out.println("Your order has now reached the nonVegSection");
		System.out.println(".......");
		System.out.println("Order is ready (veg)...");
		String message = "vegChef to waiter: you can now deliver items to customer";
		prepareOrder(order, message);
	}
}
