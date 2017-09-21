<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<title>${titulo}</title>

<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
<link rel="stylesheet" href="../../css/estilo.css">

<meta charset="utf-8" name="viewport"
	content="width=device-width, initial-scale=1.0" />

</head>
<body>

	<header>
		<!-- Barra de navegacao do Materialize (Desktop e mobile) -->
		<nav class="red darken-4">
			<div class="nav-wrapper container red darken-4">

				<!-- Menu do topo -->
				<a href="#" data-activates="mobile" class="button-collapse"><i
					class="material-icons">menu</i></a>

				<ul class="left hide-on-med-and-down">
					<li><a href="/">Revisão de adesão</a></li>
				</ul>

				<!-- Menu lateral expansivel -->
				<ul class="right hide-on-med-and-down">
				</ul>

				<ul class="side-nav" id="mobile">
					<li><a href="/">Revisão de adesão</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<form method="post">

		<h5 class="center">Informações do produto</h5>

		<div class="box-modal">
			<div class="input-field">
				<input type="text" id="nome" name="nome" class="red-text" /> <label
					class="red-text">Nome*</label>
			</div>

			<div class="input-field">
				<input type="text" id="preco" name="preco" class="red-text" /> <label
					class="red-text">Preço*</label>
			</div>

			<div class="file-field input-field">
				<div class="btn red">
					<span>Foto</span> <input type="file" id="foto" name="foto">
				</div>
				<div class="file-path-wrapper">
					<input class="file-path validate" type="text">
				</div>
			</div>
		</div>

		<div class="container modal-footer">
			<a href="#!"
				class="modal-action modal-close waves-effect waves-green btn-flat">
				Cancelar </a>
			<button type="submit" class="btn red">Salvar informações</button>
		</div>

	</form>

	<!-- Carregamento do jQuery e do materialize.js-->
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			Materialize.updateTextFields();

			$('#modal-produto').modal();

			$(".button-collapse").sideNav();

		});
	</script>
</body>
</html>