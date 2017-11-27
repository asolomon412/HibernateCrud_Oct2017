<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<link href="resources/test.css" rel="stylesheet" />
</head>
<body>

	<a href="getnewprod">Add Product</a>

	<form action="searchbyproduct" method="get">
		<input type="text" name="product"> <input type="submit"
			value="Search">
	</form>


	<table border="1">
		<c:forEach var="myVar" items="${cList}">
			<tr>
				<td>${myVar.productID}</td>
				<td>${myVar.code}</td>
				<td>${myVar.description}</td>
				<td>${myVar.listPrice}</td>
				<td><a href="delete?id=${myVar.productID}"> Delete </a></td>
				<td><a href="update?id=${myVar.productID}"> Update </a></td>

			</tr>

		</c:forEach>

	</table>
</body>
</html>