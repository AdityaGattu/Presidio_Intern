package day14;

import java.util.Locale;
import java.util.ResourceBundle;

public class LangDemo {
	public static void main(String[] args) {
		
//		Locale locale=Locale.getDefault();
//		
//		System.out.println(locale);
//		
//		Locale.setDefault(new Locale("te"));
//		
//		System.out.println(Locale.getDefault());
//		
//		locale=Locale.getDefault();
//		
//		ResourceBundle rb=ResourceBundle.getBundle("dictionary",locale);
//		
//		System.out.println(rb.getString("hello"));
		
		Locale locale=Locale.getDefault();
		System.out.println(locale);
		
		Locale.setDefault(new Locale("te"));
		Locale locale1=Locale.getDefault();
		
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",locale1);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("name"));
		
		}
}
/*o/p:
 * 	en_US
	namaskaralu
	peru

 */
