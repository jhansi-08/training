
public class Calculator {

	private double total;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Calculator(double t) {
		this.total = t;
	}

	public void summary() {
		System.out.println("Total: " + total);
	}

	public void add(double num) {
		total = total + num;
	}

	public void sub(double num) {
		total = total - num;
	}

	public void multiply(double num) {
		total = total * num;
	}

	public void divide(double num) {
		total = total / num;
	}

}
