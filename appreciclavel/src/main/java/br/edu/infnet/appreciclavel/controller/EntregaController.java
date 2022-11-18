package br.edu.infnet.appreciclavel.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.domain.Usuario;
import br.edu.infnet.appreciclavel.model.service.EntregaService;
import br.edu.infnet.appreciclavel.model.service.RecicladorService;
import br.edu.infnet.appreciclavel.model.service.ReciclavelService;

@Controller
public class EntregaController {
	
	@Autowired
	private EntregaService entregaService;

	@Autowired
	private RecicladorService recicladorService;
	@Autowired
	private ReciclavelService reciclavelService;

	@GetMapping(value = "entrega/cadastro")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("recicladores", recicladorService.obterLista(usuario));

		model.addAttribute("reciclaveis", reciclavelService.obterLista(usuario));
		
		return "entrega/cadastro";
	}
	
	@GetMapping(value = "entrega/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", entregaService.obterLista(usuario));

		return "entrega/lista";
	}
	
	@PostMapping(value = "entrega/incluir")
	public String incluir(Entrega entrega, @SessionAttribute("user") Usuario usuario) {
		
		System.out.println("Reciclador: " + entrega.getReciclador());		
		System.out.println("Reciclaveis: " + entrega.getReciclaveis());
		
		entrega.setUsuario(usuario);
		
		entregaService.incluir(entrega);
		
		return "redirect:/entrega/lista";
	}

	@GetMapping(value = "entrega/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		entregaService.excluir(id);
		
		return "redirect:entrega/lista";
	}

}
