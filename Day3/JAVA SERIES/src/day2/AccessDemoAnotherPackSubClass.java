package day2;

import day3.AccessDemo;
//private - class scope
//nomodifier - package scope

public class AccessDemoAnotherPackSubClass extends AccessDemo{
	public void display() {
		System.out.println(pub);
		//System.out.println(pri);
		System.out.println(pro);
		//System.out.println(nomod);
	}
}
