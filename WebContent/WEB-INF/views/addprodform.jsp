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
    <!--  these additional attributes for min and step allow us to take in a double variable -->
    List Price: <input type="number" min="1" step="any" name="listPrice"> <br>
    <input type="submit" value="Add Product">

</form>
</body>
</html>