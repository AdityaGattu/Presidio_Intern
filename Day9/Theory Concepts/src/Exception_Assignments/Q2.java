package Exception_Assignments;

import java.util.*;

class Q2
{ 
	public void mth1() 
	{ mth2(); 
	System.out.println("caller"); 
	} 
	public void mth2() 
	{ 
		try { // line 1 return; 
		}
		catch(Exception e)
		{ System.out.println("catch-mth2");}
		
		finally{System.out.println("finally-mth2");}
	} 
	public static void main(String p[]) 
	{ 
		Q2 s=new Q2(); 
		s.mth1(); 
	} 
}

/* o/p:
finally-mth2
caller
*/