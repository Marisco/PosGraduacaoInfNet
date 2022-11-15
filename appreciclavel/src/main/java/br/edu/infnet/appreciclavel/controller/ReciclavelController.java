package br.edu.infnet.appreciclavel.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.service.ReciclavelService;

@Controller
public class ReciclavelController {
	
	@Autowired
	ReciclavelService reciclavelService;

	@GetMapping(value = "reciclavel/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		reciclavelService.excluir(id);
		return "redirect:/reciclavel/lista";

	}

	@GetMapping(value = "reciclavel/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", reciclavelService.obterLista());

		return "reciclavel/lista";

	}

}
