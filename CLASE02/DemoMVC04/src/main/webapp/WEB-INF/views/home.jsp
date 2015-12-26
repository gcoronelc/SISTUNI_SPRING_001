<%@page import="org.springframework.web.bind.annotation.SessionAttributes"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
  <h1>IDENTIFICACIÓN</h1>
  <form method="post" action="inicio.htm">
    <p>Nombre</p><br/>
    <input type="text" name="nombre" />
    <input type="submit" value="Ingresar" />
  </form>
</body>
</html>
