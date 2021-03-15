package day6;
public class LambdaDemo {
	public static void main(String[] args) {
		String name="RajaRani";
		MyInter myInter=()->{
			int i=10+10;
			System.out.println("The value of addition is...:"+i);
			System.out.println("Name..:"+name);
		};
		//myInter.met();
		new LambdaDemo().myMethod(myInter);
		
		MyInter2 myInter2=(int i,String s)->{
			System.out.println("The value of addition is...:"+i+i);
			System.out.println("Name...:"+s);
		};
		myInter2.met(10,"ramuramu");
		
		MyInter3 myInter3=(s)->{
			return "The name is...:"+s;
		};
		
		System.out.println(myInter3.met("ramu"));
	}
	
	public void myMethod(MyInter myI) {
		System.out.println("my method is called........");
		myI.met();
	}
}
@FunctionalInterface  // this interface should have only one method....
interface MyInter{
	public void met();
}
interface MyInter2{
	public void met(int i,String s);
}
interface MyInter3{
	public String met(String s);
}