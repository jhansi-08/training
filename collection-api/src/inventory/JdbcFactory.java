package inventory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcFactory {

	public JdbcFactory() {

	}
	public static Connection getConneection() throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306/jhansi";
		DriverManager.registerDriver(new Driver());
		Connection conn = DriverManager.getConnection(url,"root","Jhansi082001@");
		return conn;
	}
	public static Connection getConnection(){
		
		return null;
		
	}
}
