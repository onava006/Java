<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><c:out value ="${count.getWord()}"></c:out></h3>
<form action ="/PalabrasAleatorias/Random"> 

 <label for="quantity">largo entre 7 y 15:</label>
<input type="number"  name="guess" min="7" max="15"> 

<input type = "submit" name = "send" value= "creart nueva palabra">

</form>

<h3> Ya has solicitado <c:out value="${count.getCounter()}"></c:out> Veces </h3>

<h3> la última vez que solicitaste palabra fue el <c:out value="${count.getTimeNow()}"></c:out></h3>


</body>
</html>