package com.ey.people;

public abstract class People {

	
	private String name;
	private String country;
	
	public People() {

		System.out.println("Constructor Loading....");
		
	}

	public People(String name, String country) {

		this.name = name;
		this.country = country;
	}

	public void getdata() {
		
		System.out.println("Name : " + name);
		System.out.println("Country : " + country);
	}
	
}
