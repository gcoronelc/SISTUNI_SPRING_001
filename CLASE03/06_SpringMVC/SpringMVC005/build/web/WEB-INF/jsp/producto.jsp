<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>DATOS DEL PRODUCTO</h1>
    <table>
      <tr>
        <td>ID</td>
        <td>${productoModel.id}</td>
      </tr>
      <tr>
        <td>NOMBRE</td>
        <td>${productoModel.nombre}</td>
      </tr>
      <tr>
        <td>PRECIO</td>
        <td>${productoModel.precio}</td>
      </tr>
      <tr>
        <td>STOCK</td>
        <td>${productoModel.stock}</td>
      </tr>
    </table>
    <a href="index.htm">Index</a>
  </body>
</html>
