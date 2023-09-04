package com.ey.people;

public class Alien extends People {

	private String visa;
	
	public Alien() {

		super();
		System.out.println("Constructor Laoding....");
	}

	public Alien(String name, String country, String visa) {
		
		super(name,country);
		this.visa = visa;
	}
	
	public void getdata() {
		
		super.getdata();
		System.out.println("Visa : " + visa);
	}
	
	
}
