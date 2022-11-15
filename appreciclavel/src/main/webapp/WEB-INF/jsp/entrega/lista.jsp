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
<title>Listagem de Entregas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="cart">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3 class="title">
						<i class="fa fa-star"></i> Entregas <span class="color"></span>
					</h3>
					<br />
					<c:forEach var="e" items="${listagem}">
						<h3 class="title">
							<i class="fa fa-check"></i>${e.id} => ${e.descricao} em ${e.data}
							<span class="color"></span>
							<button class="btn btn-xs btn-default pull-right" title="Excluir">
								<a href="/entrega/${e.id}/excluir"><i class="fa fa-times"></i></a>
							</button>
						</h3>
						<h3 class="title">
							<i class="fa fa-user"></i> ${e.reciclador.nome} <span
								class="color"></span>
						</h3>
						<table class="table table-striped tcart">
							<thead>
								<tr>
									<th>#</th>
									<th>Codigo</th>
									<th>Descrição</th>
									<th>Data</th>
									<th>Web</th>
									<th>Peso</th>
									<th>Valor</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="r" items="${e.reciclaveis}">
									<tr>
										<td>${r.id}</td>
										<td>${r.codigo}</td>
										<td>${r.marca}</td>
										<td>${r.descricao}</td>
										<td>${r.tipo}</td>
										<td>${r.reutilizavel}</td>
										<td>${r.peso}</td>
										<td>${r.valor}</td>
									</tr>
								</c:forEach>
								<tr>
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
					</c:forEach>
				</div>
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

