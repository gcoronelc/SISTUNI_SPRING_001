<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>VENTA</h1>
  <p>${mensaje}</p>
  <form method="post" action="registrarVenta.htm">
    <table>
      <tr>
        <td>Producto</td>
        <td><input type="text" name="producto"/></td>
      </tr>
      <tr>
        <td>Precio</td>
        <td><input type="text" name="precio"/></td>
      </tr>
      <tr>
        <td>Cantidad</td>
        <td><input type="text" name="cant"/></td>
      </tr>
    </table>
    <input type="submit" value="Procesar" />
  </form>
</body>
</html>