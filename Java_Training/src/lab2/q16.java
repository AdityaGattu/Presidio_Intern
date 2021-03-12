package lab2;

public class q16 {

	public static void main(String[] args) {
		
	}
}

class X 
{ 
	void do1() { }
} 
class Y extends X
{ 
	void do2() { }
} 

class Chrome 
{  public static void main(String [] args) 
	{  X x1 = new X(); 
	X x2 = new Y();  
	Y y1 = new Y(); 
	//(Y)x2.do2();
	((Y)x2).do2(); //->required change
	}  
}