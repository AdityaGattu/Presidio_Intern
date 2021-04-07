package day20;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	
    	System.out.println("init method called...............");
		String s=config.getInitParameter("myparam");
		System.out.println("Param value of myparam is...:"+s);
		Enumeration<String> e=config.getInitParameterNames();
		while(e.hasMoreElements()) {
			String name=e.nextElement();
			String value=config.getInitParameter(name);
			System.out.println(name+":"+value);
		}
		System.out.println("Name of the servlet..:"+config.getServletName());
		ServletContext application=config.getServletContext();
		System.out.println(application.getRealPath(""));
		application.setAttribute("global", "global value...............");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doget method called........");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("do post method called........");
	}
	@Override
	public void destroy() {

		System.out.println("destroy method called.....");
	}

	
}
