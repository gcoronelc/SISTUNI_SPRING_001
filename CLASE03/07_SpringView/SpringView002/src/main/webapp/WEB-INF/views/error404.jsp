<!-- Autor: Gustavo Coronel -->
<!-- Blog: gcoronelc.blogspot.com -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/estilos.css"/>" rel="stylesheet">
<title>ERROR 404</title>
</head>
<body>

<h1>ERROR 404</h1>

<p>Recurso no existe.</p>

<div class="errorMessage">
<ul>
    <li>Request URI: <c:out value="${requestScope['javax.servlet.error.request_uri']}" /></li>
    <li>Servlet name: <c:out value="${requestScope['javax.servlet.error.servlet_name']}" /></li>
    <li>Status code: <c:out value="${requestScope['javax.servlet.error.status_code']}" /></li>
</ul>
</div>

<a href="<c:url value="/"/>">Inicio</a>
</body>
</html>