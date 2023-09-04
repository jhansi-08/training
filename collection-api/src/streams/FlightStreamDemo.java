package streams;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.IOException;

public class FlightStreamDemo {

	
	public static void main(String[] args) throws Exception {
		
		List<Flight> flights = null;
		
		Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));
		
		flights = lines.map(line ->{
			String [] record = line.split(",");
			
			return new Flight(Integer.parseInt(record[0]), record[1], record[2], record[3]);
		}).collect(Collectors.toList());
		
		flights.forEach(System.out::println);
		
		//Print details of flight no 123
		
//		System.out.println("Printing details of flight no 123");
//		flights.stream().filter(s -> s.getCode() == 123).forEach(System.out::println);
//		
//		System.out.println("Printing details of flight Jet carrier");
//		flights.stream().filter(s -> s.getCarrier().equals("Jet")).forEach(System.out::println);
//		
//		System.out.println("Printing details of flight going from Pune to Delhi");
//		flights.stream().filter(s -> s.getSource().equals("Pune") && s.getDestination().equals("Delhi")).forEach(System.out::println);
//		
//		flights.removeIf(flight -> flight.getCode()==123);
//		flights.forEach(System.out::println);
	}
}
