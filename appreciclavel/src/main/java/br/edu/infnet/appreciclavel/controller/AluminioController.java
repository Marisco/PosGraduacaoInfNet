package br.edu.infnet.appreciclavel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.service.AluminioService;

@Controller
public class AluminioController {
	
	@Autowired
	private AluminioService aluminioService;
	
	@GetMapping(value = "aluminio/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {		
		aluminioService.excluir(id);
		return "redirect:/aluminio/lista";

	}

	@GetMapping(value = "aluminio/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listagem", aluminioService.obterLista());
		return "aluminio/lista";

	}

}
