<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/font-awesome.min.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">
<link href="../css/blue.css" rel="stylesheet">
<link rel="shortcut icon" href="img/favicon/favicon.png">
<title>Listagem Usuarios</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="form">
		<form class="form-horizontal">
			<div class="form-group">
				<label class="control-label col-md-3" for="username">Nome</label>
				<div class="col-md-7">
					<input type="text" class="form-control" id="username">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3" for="email">Senha</label>
				<div class="col-md-7">
					<input type="password" class="form-control" id="password">
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-7 col-md-offset-3">
					<div class="checkbox inline">
						<label> <input type="checkbox" id="inlineCheckbox1"
							value="agree"> Remember Password
						</label>
					</div>
				</div>
			</div>

			<div class="form-group">
				<div class="col-md-7 col-md-offset-3">
					<button type="submit" class="btn btn-default">Logar</button>
				</div>
			</div>
		</form>
	</div>
	<script src="../js/jquery.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/respond.min.js"></script>
	<script src="../js/html5shiv.js"></script>
	<script src="../js/custom.js"></script>
</body>
</html>