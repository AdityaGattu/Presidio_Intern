package lab4;

import java.util.*;

//39. Write multiplication tables using do-while loop? 

public class q39 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int cnt=0;
		do {
			System.out.println(n+"*"+cnt+"="+(n*cnt));
			cnt++;
		}while(cnt<=10);
	}

}
/* o/p :
5
5*0=0
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
*/