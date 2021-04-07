package day21;

import java.sql.*;
 
public class UserDAO {
 
	Connection con;
	PreparedStatement stmt;
	
    public boolean userLogin(String name, String pwd,int flag) throws SQLException,
            ClassNotFoundException {
        
    	Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/coda4","adi","aditya");
        stmt=con.prepareStatement("select * from users where username=? and password=?");
		stmt.setString(1,name);
		stmt.setString(2,pwd);
		
		ResultSet rs=stmt.executeQuery();
        return rs.next();
        }
    }