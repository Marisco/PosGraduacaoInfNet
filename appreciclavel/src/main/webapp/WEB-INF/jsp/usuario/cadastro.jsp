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
	<div class="container">
		<div class="row">
			<div class="col-md-12">
			
			<h3 class="title">
					<i class="fa fa-star"></i> Usuarios <span class="color"></span>
				</h3>
				<br />
				<div class="form">
					<form class="form-horizontal"  action="/cep" method="post">
						<div class="form-group">
							<label class="control-label col-md-3" for="cep">cep</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="cep">
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-9 col-md-offset-3">
								<button type="submit" class="btn btn-default">Buscar Cep</button>
							</div>
						</div>
					</div>
				</div>
				<h3 class="title">
					<i class="fa fa-star"></i> Usuarios <span class="color"></span>
				</h3>
				<br />
				<div class="form">
					<form class="form-horizontal"  action="/usuario/incluir" method="post">
						<div class="form-group">
							<label class="control-label col-md-3" for="nome">Nome</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="nome">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3" for="email">Email</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="email">
							</div>
						</div>						
						<div class="form-group">
							<label class="control-label col-md-3" for="senha">Senha</label>
							<div class="col-md-7">
								<input type="password" class="form-control" name="senha">
							</div>
						</div>
						
						<c:import url="/WEB-INF/jsp/endereco.jsp"/>
						
						<div class="form-group">
							<div class="col-md-9 col-md-offset-3">
								<button type="submit" class="btn btn-default">Registrar</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<script src="../js/jquery.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		<script src="../js/respond.min.js"></script>
		<script src="../js/html5shiv.js"></script>
		<script src="../js/custom.js"></script>
</body>
</html>