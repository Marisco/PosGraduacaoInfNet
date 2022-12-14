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
<title>Cadastro de Vidros</title>
</head>
<body>
	<header>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="logo">
						<h1>
							<a href="#">App<span class="color bold">Reciclįvel</span></a>
						</h1>
						<p class="meta">Reuse, Recicle ou Reduza!!!</p>
					</div>
				</div>
				<div class="col-md-4 col-md-offset-4">
					<form role="form">
						<div class="input-group">
							<input class="form-control" id="search1"
								placeholder="Digite aqui"> <span class="input-group-btn">
								<button type="submit" class="btn btn-default">Pesquisar</button>
							</span>
						</div>
					</form>
					<div class="hlinks">
						<span class="lr"><a href="#login" role="button"
							data-toggle="modal">Logar</a> ou <a href="#register"
							role="button" data-toggle="modal">Registrar</a> </span>
					</div>
				</div>
			</div>
		</div>
	</header>
	<div class="navbar bs-docs-nav" role="banner">
		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target=".bs-navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<nav class="collapse navbar-collapse bs-navbar-collapse"
				role="navigation">
				<ul class="nav navbar-nav">
					<li><a href="/entrega/lista">Entregas</a></li>
					<li><a href="/reciclador/lista">Recicladores</a></li>
					<li><a href="/reciclavel/lista">Reciclįveis</a></li>
					<li><a href="/aluminio/lista">Alumķnios</a></li>
					<li><a href="/plastico/lista">Plįsticos</a></li>
					<li><a href="/vidro/lista">Vidros</a></li>
				</ul>
			</nav>
		</div>
	</div>
	<div class="cart">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3 class="title">
						<i class="fa fa-star"></i> Vidros <span class="color"></span>
					</h3>
					<br />
					<table class="table table-striped tcart">
						<thead>
							<tr>
								<th>#</th>
								<th>Código</th>
								<th>Marca</th>
								<th>Descriēćo</th>
								<th>Tipo</th>
								<th>Reutilizįvel</th>
								<th>Peso</th>
								<th>Valor</th>
								<th></th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="v" items="${listagem}">
								<tr>
									<td>${v.id}</td>
									<td>${v.codigo}</td>
									<td>${v.marca}</td>
									<td>${v.descricao}</td>
									<td>${v.tipo}</td>
									<td>${v.reutilizavel}</td>
									<td>${v.peso}</td>
									<td>${v.valor}</td>
									<td><button class="btn btn-xs btn-default" title="Excluir">
											<a href="/vidro/${v.id}/excluir"><i
												class="fa fa-times"></i></a>
										</button></td>
									
								</tr>
							</c:forEach>
							<tr>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th>Total</th>
								<th>todo</th>
							</tr>

						</tbody>
					</table>

					<script src="../js/jquery.js"></script>
					<script src="../js/bootstrap.min.js"></script>
					<script src="../js/respond.min.js"></script>
					<script src="../js/html5shiv.js"></script>
					<script src="../js/custom.js"></script>
</body>
</html>

