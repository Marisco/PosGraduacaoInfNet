package br.edu.infnet.appreciclavel.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Plastico;

@Controller
public class PlasticoController {

	private static Map<Integer, Plastico> mapa = new HashMap<Integer, Plastico>();
	private static Integer id = 1;

	public static void incluir(Plastico plastico) {
		plastico.setId(id++);
		mapa.put(plastico.getId(), plastico);
	}

	public static Collection<Plastico> obterLista() {
		return mapa.values();
	}

	@GetMapping(value = "plastico/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "plastico/lista";

	}

}
