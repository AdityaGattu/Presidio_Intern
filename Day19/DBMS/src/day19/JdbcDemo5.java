package day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcDemo5 {
	public static void main(String[] args) {
		try {
			Connection con=DBUtility.getConnection();
			
			Statement st=con.createStatement();
			
			ResultSet rs= st.executeQuery("select * from users");
			
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
			
			DBUtility.closeConnection(null, null);
		}catch(Exception e) {
			DBUtility.closeConnection(e, null);
		}
	}
}
