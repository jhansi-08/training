package ax3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stk")
@Scope(value = "singleton")
public class Stock {

	public Stock() {

		System.out.println("Default constructor");
	}

	public static Stock stk;

	private static Stock getStock() {
		System.out.println("Stock Singleton");

		if (stk == null)
			stk = new Stock();

		return stk;

	}
}