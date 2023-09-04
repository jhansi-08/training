package com.ey.emp;

public class Clerk extends Employee {
	
	private double commission;

	public Clerk() {
		// Optional: By default a child class calls the default constructor of parent
		super();
	}

	public Clerk(String empName, double salary, double commission) {
		//constructor chaining: Calling constructor of parent class with matching signature
		super(empName, salary);
		this.commission=commission;
	}

	@Override
	public void payslip() {
		super.payslip(); //calling payslip() of super class
		System.out.println("commission: " + commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary()+commission;
		
	}

}
