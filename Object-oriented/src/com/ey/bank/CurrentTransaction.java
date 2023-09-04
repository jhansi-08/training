package com.ey.bank;

public class CurrentTransaction extends Transaction {

	
	private double overdraft;
	private int acntNo;
	private String holder;
	private double balance;
	public CurrentTransaction(int acntNo, String holder, double balance, double overdraft) {
		// TODO Auto-generated constructor stub
		this.overdraft = overdraft;
		this.acntNo = acntNo;
		this.holder = holder;
		this.balance = balance;
		
	}
	@Override
	public String toString() {
		return "CurrentTransaction [overdraft=" + overdraft + ", acntNo=" + acntNo + ", holder=" + holder + ", balance="
				+ balance + "]";
	}
	
}
