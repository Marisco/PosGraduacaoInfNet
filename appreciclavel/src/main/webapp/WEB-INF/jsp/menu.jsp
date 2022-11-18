<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						<input class="form-control" id="search1" placeholder="Digite aqui">
						<span class="input-group-btn">
							<button type="submit" class="btn btn-default">Pesquisar</button>
						</span>
					</div>
				</form>
				<div class="hlinks">
					<span class="lr"> <c:if test="${empty user}">
							<a href="/login" role="button">Login</a> ou <a
								href="/usuario/cadastro" role="button">Registrar</a>
						</c:if> <c:if test="${not empty user}">
							<a href="/logout" role="button">Logout ${user.nome}</a>
						</c:if>
					</span>
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
				<span class="sr-only">...</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
		</div>
		<nav class="collapse navbar-collapse bs-navbar-collapse"
			role="navigation">
			<ul class="nav navbar-nav">
				<li><a href="/">home</a></li>
				<c:if test="${not empty user}">					
					<li><a href="/reciclavel/lista">Recicláveis</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Entregas <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/entrega/cadastro">Cadastro</a></li>
							<li><a href="/entrega/lista">lista</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Recicladores <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/reciclador/cadastro">Cadastro</a></li>
							<li><a href="/reciclador/lista">Lista</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Alumínios <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/aluminio/cadastro">Cadastro</a></li>
							<li><a href="/aluminio/lista">Lista</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Plásticos <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/plastico/cadastro">Cadastro</a></li>
							<li><a href="/plastico/lista">Lista</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Vidros <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/vidro/cadastro">Cadastro</a></li>
							<li><a href="/vidro/lista">Lista</a></li>
						</ul></li>
				</c:if>
			</ul>
		</nav>
	</div>
</div>