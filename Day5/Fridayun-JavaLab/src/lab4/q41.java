package lab4;

import java.util.Scanner;

/*41. Write a program to print the format below using nested for loop 
  1                                         0 
  2  3                                     0  0 
  4  5  6                                 0  0  0 
  7  8  9  10       and                0  0  0  0  0 
  */

public class q41 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		
		
		for(int i=1;i<=rows;i++)
		{
			int k=0;
			for(int space=1;space<=rows-i;space++)
			{System.out.print(" ");}
			while(k<((2*(i-1))+1))
			{
				System.out.print("0");
				k++;
			}
			System.out.println();
		}
		/*
		o/p:
			6
		     0
		    000
		   00000
		  0000000
		 000000000
		00000000000
		*/
		
		/*int cnt=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(cnt+" ");cnt++;
			}
			System.out.println();
		}
		5
		1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 */
	
	}
	
}

