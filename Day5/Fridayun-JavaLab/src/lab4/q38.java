package lab4;
//38. Write a program for Fibonacci series  
import java.util.*;

public class q38 {
	
	public static int fib(int n) {
		if (n==0 || n==1 )
				return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
}

/* o/p:
 * 6
0 1 1 2 3 5 */
