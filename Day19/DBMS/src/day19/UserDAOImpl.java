package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAOImpl implements UserDAO,Cloneable{
	
	private static UserDAOImpl obj;
	
	private UserDAOImpl() {
		
	}
	
	private UserDAOImpl getUserDAOImpl() {
		
		if(obj==null) {
			return new UserDAOImpl();
		}
		return obj.getClone();
	}
	
	private UserDAOImpl getClone() {
		
		try {
		return (UserDAOImpl)super.clone();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public UserDTO getUser(int userid) {
		// TODO Auto-generated method stub
		
		Connection con=DBUtility.getConnection();
		try {
		PreparedStatement stmt=con.prepareStatement("select * from users where userid=?");
		stmt.setInt(1, userid);
		
		ResultSet rs=stmt.executeQuery();
		
		UserDTO ob=UserDTO.getUserDTO();
		
		while(rs.next()) {
			ob.setUserid(rs.getInt(1));
			ob.setPassword(rs.getString("password"));
			ob.setUsername(rs.getString("username"));
		}
		
		return ob;
		
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public int createUser(UserDTO u) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into users values (?,?,?)");
			ps.setInt(1, u.getUserid());
			ps.setString(2, "username");
			ps.setString(3, "password");
			
			int rows_inserted=ps.executeUpdate();
			return rows_inserted;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateUser(UserDTO u) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("update users set username=?,password=? where userid=?");
			ps.setString(2,u.getUsername());
			ps.setString(3,u.getPassword());

			int rows_updated=ps.executeUpdate();
			return rows_updated;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteUser(UserDTO u) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from users where userid=?,username=?");
			ps.setInt(1, u.getUserid());
			ps.setString(2, u.getUsername());
			
			int rows_deleted=ps.executeUpdate();
			return rows_deleted;
		}
		catch(Exception e) {
			e.printStackTrace();
		return 0;
		}
	}

	@Override
	public int deleteUserById(int userid) {
		// TODO Auto-generated method stub
		
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from users where userid=?");
			ps.setInt(1, userid);
			
			int rows_deleted=ps.executeUpdate();
			return rows_deleted;
		}
		catch(Exception e) {
			e.printStackTrace();
		return 0;
		}
	}
	
	
}
