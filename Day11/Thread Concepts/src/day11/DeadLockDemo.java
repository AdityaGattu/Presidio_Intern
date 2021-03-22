package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class DeadLockDemo {
	public static void main(String[] args) {
		Crane crane=new Crane();
		Frog frog=new Frog();
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			crane.eat(frog);
		});
		es.execute(()->{
			frog.escape(crane);
		});
		
		es.shutdown();
	}
}
class Crane{
	synchronized public void eat(Frog frog) {
		System.out.println();
		frog.leaveCrane();
	}
	synchronized public void spitFrog() {
		
	}
}
class Frog{
	synchronized public void escape(Crane c) {
		c.spitFrog();
	}
	synchronized public void leaveCrane() {
		
	}
}
