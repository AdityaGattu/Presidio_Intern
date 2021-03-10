package pack1;

public class q28 {

	public static void main(String[] args) {
		String s1=new String("Hello");
		String s2=new String("there"); 
		String s3=new String();
		s3=s1 + s2; 
		//s3=s1-s2;
		//s3=s1 && s2 ;
	}
	/*
	Given the following declarations 
	String s1=new String("Hello") 
	String s2=new String("there"); 
	String s3=new String();
	Which of the following are legal operations? 
	1) s3=s1 + s2; 
	2) s3=s1-s2; 
	3) s3=s1 & s2; 
	4) s3=s1 && s2 
	
	1) s3=s1 + s2; 
	Java does not allow operator overloading as in C++, but 
	for the sake of convenience the + operator is overridden for strings. 
	*/
}
