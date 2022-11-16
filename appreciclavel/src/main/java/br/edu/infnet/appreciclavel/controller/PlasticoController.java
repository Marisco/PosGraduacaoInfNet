package br.edu.infnet.appreciclavel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.service.PlasticoService;

@Controller
public class PlasticoController {
	
	@Autowired
	private PlasticoService plasticoService;

	@GetMapping(value = "plastico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		plasticoService.excluir(id);
		return "redirect:/plastico/lista";

	}

	@GetMapping(value = "plastico/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", plasticoService.obterLista());

		return "plastico/lista";

	}
	
	@PostMapping(value = "plastico/incluir")
	public String incluir(Plastico plastico) {

		plasticoService.incluir(plastico);
		return "redirect:/plastico/lista";

	}
	
	@GetMapping(value = "plastico/cadastro")
	public String telaCadastro() {
		
		return "plastico/cadastro";

	}

}
