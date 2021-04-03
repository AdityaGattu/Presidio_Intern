package day19;

import java.sql.Connection;
import java.sql.Savepoint;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String[] args) {
		Connection con=DBUtility.getConnection();
		Savepoint first=null;
		try {
		
		Statement stmt=con.createStatement();
		
		//int i=stmt.executeUpdate("create table users (uid int(5),uname varchar(30),upass varchar(8),flag int(1))");
		//System.out.println(i +" table created....");
		
		int i=stmt.executeUpdate("insert into users values (2,'somu','spider',0)");
		System.out.println(i +" rows inserted....");
		
		first=con.setSavepoint("first");
		//con.commit();
		
		i=stmt.executeUpdate("insert into users values (3,'monu','spider',0)");
		System.out.println(i +" rows inserted....");
				
		Savepoint second=con.setSavepoint("second");
		//con.commit();
		
		i=stmt.executeUpdate("insert into user values (4,'monu','spider')");
		System.out.println(i +" rows inserted....");
		
		DBUtility.closeConnection(null,null);
		
		}catch(Exception e) {
//			try{
//				
//				con.rollback(first);
//				con.commit();	
//			}catch(Exception eee) {e.printStackTrace();}
			DBUtility.closeConnection(e,first);
			e.printStackTrace();
		}

	}
}
