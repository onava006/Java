<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<%@ include file="/WEB-INF/css/style.css"%>
</style>
<style><%@include file="/WEB-INF/css/bootstrap/css/bootstrap.min.css"%></style>
</head>
<body>
<div class="container">

<h1>Crea tu mascota super cachilupi</h1>

</div>

<div class="container">
<div class="row">
<div class="col-6 border">
<h1><c:out value="${'Create a Dog'}"></c:out></h1>
<form action="/Mascotas/Dogs">

	<span style="width:80px;">Nombre    : </span><input type="text" name="nombreperro"><br><br>
	<span style="width:80px;">Raza    : </span><input type="text" name="razaperro"><br><br>
	<span style="width:80px;">Peso    : </span><input type="text" name="pesoperro"><br><br>
<input type="submit" value="pedir perrito">

</form>
</div>
<div class="col-6 border pb-4">

<h1><c:out value="${'Create a Cat'}"></c:out></h1>
<form action = "/Mascotas/Cats" target="_blank">


<span style="width:80px;">Nombre    : </span><input type = "text" name="nombregato"><br><br>
<span style="width:80px;">Raza    : </span><input type = "text" name="razagato"><br><br>
<span style="width:80px;">Peso    : </span><input type="text" name="pesogato"><br><br>
<input type= "submit" value="pedir michi">

</form>
</div>
</div>
</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>