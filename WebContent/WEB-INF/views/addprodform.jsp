<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Product</title>
</head>
<body>
<form action="addnewproduct" method="post">
    Code: <input type="text" name="code" required> <br>
    Description: <input type="text" name="description" required> <br>
    List Price: <input type="text" name="listPrice"> <br>
    <input type="submit" value="Add Product">

</form>
</body>
</html>