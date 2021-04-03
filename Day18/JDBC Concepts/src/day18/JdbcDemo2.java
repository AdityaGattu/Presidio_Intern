package day18;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class JdbcDemo2 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			Connection con=DBUtility.getConnection();
			System.out.println(con);
			DBUtility.closeConnection();
			
			Connection con2=DBUtility.getConnection();
			System.out.println(con2);
		});
		es.execute(()->{
			Connection con=DBUtility.getConnection();
			System.out.println(con);
			Connection con2=DBUtility.getConnection();
			System.out.println(con2);
		});
		es.shutdown();
	}
}