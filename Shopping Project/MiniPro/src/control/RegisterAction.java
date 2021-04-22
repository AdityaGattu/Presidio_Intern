package control;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import daopack.UserDAOImpl;
import servicepack.LoginService;
import servicepack.LoginServiceImpl;

public class RegisterAction extends Action{
	public RegisterAction() {
		// TODO Auto-generated constructor stub
	}
	
	private static Properties dbConfigProp;
	public RegisterAction(Properties dbConfigProp) {
		RegisterAction.dbConfigProp=dbConfigProp;
	}
@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	
	LoginServiceImpl loginService=LoginServiceImpl.getLoginService();
	HttpSession session=request.getSession();
	
	if(loginService.registerUser(11,uname, upass,0)==1) {
			return "register.success";
	 }
	else {
		return "login.register";
	}
	
}
}
