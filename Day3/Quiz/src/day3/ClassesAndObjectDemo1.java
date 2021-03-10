package day3;

public class ClassesAndObjectDemo1 {

	public static void main(String[] args) {
		Employee emp;//no object is created, only variable reference is created.....
		new Employee();//orphan object with no variable reference...
		Employee e=new Employee("hjhjhjhj");
		e.setName("ramu");
		System.out.println(e.getName());
		//dynamically java identifies
		//VMI - virtual method invocation or dynamic method invocation - polymorphism
		e.met();
		e.met(100);
	}
}
class Employee{
	//constructor overload or method overload....
	public Employee() {
		System.out.println("cons called...");
	}
	public Employee(String s) {
		System.out.println("Parametric constructor called...");
	}
	String name;//instance variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;//this always refers to instance variable....
	}
	//overloaded methods....
	//overloaded methods access specifier can change...
	//overloaded method return type can change....
	//you cannot change the method name-if you change it is not overloading then
	//parameter compulsory to be different
	 int met() {
		System.out.println("no param method called...");
		return 1;
	}
	public void met(int i) {
		System.out.println("param method called.....");
	}

}
