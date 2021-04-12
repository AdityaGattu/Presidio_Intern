package com;

import java.io.PrintWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CheckNumber extends TagSupport{
	private String number;
	
	public final String getNumber() {
		return number;
	}
	public final void setNumber(String number) {
		this.number = number;
	}
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		int n=Integer.parseInt(number);
		if(n%2==0) {
			try{
				out.println("<h1>Even Number....</h1>");
			}catch(Exception e) {e.printStackTrace();}
		}
		else {
			try{
				out.println("<h1>Odd Number....</h1>");
			}catch(Exception e) {e.printStackTrace();}
		}
		return super.doEndTag();
	}
}