package lab4;

import java.util.*;

// 34. Write a program to find average of odd number below range? 

public class q34 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		
	}
}

/*o/p:
44 77
45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 
*/