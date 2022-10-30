package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;

@Controller
public class RecicladorController {

	private static List<Reciclador> recicladores = new ArrayList<Reciclador>();

	public static void incuir(Reciclador recilador) {
		recicladores.add(recilador);
	}

	@GetMapping(value = "reciclador/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", recicladores);
		return "reciclador/lista";

	}

}
