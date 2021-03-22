package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
	
	public ThreadDemo() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyThreadWork());
		es.shutdown();
	}
	public static void main(String[] args) throws Exception{
		
		new ThreadDemo();
		Thread t=Thread.currentThread();
		System.out.println(t);
		for(int i=0;i<5;i++) {
			System.out.println(i);
			t.sleep(1000);
			
		}
		
	}
}

class MyThreadWork implements Runnable{
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println("child thread called.......");
	}
}