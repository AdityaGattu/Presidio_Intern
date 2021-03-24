package Day4;

public class VariableDemo {
	//1. instance variable 2. class variable 3. local variable
	
		int i;//instance variable
		static int k;//class variable
		public void met() {
			int x;//local variable - these local variables are not initialized by default
			System.out.println(i);
			System.out.println(k);
		//	System.out.println(x);
			//you cannot declare static variables inside a method
			//static int k;
			
			
		}
		public static void main(String[] args) {
			ClassRoom kalamroom=new ClassRoom();
			ClassRoom einsteenroom=new ClassRoom();	
		}
	}
	class ClassRoom{
		static Canteen canteen=new Canteen();//class variable
		Projector projector=new Projector();//instance variable
	}
	//instance variable - multiple instances will be created...
	class Projector{
		public Projector() {
			System.out.println("Projector object created...");
		}
	}
	//class variable - only one instance of this will be created..
	class Canteen{
		public Canteen() {
			System.out.println("canteen object created....");
		}

}
