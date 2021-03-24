package Day4;

public class StaticDemo {
	int i;
	public static void main(String[] args) {
		System.out.println("main method executed...");
		//main(new int[] {1,2,3});
		//StaticDemo obj=new StaticDemo();
		//obj.main(new char[] {'c','d'});
		A.met();
		A.met2();
	}
	
	public static void main(int a[]) {
		//static methods cannot use super and this keyword
		//super.toString();
		//this.i=10;
	
	}
	
	public void main(char c[]) {
		super.toString();
		this.i=10;
		//non static method can call static methods without creating a object
		main(new int[] {1,2,3});
		//A.met();//static methods of another class should be always called using the class name.
	}
}
//static block is used for initializing , and remember it gets called only once...like constructor
class A{
	static {
		System.out.println("static block called...");
	}
	public A() {
		System.out.println("cons called for A");
	}
	static int i;
	public static void met() {
		System.out.println("met method called....");
	}
	public static void met2() {
		System.out.println("met2222222222222 method called....");
	}
	
}
//static methods are always loaded by the jvm by default
//static methods can call another static method without creating the object of the class
//non static methods, since they are not in memory, they cannot be called directly
//To call non static methods, u have to create a object of the class
//static methods cannot have or use keywords "this and super"
