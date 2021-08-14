<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Car</h1> 
  <form action="addCar" method="post">
    Id:    <input type="number" name="id" id="id"> <br /> 
    Model: <input type="text" name="model" id="model"> <br /> 
    Brand: <input type="text" name="brand" id="brand"> <br /> 
    <p>
      <input type="submit">
    </p>
  </form>
  
  <hr>
  <h1>Find Car</h1>
  <form action="getCar" method="post">
    Id:    <input type="number" name="id" id="id"> <br /> 
    <p>
      <input type="submit">
    </p>
  </form>
  
  
  <hr>
  <p>
    <a href="/delete">Delete Cars</a>
  </p>  
  <p>
    <a href="/update">Update Car</a>
  </p>  
  
  <p>
  
  </p>

</body>
</html>