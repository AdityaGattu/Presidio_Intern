package day19;

public interface UserDAO {

	public UserDTO getUser(int userid);
	public int createUser(UserDTO u);
	public int updateUser(UserDTO u);
	public int deleteUser(UserDTO u);
	public int deleteUserById(int userid);
	
	
}
