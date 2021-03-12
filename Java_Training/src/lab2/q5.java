package lab2;

//Write a program to calculate the number of object created 
//at any point using user defined class 
class count{

static int cnt=0;

count()
{
	cnt++;
}
	
}
public class q5 {

public static void main(String[] args) {
	
	count o1=new count();
	count o2=new count();
	count o3=new count();
	
	System.out.println("count is: "+o3.cnt);	
}
}

//o/p: count is: 3
