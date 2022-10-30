package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Plastico;

@Controller
public class PlasticoController {

	private static List<Plastico> plasticos = new ArrayList<Plastico>();

	public static void incluir(Plastico plastico) {
		plasticos.add(plastico);
	}

	@GetMapping(value = "plastico/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", plasticos);

		return "plastico/lista";

	}

}
