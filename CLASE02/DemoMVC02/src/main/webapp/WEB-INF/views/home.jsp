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
	     <td>N�mero 1:</td>
	     <td><input type="text" name="n1"/></td>
	   </tr>
	   <tr>
       <td>N�mero 2:</td>
       <td><input type="text" name="n2"/></td>
     </tr>
     <tr>
       <td>N�mero 3:</td>
       <td><input type="text" name="n3"/></td>
     </tr>
     <tr>
       <td>N�mero 4:</td>
       <td><input type="text" name="n4"/></td>
     </tr>
	 </table>
	 <input type="submit" value="Procesar"/>
	</form>
</body>
</html>
