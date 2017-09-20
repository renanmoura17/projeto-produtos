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
					<input type="text" name="titulo" class="red-text" required /> 
					<label class="red-text">Nome*</label>
				</div>
				
				<div class="input-field">
					<input type="text" name="titulo" class="red-text" required /> 
					<label class="red-text">Preço*</label>
				</div>
				
				<div class="input-field">
					<input type="text" name="foto" class="red-text" /> 
					<label class="red-text">Foto (Opcional)</label>
				</div>
			</div>

			<div class="modal-footer">
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