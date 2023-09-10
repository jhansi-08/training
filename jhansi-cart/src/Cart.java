
public class Cart {

	private String item;
	private double price;
	private int discount;
	
	public Cart() {

	}

	public Cart(String item, double price, int discount) {
		super();
		this.item = item;
		this.price = price;
		this.discount = discount;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "cart [item=" + item + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
}
