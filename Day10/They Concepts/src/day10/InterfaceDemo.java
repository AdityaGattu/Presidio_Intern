package day10;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class InterfaceDemo {
	public static void main(String[] args) {
		Object obj=new AImpl();
		
		Importer importObj=(Importer)obj;
		importObj.testA();
		
		Exporter exportImplObj=new ExporterImpl();
		obj=Proxy.newProxyInstance(importObj.getClass().getClassLoader(),
				new Class[] {Importer.class,Exporter.class,MegaExporter.class},
				new MyInvocationHandler(new Object[] {importObj,exportImplObj}));
		
		Importer iObj=(Importer)obj;
		
		Exporter eObj=(Exporter)obj;
		
		MegaExporter mObj=(MegaExporter)obj;
		
		iObj.testA();
		eObj.doExport();
		String result=mObj.doMegaExport("mega export...");
		System.out.println("The result....is..:"+result);
		
	}
}
class MyInvocationHandler implements InvocationHandler{
	Object obj[];
	public MyInvocationHandler(Object obj[]) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnObj=null;
		for(Object o:obj) {
			Method m[]=o.getClass().getDeclaredMethods();
			for(Method met:m) {
				if(met.getName().equals(method.getName())) {
					met.setAccessible(true);
					returnObj=method.invoke(o, args);
				}
			}
		}
		return returnObj;
	}
}
interface Importer{
	public void testA();
}
class AImpl implements Importer{
	@Override
	public void testA() {
		System.out.println("test a is called....");
	}
}
interface Exporter{
	public void doExport();
}
interface MegaExporter{
	public String doMegaExport(String data);
}
class ExporterImpl implements Exporter,MegaExporter{
	@Override
	public void doExport() {
		System.out.println("do export method called....");
	}
	@Override
	public String doMegaExport(String data) {
		return "return value is..................:"+data;
	}
}

/* o/p :
test a is called....
test a is called....
do export method called....
The result....is..:return value is..................:mega export...
*/