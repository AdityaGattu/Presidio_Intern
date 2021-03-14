package lab6;
import java.util.*;

//48. Write the above (47) program using overloading constructors?  

public class q48 {

    q48(int a)
	{
		System.out.println("constructer1 called..."+a);
	}
	
    q48(float a)
	{
		System.out.println("constructer2 called..."+a);
	}
	
	public static void main(String[] args) {
	
		q48 obj=new q48(7);
		q48 obj1=new q48(7.6f);
		
	}
}

/* o/p :
constructer1 called...7
constructer2 called...7.6
*/