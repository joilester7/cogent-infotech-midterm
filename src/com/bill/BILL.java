/**
 * 
 */
package com.bill;

import com.customer.Customer;
import com.order.Order;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class BILL {
	Order order;
	int bill;
	int count;
	int price;
	static int totalBill = 0;
	
	public void generateBill(Customer c) {
		System.out.println("Hey " + c.getCustomerName() + ", here's your bill");
		System.out.println("INVOICE");
		System.out.println("-----");
		System.out.println("Item \t\t Quantity \t Bill");
		System.out.println("--- \t\t ---- \t\t ----");
		
		for (int i = 0; i < c.order.numOfItems; i++) {
			count=c.order.Items[i][1];
			price=c.order.menuPrices[(c.order.Items[i][0])-1];
			
			System.out.print(c.order.menuItems[(c.order.Items[i][0])-1]);
			System.out.print(" \t "+count);
			System.out.println(" \t\t "+ price);
			totalBill=totalBill + price * count;
		}
		System.out.println(" \t\t \t -------");
		System.out.println("Total Bill \t\t " +totalBill);
	}
	
	
	
}
