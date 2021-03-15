package day6;
import java.util.Scanner;
public class ShaitanDemo {
	public static void main(String[] args) {
		Shaitan shaitan=new Shaitan();
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter to pull the chain...");
			scan.next();
			shaitan.pull();
		}
	}
}
class Shaitan{
	int state=0;
	public void pull() {
		switch(state) {
		case 0:{
			System.out.println("switch on state....");
			state=1;
			break;
		}
		case 1:{
			System.out.println("medium speed state....");
			state=2;
			break;
		}
		case 2:{
			System.out.println("high speed state.....");
			state=3;
			break;
		}
		case 3:{
			System.out.println("switch off state....");
			state=0;
			break;
		}
		}
	}
}