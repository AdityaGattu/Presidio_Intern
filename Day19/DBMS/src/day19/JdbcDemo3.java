package day19;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class JdbcDemo3 {
	public static void main(String[] args) throws Exception{
		Connection con=DBUtility.getConnection();
		con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		DatabaseMetaData dmd= con.getMetaData();//to capture the database
		
		System.out.println("version details..:"+dmd.getDatabaseMajorVersion());
		System.out.println("db name..:"+dmd.getDatabaseProductName());
		dmd.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE);
		
		System.out.println("Isolation default level..:"+dmd.getDefaultTransactionIsolation());
		System.out.println("Isolation set:"+con.getTransactionIsolation());
		
	}
}
