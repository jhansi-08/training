package inventory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightDao {
	
	private List<Flight> flights;
	
	public FlightDao() throws Exception {
		
		try {
			Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));
			
			flights = lines.map(line -> {
				String[] record = line.split(",");
				return new Flight(Integer.parseInt(record[0]), record[1], record[2], record[3]);
			}).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}
	
	public void add(Flight f) {
		
		flights.add(f);
		
	}
	public Flight find(int code) {
		
		return flights.stream().filter(f -> f.getCode()==code).findFirst().get();
		
	}
	public List<Flight> list(){
		
		return flights;
		
	}
	public void delete(int code) {
		
		flights.removeIf(f -> f.getCode() == code);
	}
//	public Flight findsource(int code) {
		
//		return flights.stream().filter(f -> f.getSource()==source).findFirst().get();
//		return flights.stream().filter(f -> f.getSource().equals(source)).forEach(System.out::println);
		
//	}

}
