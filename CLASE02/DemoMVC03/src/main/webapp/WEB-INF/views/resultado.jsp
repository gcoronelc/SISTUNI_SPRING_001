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
  <h1>RESULTADO</h1>
  <table>
    <tr>
      <td>N�mero 1</td>
      <td>${promedioModel.nota1}</td>
    </tr>
    <tr>
      <td>N�mero 2</td>
      <td>${promedioModel.nota2}</td>
    </tr>
    <tr>
      <td>N�mero 3</td>
      <td>${promedioModel.nota3}</td>
    </tr>
    <tr>
      <td>N�mero 4</td>
      <td>${promedioModel.nota4}</td>
    </tr>
    <tr>
      <td>Promedio</td>
      <td>${promedioModel.prom}</td>
    </tr>
    <tr>
      <td>Menor</td>
      <td>${promedioModel.menor}</td>
    </tr>
    <tr>
      <td>Condici�n</td>
      <td>${promedioModel.cond}</td>
    </tr>
  </table>
  <a href='<c:url value="/"  />'>Home</a>
</body>
</html>