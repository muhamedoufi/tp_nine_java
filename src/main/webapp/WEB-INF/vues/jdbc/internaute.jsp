<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    
    <title>Menu JDBC</title>
    </head>

    <div style="width: 500px; margin-left: auto;
    margin-right: auto;">
    <h2>Liste des Internautes</h2>
    
        
        <table class="table" style=" width: 500px;">
            <thead class="table-dark">
              <tr>
                
                <th scope="col">Email</th>
                <th scope="col">Adresse</th>
                <th scope="col">Adresse Pro</th>
                
              </tr>
            </thead>
            <tbody>
                <c:forEach var="internautes" items="${internautes}" >
              <tr>
               
                <td>${internautes.email}</td>
                <td>${internautes.adresse.adresse}</td>
                <td>${internautes.adressePro.adresse}</td>
              </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    