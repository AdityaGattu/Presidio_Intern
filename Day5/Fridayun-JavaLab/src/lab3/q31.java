package lab3;

//31. Write a program for four-function calculator 
//using switch case?(add,sub,mul,div) 
import java.util.*;

public class q31 {
	
	public static int calculator(int a,int b,char c) {
		
		switch(c) {
		case '+': return a+b;
		case '-': return a-b;
		case '*': return a*b;
		case '/': return a/b;
		default: return -1;
		
		}
	}
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 nos");
		int a=s.nextInt();
		int b=s.nextInt();
		char c=s.next().charAt(0); // first char in word read
		System.out.println(calculator(a,b,c));
		
	}
}

/* o/p : 
Enter 2 nos
50 30 -
20
*/