package day18;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/coda5","root1","root1");
		System.out.println(con);
		
		
	}
}


