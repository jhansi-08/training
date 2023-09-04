package com.ey.bank;                       // Using Refactoring so that exception is called everywhere

public interface Bank {
	
	//Applications Constants 
		int INIT_ACCOUNT_NO = 10101;
		double MIN_SAVINGS_BAL = 1000;
		double OPENING_CURRENT_BAL = 5000;
		double MIN_CURRENT_BAL = 0;
		double OVERDRAFT_LIMIT = 10000;
		
//		public Transaction  statement() {
//			
//			return Transaction.forEach(System.out::println);
//		}
	
	// Application behaviour (API)
	void summary();
	void deposit(double amount);
	void withdraw(double amount)throws BalanceException;// select withdraw method- refactor - change method signature - exception, select exception
	

}
