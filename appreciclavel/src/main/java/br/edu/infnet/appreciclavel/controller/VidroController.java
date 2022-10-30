package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import br.edu.infnet.appreciclavel.model.domain.Vidro;

@Controller
public class VidroController {

	private static List<Vidro> vidros = new ArrayList<Vidro>();

	public static void incluit(Vidro vidro) {
		vidros.add(vidro);
	}

	@GetMapping(value = "vidro/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", vidros);

		return "vidro/lista";

	}

}
