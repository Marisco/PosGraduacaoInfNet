package br.edu.infnet.appreciclavel.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;

@Controller
public class AluminioController {

	private static Map<Integer, Aluminio> mapa = new HashMap<Integer, Aluminio>();
	private static Integer id = 1;

	public static void incluir(Aluminio aluminio) {
		aluminio.setId(id++);
		mapa.put(aluminio.getId(), aluminio);
	}

	public static Collection<Aluminio> obterLista() {
		return mapa.values();
	}

	@GetMapping(value = "aluminio/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "aluminio/lista";

	}

}
