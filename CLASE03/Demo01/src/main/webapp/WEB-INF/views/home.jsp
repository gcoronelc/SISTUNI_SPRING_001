<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>INICIO DE SESION</h1>
	<p>Error: ${error}</p>
  <form method="post" action="ingreso.htm">
    <table>
      <tr>
        <td>Usuario:</td>
        <td><input type="text" name="usuario" value="${usuario}"/></td>
      </tr>
      <tr>
        <td>Clave:</td>
        <td><input type="password" name="clave"/></td>
      </tr>
    </table>
    <input type="submit" value="Ingresar"/>
  </form>
</body>
</html>
