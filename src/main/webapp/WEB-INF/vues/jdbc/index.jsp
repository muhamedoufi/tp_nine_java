<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

<title>Menu JDBC</title>
</head>
<body>
	<div style="width: 500px; margin: auto;">
	<h1>Actions JDBC</h1>
	<ul>
		<li><a
			href="${pageContext.request.contextPath}/jdbc?action=connexion">
				Connexion </a>
		<li><a
			href="${pageContext.request.contextPath}/jdbc?action=requeteA">RequêteA</a>
		</li>
        <li><a
			href="${pageContext.request.contextPath}/jdbc?action=selectAllpys1">SelectAllpays </a>
		</li>
        <li><a
			href="${pageContext.request.contextPath}/jdbc?action=selectAllfilm">SelectAllFilm</a>
		</li>
        <li><a
			href="${pageContext.request.contextPath}/jdbc?action=selectAllfilmartiste">Films et artistes</a>
		</li>
        <li><a
			href="${pageContext.request.contextPath}/jdbc?action=internaute">Les internautes</a>
		</li>
        <li><a
			href="${pageContext.request.contextPath}/jdbc?action=artiste">Les artistes</a>
		</li>
        <li><a
			href="${pageContext.request.contextPath}/jdbc?action=roles">Les roles</a>
		</li>
	</ul>
    
	<br><br>
<fieldset>
    <form action="${pageContext.request.contextPath}/jdbc" method="get">
        <div style="width: 500px; margin: auto;">
			<input type="hidden" name="insert" value="insert">
            <div class="form-group">

                <label for="formGroupExampleInput">Code Pays</label>
                <input type="text" class="form-control" id="formGroupExampleInput" name="code">
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput2">Nom Pays</label>
                <input type="text" class="form-control" id="formGroupExampleInput2" name="nom">
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput2">Langue</label>
                <input type="text" class="form-control" id="formGroupExampleInput2" name="lng">
            </div>
            <div class="form-group">
                
                <input type="submit" class="form-control" value="Enregistrer" >
            </div>
    </form>
</fieldset>
</body>
</html>