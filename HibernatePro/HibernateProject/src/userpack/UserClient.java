package userpack;

public class UserClient {
	public static void main(String[] args) {
		
		
//		UserDTO u=new UserDTO();
//		u.setUserid(500);
//		u.setUsername("aditya");
//		u.setPassword("adi");
//		
//		UserDAO user=new UserDAO();
//		user.createUser(u);
		
		UserDTO u2=new UserDTO();
		u2.setUserid(300);
		u2.setUsername("samarth");
		u2.setPassword("sam");
		
		UserDAO user=new UserDAO();
		user.deleteUser(u2);
	}
}
