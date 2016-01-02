<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>INICIO DE SESION</h1>
	<p>Error: ${error}</p>
  <form:form commandName="usuarioBean" method="post" action="ingreso.htm">
    <table>
      <tr>
        <td>Usuario:</td>
        <td><form:input path="usuario"/></td>
      </tr>
      <tr>
        <td>Clave:</td>
        <td><form:password path="clave"/></td>
      </tr>
    </table>
    <input type="submit" value="Ingresar"/>
  </form:form>
</body>
</html>
