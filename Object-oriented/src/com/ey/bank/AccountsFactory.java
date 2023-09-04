package com.ey.bank;

public class AccountsFactory {

	private AccountsFactory() {
		
	}
	public final  static Savings createSavingsAccount(String holder) {

		return new Savings(holder);
	}

	public static Current createCurrentAccount(String holder) {

		return new Current(holder);
	}

}
