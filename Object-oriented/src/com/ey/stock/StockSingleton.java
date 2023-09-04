package com.ey.stock;

public class StockSingleton {

	private StockSingleton() {
		
	}
	
	private static Stock stk;
	
	public static Stock getStock() {
		
		if(stk == null)
			stk = new Stock();
		
		return stk;
	}
}
