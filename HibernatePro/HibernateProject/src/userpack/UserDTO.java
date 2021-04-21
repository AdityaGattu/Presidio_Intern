package userpack;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="user")
@Table(name="user")
public class UserDTO implements Serializable,Cloneable{
	
	@Id
	private int userid;
	private String username,password;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	static UserDTO obj;
	static UserDTO getUserDTO() {
		if(obj==null) {
			return new UserDTO();
		}
		return obj.getCloneUserDTO();
	}
	
	private UserDTO getCloneUserDTO() {	
		try {
		return (UserDTO)super.clone();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
}
