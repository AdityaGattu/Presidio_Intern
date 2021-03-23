package day12;

public class EnumDemo {
	public static void main(String[] args) {
//		Cars c;
//		c=Cars.honda;
//		met(c);
		Cars cc[]=Cars.values();
		for(Cars cars:cc) {
			System.out.println(cars +" Prize is...:"+cars.getPrize());
		}
		
	}	
	public static void met(Cars c) {
		switch(c) {
		case maruthi:{
			System.out.println("The car is maruti.........");
			break;
		}
		case suzuki:{
			System.out.println("its suzuki...........");
			break;
		}
		default:{
			System.out.println("default...........ambi");
		}
		}
	}
}
enum Cars{
	maruthi(1000),suzuki,honda,nissan;
	int prize;
	Cars(){
		System.out.println("cons called....");
	}
	Cars(int prize){
		System.out.println("The prize of the car is..:"+prize);	
		this.prize=prize;
	}
	public int getPrize() {
		return this.prize;
	}
}

/*o/p:
The prize of the car is..:1000
cons called....
cons called....
cons called....
maruthi Prize is...:1000
suzuki Prize is...:0
honda Prize is...:0
nissan Prize is...:0*/