package day9;
import java.util.Scanner;
public class ExceptionHandlingDemo {
	public static void main(String[] args) throws Exception{
		Dog dog=new Dog();
		Child child=new Child();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the item class..:");
		String itemClass=scan.next();
		Item ic=(Item)Class.forName(itemClass).getConstructor().newInstance();
		child.playWithDog(dog, ic);
	}
}
abstract class DogExceptions extends Exception{
	public abstract void visit(Handler911 handler911);
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}	
	@Override
	public void visit(Handler911 handler911) {
		handler911.handle(this);
	}
}
class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	@Override
	public void visit(Handler911 handler911) {
		handler911.handle(this);
	}
}
class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return this.msg;
	}
	@Override
	public void visit(Handler911 handler911) {
		handler911.handle(this);
	}
}
abstract class Item{
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public abstract void execute()throws DogExceptions;
}
class StickItem extends Item{
	public StickItem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute()throws DogExceptions {
		throw new DogBiteException("you beat i bite.....");
	}
}
class StoneItem extends Item{
	public StoneItem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() throws DogExceptions {
		throw new DogBarkException("you throw I bark.....");
	}
}
class BiscuitItem extends Item{
	public BiscuitItem() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute() throws DogExceptions {
		throw new DogHappyException("I love biscuits........");
	}
}
class Dog{
	public void play(Item item) throws DogExceptions{
		item.execute();
	}
}
class Child {
	public void playWithDog(Dog dog,Item item) {
		try {
			dog.play(item);
		}catch(DogExceptions de) {
			de.visit(new Handler911Impl());
		}
	}
}
//To handle exception - you should write a seperate handler class
interface Handler911{
	public void handle(DogBiteException dbe);
	public void handle(DogBarkException dre);
	public void handle(DogHappyException dre);
}
class Handler911Impl implements Handler911{
	@Override
	public void handle(DogBarkException dre) {
		System.out.println("handling logic is written....dont worry...it is just barking......");
	}
	@Override
	public void handle(DogBiteException dbe) {
		System.out.println("ambulance is on the way...........dont be panic..........");
	}
	@Override
	public void handle(DogHappyException dhe) {
		System.out.println("the dog is happy,, enjoying the biscuits......");
	}
}

/*o/p:
Please enter the item class..:
day9.BiscuitItem
the dog is happy,, enjoying the biscuits......
*/