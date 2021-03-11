package Assignment;

import java.util.*;

public class q15 {

	public static void main(String[] args) {
		
		for(int i=0;i<101;i++)
		{
		   if(Primenos(i))
			   System.out.print(i+" ");
		}
	}
	
	public static boolean Primenos(int n)
	{
		if(n==0 || n==1)return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)return false;
		}
		return true;
	}
}
