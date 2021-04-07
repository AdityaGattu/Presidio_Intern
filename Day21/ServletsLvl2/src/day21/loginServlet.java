package day21;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.jdbc.Driver;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Connection con;
	PreparedStatement stmt;
    public loginServlet() {
        super();
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/coda4","adi","aditya");
        stmt=con.prepareStatement("insert into users values(?,?)");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("username");
		String pwd=request.getParameter("password");
		
		UserDAO userDao = new UserDAO();
		PrintWriter pw=response.getWriter();
		try {
			
			boolean ans=userDao.userLogin(name, pwd, 0);
			if(ans==false) {response.sendRedirect("registration.html");}
			
			else {
				HttpSession session = request.getSession();
				session.setAttribute("flag",1 );
				
				stmt=con.prepareStatement("update users set flag=? where  username=? and password=?");
				stmt.setInt(1, 1);
				stmt.setString(2,name);
				stmt.setString(3,pwd);
				
				response.sendRedirect("welcome.html");
			}
			
			int no_updates=stmt.executeUpdate();
			pw.write("<h1"+no_updates+" rows updated......"+"</h1>");
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
