package control;

import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action{
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String shopid=request.getParameter("shopid");
	Enumeration<String> e=request.getParameterNames();
	
	HttpSession session=request.getSession();
	
//	Vector<String>cart=(Vector<String>)session.getAttribute("cart");
//	
//	if(cart==null) {
//		cart=new Vector<String>();
//	}
//	
//	Enumeration<String> e=request.getParameterNames();
//	
//	while(e.hasMoreElements()) {
//		cart.add(e.nextElement());
//	}
//	session.setAttribute("cart", e);
	while(e.hasMoreElements()) {
		String name=e.nextElement();
		String value=request.getParameter(name);
		
		if(!name.equals("formid")||!name.equals("shopid")) {
			
		}
		else {
			session.setAttribute(name, value);
		}
	}
	return shopid;
}
}
