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
<title>Cadastro Plástico</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3 class="title">
					<i class="fa fa-star"></i> Cadastro Plástico <span class="color"></span>
				</h3>
				<br />
				<div class="form">
					<form class="form-horizontal" action="/plastico/incluir"
						method="post">
						<div class="form-group">
							<label class="control-label col-md-3" for="marca">Marca</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="marca">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3" for="email">Descrição</label>
							<div class="col-md-7">
								<input type="text" class="form-control" name="descricao">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">Tipo</label>
							<div class="col-md-7">							
								<select class="form-control" name="tipo">								
									<option>SELECIONE...</option>
									<option value="filme">Filme</option>
									<option value="Tetra">Tetra</option>
									<option value="pvc">PVC</option>
									<option value="pet500">GARRAFA PET 500ML</option>
									<option value="pet600">GARRAFA PET 600ML</option>
									<option value="pet1000">GARRAFA PET 1000ML</option>
									<option value="pet1500">GARRAFA PET 1500ML</option>
									<option value="pet2000">GARRAFA PET 2000ML</option>
									<option value="pet2500">GARRAFA PET 2500ML</option>
									<option value="pet5000">GARRAFA PET 5000ML</option>
								</select>
							</div>
						</div>
						<c:import url="/WEB-INF/jsp/reciclavel.jsp" />
						<div class="form-group">
							<div class="col-md-9 col-md-offset-3">
								<button type="submit" class="btn btn-default">Salvar</button>
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