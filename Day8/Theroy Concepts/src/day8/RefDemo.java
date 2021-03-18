package day8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefDemo {

	public static void main(String[] args) throws Exception{
		PoliceStation p1=new PoliceStation();
		Politician rana=new Politician();
		p1.arrest(rana);
		
		//Doctor prakash=new Doctor();
	}
}

class PoliceStation{
	public void arrest(Object p) throws Exception{
		
		//Politician pol=(Politician)p;
		//System.out.println(pol.name);
		//pol.doWork(); ->not good practice for type casting object
		
		
		//interrogation
		Class c=p.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(p));
		
		Method m=c.getMethod("doWork");
		m.invoke(p);
		
		Field f1=c.getDeclaredField("secretname");
		f1.setAccessible(true);
		System.out.println(f1.get(p));
		
		Method m1=c.getDeclaredMethod("secretWork");
		m1.setAccessible(true);
		m1.invoke(p);
	}
}

class Politician{
	
	public String name="sam";
	private String secretname="theif";
	
	public void doWork() {
		System.out.println("I do social work...........");
	}
	private void secretWork() {
		System.out.println("I trouble people and steal there money....");
	}
		
}

//class Doctor{
	
//}