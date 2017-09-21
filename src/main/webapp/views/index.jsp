<!DOCTYPE HTML>
<html>
	<head>
		<title>Página inicial</title>
		<meta charset="utf-8">
		<!--Import Google Icon Font-->
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<!--Import materialize.css-->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

		<link rel="stylesheet" href="../../css/estilo.css">

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
						<li><a href="/">Login</a></li>
					</ul>

					<!-- Menu lateral expansivel -->
					<ul class="right hide-on-med-and-down">
						<li>
							<a href="/">
								<i class="large material-icons">email</i>
							</a>
						</li>
					</ul>
					
					<ul class="side-nav" id="mobile">
						<li><a href="/">Login</a></li>
					</ul>
				</div>
			</nav>
		</header>

		<div class="container box-default">

			<!-- Imagem superior -->
			<div class="alinhamento-central">
				<img src="../../img/lojas-americanas.jpg" class="responsive-img img-padrao">
				<img src="../../img/lojas-americanas2.jpg" class="responsive-img img-padrao">
				<img src="../../img/lojas-americanas3.jpg" class="responsive-img img-padrao">
			</div>

			<!-- A box principal foi dividida em duas partes: uma contendo o texto e a outra contendo o form -->
			<div id="box-principal" class="row">
				<div class="col s6">
					<h4 class="red-text">Bem-vindo</h4>
					<p>Bem-vindo ao website do Plano de Ações das Lojas Americanas. Aqui você poderá acessar todas as informações relevantes ao seu plano. Por favor entre no site usando o usuário e senha que você definiu no seu processo de ativação de conta.</p>
				</div>

				<div class="col s6">
					<form method="post">

						<div class="input-field">
							<input type="text" name="titulo" class="red-text"/>
							<label class="red-text">Nome de usuário</label>
						</div>

						<div class="input-field">
							<input type="text" name="titulo" class="red-text"/>
							<label class="red-text">Senha</label>
						</div>
		
					<button class="btn red" type="submit">Entrar</button>
					<p>
						<a href="">Esqueci a senha</a>
					</p>
					
				</form>
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
