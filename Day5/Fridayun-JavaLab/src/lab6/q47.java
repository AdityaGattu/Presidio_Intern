package lab6;
import java.util.*;

//47. Write a program for arithmetic operation using method overloading? 

public class q47 {

	void overloadadd(int a)
	{
		System.out.println("overloadmet1 called..."+a);
	}
	
	void overloadadd(float a)
	{
		System.out.println("overloadmet2 called..."+a);
	}
	
	public static void main(String[] args) {
	
		q47 obj=new q47();
		obj.overloadadd(5);
		obj.overloadadd(7.7f);
		
	}
}
/*o/p
 * overloadmet1 called...5
overloadmet2 called...7.7
*/
