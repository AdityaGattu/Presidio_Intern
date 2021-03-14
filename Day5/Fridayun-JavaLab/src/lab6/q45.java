package lab6;

import java.util.*;

class BankAccount{
	
	String name,account_type;
	int acc_no,bal;
	
	BankAccount()
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


public class q45 {
public static void main(String[] args) {
	
	BankAccount b=new BankAccount();
	b.intialValues("aditya_gattu");
	b.deposit(10000);
	b.display();
	
}
}

/*o/p:
 * Name of account holder: Aditya
 Balance : 40000
 */
