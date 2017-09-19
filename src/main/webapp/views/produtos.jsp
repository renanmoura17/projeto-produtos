<!DOCTYPE HTML>
<html>
	<head>
		<title>Produtos</title>
		<meta charset="utf-8">
		<!--Import Google Icon Font-->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<!--Import materialize.css-->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

		<link rel="stylesheet" href="../css/estilo.css">

		<!--Let browser know website is optimized for mobile-->
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
				<div class="container">

					<div class="row">
						
						<table>
							<thead>
								<tr>
									<th>Nome</th>
									<th>CPF</th>
									<th>Valor</th>
									<th>Data</th>
								</tr>
							</thead>

							<tbody>
								<tr>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>

							</tbody>
						</table>
					</div>

					<div>
						<a class="btn indigo teal" href="{{ route('admin.cursos.adicionar') }}">Adicionar</a>
					</div>
			</div>
			
		</div>

		<!-- Carregamento do jQuery e do materialize.js-->
	    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
	    <script type="text/javascript">

	    	$(document).ready(function() {
	    		Materialize.updateTextFields();

	    		$(".button-collapse").sideNav();
	    	});

	    </script>
	</body>
</html>
