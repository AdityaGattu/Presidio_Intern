package lab6;

import java.util.*;

class Bank{
	
	String name,account_type;
	int acc_no,bal;
	
	Bank()
	{
		
	}
	void intialValues(String name)
	{
		this.name=name;
		this.account_type="savings";
		this.acc_no=888888;
		this.bal=0;
		
	}
	void deposit(int amt)
	{
		if(amt<=50000) {
			this.bal+=amt;
		}
	}
	void display()
	{
		System.out.println("Name of account holder: "+this.name+"\n Balance : "+this.bal);
	}
	
}


public class q52 {
public static void main(String[] args) {
	
	Bank b1[]=new Bank[2];
	
	for(int i=0;i<2;i++)
	{
		b1[i]=new Bank();
	}
	b1[0].intialValues("adi");
	b1[0].deposit(10000);
	b1[0].display();
	
	b1[1].intialValues("sam_gattu");
	b1[1].deposit(5000);
	b1[1].display();
}
}

/*o/p:
 * Name of account holder: adi
 Balance : 10000
Name of account holder: sam_gattu
 Balance : 5000

 */
