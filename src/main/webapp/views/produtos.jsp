<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<title>${titulo}</title>

		<!--Import Google Icon Font-->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<!--Import materialize.css-->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
		<link rel="stylesheet" href="../../css/estilo.css">
		
		<meta charset="utf-8" name="viewport" content="width=device-width, initial-scale=1.0"/>
		
	</head>
	<body>

		<header>
			<!-- Barra de navegacao do Materialize (Desktop e mobile) -->
			<nav class="red darken-4">
				<div class="nav-wrapper container red darken-4">
					
					<!-- Menu do topo -->
					<a href="#" data-activates="mobile" class="button-collapse"><i class="material-icons">menu</i></a>
					
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

		<div class="container box-default">
	
			<div id="box-principal" class="row">
				
				<!-- Se um erro ocorrer, a variavel mensagemErro o exibira de forma menos desagradavel ao usuario-->
				<c:if test="${ not empty mensagemErro }">
					<div class="container">
						${ mensagemErro }
					</div>
				</c:if>
				
				<div class="container">

					<div class="row">
						
						<table>
							<thead>
								<tr>
									<th>ID</th>
									<th>Nome</th>
									<th>Foto</th>
									<th>Preço</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach items="${ produtos }" var="produto">
									<tr>
										<td>${ produto.id }</td>
										<td>${ produto.nome }</td>
										<td>${ produto.foto }</td>
										<td>${ produto.preco }</td>
									</tr>
								</c:forEach>

							</tbody>
							
							<tfoot>
								<tr>
									<td colspan="4">Produtos Cadastrados: ${ produtos.size() }</td>
								</tr>
							</tfoot>
						</table>
						
						<div>
							<a class="waves-effect waves-light btn modal-trigger red" href="#modal-produto">Adicionar Produto</a>
						</div>
						
					</div>

				</div>				
			</div>
		</div>
		
		<!-- Janela modal de cadastro e al de produtos -->
		<jsp:include page="modal-produto.jsp"/>

		<!-- Carregamento do jQuery e do materialize.js-->
	    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	    <script type="text/javascript">

	    	$(document).ready(function() {
	    		Materialize.updateTextFields();
	    		
	    		$('#modal-produto').modal();

	    		$(".button-collapse").sideNav();
	    		
	    	});

	    </script>
	</body>
</html>
