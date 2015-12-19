<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h1>HOLA GUSTAVO</h1>
  
  <p>${saludo}</p>
  
  <form method="post" action="sumar.gustavo">
    Número 1: <input type="text" name="n1" /><br/>
    Número 2: <input type="text" name="n2" /><br/>
    <input type="submit" value="Sumar" /><br/>
  </form>
  
  <c:if test="${suma != null}">
	  <h2>RESPUESTA</h2>
	  N1: ${n1}<br/>
	  N2: ${n2}<br/>
	  SUMA: ${suma}<br/>
  </c:if>
  
</body>
</html>