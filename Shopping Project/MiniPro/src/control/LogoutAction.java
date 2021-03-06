package control;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daopack.UserDAO;
import daopack.UserDAOImpl;
import servicepack.LoginServiceImpl;

public class LogoutAction extends Action {
	
	public LogoutAction() {
		// TODO Auto-generated constructor stub
	}
	
	
 @Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	HttpSession session=request.getSession();
	String uname=session.getAttribute("uname").toString();
	
	LoginServiceImpl lservice=LoginServiceImpl.getLoginService();
	lservice.setUserDAO(UserDAOImpl.getUserDaoImpl());
	
	lservice.updateFlag(uname, 0);
	
	return "logout.success";
}
}
