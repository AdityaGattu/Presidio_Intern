package day2;

import day3.AccessDemo;
/*
 * private - class scope
 * no_modifier- package scope
 * protected - relation (inheritance) scope
 * public - global scope
 */

public class AccessDemoAnotherPackNonSubClass {
	AccessDemo obj=new AccessDemo();
	//obj is not the object - it is just reference or name
	//what is object here - the object is AccessDemo object.
	public void display() {
		System.out.println(obj.pub);
		//System.out.println(obj.pri);
		//System.out.println(obj.pro);
		//System.out.println(obj.nomod);
	}
}
