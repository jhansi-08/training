import com.ey.pizza.Pizza;

public class TestPizza {

	public static void main(String[] args) {

		Pizza p1, p2;
		p1 = new Pizza("Veggie Lovers", "Extra corn", "Veg", "Medium", 250);
		p2 = new Pizza("Chicken Tikka", "Peppers", "Non-veg", "Medium", 350);
		System.out.println(p1);
		System.out.println(p2);
	}

}
