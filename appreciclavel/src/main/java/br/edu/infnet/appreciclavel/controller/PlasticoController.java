package br.edu.infnet.appreciclavel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.service.PlasticoService;

@Controller
public class PlasticoController {
	
	@Autowired
	private PlasticoService platicoService;

	@GetMapping(value = "plastico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		platicoService.excluir(id);
		return "redirect:/plastico/lista";

	}

	@GetMapping(value = "plastico/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", platicoService.obterLista());

		return "plastico/lista";

	}

}
