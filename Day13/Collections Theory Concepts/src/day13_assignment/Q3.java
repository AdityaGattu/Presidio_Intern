package day13_assignment;

import java.util.*;

/*3. Given: public static void before()
 *  { Set set = new TreeSet(); set.add("2"); 
 *  set.add(3); set.add("1"); 
 *  Iterator it = set.iterator(); 
 *  while (it.hasNext()) System.out.print(it.next() + " ");
 *   } Which statements are true? 
 
		A. The before() method will print 1 2 
		B. The before() method will print 1 2 3 
		C. The before() method will print three numbers, but the order cannot be determined 
		D. The before() method will not compile 
		E. The before() method will throw an exception at runtime
 */
public class Q3 {
	public static void main(String[] args) {
			Set set = new TreeSet(); 
			set.add("2"); 
			set.add(3); 
			set.add("1"); 
			Iterator it = set.iterator(); 
			while (it.hasNext())
			System.out.print(it.next() + " ");
		 
	}

}

/* O/P : opt:e
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
at java.base/java.lang.Integer.compareTo(Integer.java:64)
at java.base/java.util.TreeMap.put(TreeMap.java:806)
at java.base/java.util.TreeMap.put(TreeMap.java:534)
at java.base/java.util.TreeSet.add(TreeSet.java:255)
at day13_assignment.Q3.main(Q3.java:21)
*/
