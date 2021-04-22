package factorypack;

public class ShoeException extends Exception{
	String msg;
	public ShoeException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return this.msg;
	}
}
