package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SingleObjectTwoThreadsOneTask {
	public static void main(String[] args) {
		Gun bofors=new Gun();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			Thread.currentThread().setName("filler");
			for(int i=0;i<5;i++) {
				bofors.fill();
			}
		});
		
		es.execute(()->{
			Thread.currentThread().setName("shooter");
			for(int i=0;i<5;i++) {
				bofors.shoot();
			}			
		});		
		es.shutdown();		
	}
}
class Gun{
	boolean flag;
	synchronized public void fill() {
		if(flag) {
			try {
				//Thread.sleep(5000);
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("fill the gun..............");
		flag=true;
		notify();
	}
	
	synchronized public void shoot() {
		if(!flag) {
			try {
				//Thread.sleep(5000);
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("shoot the gun.....");
		flag=false;
		notify();//it will notify the  waiting filler thread inside the monitor
	}
	
}