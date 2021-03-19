package Exception_Assignments;

import java.util.Scanner;

public class Q7_a_b {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter numerator and denominator.......");
			String num=s.next();
			String div=s.next();
			
			if(num.equals("q")|| num.equals("Q"))break;
			
			try {
				
				int res=Integer.parseInt(num)/Integer.parseInt(div);
				System.out.println(res);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

/* o/p:
Enter numerator and denominator.......
45 
7
6
Enter numerator and denominator.......
345 
7
49
Enter numerator and denominator.......
q
t
*/