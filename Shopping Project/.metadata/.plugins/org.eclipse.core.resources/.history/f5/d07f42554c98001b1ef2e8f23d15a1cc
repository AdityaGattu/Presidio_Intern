package daopack;

import java.io.Serializable;

public class UserDTO implements Comparable<UserDTO>, Serializable,Cloneable{
	private int uid;
	private String uname,upass;
	private int flag;
	
	@Override
	public int compareTo(UserDTO o) {
		return this.uname.compareTo(o.uname);
	}
	
	public final int getUid() {
		return uid;
	}

	public final void setUid(int uid) {
		this.uid = uid;
	}

	public final String getUname() {
		return uname;
	}

	public final void setUname(String uname) {
		this.uname = uname;
	}

	public final String getUpass() {
		return upass;
	}

	public final void setUpass(String upass) {
		this.upass = upass;
	}

	public final int getFlag() {
		return flag;
	}

	public final void setFlag(int flag) {
		this.flag = flag;
	}

	public UserDTO getClone() {
		try {
			return (UserDTO)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String toString() {
		return "UserDTO [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", flag=" + flag + "]";
	}
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int uid, String uname, String upass, int flag) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.flag = flag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flag;
		result = prime * result + uid;
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		result = prime * result + ((upass == null) ? 0 : upass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		if (flag != other.flag)
			return false;
		if (uid != other.uid)
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		if (upass == null) {
			if (other.upass != null)
				return false;
		} else if (!upass.equals(other.upass))
			return false;
		return true;
	}
	
}
