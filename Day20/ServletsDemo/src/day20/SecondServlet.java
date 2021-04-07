package day20;
import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	@Override
//		public void init(ServletConfig config) throws ServletException {
//			ServletContext application=config.getServletContext();
//			String s=application.getAttribute("global").toString();
//			
//			System.out.println(s);
//	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		ServletOutputStream out=response.getOutputStream();
//		
//		String name=request.getParameter("uname");
//		out.println(name);
//		String pass=request.getParameter("upass");
//		out.println(pass);
//		Enumeration<String> e=request.getParameterNames();
//		while(e.hasMoreElements()) {
//			String n=e.nextElement();
//			String value=request.getParameter(n);
//			out.println("<h1>"+n+":"+value);
//		}
//		
		String name=request.getParameter("uname");
		if(name.equals("ramu")) {
		//	response.sendRedirect("anotherpage.html");
			RequestDispatcher rd=request.getRequestDispatcher("anotherfile.html");
			rd.forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}