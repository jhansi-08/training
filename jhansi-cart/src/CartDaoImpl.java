import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CartDaoImpl {

	private List<Cart> carts;
	
	public CartDaoImpl() {

		this.carts = new ArrayList<>();
	}
	
	public void addItem(Cart cart) throws ItemAlreadyExistException {
		if(carts.stream().anyMatch(c -> c.getItem().equals(cart.getItem()))){
			
			throw new ItemAlreadyExistException("Item alredy exist: " + cart.getItem());
		}
		carts.add(cart);
	}
	
	public List<Cart> list(){
		return carts;
	}
	
	public List<Cart> findByItem(String item) throws InvalidCartException  {
		
		return carts.stream().filter(c -> c.getItem().equals(item)).collect(Collectors.toList());	
	}
	
	public List<Cart> findByPrice(double price) throws InvalidCartException{
		
		return carts.stream().filter(c -> c.getPrice()==price).collect(Collectors.toList());
	}
	
	public List<Cart> findByDiscount(int discount) throws InvalidCartException{
		
		return carts.stream().filter(c -> c.getDiscount()==discount).collect(Collectors.toList());
	}
	
	public boolean update(Cart updatedcart) throws InvalidCartException {
		
		for (Cart cart: carts) {
		if(cart.getItem().equals(updatedcart)) {
			
			cart.setPrice(updatedcart.getPrice());
			cart.setDiscount(updatedcart.getDiscount());
			return true;
		}
		}
		return false;
	}
	
	public boolean delete(String item) {
		
		return carts.removeIf(c -> c.getItem().equals(item));
	}
	
	
}
