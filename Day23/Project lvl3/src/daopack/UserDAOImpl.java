package daopack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Set;

public class UserDAOImpl implements UserDAO,Cloneable{

	private UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	private static UserDAOImpl userDaoImpl;
	
	public static UserDAOImpl getUserDaoImpl() {
		if(userDaoImpl==null) {
			userDaoImpl=new UserDAOImpl();
		}
		return userDaoImpl.getClone();
	}
	
	public UserDAOImpl getClone() {
		try {
			return (UserDAOImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public UserDTO findById(int uid) {
		// TODO Auto-generated method stub
		Connection con=DBUtility.getConnection();
		try {
		PreparedStatement stmt=con.prepareStatement("select * from users where uid=?");
		stmt.setInt(1, uid);
		ResultSet rs=stmt.executeQuery();
		UserDTO obj=new UserDTO();
		while(rs.next()) {
			obj.setUid(rs.getInt(1));
			obj.setUname(rs.getString("uname"));
			obj.setUpass(rs.getString("upass"));
			obj.setFlag(rs.getInt(4));
		}
		return obj;
		}
		catch(Exception e) {
		    e.printStackTrace();
			return null;
		}
	}

	@Override
	public Set<UserDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int rows=0;
				
				try {
				Connection con=DBUtility.getConnection();
				PreparedStatement stmt=con.prepareStatement("insert into users values(?,?,?,?)");
				stmt.setInt(1, userDTO.getUid());
				stmt.setString(2, userDTO.getUname());
				stmt.setString(3, userDTO.getUpass());
				stmt.setInt(4, userDTO.getFlag());
				rows=stmt.executeUpdate();
				DBUtility.closeConnection(null, null);
				return rows;
				}
				catch(Exception e) {
				    e.printStackTrace();
					return 0;
				}
	}

	@Override
	public int deleteUser(int uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		
		int rows=0;
		Connection con=DBUtility.getConnection();
		try {
		PreparedStatement stmt=con.prepareStatement("update users set flag=? where uid=?");
		
		stmt.setInt(1, userDTO.getFlag());
		stmt.setInt(2, userDTO.getUid());
		
		rows=stmt.executeUpdate();
		
		return rows;
		}
		catch(Exception e) {
		    e.printStackTrace();
			return 0;
		}
	}

	@Override
	public UserDTO findByName(String uname) {
		// TODO Auto-generated method stub
		try {
			Connection con=DBUtility.getConnection();
			PreparedStatement stmt=con.prepareStatement("select * from users where uname=?");
			stmt.setString(1, uname);
			ResultSet rs=stmt.executeQuery();
			UserDTO obj=new UserDTO();
			while(rs.next()) {
				obj.setUid(rs.getInt(1));
				obj.setUname(rs.getString("uname"));
				obj.setUpass(rs.getString("upass"));
				obj.setFlag(rs.getInt(4));
				
			}
			DBUtility.closeConnection(null, null);
			return obj;
			}
			catch(Exception e) {
			    e.printStackTrace();
				return null;
			}
	}

}
