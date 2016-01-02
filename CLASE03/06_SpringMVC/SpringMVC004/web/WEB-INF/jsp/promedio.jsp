<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PROMEDIO</title>
  </head>
  <body>
    <h1>PROMEDIO</h1>
    <c:if test="${error == null}">
      <table>
        <tr>
          <td>Nota 1:</td>
          <td>${nota1}</td>
        </tr>
        <tr>
          <td>Nota 1:</td>
          <td>${nota2}</td>
        </tr>
        <tr>
          <td>Nota 3:</td>
          <td>${nota3}</td>
        </tr>
        <tr>
          <td>Promedio:</td>
          <td>${prom}</td>
        </tr>
      </table>
    </c:if>
    <a href="index.htm">Index</a>
  </body>
</html>
