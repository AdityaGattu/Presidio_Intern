package daopack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.util.Properties;

import javax.servlet.ServletContext;

public class DBUtility {
	private DBUtility() {
		// TODO Auto-generated constructor stub
	}
	private static String url,username,password;
	private static ServletContext ctx;
	static {
		try {
			Properties prop=new Properties();
			prop.load(new FileInputStream(ctx.getAttribute("dbconfigpath").toString()));
			String driver=prop.getProperty("driver");
			url=prop.getProperty("url");
			username=prop.getProperty("username");
			password=prop.getProperty("password");
			Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static ThreadLocal<Connection> tlocal=new ThreadLocal<>();
	private static Connection con;
	
	synchronized public static Connection getConnection(ServletContext context) {
		ctx=context;
		con=tlocal.get();
		if(con==null) {
			try {
				con=DriverManager.getConnection(url,username,password);
				con.setAutoCommit(false);
				tlocal.set(con);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	synchronized public static void closeConnection(Exception e,Savepoint sp) {
		con=tlocal.get();
		if(con!=null) {
			try {
				if(e==null) {
					con.commit();//manual commit
				}
				else {
					if(sp==null) {
						con.rollback();
					}
					else {
						con.rollback(sp);
						con.commit();
					}
				}
			con.close();
			tlocal.remove();
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}
	}
}
