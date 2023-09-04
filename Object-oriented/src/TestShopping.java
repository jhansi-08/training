import com.ey.shop.CartException;
import com.ey.shop.Product;
import com.ey.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product p1 = new Product("IPhone X",23000);
		try {
			cart.addToCart(p1);
		} catch (CartException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			cart.addToCart(new Product("AirPods2", 8999));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			cart.addToCart(new Product("Apple Watch SE", 33000));
		} catch (CartException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		cart.checkout();
	}
}
