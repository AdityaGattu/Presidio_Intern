package pack1;

public class q14 {
public static void main(String[] args) {
	int i=0; 
	if(i) {  // boolean i not equal to int i=0; so error
	        System.out.println("Hello"); 
	        }

	boolean b=true; 
	boolean b2=true; 
	if(b==b2) { 
	        System.out.println("So true"); 
	        }  //->no error

	int k=1; 
	int j=2; 
	if(k==1|| j==2) 
	        System.out.println("OK"); //->no error

	int m=1; 
	int n=2; 
	if(m==1 &| n==2)   // syntax error
	        System.out.println("OK");
}
}
