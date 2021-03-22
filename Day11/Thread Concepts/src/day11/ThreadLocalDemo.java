package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadLocalDemo {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			Resource r=ThreadLocalUtility.getResource("first");
			System.out.println(r);
			//ThreadLocalUtility.closeResource();
			r=ThreadLocalUtility.getResource("first first");
			System.out.println(r);
		});
		
		es.execute(()->{
			Resource r=ThreadLocalUtility.getResource("second");
			System.out.println(r);
		 r=ThreadLocalUtility.getResource("second second");
			System.out.println(r);
		});
		
		es.shutdown();
	}
}
class ThreadLocalUtility{
	private static ThreadLocal tLocal=new ThreadLocal();
	synchronized public static Resource getResource(String name){
		Resource r=(Resource)tLocal.get();
		if(r==null) {			
			r=new Resource(name);
		//	try {Thread.sleep(2000);}catch(Exception e) {}
			tLocal.set(r);
		}
		r.name=name;
		return r;
	}
	public static void closeResource() {
		Resource r=(Resource)tLocal.get();
		if(r!=null) {
			tLocal.remove();
		}
	}
}
class Resource{
	String name;
	public Resource(String name) {
		System.out.println("Resource Object created...");
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}