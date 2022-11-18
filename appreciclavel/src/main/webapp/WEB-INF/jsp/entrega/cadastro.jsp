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
<title>Cadastro Entregas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3 class="title">
					<i class="fa fa-star"></i> Cadastro Entregas <span class="color"></span>
				</h3>
				<br />
				<div class="form">
					<form class="form-horizontal" action="/entrega/incluir"
						method="post">
						<div class="form-group">
							<label class="control-label col-md-3">Descrição</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="descricao">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Data</label>
							<div class="col-md-7">
								<input type="datetime-local" class="form-control"
									name="dtSolicitante">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Reciclador</label>
							<div class="col-md-7">
								<select name="recicladores" class="form-control">
									<c:forEach var="r" items="${recicladores}">
										<option value="${r.id}">${r.nome}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Recicláveis</label>
							<div class="col-md-7">
								<c:forEach var="r" items="${reciclaveis}">
									<div class="form-check">
										<input class="form-check-input" type="checkbox"
											name="Reciclaveis" value="${r.id}"> <label
											class="form-check-label"> ${r.descricao} - ${r.marca}
											- ${r.tipo} </label>
									</div>
								</c:forEach>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-9 col-md-offset-3">
								<button type="submit" class="btn btn-default">Salvar</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>