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
<title>Cadastro de Alum�nios</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />	
	<div class="cart">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3 class="title">
						<i class="fa fa-star"></i> Alum�nios <span class="color"></span>
					</h3>
					<br />
					<table class="table table-striped tcart">
						<thead>
							<tr>
								<th>#</th>
								<th>Codigo</th>
								<th>Marca</th>
								<th>Descri��o</th>
								<th>Tipo</th>
								<th>Reutiliz�vel</th>
								<th>Peso</th>
								<th>Valor</th>
								<th></th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="a" items="${listagem}">
								<tr>
									<td>${a.id}</td>
									<td>${a.codigo}</td>
									<td>${a.marca}</td>
									<td>${a.descricao}</td>
									<td>${a.tipo}</td>
									<td>${a.reutilizavel}</td>
									<td>${a.peso}</td>
									<td>${a.valor}</td>
									<td><button class="btn btn-xs btn-default" title="Excluir">
											<a href="/aluminio/${a.id}/excluir"><i
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

