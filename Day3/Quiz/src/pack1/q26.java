package pack1;

public class q26 {

	public static void main(String[] args) {
		String s=new String("Bicycle"); 
		int iBegin=1; 
		char iEnd=3; 
		System.out.println(s.substring(iBegin,iEnd));
	}
	/*If you run the code below, what gets printed out? 
			String s=new String("Bicycle"); 
			int iBegin=1; 
			char iEnd=3; 
			System.out.println(s.substring(iBegin,iEnd));
			1) Bic 
			2) ic 
			3) icy 
			4) error: no method matching substring(int,char)
			
			2) ic 
This is a bit of a catch question. Anyone with a C/C++ background
 would figure out that addressing in strings starts with 0 so that 1 
 corresponds to i in the string Bicycle. The catch is that the second parameter 
 returns the endcharacter minus 1. In this case it means instead of the "icy" 
 being returned as intuition would expect it is only "ic". 

			*/
}
