package Exception_Assignments;

import java.io.IOException;

//1. Create a class with a method throwing an object of class IOException. 
//Neither catch this object nor use throws clause. Test and see the result 

public class Q1 {
	public static void main(String[] args) {
		
	}
	
	public void met() throws IOException {  //without throws complile time exception
		
		throw new IOException();
		
	}
}
