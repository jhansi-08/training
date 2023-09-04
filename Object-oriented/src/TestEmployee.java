import com.ey.emp.Clerk;
import com.ey.emp.Employee;
import com.ey.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {

//		Employee e1; //Creating an abstract class object 

		Manager m1 = new Manager("Mike", 500, 2000);
//		m1.payslip();

		Clerk c1 = new Clerk("Jhansi", 600, 3000);
//		c1.payslip();

		showSalary(m1);
		showSalary(c1);
	}

	private static void showSalary(Employee e) {
		if ( e instanceof Manager) 
			System.out.println("Manager Salary: " + e.getSalary());
		else
			System.out.println("Clerk Salary: " + e.getSalary());
	}
	

//	private static void showSalary(Clerk c1) {
//		System.out.println("Clerk Salary: " + c1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		System.out.println("Manager Salary: " + m1.getSalary());
//	}

}
