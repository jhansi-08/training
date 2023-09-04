
public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;
	
	private static int counter = 1;
	
	public Customer() {

	}
	public Customer ( String custName, double creditLimit) {
		this.custId = counter++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}
	public void payslip() {
		System.out.println("Cust Id: " + custId);
		System.out.println("Cust Name: " + custName);
		System.out.println("Credit Limit: " + creditLimit);
	}
	public double getCreditLimit() {
		return creditLimit;
	}

}
