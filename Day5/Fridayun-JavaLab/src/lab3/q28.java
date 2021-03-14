package lab3;

//28. Write a program that uses an if-else-if ladder to 
//determine which season a particular month is in? 

class Season{
	
	public static String find(String month) {
		
		if(month=="jan" || month=="feb" || month=="dec" || month=="nov") return "winter"; 
		else if(month=="mar" || month=="apr" || month=="may" || month=="jun") return "summer";
		else if(month=="jul" || month=="aug" || month=="sep" || month=="oct" ) return "rainy";
		else return "enter correct month";
	}
}
public class q28 extends Season{

	public static void main(String[] args) {
		
		String ans=Season.find("apr");
		System.out.println(ans);
	}
}
