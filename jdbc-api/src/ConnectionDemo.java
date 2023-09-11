import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

import inventory.JdbcFactory;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {

		Connection conn = JdbcFactory.getConneection();
		System.out.println("Connection successful!");
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB Name: " + meta.getDatabaseProductName());
		System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
		System.out.println("Driver Name: " + meta.getDriverName());
		System.out.println("Driver Ver: " + meta.getDriverVersion());
		
	}
	
}
