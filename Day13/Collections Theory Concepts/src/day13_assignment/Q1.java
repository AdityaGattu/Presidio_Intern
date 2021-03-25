package day13_assignment;

import java.util.ArrayList;
import java.util.*;

/*
 * 1. Given: public static void main(String[] args) 
 * { // INSERT DECLARATION HERE for (int i = 0; i <= 10; i++) 
 * { List<Integer> row = new ArrayList<Integer>(); 
 * for (int j = 0; j <= 10; j++) row.add(i * j); table.add(row); 
 * } for (List<Integer> row : table) System.out.println(row); 
 * } 
 * Which statements could be inserted at // INSERT DECLARATION HERE to allow this
 *  code to compile and run? (Choose all that apply). 
 
A. List<List<Integer>> table = new List<List<Integer>>(); 
B. List<List<Integer>> table = new ArrayList<List<Integer>>();
C. List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
D. List<List, Integer> table = new List<List, Integer>(); 
E. List<List, Integer> table = new ArrayList<List, Integer>();
F. List<List, Integer> table = new ArrayList<ArrayList, Integer>(); 
G. None of the above 
 */
public class Q1 {
	public static void main(String[] args) {
		List<List<Integer>> table = new ArrayList<List<Integer>>(); 
		for (int i = 0; i <= 10; i++)
		{ 
			List<Integer> row = new ArrayList<Integer>(); 
			for (int j = 0; j <= 10; j++) 
				row.add(i * j);
			table.add(row); 
		} 
		for (List<Integer> row : table) 
			System.out.println(row); 
		
	}

}

/* o/p : ans b;
 * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
[0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30]
[0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40]
[0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
[0, 6, 12, 18, 24, 30, 36, 42, 48, 54, 60]
[0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70]
[0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80]
[0, 9, 18, 27, 36, 45, 54, 63, 72, 81, 90]
[0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
*/
