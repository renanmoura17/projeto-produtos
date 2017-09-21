package br.com.renan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.renan.model.entidades.Produto;
import br.com.renan.model.entidades.Usuario;
import br.com.renan.model.repositorios.UsuarioRepositorio;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired private UsuarioRepositorio usuarioRepositorio;
	
	@RequestMapping("/")
	public String acessarIndex() {
		return "index";
	}
	
	//produtos/app/lista/lista-produtos
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.OK)
	public String logar( @Valid @ModelAttribute Usuario usuario, BindingResult bindingResult, 
			RedirectAttributes redirectAttributes, Model model ) {
		
		//Fazer tratamento do login
		
		return "produtos"; 
		
	}
}
