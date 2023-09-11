import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import inventory.JdbcFactory;

public class PreparedInputDemo {

	
	public static void main(String[] args) {
		
		// ? is known as placeholders, their index starts from 1
		String sql = "insert into customer values (?,?,?)";
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the details: ");
		try {
			Connection conn = JdbcFactory.getConneection();
			
			//Pre-compile statement created with query
			PreparedStatement stmt = conn.prepareStatement(sql);
			//Replacing place holders with values
			stmt.setInt(1,console.nextInt());
			stmt.setString(2,console.next());
			stmt.setString(3,console.next());
			
			stmt.executeUpdate();
			System.out.println("Record successfully inserted...");
		} catch (SQLException e) {

			System.out.println("Record not inserted...");
			e.printStackTrace();
		}
	}
}

