package Assignment;

public class q23 {
	protected int i;
	
	public static void main(String[] args) {
		
		second obj=new second();
		obj.manipulate();
		
		q23 obj1=new q23();
		System.out.println(obj1.i);
	}

}

class second extends q23{
	
	public void manipulate()
	{
		i+=2;
		System.out.println(i);
	}
}