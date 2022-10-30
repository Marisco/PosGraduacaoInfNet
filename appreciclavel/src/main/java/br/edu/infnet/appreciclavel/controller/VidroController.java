package br.edu.infnet.appreciclavel.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import br.edu.infnet.appreciclavel.model.domain.Vidro;

@Controller
public class VidroController {

	private static Map<Integer, Vidro> mapa = new HashMap<Integer, Vidro>();
	private static Integer id = 1;

	public static void incluir(Vidro vidro) {
		vidro.setId(id++);
		mapa.put(vidro.getId(), vidro);
	}

	public static Collection<Vidro> obterLista() {
		return mapa.values();
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	@GetMapping(value = "vidro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/vidro/lista";

	}

	@GetMapping(value = "vidro/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "vidro/lista";

	}

}
