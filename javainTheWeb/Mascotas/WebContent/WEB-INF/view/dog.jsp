<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
<%@ include file="/WEB-INF/css/style.css"%>
</style>
<style><%@include file="/WEB-INF/css/bootstrap/css/bootstrap.min.css"%></style>

<title>Insert title here</title>
</head>
<body>
	<div class="contenedorRespuesta container">
	<div class="row">
	<div class="col-12 text-center border-bottom">
		<p class="display-2">
			Haz creado un: <c:out value="${breed}">
			</c:out>
		</p>
		</div>
	<div class="col-12 text-center">
		<p class="display-4">
			<b><c:out value="${name}"></c:out></b><c:out value="${ ' '}${action} "></c:out>
		</p>
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