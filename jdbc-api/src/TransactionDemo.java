import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import inventory.JdbcFactory;

public class TransactionDemo {

	public static void main(String[] args) {
		
		String sql1 = "insert into customer values(143, 'Lovina', 'Games')";
		String sql2 = "update customer set domain = 'Sports' where cust_id = 121 ";
		String sql3 = "delete from customer where custid = 212 ";
		
		Connection conn = null;
		try {
			conn = JdbcFactory.getConneection();
			
			Statement stmt = conn.createStatement();
			
			// Adding batch of SQL queries to statement
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			conn.setAutoCommit(false); // Setting auto-commit off
			stmt.executeBatch(); // Executing batch of queries at once
			
			conn.commit();
			System.out.println("Transaction completed.");
		} catch (SQLException e) {

			System.out.println("Transaction failed due to...");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
