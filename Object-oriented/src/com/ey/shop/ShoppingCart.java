package com.ey.shop;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> products;
	private double total;

	public ShoppingCart() {
		products = new ArrayList<Product>();
	}

	public void addToCart(Product p) throws CartException {
//		if (index == products.length)
//			throw new CartException("Your cart is full...");
//		else {
//			products[index] = p;
//			index++;
//			total += p.getPrice();
//		}
		
		products.add(p);
		total += p.getPrice();
	}

	public void checkout() {
		System.out.println("Your oder summary...");
//		for (int i = 0; i < index; i++) {
//			products[i].print();
//		}
		products.forEach(System.out::println);
		
		System.out.println("Total Amount: " + total);
	}
}
