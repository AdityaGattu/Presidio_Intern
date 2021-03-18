package day8;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class RefDemo2 {
	public static void main(String[] args) throws Exception{
		//Dynamic object creation.... this can be used as a replacement for NEW keyword
		//new keyword is static and Class.forName(...) is dynamic
		Demo d=(Demo)Class.forName("day8.Demo").getConstructor().newInstance();
		String result=d.test("ramu",30);
		System.out.println("The result is..:"+result);
		
		d=(Demo)Class.forName("day8.Demo").getConstructor(String.class).newInstance("hello");
		
		Class.forName("day8.Demo").getConstructor(int.class).newInstance(100);
		
		Field f[]=d.getClass().getFields();
		for(Field field:f) {
			System.out.println(field.getName());
		}
		Method m[]=d.getClass().getMethods();
		for(Method method:m) {
			System.out.println(method.getName());
		}
		
		//Method testMethod=d.getClass().getMethod("test",new Class[] {String.class,Integer.class});
		//result=(String) testMethod.invoke(d, new Object[] {"ramu",Integer.valueOf(20)});
		Method testMethod=d.getClass().getMethod("test", String.class,int.class);
		String res=(String)testMethod.invoke(d, "ramu",20);
		System.out.println("The result is..:"+res);
		
		Method parentMethod=d.getClass().getSuperclass().getDeclaredMethod("parent");
		parentMethod.setAccessible(true); 
		parentMethod.invoke(d);
	}
}
class DemoParent{
	private void parent() {
		System.out.println("parent method....");
	}
}
class Demo extends DemoParent{
	public String f1,f2,f3;
	public Demo() {
		System.out.println("Constructor without variable called...");
	}
	public Demo(String s) {
		System.out.println("Constructor with variable called...:"+s);
	}
	public Demo(int i) {
		System.out.println("Constructor with int variable called....:"+i);
	}
	public String test(String name,int age) {
		return "The name is...:"+name+" and age is..:"+age;
	}
}