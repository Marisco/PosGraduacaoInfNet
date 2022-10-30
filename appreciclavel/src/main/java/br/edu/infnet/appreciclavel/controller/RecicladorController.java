package br.edu.infnet.appreciclavel.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;

@Controller
public class RecicladorController {

	private static Map<Integer, Reciclador> mapa = new HashMap<Integer, Reciclador>();
	private static Integer id = 1;

	public static void incluir(Reciclador reciclador) {
		reciclador.setId(id++);
		mapa.put(reciclador.getId(), reciclador);
	}

	public static Collection<Reciclador> obterLista() {
		return mapa.values();
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	@GetMapping(value = "reciclador/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/reciclador/lista";

	}

	@GetMapping(value = "reciclador/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());
		return "reciclador/lista";

	}

}
