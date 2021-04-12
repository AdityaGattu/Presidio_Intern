package day21;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class SessionDemo
 */
public class SessionDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("count");
		ServletOutputStream out=response.getOutputStream();
		if(obj==null) {
			out.println("<h1>You are visiting for the first time....</h1>");
			session.setAttribute("count", 2);
		}
		else {			
			String s=obj.toString();
			int n=Integer.parseInt(s);
			out.println("<h1>You are visiting for the "+n+" time");
			n=n+1;
			session.setAttribute("count", n);			
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
