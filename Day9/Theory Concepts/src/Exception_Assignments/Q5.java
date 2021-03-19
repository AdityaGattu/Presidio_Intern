package Exception_Assignments;

//5. Write a class with a method that throws an exception of the type created in previous exercise. 
//Compile this without catch the exception 

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
public class Q5 {
	public static void main(String[] args) throws MyException{
		
		throw new MyException("my custom exception executed....");
			
		
	}
}

/*o/p:
 * Exception in thread "main" my custom exception executed....
	at Exception_Assignments.Q5.main(Q5.java:20)
*/

