package dbdemos;

public class User {
	private int uid;
	private String uname;
	private int amount;
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
	public final int getAmount() {
		return amount;
	}
	public final void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", amount=" + amount + "]";
	}
	
}
