package lab2;

/* Modify above Exercise  so that A and B have constructors with arguments 
 * instead of default constructors. 
 * Write a constructor for C and perform all initialization within C’s constructor.
 */
class A{
	int a;

	A(int a){
		this.a=a;
	}
}
class  B{
	int b;
	B(int b){
		this.b=b;
	}
}
class C extends A{
	
	C()
	{
		super(100);
		B objb=new B(50);
	}
}

public class q11 {

	public static void main(String[] args) {
		
		C obj=new C();
	}
	
}
