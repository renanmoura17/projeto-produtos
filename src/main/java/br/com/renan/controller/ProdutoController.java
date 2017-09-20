package br.com.renan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.renan.model.entidades.Produto;
import br.com.renan.model.repositorios.ProdutoRepositorio;


@Controller
@RequestMapping("/lista") //Mapeia o padrão de URL a ser recuperado
public class ProdutoController {
	
	@Autowired private ProdutoRepositorio produtoRepositorio;
	
	//@RequestMapping("lista-produtos")
	@RequestMapping(value = "lista-produtos", method = RequestMethod.GET)
	public String listarProdutos( Model model ) {
		Iterable<Produto> produtos = produtoRepositorio.findAll();
		
		model.addAttribute("titulo", "Listagem de Produtos");
		model.addAttribute("produtos", produtos);
		
		return "produtos";
	}
	
}
