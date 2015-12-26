<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>PROMEDIO</h1>
	<form method="post" action="promedio.htm">
	 <table>
	   <tr>
	     <td>Número 1:</td>
	     <td><input type="text" name="nota1"/></td>
	   </tr>
	   <tr>
       <td>Número 2:</td>
       <td><input type="text" name="nota2"/></td>
     </tr>
     <tr>
       <td>Número 3:</td>
       <td><input type="text" name="nota3"/></td>
     </tr>
     <tr>
       <td>Número 4:</td>
       <td><input type="text" name="nota4"/></td>
     </tr>
	 </table>
	 <input type="submit" value="Procesar"/>
	</form>
</body>
</html>
