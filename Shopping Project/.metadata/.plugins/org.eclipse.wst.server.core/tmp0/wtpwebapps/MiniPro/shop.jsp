<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Vegetable Shop</h1>
<%@ include file="logout.jsp" %>
	<form action="shop.do" method="post">
	<input type="hidden" name="formid" value="shop">
	<input type="hidden" name="shopid" value="shop1">
		Brinjal:<input type="checkbox" name="c1" value="brinjal">
		Potato:<input type="checkbox" name="c2" value="potato">
		Carrot:<input type="checkbox" name="c1" value="carrot">
		
		<input type="submit" value="Next shop..">
	</form>
</body>
</html>