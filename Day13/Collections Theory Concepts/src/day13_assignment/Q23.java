package day13_assignment;


import java.util.*;
class Dog 
{ 
	int size; 
	Dog(int s) 
	{ size = s; } 
}
public class Q23 {
	public static void main(String[] args) 
	{ 
		TreeSet<Integer> i = new TreeSet<Integer>(); 
		
		TreeSet<Dog> d = new TreeSet<Dog>();
		d.add(new Dog(1)); 
		d.add(new Dog(2)); 
		d.add(new Dog(1)); 
		i.add(1); i.add(2); 
		i.add(1); 
		System.out.println(d.size() + " " + i.size()); 
	} 
} 

/*
A. 1 2
B. 2 2 
C. 2 3 
D. 3 2 
E. 3 3 
F. Compilation fails 
G. An exception is thrown at runtime

optn G

Exception in thread "main" java.lang.ClassCastException: class day13_assignment.Dog cannot be cast to class java.lang.Comparable (day13_assignment.Dog is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.TreeMap.compare(TreeMap.java:1563)
	at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:768)
	at java.base/java.util.TreeMap.put(TreeMap.java:777)
	at java.base/java.util.TreeMap.put(TreeMap.java:534)
	at java.base/java.util.TreeSet.add(TreeSet.java:255)
	at day13_assignment.Q23.main(Q23.java:16)
*/
