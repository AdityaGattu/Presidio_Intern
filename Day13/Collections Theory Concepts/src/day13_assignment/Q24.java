package day13_assignment;

import java.util.*; 
public class Q24 
{
	public static void main(String[] args) 
	{ 
		String[] s = {"map", "pen", "marble", "key"}; 
		Othello o = new Othello(); 
		Arrays.sort(s,o); 

		for(String s2: s) System.out.print(s2 + " "); 
		System.out.println(Arrays.binarySearch(s, "map"));
} 

static class Othello implements Comparator<String> 
{ 
	public int compare(String a, String b) 
	{ return b.compareTo(a); } 
	} 
} 

//A. Compilation fails 
//B. The output will contain a 1 
//C. The output will contain a 2 
//D. The output will contain a –1 
//E. An exception is thrown at runtime 
//F. The output will contain "key map marble pen" 
//G. The output will contain "pen marble map key" 
//o/P:
//pen marble map key -1