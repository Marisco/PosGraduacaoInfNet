package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Entrega;

@Controller
public class EntregaController {

	private static List<Entrega> entregas = new ArrayList<Entrega>();

	public static void incluir(Entrega entrega) {
		entregas.add(entrega);
	}

	@GetMapping(value = "entrega/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", entregas);

		return "entrega/lista";

	}

}
