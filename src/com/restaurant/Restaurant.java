/**
 * 
 */
package com.restaurant;

import com.customer.Customer;
import com.waiter.WAITER;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class Restaurant {
	public static void main(String[] args) {
		Customer customer =new Customer();
		WAITER waiter = new WAITER();
		waiter.takeOrder(customer);
		
	}
}
