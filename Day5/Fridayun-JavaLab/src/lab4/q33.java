package lab4;

//33. Write a program to find even number up to range? 
import java.util.*;

public class q33 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}

/*o/p:
34 78
34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 
*/