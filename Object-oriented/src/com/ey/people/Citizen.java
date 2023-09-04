package com.ey.people;

public class Citizen extends People {

	private String passport;
	
	public Citizen() {
		// Optional: By default a child class calls the default constructor of parent
		super();
		System.out.println("Constructor Laoding....");
	}

	public Citizen(String name, String country, String passport) {
		//constructor chaining: Calling constructor of parent class with matching signature
		super(name,country);
		this.passport = passport;
	}

	public void getdata() {
		super.getdata();
		System.out.println("Passport : " + passport);
		
	}
	
	
	
	
}
