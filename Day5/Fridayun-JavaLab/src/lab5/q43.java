package lab5;

//43. Write a program to find Biggest and Lowest element of an array
import java.util.*;

public class q43 {

	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	ArrayList arr=new ArrayList<>();
	
	int n=s.nextInt();
	
	for(int i=0;i<n;i++)
	{
		arr.add(s.nextInt());
	}
	
	System.out.println("Maximum element : " + Collections.max(arr));

	System.out.println("Maximum element : " + Collections.min(arr));
	}
}
/*
 * 5
67 23 45 11 98 
Maximum element : 98
Maximum element : 11
*/
