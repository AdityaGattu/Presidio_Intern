package lab2;

//Write a program to change state of object using the final reference variable

class StateOfObj{
	
	private String name;
	
	public void setname(String s)
	{
		this.name=s;
	}
	
	public String getname()
	{
		return this.name;
	}
	
}
public class q7 {
	public static void main(String[] args) {
		
		final StateOfObj obj=new StateOfObj();
		obj.setname("aditya");
		//System.out.println(obj.getname());
		obj.setname("gattu");
		System.out.println(obj.getname());  // u can change state of object
		
//		StateOfObj obj1=new StateOfObj();
//		obj1.setname("aditya_gattu");
//		
//		StateOfObj obj2=new StateOfObj();
//		obj2.setname("adi");
//		
//		obj2=obj1;// allowed since not final 
//		System.out.println(obj2.getname()); //o/p=aditya_gattu
//		obj=obj1; // ->can't modified as define final only state of obj can be changed
	}
	
}

//o/p -> gattu