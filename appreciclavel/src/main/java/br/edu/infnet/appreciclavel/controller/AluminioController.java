package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;

@Controller
public class AluminioController {

	private static List<Aluminio> alunimios = new ArrayList<Aluminio>();

	public static void incluir(Aluminio aluminio) {
		alunimios.add(aluminio);
	}

	@GetMapping(value = "aluminio/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", alunimios);

		return "aluminio/lista";

	}

}
