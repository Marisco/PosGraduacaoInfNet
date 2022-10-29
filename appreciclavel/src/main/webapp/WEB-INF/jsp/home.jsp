<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/blue.css" rel="stylesheet">
<link rel="shortcut icon" href="img/favicon/favicon.png">
<title></title>
</head>
<body>
	<header>
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="logo">
						<h1>
							<a href="#">App<span class="color bold">Reciclável</span></a>
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
					<li><a href="/reciclavel/lista">Recicláveis</a></li>
					<li><a href="/aluminio/lista">Alumínios</a></li>
					<li><a href="/plastico/lista">Plásticos</a></li>
					<li><a href="/vidro/lista">Vidros</a></li>
				</ul>
			</nav>
		</div>
	</div>

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/respond.min.js"></script>
	<script src="js/html5shiv.js"></script>
	<script src="js/custom.js"></script>
</body>
</html>