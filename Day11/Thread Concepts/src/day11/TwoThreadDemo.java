package day11;

public class TwoThreadDemo {
	public static void main(String[] args){
		System.out.println("first line.....");
		//new Thread(()->{met();}).start();
		met();
		System.out.println("third line...");
		
	}
	
	static void met() {
		try{Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("second line...");
	
	}
}