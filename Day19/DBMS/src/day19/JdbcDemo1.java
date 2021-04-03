package day19;


import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo1 {
	public static void main(String[] args) throws Exception{
		//load or register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/coda4","root","root");
		
		System.out.println(con);
	}
}
