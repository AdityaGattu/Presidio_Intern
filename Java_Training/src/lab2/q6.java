package lab2;

//Write a program to prove the order of initialization for static block

class StaticCls {
	
	static {
		System.out.println("Static block called...");
	}
	
	StaticCls()
	{
		System.out.println("StaticCls constructer called....");
	}
	
}
public class q6 {
	public static void main(String[] args) {

		StaticCls sc=new StaticCls();
	}
}

/* o/p
Static block called...
StaticCls constructer called....
*/