package br.edu.infnet.appreciclavel.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.domain.Reciclavel;

@Controller
public class EntregaController {

	private static Map<Integer, Entrega> mapa = new HashMap<Integer, Entrega>();
	private static Integer id = 1;
	private static Integer idReciclavel = 1;

	public static void incluir(Entrega entrega) {

		entrega.setId(id++);
		List<Reciclavel> reciclaveis = entrega.getReciclaveis();
		reciclaveis.forEach(r -> r.setId(idReciclavel++));

		mapa.put(entrega.getId(), entrega);
	}

	public static Collection<Entrega> obterLista() {
		return mapa.values();
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	@GetMapping(value = "entrega/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/entrega/lista";

	}

	@GetMapping(value = "entrega/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "entrega/lista";

	}

}
