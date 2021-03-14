package lab3;

//29. Write a program that uses a switch case to 
//determine given character is vowel or not? 

import java.util.*;

public class q29 {
	public static boolean vowel(char c)
	{
		switch(c) {
		case 'a':return true;
		case 'e':return true;
		case 'i':return true;
		case 'o':return true;
		case 'u':return true;
		default: return false;
		}
	}

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		String st=s.nextLine();
		
		char[] c=st.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if(vowel(c[i])){
				System.out.println(c[i]+" is vowel");
			}
			else
			System.out.println(c[i]+" is not a vowel");
		}
	}
}

/*o/p :
 * Enter String: 
aditya
a is vowel
d is not a vowel
i is vowel
t is not a vowel
y is not a vowel
a is vowel
*/
