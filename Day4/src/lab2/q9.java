package lab2;

/*
  Create a class A. add public, private and protected member variable and methods.
  Create another class B which extends from A and add few members. 
  Try to access a private ,public and protected members of a base class
   within a class B. observe the result 
*/
class A{
	public int a;
	private int b;
	protected int c;
	
	public void meta() {
		System.out.println("metha ....");
	}
	
	private void metb() {
		System.out.println("methb ....");
		
	}
	
	protected void metc() {
		System.out.println("methc ....");
		
	}

}

class B extends A{
	int var;
	
	public B()
	{
		this.metc();
		this.meta();
		//this.metb();//not accessible since private
	}
	
	public void add()
	{
		var=a+c; //a,c accessible 
		//var=b;//b is private not accessible
	}

	
}
public class q9 {
	public static void main(String[] args) {
		
	}
	
}
