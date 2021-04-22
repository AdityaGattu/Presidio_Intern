package sprintrans;

public class InsufficientBalanceException extends  Exception{
	String msg;
	public InsufficientBalanceException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
}
