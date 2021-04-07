package day21;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class registrationServlet
 */
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Connection con;
	PreparedStatement stmt;
    public registrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("username");
		String pwd=request.getParameter("password");
		int flag=0;
		PrintWriter pw=response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost/coda4","adi","aditya");
	        stmt=con.prepareStatement("insert into users values(?,?,?)");
			stmt.setString(1,name);
			stmt.setString(2,pwd);
			stmt.setInt(3, flag);
			int no_updates=stmt.executeUpdate();
			if(no_updates==1)
			{
				response.sendRedirect("login.html");
			}
			pw.write("<h1>"+no_updates+" rows updated......"+"</h1>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
