package day12;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
public class ForkAndJoinDemo {
	
	
	public static void main(String[] args) {
		String arr[]= {"padala","meghana","kalpana","kanpur","megha","raghul","raghul","mohan","raghul","meghana"};
		int count=0;
		for(String s:arr) {
			if(s.equalsIgnoreCase("raghul")) {
				count++;
			}
		}
		System.out.println("Count of raghul...:"+count);
		
		ForkJoinPool fjp=ForkJoinPool.commonPool();
		
		MyTask task1=new MyTask(arr,0,3,"raghul");
		MyTask task2=new MyTask(arr,3,5,"raghul");
		MyTask task3=new MyTask(arr,5,7,"raghul");
		MyTask task4=new MyTask(arr,7,9,"raghul");
		
		int result1=fjp.invoke(task1);
		int result2=fjp.invoke(task2);
		int result3=fjp.invoke(task3);
		int result4=fjp.invoke(task4);
		
		int total=result1+result2+result3+result4;
		System.out.println("Total raghuls are...:"+total);
		
	}
}
class MyTask extends RecursiveTask<Integer>{
	String arr[];
	int start,end;String searchString;
	public MyTask(String arr[],int start,int end,String searchString) {
		this.arr=arr;
		this.start=start;
		this.end=end;
		this.searchString=searchString;
	}
	@Override
	protected Integer compute() {
		int count=0;
		for(int i=start;i<end;i++) {
			if(arr[i].equalsIgnoreCase(searchString)) {
				count++;
			}
		}
		return count;
	}
}


/* o/p: 
Count of raghul...:3
Total raghuls are...:3*/