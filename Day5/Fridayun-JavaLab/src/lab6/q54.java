package lab6;

//54. Write a simple interface program to print an integer value 
//using access implementation through interface      references? 

interface MyInterface{
	
	//compiler will treat them as: 
    //public abstract void method1();
	
	//int method(int x); ->also works....
	void method(int x);
	
}

class Demo implements MyInterface{
	
	@Override
	public void method(int x) {
		System.out.println("the integer is: "+x);
		//return x;
	}
}

public class q54 {
	public static void main(String[] args) {
		
		MyInterface i=new Demo(); // reference i points to demo object
		i.method(55);
		
	}
	
}

//o/p:
//the integer is: 55
