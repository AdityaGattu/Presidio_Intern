package lab5;

//44. Write a program to swap two arrays without using temporary variable. 

import java.util.*;

public class q44 {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	
	int[] arr1=new int[n];
	int[] arr2=new int[n];
	
	for(int i=0;i<n;i++)
	{
		arr1[i]=s.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		arr2[i]=s.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		arr1[i]=arr1[i]+arr2[i];
		arr2[i]=arr1[i]-arr2[i];
		arr1[i]=arr1[i]-arr2[i];
	}
	
	System.out.println("swapped arrays: ");
	
	for(int i=0;i<n;i++)
	{
		System.out.print(arr1[i]+" ");
	}
	
	System.out.println();
	
	for(int i=0;i<n;i++)
	{
		System.out.print(arr2[i]+" ");
	}
}
	
}
/*
 * 5
2 5 6 7 1
3 7 9 5 1
swapped arrays: 
3 7 9 5 1 
2 5 6 7 1 
*/
