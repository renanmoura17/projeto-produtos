package br.com.renan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.renan.model.entidades.Produto;
import br.com.renan.model.repositorios.ProdutoRepositorio;


@Controller
@RequestMapping("/lista") //Mapeia o padrão de URL a ser recuperado
public class ProdutoController {
	
	@Autowired private ProdutoRepositorio produtoRepositorio;
	
	@RequestMapping(value = "lista-produtos", method = RequestMethod.GET)
	public String listarProdutos( Model model ) {
		
		Iterable<Produto> produtos = produtoRepositorio.findAll();
		
		model.addAttribute("titulo", "Listagem de Produtos");
		model.addAttribute("produtos", produtos);
		
		return "produtos";
	}
	
	@RequestMapping(value = "lista-produtos", method = RequestMethod.POST)
	public String adicionarProduto ( 
			@Valid @ModelAttribute Produto produto, 
			BindingResult bindingResult, 
			RedirectAttributes redirectAttributes ) {
		
		if ( bindingResult.hasErrors() ) {
			FieldError error = bindingResult.getFieldErrors().get(0);
			redirectAttributes.addFlashAttribute("mensagem", "Não foi possível salvar o produto. Erro no campo '" + error.getField() + "'");
		} else {
			produtoRepositorio.save(produto);
		}
		
		return "redirect:/app/lista/lista-produtos";
	}
	
}
