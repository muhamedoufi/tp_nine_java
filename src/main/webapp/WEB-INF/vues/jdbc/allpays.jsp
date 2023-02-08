<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    
    <title>Menu JDBC</title>
    </head>

<br><br>
<div style="width: 500mm; padding-right: 50%; position: relative; "></div>
<h2>Liste des Pays</h2>
<ul class="list-group">
    <c:forEach var="pays" items="${pays}" >
    <li class="list-group-item">${pays.nom} </li>
</c:forEach>
  </ul>