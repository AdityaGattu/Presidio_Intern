package day13_assignment;

import java.util.*;
/*
 * 4. Given: 12. public class AccountManager 
 * { 13. private Map accountTotals = new HashMap(); 
 *   14. private int retirementFund; 
 *   15. 16. public int getBalance(String accountName) 
 *   		{ 17. Integer total = (Integer) accountTotals.get(accountName); 
 *   18. if (total == null) 19. total = Integer.valueOf(0); 
 *   20. return total.intValue(); 21. }
 *    23.   public void setBalance(String accountName, int amount)
 *     		{ accountTotals.put(accountName, Integer.valueOf(amount)); 
 *      	} 
 *      }
 *      This class is to be updated to make use of appropriate generic types, 
 *      with no changes in behavior (for better or worse). 
 *      Which of these steps could be performed? (Choose three.) 
 * 
 */


public class Q4 {
	private Map<String, Integer> accountTotals = new HashMap<String, Integer>();  //->1
	private int retirementFund; 
	
	public int getBalance(String accountName) { 
		Integer total = (Integer) accountTotals.get(accountName); 
		if (total == null) total = Integer.valueOf(0); 
		return total.intValue();
	}
	
	public void setBalance(String accountName, int amount)
	 { 
		accountTotals.put(accountName, Integer.valueOf(amount)); 
	 }

	public int getRetirementFund() {  //->2
		return retirementFund;
	}

	public void setRetirementFund(int retirementFund) { //->3
		this.retirementFund = retirementFund; 
	} 	
}
