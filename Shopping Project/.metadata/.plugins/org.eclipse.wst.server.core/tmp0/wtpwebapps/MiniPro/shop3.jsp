<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Grocery Shop</h1>
<%@ include file="logout.jsp" %>
	<form action="shop.do" method="post">
	<input type="hidden" name="formid" value="shop">
	<input type="hidden" name="formid" value="shop3">
		Rice:<input type="checkbox" name="c7" value="rice">
		Daal:<input type="checkbox" name="c8" value="daal">
		Oil:<input type="checkbox" name="c9" value="oil">
		
		<input type="submit" value="Next shop..">
	</form>
</body>
</html>