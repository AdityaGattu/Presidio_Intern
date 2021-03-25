package day13_assignment;

import java.util.HashMap;
import java.util.Map;

/*
 * . Given: import java.util.*; 
 * class MapEQ { public static void main(String[] args) 
 * { 
 * 		Map<ToDos, String> m = new HashMap<ToDos, String>(); 
 * 		ToDos t1 = new ToDos("Monday"); ToDos t2 = new ToDos("Monday");
 * 	    ToDos t3 = new ToDos("Tuesday"); m.put(t1, "doLaundry"); 
 * 		m.put(t2, "payBills");
 * 		m.put(t3, "cleanAttic"); 
 * 		System.out.println(m.size()); 
 * 		}
 * 	} 
 * class ToDos{ 
 * String day; ToDos(String d) 
 * { day = d; } public boolean equals(Object o) 
 * { return ((ToDos)o).day == this.day; } 
 * // public int hashCode() { return 9; } } 
 */
public class Q5 {
	public static void main(String[] args) 
		  { 
		  		Map<ToDos, String> m = new HashMap<ToDos, String>(); 
		 		ToDos t1 = new ToDos("Monday"); 
		 		ToDos t2 = new ToDos("Monday");
		  	    ToDos t3 = new ToDos("Tuesday"); 
		  	    m.put(t1, "doLaundry"); 
		 		m.put(t2, "payBills");
		  		m.put(t3, "cleanAttic"); 
		  		System.out.println(m.size()); 	
		 } 
}
class ToDos{
	String day; 
	ToDos(String d) {
		 day = d;
	}
	public boolean equals(Object o) 
	 { return ((ToDos)o).day == this.day; } 
	
	 //public int hashCode() { return 9; } 
}

/*
 * A. As the code stands it will not compile 
 * B. As the code stands the output will be 2 
 * C. As the code stands the output will be 3 
 * D. If the hashCode() method is uncommented the output will be 2 
 * E. If the hashCode() method is uncommented the output will be 3 
 * F. If the hashCode() method is uncommented the code will not compile 
 */

//O/p : 3 -> with comments
     // 2-> without comments hence optns:b,d