<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>DATOS DEL PRODUCTO</title>
  </head>

  <body>
    <h1>DATOS DEL PRODUCTO</h1>
    <form method="post" action="producto.htm">
      <table>
        <tr>
          <td>ID</td>
          <td><input type="text" name="id" placeholder="Id del producto." /></td>
        </tr>
        <tr>
          <td>NOMBRE</td>
          <td><input type="text" name="nombre" placeholder="Nombre del producto." /></td>
        </tr>
        <tr>
          <td>PRECIO</td>
          <td><input type="text" name="precio" placeholder="Precio del producto." /></td>
        </tr>
        <tr>
          <td>STOCK</td>
          <td><input type="text" name="stock" placeholder="Stock del producto." /></td>
        </tr>
      </table>
      <input type="submit" value="Procesar" />
    </form>
  </body>
</html>
