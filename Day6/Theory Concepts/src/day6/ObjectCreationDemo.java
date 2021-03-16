package day6;
public class ObjectCreationDemo {
	public static void main(String[] args)throws Exception {
		MyBusinessLogic myb=MyBusinessLogic.createObject();
		myb.str="first object...";
		MyBusinessLogic myb2=MyBusinessLogic.createObject();
		myb2.str="second object...";
		
		System.out.println(myb.str);
	}
}
class MyBusinessLogic implements Cloneable{
	String str;
	private MyBusinessLogic() {
		System.out.println("cons called...");		
	}
	private static MyBusinessLogic myb;
	synchronized public static MyBusinessLogic createObject() throws Exception{
		if(myb==null) {
			myb=new MyBusinessLogic();
		}
		return myb.createClone();		
	}
	public  MyBusinessLogic createClone()throws Exception {	
			return (MyBusinessLogic)super.clone();		
	}
}
//My Resources are shared but still properties are unique...