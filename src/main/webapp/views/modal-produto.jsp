<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="modal-produto" class="modal">
	<div class="modal-content">
		<form method="post">
		
			<h5 class="center">Informações do produto</h5>
		
			<div class="box-modal" >
				<div class="input-field">
					<input type="text" id="nome" name="nome" class="red-text" required /> 
					<label class="red-text">Nome*</label>
				</div>
				
				<div class="input-field">
					<input type="text" id="preco" name="preco" class="red-text" required /> 
					<label class="red-text">Preço*</label>
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
				<a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat">
					Cancelar 
				</a> 
				<button type="submit" class="btn red">
					Salvar informações
				</button>
			</div>
			
		</form>
	</div>
	
</div>