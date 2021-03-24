package lab2;

/* Create two classes, A and B, with default constructors 
 * (empty argument lists) that announce themselves. 
 * Inherit a new class called C from A, and create a member B inside C. 
 * Do not create a constructor for C.
 *  Create an object of class C and observe the results
 */
class A{

	A(){
		
	}
}
class  B{
	B(){
		
	}
}
class C extends A{
	
	B objb=new B();
}
public class q10 {
	public static void main(String[] args) {
		
		C obj=new C();
	}

}
