<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>OPERACIONES</title>
  </head>
  <body>
    <h1>OPERACIONES</h1>
    <c:if test="${error == null}">
      <table>
        <tr>
          <td>Número 1:</td>
          <td>${n1}</td>
        </tr>
        <tr>
          <td>Número 1:</td>
          <td>${n2}</td>
        </tr>
        <tr>
          <td>Suma:</td>
          <td>${suma}</td>
        </tr>
        <tr>
          <td>Producto:</td>
          <td>${prod}</td>
        </tr>
      </table>
    </c:if>
    <a href="index.htm">Index</a>
  </body>
</html>
