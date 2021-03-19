package Exception_Assignments;

import java.util.Scanner;

//8. Write a Program to take care of Number Format Exception if user enters values other that 
//integer for calculating average of marks ten students. Do not allow program to terminate 
//but again continue with the program after giving respective message to User

public class Q8 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int cnt=0;
		int total=0;
		while(cnt<3) {
			System.out.println("Enter the marks of student......");
			
			try {
				String n=s.next();
				total+=Integer.parseInt(n);
				cnt++;
			}
			catch(NumberFormatException e) {
				System.out.println("Exception is .."+e);
			}
			
		}
		System.out.println("AVERAGE IS: "+(total/3));
	}
	
}

/* o/p:
Enter the marks of student......
45
Enter the marks of student......
r
Exception is ..java.lang.NumberFormatException: For input string: "r"
Enter the marks of student......
67
Enter the marks of student......
69
AVERAGE IS: 60
*/
