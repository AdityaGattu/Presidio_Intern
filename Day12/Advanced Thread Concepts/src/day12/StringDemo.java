package day12;

import java.util.StringJoiner;
public class StringDemo {
	public static void main(String[] args) {
		String s="hello world";
		String ss=new String("hello world");
		
		StringJoiner joinstr=new StringJoiner(",");
		joinstr.setEmptyValue("its a empty string..");
		System.out.println(joinstr);
		joinstr.add("hello");
		joinstr.add("hai");
		System.out.println(joinstr);
		
		joinstr=new StringJoiner(",","[","]");
		joinstr.add("hello");
		joinstr.add("hai");
		System.out.println(joinstr);
		
		StringBuffer sbf=new StringBuffer();//synchronized
		sbf.append("hello");
		StringBuilder sb=new StringBuilder();//non synchronized..
		sb.append("hai");
	}
}