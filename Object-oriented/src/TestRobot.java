import com.ey.robot.Robot;

public class TestRobot {

	public static void main(String[] args) {
		
		Robot r1, r2, r3;
		r1 = new Robot("Aerospace Robots", "1000 RPM", "Research");
		r2 = new Robot("Industrial Robots", "1000 RPM", "Executes tasks");
		r3 = new Robot("Consumer Robots", "500 RPM", "Household helpers");
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
	
}
