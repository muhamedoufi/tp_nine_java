<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des films</title>
</head>
<body>
	<h1>Liste des films</h1>
	<ul>
		<%
		ResultSet films = (ResultSet) request.getAttribute("films");
		while (films.next()) {
			out.println("<li>Titre du film: " + films.getString("titre") + "</li>");
		}
		%>
	</ul>
	<p>
		<a href="http://localhost:8080/TP7/jdbc">Accueil</a>
	</p>
</body>
</html>