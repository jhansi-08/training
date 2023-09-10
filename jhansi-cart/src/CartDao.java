import java.util.List;

public interface CartDao {

	void addItem(Cart cart) throws ItemAlreadyExistException;
	List<Cart> list();
	List<Cart> findByItem(String item) throws InvalidCartException;
	List<Cart> findByPrice(double price) throws InvalidCartException;
	List<Cart> findByDiscount(int discount) throws InvalidCartException;
	
}
