<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>
	<%=application.getRealPath("") %>
		</h1>
		<%
			Date d=new Date();
			out.println(d);
		%>
	
</body>
</html>