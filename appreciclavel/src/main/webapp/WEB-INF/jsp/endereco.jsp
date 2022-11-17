<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div class="form-group">
	<label class="control-label col-md-3">Cep</label>
	<div class="col-md-7">
		<input type="text" class="form-control"
			placeholder="Digite seu cep" value="${endereco.cep}"
			name="endereco.cep">
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-3">Logradouro</label>
	<div class="col-md-7">
		<input type="text" class="form-control"
			placeholder="Digite seu logradouro"
			value="${endereco.logradouro}" name="endereco.logradouro">
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-3">Complemento:</label>
	<div class="col-md-7">
		<input type="text" class="form-control"
			placeholder="Digite seu complemento"
			value="${endereco.complemento}" name="endereco.complemento">
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-3">Bairro</label>
	<div class="col-md-7">
		<input type="text" class="form-control"
			placeholder="Digite seu bairro" value="${endereco.bairro}"
			name="endereco.bairro">
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-3">Localidade</label>
	<div class="col-md-7">
		<input type="text" class="form-control"
			placeholder="Digite sua localidade"
			value="${endereco.localidade}" name="endereco.localidade">
	</div>
</div>

<div class="form-group">
	<label class="control-label col-md-3">UF</label>
	<div class="col-md-7">
		<input type="text" class="form-control"
			placeholder="Digite sua UF" value="${endereco.uf}"
			name="endereco.uf">
	</div>
</div>