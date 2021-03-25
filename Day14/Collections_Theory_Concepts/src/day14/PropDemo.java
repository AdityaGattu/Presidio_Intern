package day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.*;

public class PropDemo{
	public static void main(String[] args) throws Exception {
		
		Properties prop=new Properties();
		prop.load(new FileInputStream("abc.properties"));
		
		Enumeration e=prop.elements();
		
		while(e.hasMoreElements()) {
			String s=(String)e.nextElement();
			System.out.println(s);
		}
		
		System.out.println(prop.getProperty("key2"));
	}
}