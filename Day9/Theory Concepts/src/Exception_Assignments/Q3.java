package Exception_Assignments;

//3. try the above by replacing the return statement inside try block by System.exit(0); 

public class Q3 {

	public void mth1() 
	{ mth2(); 
	System.out.println("caller"); 
	} 
	public void mth2() 
	{ 
		try { System.exit(0); 
		     //exit(0) : Generally used to indicate successful termination.
		//exit(1) or exit(-1) or any other non-zero value – Generally indicates unsuccessful termination.
			// line 1 return; 
		}
		catch(Exception e)
		{ System.out.println("catch-mth2");}
		
		finally{System.out.println("finally-mth2");}
	} 
	public static void main(String p[]) 
	{ 
		Q3 s=new Q3(); 
		s.mth1(); 
	} 
}
