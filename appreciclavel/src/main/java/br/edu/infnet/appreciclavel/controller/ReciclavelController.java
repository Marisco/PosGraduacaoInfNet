package br.edu.infnet.appreciclavel.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.domain.Reciclavel;

@Controller
public class ReciclavelController {
	private static Map<Integer, Reciclavel> mapa = new HashMap<Integer, Reciclavel>();
	private static Integer id = 1;

	public static void incluir(Reciclavel reciclavel) {
		reciclavel.setId(id++);
		mapa.put(reciclavel.getId(), reciclavel);
	}

	public static Collection<Reciclavel> obterLista() {
		return mapa.values();
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	@GetMapping(value = "reciclavel/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/reciclavel/lista";

	}

	@GetMapping(value = "reciclavel/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "reciclavel/lista";

	}

}
