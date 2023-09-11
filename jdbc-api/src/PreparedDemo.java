import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import inventory.JdbcFactory;

public class PreparedDemo {

	
	public static void main(String[] args) {
		
		// ? is known as placeholders, their index starts from 1
		String sql = "insert into customer values (?,?,?)";
		
		try {
			Connection conn = JdbcFactory.getConneection();
			
			//Pre-compile statement created with query
			PreparedStatement stmt = conn.prepareStatement(sql);
			//Replacing place holders with values
			stmt.setInt(1,Integer.parseInt(args[0]));
			stmt.setString(2,args[1]);
			stmt.setString(3,args[2]);
			
			stmt.executeUpdate();
			System.out.println("Record successfully inserted...");
		} catch (SQLException e) {

			System.out.println("Record not inserted...");
			e.printStackTrace();
		}
	}
}
