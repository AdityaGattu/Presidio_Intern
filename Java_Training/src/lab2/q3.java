package lab2;

import java.util.*;
//Write a application to implement a Pay Roll System for an Organization 

class Employee{
	
	Date date;
	
	Employee()
	{
		this.date=new Date();
	}
}

class SalesPerson extends Employee{
	
	SalesPerson()
	{
		System.out.println("SalesPerson joined...."+this.date);
	}
	
}
class SalesManager extends SalesPerson{
    
	SalesManager()
	{
		System.out.println("SalesManager joined...."+this.date);
	}
}
class SalesTerritoryManager extends SalesManager{
	
	SalesTerritoryManager()
	{
		System.out.println("SalesTerritoryManager joined...."+this.date);
	}
}
class Worker extends Employee{
	
	Worker()
	{
		System.out.println("Worker joined...."+this.date);
	}
	
}
public class q3 {
	
	public static void main(String[] args) {
		
		SalesTerritoryManager m=new SalesTerritoryManager();
	}

}
/*o/p
 * 
 * SalesPerson joined....Fri Mar 12 11:26:11 IST 2021
SalesManager joined....Fri Mar 12 11:26:11 IST 2021
SalesTerritoryManager joined....Fri Mar 12 11:26:11 IST 2021
*/
