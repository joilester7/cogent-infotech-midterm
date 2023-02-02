/**
 * 
 */
package com.chef;

import com.order.Order;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class Chef {

	public void prepareOrder(Order order, String vegRNonVeg) {
		callWaiter(vegRNonVeg);
	}
	
	public void callWaiter(String vegRNonVeg) {
		System.out.println(vegRNonVeg);
	}
}
