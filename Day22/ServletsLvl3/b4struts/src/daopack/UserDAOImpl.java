package daopack;

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
		return null;
	}

	@Override
	public Set<UserDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO findByName(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
