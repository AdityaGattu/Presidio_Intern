package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo6 {
	public static void main(String[] args) {
		try {
			Connection con=DBUtility.getConnection();
			
			PreparedStatement st=con.prepareStatement("select * from users where uid=?");
			while(true) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter a valid uid...");
			int userid=scan.nextInt();
			st.setInt(1, userid);
			ResultSet rs= st.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int colCount=rsmd.getColumnCount();
			
			for(int i=1;i<=colCount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println("\n_____________________________________________________________\n");
			while(rs.next()) {
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString("uname"));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getInt("flag"));
				for(int i=1;i<=colCount;i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
			}
			//DBUtility.closeConnection(null, null);
			
		}catch(Exception e) {
			DBUtility.closeConnection(e, null);
		}
		
	}
}
