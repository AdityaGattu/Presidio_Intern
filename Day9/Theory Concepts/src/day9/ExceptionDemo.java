package day9;
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("before exception ");
		try {
			
				int i=1/Integer.parseInt(args[0]);
			
		}catch(ArithmeticException e) {
			System.out.println("Number is zero..:"+e);
		}catch(NumberFormatException ne) {
			System.out.println("Number is a character..:"+ne);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("unknown exception........."+ex);
		}
		System.out.println("after exception..");
	}
}

/*before exception 
unknown exception.........java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
after exception..
*/