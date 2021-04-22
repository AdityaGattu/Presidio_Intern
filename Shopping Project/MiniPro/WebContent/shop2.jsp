<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fruit Shop</h1>
<%@ include file="logout.jsp" %>
	<form action="shop.do" method="post">
	<input type="hidden" name="formid" value="shop">
	<input type="hidden" name="formid" value="shop2">
		Mango:<input type="checkbox" name="c4" value="mango">
		Banana:<input type="checkbox" name="c5" value="banana">
		PineApple:<input type="checkbox" name="c6" value="pineapple">
		
		<input type="submit" value="Next shop..">
	</form>
</body>
</html>