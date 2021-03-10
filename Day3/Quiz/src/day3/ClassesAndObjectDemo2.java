package day3;

public class ClassesAndObjectDemo2 {
	public static void main(String[] args) {
		LeatherShoe shoe=new LeatherShoe();
		shoe.met(2);
		shoe.leatherMethod();
	}
}
class A{
	public A() {
		System.out.println("a cons called....");
	}
}
class Shoe extends A{
	public Shoe() {
		
	}
	public Shoe(int i) {
		System.out.println("shoe cons called...");
	}
	
	//final declared methods cannot be overriden
	//final
	protected void met(int i) {
		System.out.println("met of shoe called...");
	}
}
//inheritance - Kind of Relationship  - java does not support multiple inheritance but it supports multi level inheritance
class LeatherShoe extends Shoe{
	public void leatherMethod() {
		
	}
	public LeatherShoe() {
		super(10);//this super will invoke the parent class contructor and remember this should be the first line
		System.out.println("leather shoe cons called...");
	}
	//overriding
	//changing the method name or method parameters will not amount to overriding
	//the parameters and the method name both should be same
	//you cannot change the return type
	//you can increase the visibility but you cannot decrease the visibility
	//override annotation checks whether the method below is declared in the parent class or not
	//if not declared it will throw a error.
	@Override
	public void met(int i) {		
		System.out.println("met of leathershoe called...");
		super.met(10);//super is a keyword - use to invoke the parent method....
	}
}
