package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Reciclavel;

@Controller
public class ReciclavelController {
	private static List<Reciclavel> reciclaveis = new ArrayList<Reciclavel>();

	public static void incluir(Reciclavel reciclavel) {

		reciclaveis.add(reciclavel);

	}

	@GetMapping(value = "reciclavel/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", reciclaveis);

		return "reciclavel/lista";

	}

}
