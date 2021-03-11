package Assignment;

import java.util.*;

public class q8 {
	public static void main(String[] args) {
	
		int arr[]= {3,4,12,2,8,6,7,8};
		
		System.out.println(index(arr,8));
	}
	
	public static int index(int[] arr,int ele)
	{
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int e:arr)
		{
			list.add(e);
		}
		
		return list.indexOf(ele);
		
	}
}
