package lab6;

import java.util.*;

class BankAccounts{
	
	String name,account_type;
	int acc_no,bal;
	
	BankAccounts(String name,String at,int acc_no,int bal)
	{
		this.name=name;
		this.account_type=at;
		this.acc_no=acc_no;
		this.bal=bal;
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


public class q46 {
public static void main(String[] args) {
	
	BankAccounts b=new BankAccounts("Aditya","salary",456789,30000);
	b.deposit(10000);
	b.display();
	
}
}

/*o/p:
 * Name of account holder: Aditya
 Balance : 40000
 */
