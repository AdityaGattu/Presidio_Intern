package day6;
import java.util.Scanner;
public class KhaitanDemo {
public static void main(String[] args) {
	Khaitan khaitan=new Khaitan();
	while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter to pull the chain...");
		scan.next();
		khaitan.pull();
	}
}
}
class Khaitan{
	private State state;
	public final void setState(State state) {
		this.state = state;
	}
	public Khaitan() {
		this.state=new SwitchOffState();
	}
	
	public void pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract void pull(Khaitan khaitan);
}
class SwitchOffState extends State{
	
	@Override
	public void pull(Khaitan khaitan) {
		System.out.println("switch on state.................");
		khaitan.setState(new LowSpeedState());
	}
}
class LowSpeedState extends State{
	@Override
	public void pull(Khaitan khaitan) {
		System.out.println("low speed state....");
		khaitan.setState(new MediumSpeedState());
	}
}
class MediumSpeedState extends State{
	@Override
	public void pull(Khaitan khaitan) {
		System.out.println("Medium speed state....");
		khaitan.setState(new HighSpeedState());
	}
}
class HighSpeedState extends State{
	@Override
	public void pull(Khaitan khaitan) {
		System.out.println("high speed state.....");
		khaitan.setState(new SwitchOffState());
	}
}