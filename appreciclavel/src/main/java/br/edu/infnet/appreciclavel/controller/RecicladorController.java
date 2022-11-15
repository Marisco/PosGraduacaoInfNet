package br.edu.infnet.appreciclavel.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.service.RecicladorService;

@Controller
public class RecicladorController {

	@Autowired
	RecicladorService recicladorService;

	@GetMapping(value = "reciclador/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		recicladorService.excluir(id);
		return "redirect:/reciclador/lista";

	}

	@GetMapping(value = "reciclador/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", recicladorService.obterLista());
		return "reciclador/lista";

	}

}
