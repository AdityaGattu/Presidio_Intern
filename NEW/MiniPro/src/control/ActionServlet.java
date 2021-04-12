package control;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	private RequestProcessor rp;
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
		rp=new RequestProcessor();
		ServletContext application=config.getServletContext();
		String configfile=config.getInitParameter("config");
		String dbconfigfile=config.getInitParameter("dbconfig");
		String configpath=application.getRealPath(configfile);
		String dbconfigpath=application.getRealPath(dbconfigfile);
		
		Properties configProp=new Properties();
		configProp.load(new FileInputStream(configpath));
		
		Properties dbConfigProp=new Properties();
		dbConfigProp.load(new FileInputStream(dbconfigpath));
		
		System.out.println(dbconfigpath);
		System.out.println(dbConfigProp.getProperty("driver"));
		application.setAttribute("configProp", configProp);
		application.setAttribute("dbConfigProp", dbConfigProp);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rp.process(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
