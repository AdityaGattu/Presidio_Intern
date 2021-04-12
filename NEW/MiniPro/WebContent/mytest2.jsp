<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/myjsptags.tld" prefix="coda" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<coda:checkNumber number="<%=request.getParameter(\"num\")%>"/>
</body>
</html>


<%-- <%
		int n=Integer.parseInt(request.getParameter("num"));
	
		if(n%2==0){
			out.println("Even Number............");
		}
		else{
			out.println("Odd Number...............");
		}
	
		http://localhost:8080/b4struts/mytest2.jsp?num=11
	%> --%>