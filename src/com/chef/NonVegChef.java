/**
 * 
 */
package com.chef;

import com.order.Order;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class NonVegChef extends Chef {

	public void nonVegSection(Order order) {
		System.out.println("Your order has now reached the nonVegSection");
		System.out.println(".......");
		System.out.println("The order is ready (nonVeg)...");
		String message = "nonVegChef to waiter: you can now deliver items to customer";
		prepareOrder(order, message);
	}
}
