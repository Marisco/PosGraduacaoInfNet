package br.edu.infnet.appreciclavel.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appreciclavel.model.domain.Usuario;
import br.edu.infnet.appreciclavel.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping(value = "usuario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		usuarioService.excluir(id);
		return "redirect:/usuario/lista";

	}

	@GetMapping(value = "usuario/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", usuarioService.obterLista());
		return "usuario/lista";

	}
	
	@PostMapping(value = "usuario/incluir")
	public String incluir(Usuario usuario) {

		usuarioService.incluir(usuario);
		return "redirect:/usuario/lista";

	}
	
	@GetMapping(value = "usuario/cadastro")
	public String telaCadastro() {
		
		return "usuario/cadastro";

	}
	
	@PostMapping(value = "cep")
	public String buscarCep(Model model, @RequestParam String cep) {

		model.addAttribute("endereco", usuarioService.buscarCep(cep));
		
		return "usuario/cadastro";

	}

}
