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
<title>Listagem Recicladores</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="cart">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h3 class="title">
						<i class="fa fa-star"></i> Recicladores <span class="color"></span>
					</h3>
					<br />
					<table class="table table-striped tcart">
						<thead>
							<tr>
								<th>#</th>
								<th>Nome</th>
								<th>Cpf</th>
								<th>Emai</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="r" items="${listagem}">
								<tr>
									<td>${r.id}</td>
									<td>${r.nome}</td>
									<td>${r.cpf}</td>
									<td>${r.email}</td>
									<td><button class="btn btn-xs btn-default" title="Excluir">
											<a href="/reciclador/${r.id}/excluir"><i
												class="fa fa-times"></i></a>
										</button></td>
								</tr>
							</c:forEach>
							<tr>
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

