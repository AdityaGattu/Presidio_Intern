package day3;

public class AccessDemo {

	//instance variables...those variables which are declared inside a class
	//by default instance variables are initialized to there default values..
	
	public int pub;
	private int pri;
	protected int pro;
	int nomod; //modifier
	
	public void display() {
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(nomod);
	}
}
class AccessDemoSub extends AccessDemo{
	public void display() {
		System.out.println(pub);
		//System.out.println(pri);
		System.out.println(pro);
		System.out.println(nomod);
	}
}
class AccessDemoNonSub{
	AccessDemo obj=new AccessDemo();
	//obj is not the object - it is just reference or name
	//what is object here - the object is AccessDemo object.
	public void display() {
		System.out.println(obj.pub);
		//System.out.println(obj.pri);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
	}
}
