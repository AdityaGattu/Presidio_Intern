package pack1;

public class q27 {
	
	public static void main(String[] args) {
		
		String s="Java";
		
		System.out.println(s.indexOf('v'));
		
	}
	/*
	If you wanted to find out where the position of the letter v (ie return 2) 
	in the string s containing "Java", which of the following could you use? 
	1) mid(2,s); 
	2) charAt(2); 
	3) s.indexOf('v'); 
	4) indexOf(s,'v'); 
	
	3) s.indexOf('v'); 
	charAt returns the letter at the position rather than searching for a 
	letter and returning the position, MID is just to confuse the Basic Programmers,
	indexOf(s,'v'); is how some future VB/J++ nightmare hybrid, might perform such a 
	calculation. 

	*/

}
