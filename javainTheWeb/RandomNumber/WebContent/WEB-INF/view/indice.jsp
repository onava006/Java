<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GGG</title>
</head>
<body>
	<!-- 
	
 -->

	<h3 style="text-align: center;">Welcome to Great Number Game</h3>
	<p style="text-align: center;">I am thinkin of a number between <c:out value="${min}"></c:out>
		and <c:out value="${max}"></c:out></p>
	<p style="text-align: center;">Take a guess</p>


	<hr>

	<!-- aquí viene el jstl choose -->

	<c:set var="result" value="${guesser.getResult()}" />
	<c:choose>

		<c:when test="${result == 0}">
			<h2 style="text-align: center; background-color: green; color: white; min-height: 3rem; margin: auto; width: 50%; border: 3px solid green;  padding: 10px;">
			le apuntaste!, te tomó <c:out value="${guesser.getCounter()}"> </c:out> intentos. Juega de nuevo  </h2>
			
		</c:when>

		<c:when test="${result == 1}">
			<h2 style="text-align: center; background-color: red; color: white; min-height: 3rem; margin: auto; width: 50%; border: 3px solid green;  padding: 10px;">Muy alto!!</h2>
		</c:when>
		         
		<c:when test="${result == -1 }">
		<h2 style="text-align: center; background-color: red; color: white; min-height: 3rem; margin: auto; width: 50%; border: 3px solid green;  padding: 10px;">Muy bajo!</h2>
		</c:when>
         <c:otherwise>
			<h2 style="text-align: center; background-color: blue; color: white; min-height: 3rem; margin: auto; width: 50%; border: 3px solid green;  padding: 10px;">Comencemos!</h2>
		</c:otherwise>
	</c:choose>

	<hr>

	<form style="text-align: center;" action="/RandomNumber/Main"
		method="post">
		<input type="number" name="guess" min="${guesser.getmin()}" max="${guesser.getmax()}"> <input type="submit"
			name="send" value="check!">
	</form>

	<p> <c:out value="${guesser.getguessing()}"></c:out></p>


	
</body>
</html>