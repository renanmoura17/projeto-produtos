package br.com.renan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.renan.model.repositorios.UsuarioRepositorio;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired private UsuarioRepositorio usuarioRepositorio;
	
	@RequestMapping("qtd")
	@ResponseBody
	public String quantidadeUsuarios () {
		return "Atualmente, há " +  usuarioRepositorio.count() + " usuários cadastrados!";
	}
	
}
