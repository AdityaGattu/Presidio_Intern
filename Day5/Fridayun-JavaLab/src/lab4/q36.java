package lab4;

//36. Write a program for palindrome using while loop? 
//(write for both string and numbers) 

import java.util.*;

public class q36 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String s1=s.nextLine();
		int start=0;
		int end=s1.length()-1;
		
		char[] c=s1.toCharArray();
		
		int f=0;
		while(start<=end) {
			
			if(c[start]==c[end])
			{	start++;
				end--;
			}
			else {
				f=1;break;
			}
		}
		if(f==0)System.out.println("Palindrome");
		else {System.out.println("Not a Palindrome");}
		
	}

}
//o/p:
//aditida
//Palindrome
