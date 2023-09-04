import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();    // Todays date
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2012, 02, 13);  // Prints in date format
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2018-05-19");  // Prints the date
		System.out.println(d3);
		
		System.out.println(d1.plusDays(1));   // Adding one day 
		System.out.println(d1.minus(1,ChronoUnit.MONTHS)); // Subtracting one month and one year from the current date
		System.out.println(d2.getDayOfWeek()); // Prints the Day
		System.out.println(d3.getDayOfMonth()); // Prints the date
		System.out.println(d2.isLeapYear());   // Checks if its a leap year
	}
}
