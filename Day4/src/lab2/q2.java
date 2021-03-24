package lab2;

//Write a program to add two complex number using this reference 

class ComplexNumber{
	int a,b;
	
	ComplexNumber(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void add(ComplexNumber no)
	{
		this.a+=no.a;
		this.b+=no.b;
	}
	
	public void display()
	{
		System.out.println("Result : "+this.a+"+i"+this.b);
	}
	
}
public class q2 {

	public static void main(String[] args) {
		
		ComplexNumber no1=new ComplexNumber(4,5);
		no1.display();
		ComplexNumber no2=new ComplexNumber(2,3);
		no2.display();
		
		no1.add(no2);
		no1.display();
	}
	
}

/*o/p
 * Result : 4+i5
Result : 2+i3
Result : 6+i8
*/
