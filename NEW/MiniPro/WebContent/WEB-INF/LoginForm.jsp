<%@page import="com.LoginForm"%>
<%-- <%
	String uname=request.getParameter("uname");
	String upass=request.getParameter("upass");
	
	LoginForm lForm=new LoginForm();
	lForm.setUname(uname);
	lForm.setUpass(upass);
	
	session.setAttribute("loginform",lForm);
	RequestDispatcher rd=request.getRequestDispatcher("next.jsp");
	rd.forward(request, response);
%> --%>
<jsp:useBean id="lForm" class="com.LoginForm" scope="session">
	<jsp:setProperty name="lForm" property="*" />
<%-- 	<jsp:setProperty name="lForm" property="upass" /> --%>
</jsp:useBean>
<jsp:forward page="next.jsp"/>