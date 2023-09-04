package com.ey.pizza;

public class Pizza {

	private int orderNo;
	private String name;
	private String toppings;
	private String category;
	private String size;
	private double price;
	
	private static int counter =1;
	
	public Pizza() {

		System.out.println("Constructor Loading....");
	}
	
	
	public Pizza(String name, String toppings, String category, String size, double price) {

		this.orderNo = counter++;
		this.name = name;
		this.toppings = toppings;
		this.category = category;
		this.size = size;
		this.price = price;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Pizza.counter = counter;
	}


	@Override
	public String toString() {
		return "Pizza [orderNo=" + orderNo + ", name=" + name + ", toppings=" + toppings + ", category=" + category
				+ ", size=" + size + ", price=" + price + "]";
	}
	
	
	
}
