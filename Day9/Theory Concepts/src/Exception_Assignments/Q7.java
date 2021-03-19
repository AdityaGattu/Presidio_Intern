package Exception_Assignments;

import java.util.Scanner;

//7. Write a program such that the user is repeatedly asked for the numerator and the divisor. 
//For each set of data, the program prints out the result or an informative error message if there 
//is a problem (division by zero or poor input data

public class Q7 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int quit=0;
		while(quit==0) {
			
			System.out.println("Enter -1 to quit and 0 to continue....");
			quit=s.nextInt();
			
			try {
				int num=s.nextInt();
				int div=s.nextInt();
				int res=num/div;
				System.out.println(res);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
	}
}

/*o/p:
 * Enter -1 to quit and 0 to continue....
0
7 9
0
Enter -1 to quit and 0 to continue....
0
8 8
1
Enter -1 to quit and 0 to continue....
0
78 9
8
Enter -1 to quit and 0 to continue....
0
9 0
java.lang.ArithmeticException: / by zero
Enter -1 to quit and 0 to continue....
*/
