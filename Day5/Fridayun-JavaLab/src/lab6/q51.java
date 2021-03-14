package lab6;
//51. Write a program to print the integer value using method
//     overriding and super keyword? 

class Base{
	
	int x;
	
	Base(int x){
		this.x=x;
	}
}

class Child extends Base{

	int y;
	Child(int x,int y) {
		super(x);
		this.y=y;
	}
	
	void display()
	{
		System.out.println("the integer x is: "+x);
		System.out.println("the integer y is: "+y);
		
	}
	
}

public class q51 {
	public static void main(String[] args) {
		
		Child c=new Child(7,5);
		c.display();
	}
}
/*o/p:
 * the integer x is: 7
the integer y is: 5
*/
