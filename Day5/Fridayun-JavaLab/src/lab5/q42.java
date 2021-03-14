package lab5;

import java.util.*;
//42. Write a program to print array elements in reverse order. 

public class q42 {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	ArrayList arr=new ArrayList<>();
	
	int n=s.nextInt();
	
	for(int i=0;i<n;i++)
	{
		arr.add(s.nextInt());
	}
	
	System.out.println("reversed array: ");
	
	for(int i=0;i<n;i++)
	{
		System.out.print(arr.get(i)+" ");
	}
	
}
}

/*
 * 5
4 6 8 3 1
reversed array: 
4 6 8 3 1 
*/
