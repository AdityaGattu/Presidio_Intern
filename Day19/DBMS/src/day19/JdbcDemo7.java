package day19;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class JdbcDemo7 {
	public static void main(String[] args) throws Exception{
		Connection con=DBUtility.getConnection();
		
		// CallableStatement cs= con.prepareCall("{call proc1()}");
		
		// int i=cs.executeUpdate();
		
		// System.out.println("No of rows updated...:"+i);
		
		//  Statement st= con.createStatement();
		//	boolean b=st.execute("insert into users values (3,'raja','spider',0)");
		//  System.out.println(b);
		
		//CallableStatement cs=con.prepareCall("{call proc2(?,?)}");
	//	cs.setString(1, "ramu");
	//	cs.setInt(2, 1);
		
	//	cs.executeUpdate();
		
		CallableStatement cs=con.prepareCall("{call proc3(?,?)}");
		cs.setString(1, "somu");
		cs.registerOutParameter(2, Types.INTEGER);
		
		cs.execute();
		
		System.out.println("The flag value of ramu is...:"+cs.getInt(2));
		DBUtility.closeConnection(null, null);
	}
}

/*
 * 
 *create procedure proc1()
    -> begin
    -> update users set flag=0;
    -> end
    -> //
Query OK, 0 rows affected (0.25 sec)

 * create procedure proc2(IN name VARCHAR(30),IN fl INT)
    -> begin
    -> update users set flag=fl where uname=name;
    -> end;
    -> //
Query OK, 0 rows affected (0.02 sec)
 
 create procedure proc3(IN name varchar(30),OUT fl INT)
    -> begin
    -> select flag into fl from users where uname=name;
    -> end;
    -> //
Query OK, 0 rows affected (0.01 sec)
*/