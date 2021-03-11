package Assignment;

import java.util.*;

public class q16 {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	ArrayList<Integer> arr=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		arr.add(s.nextInt());
	}
	System.out.println(arr.contains(1));
	if(arr.contains(1))
	{
		System.out.println(arr.indexOf(1));
	}
	int cnt=0;
	for(int i=0;i<n;i++)
	{
		if(arr.get(i)==1)cnt++;
	}
	System.out.println("count is: "+cnt);
}
}
