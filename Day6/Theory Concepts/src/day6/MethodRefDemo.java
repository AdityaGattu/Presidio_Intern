package day6;
public class MethodRefDemo {
	public MethodRefDemo() {
		// TODO Auto-generated constructor stub
	}
	String name="ramu";
	public void met1() {
		int i=10+10;
		System.out.println("The value of addition is...:"+i);
		System.out.println("Name..:"+name);
	}
	public MethodRefDemo(int i,String s) {
		System.out.println("The value of addition is...:"+(i+i));
		System.out.println("Name...:"+s);
	}
	public static String met3(String s) {
		return "The name is...:"+s;
	}
	public static void main(String[] args) {
		MyInter my1=new MethodRefDemo()::met1;  //non static method association
		my1.met();
		
		MyInter2 my2=MethodRefDemo::new; // this will point to the constructor....
		my2.met(10,"ramu");
		
		MyInter3 my3=MethodRefDemo::met3; // static method association..
		System.out.println(my3.met("ramu"));
				
	}
}	