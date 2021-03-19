package Exception_Assignments;

import java.util.Scanner;

//9. In the same Program write your own Exception classes to take care of Negative values and values 
//out of range (i.e. other than in the range of 0-100) and do not allow program to terminate give the 
//message depending upon the wrong input submitted by the user. 

public class Q9 {
	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		int cnt=0;
		int total=0;
		while(cnt<3) {
			System.out.println("Enter the marks of student......");
			
			try {
				String n=s.next();
				int num=Integer.parseInt(n);
				if(num<0)
					throw new NegitivenumException("negtive no should not be given.......");
				
				if(num>100)
					throw new OutOfRangeException("no can't be given greater than 100.......");
				total+=num;
				cnt++;
			}
			catch(NumberFormatException e) {
				System.out.println("Exception is .."+e);
			}
			
		}
		System.out.println("AVERAGE IS: "+(total/3));
		
	}
}

class NegitivenumException extends Exception{
	
	String str;
	public NegitivenumException(String str) {
		this.str=str;
	}
	@Override
	public String toString() {
		return str;
	}
}

class OutOfRangeException extends Exception{
	
	String str;
	public OutOfRangeException(String str) {
		this.str=str;
	}
	@Override
	public String toString() {
		return str;
	}
}

/*
Enter the marks of student......
34
Enter the marks of student......
56
Enter the marks of student......
122
Exception in thread "main" no can't be given greater than 100.......
	at Exception_Assignments.Q9.main(Q9.java:24)
*/