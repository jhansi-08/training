
public class TestCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer("Jhansi",8000);
		c1.payslip();
		System.out.println("Credit Limit: " + c1.getCreditLimit() );
	}

}
