package inventory;

import java.util.Scanner;

public class FlightMenu {
	
	private static FlightDao dao;
	static {
		 try {
			dao = new FlightDao();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		
		while(true) {
			System.out.println("Main Menu");
			System.out.println("1- Add Flight \n2- Find Flight \n3- List Flights \n4- Delete Flight \n5- Exit");
			System.out.println("Enter Choice: ");
			int choice = console.nextInt();
			switch(choice) {
			
			case 1: addFlight(); break;
			case 2: findFlight(); break;
			case 3: listFlight(); break;
			case 4: delFlight(); break;
			case 5: System.exit(0);
			default: System.out.println("Invalid option");
			}
		}
	}

	private static void addFlight() {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Flight Code: ");
		int code = console.nextInt();
		System.out.println("Enter Carrier: ");
		String carrier = console.next();
		System.out.println("Enter Source");
		String source = console.next();
		System.out.println("Enter Destination");
		String destination = console.next();
		
		Flight f = new Flight(code, carrier, source, destination);
		dao.add(f);
		
	}

	private static void listFlight() {
		
		dao.list().forEach(System.out::println);
	}

	private static void findFlight() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Flight Code: ");
		int code = console.nextInt();
		
		System.out.println(dao.find(code));
	}

	private static void delFlight() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Flight Code: ");
		int code = console.nextInt();
		
		dao.delete(code);
	}

}
