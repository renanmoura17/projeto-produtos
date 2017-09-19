package br.com.renan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/produtos") //Mapeia o padrão de URL a ser recuperado
public class ProdutoController {
	
	public ProdutoController() {
		System.out.println("criou o produto controller");
	}

	@RequestMapping("/ola/{nome}")
	@ResponseBody
	public String ola ( @PathVariable String nome) {
		return "Ola " + nome;
	}
	
}
