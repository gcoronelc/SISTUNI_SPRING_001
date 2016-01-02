<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PROMEDIO</title>
  </head>
  <body>
    <h1>PROMEDIO</h1>
    <form method="post" action="promedio.htm">
      <table>
        <tr>
          <td>Nota 1:</td>
          <td><input type="text" name="nota1" placeholder="Nota 1." /></td>
        </tr>
        <tr>
          <td>Nota 2:</td>
          <td><input type="text" name="nota2" placeholder="Nota 2." /></td>
        </tr>
        <tr>
          <td>Nota 3:</td>
          <td><input type="text" name="nota3" placeholder="Nota 2." /></td>
        </tr>        
      </table>
      <input type="submit" value="Procesar" />
    </form>
  </body>
</html>
