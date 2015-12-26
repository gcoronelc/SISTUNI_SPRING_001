<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>DEMO DE DATOS EN SESSION</h1>
  <p>Usuario: ${nombre}</p>
  <a href="registrarVenta.htm" target="WORK">Registrar Venta</a>&nbsp;&nbsp;
  <a href="pagarVenta.htm" target="WORK">Pagar Venta</a>&nbsp;&nbsp;
  <hr/>
  <iframe name="WORK" width="900" height="700" frameborder="1"></iframe>
</body>
</html>