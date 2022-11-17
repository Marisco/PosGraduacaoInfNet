package br.edu.infnet.appreciclavel.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.service.EntregaService;

@Controller
public class EntregaController {
	
	@Autowired
	private EntregaService entregaService;

	@GetMapping(value = "entrega/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		entregaService.excluir(id);
		return "redirect:/entrega/lista";

	}

	@GetMapping(value = "entrega/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", entregaService.obterLista());
		return "entrega/lista";

	}

}
