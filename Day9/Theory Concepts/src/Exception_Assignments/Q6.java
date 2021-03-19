package Exception_Assignments;

/*6. Write a program to check whether a derived class constructor can catch exception thrown by base class constructor
 * */

public class Q6{
	public static void main(String[] args) {
		Derived d=new Derived();
	}
}

class Base{
	Base(){
		System.out.println("Base class Constructor called.......");
		throw new ArrayIndexOutOfBoundsException();
	}
	
}

class Derived extends Base{
	
	public Derived() {
		try {
			System.out.println("Derived class constructor called.....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

/* o/p:
Base class Constructor called.......
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
	at Exception_Assignments.Base.<init>(Q6.java:15)
	at Exception_Assignments.Derived.<init>(Q6.java:22)
	at Exception_Assignments.Q6.main(Q6.java:8)
*/