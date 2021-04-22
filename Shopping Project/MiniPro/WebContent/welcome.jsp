<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome...........To our Shopping Site....<%=session.getAttribute("uname") %></h1>
	<%@ include file="logout.jsp" %>
	<hr>
	<h1>Go Shopping....</h1>
		<form action="shopping.do" method="post">
			<input type="hidden" name="formid" value="goshop">
			<input type="submit" value="Shopping........">
		</form>
</body>
</html>