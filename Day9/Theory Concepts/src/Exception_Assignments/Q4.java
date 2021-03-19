package Exception_Assignments;

//Create your own exception. In main() create a trycatch clause to exercise your new exception

class MyException extends Exception{
	String msg;
	public MyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	
}
public class Q4 {
	public static void main(String[] args) {
		
		try {
			throw new MyException("my custom exception called......");
		}
		catch(MyException me){
			System.out.println(me);
		}
		
	}
}

/*o/p:
 * my custom exception called......
 */