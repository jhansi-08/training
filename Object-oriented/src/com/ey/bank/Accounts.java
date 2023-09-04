package com.ey.bank;

public abstract class Accounts implements Bank {

	private int acntNo;
	private String holder;
	protected double balance;
	
	
	
	private static int autogen = INIT_ACCOUNT_NO;

	public Accounts() {

	}

	public Accounts(String acntName, double balance) {
		this.acntNo = autogen++;
		this.holder = acntName;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	// Business Logic
	public void deposit(double amount) {
		balance += amount;
	}

//	public abstract void withdraw(double amount);
}
