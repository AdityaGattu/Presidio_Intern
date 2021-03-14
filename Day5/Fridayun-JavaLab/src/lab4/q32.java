package lab4;

import java.util.Scanner;

//32. Write a program to determine given number is prime or not? 

public class q32 {

	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	if(n==0) {System.out.println("neither Composite nor Prime");}
	if(n==1) {System.out.println("Composite");}
	int flag=0;
	for(int i=2;i<=Math.sqrt(n);i++) {
		
		if(n%i==0) {flag=1;System.out.println("Composite");}
	}
	if(flag==0) {System.out.println("Prime");}
}

}

/*o/p:
67
Prime
*/