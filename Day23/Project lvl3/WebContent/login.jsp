<!DOCTYPE html>
<%@page import="java.util.ResourceBundle" buffer="8kb" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Details....</h1>
	<form action="login.do" method="post">
	<%
		ResourceBundle rb=(ResourceBundle)session.getAttribute("rb");
	%>
	<input type="hidden" name="formid" value="login">
		<%=rb.getString("username") %>:<input type="text" name="uname">
		<%=rb.getString("password") %>:<input type="password" name="upass">
		
		<input type="submit" value="Login..">
	</form>
</body>
</html>