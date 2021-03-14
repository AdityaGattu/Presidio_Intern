package lab4;

//37. Write a program to find sum of digits of a number

import java.util.*;

public class q37 {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n>0) {
			int last=n%10;
			sum+=last;
			n=n/10;
		}
		System.out.println("sum is: "+sum);
 }
}

/*o/p:
4567
sum is: 22
*/
