package br.edu.infnet.appreciclavel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.service.VidroService;

@Controller
public class VidroController {

	@Autowired
	VidroService vidroService;

	@GetMapping(value = "vidro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		vidroService.excluir(id);
		return "redirect:/vidro/lista";

	}

	@GetMapping(value = "vidro/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", vidroService.obterLista());

		return "vidro/lista";

	}
	
	@PostMapping(value = "vidro/incluir")
	public String incluir(Vidro vidro) {

		vidroService.incluir(vidro);
		return "redirect:/vidro/lista";

	}
	
	@GetMapping(value = "vidro/cadastro")
	public String telaCadastro() {
		
		return "vidro/cadastro";

	}

}
