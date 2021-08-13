<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Cars</h1> 
  <hr>
	<form action="addCar" method="post">
		Id:    <input type="number" name="id" id="id"> <br /> 
    Model: <input type="text" name="model" id="model"> <br /> 
    Brand: <input type="text" name="brand" id="brand"> <br /> 
		<input type="submit">
	</form>
	
	<a href="delete">Delete Cars</a>

</body>
</html>