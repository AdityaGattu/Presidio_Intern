package pack1;

public class q25 {
	public static void main(String[] args) {
		Integer ten=new Integer(10); 
		Long nine=new Long (9);
		System.out.println(ten + nine); 
		int i=1;
		System.out.println(i + ten);
	}

	/*

What will happen if you attempt to compile and run the following code? 
Integer ten=new Integer(10); 
Long nine=new Long (9);
System.out.println(ten + nine); 
int i=1;
System.out.println(i + ten);
1) 19 followed by 20 
2) 19 followed by 11 
3) Error: Can't convert java lang Integer 
4) 10 followed by 1 

Objective 2.2 
3) Error: Cant convert java lang Integer 
The wrapper classes cannot be used like primitives. 
Wrapper classes have similar names to primitives but all start with upper case letters. 
Thus in this case we have int as a primitive and Integer as a wrapper. 
The objectives do not specifically mention the wrapper classes but don't be surprised 
if they come up. 

	 */
}
