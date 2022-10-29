package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;


@Controller
public class RecicladorController {
	
	@GetMapping(value="reciclador/lista")
	public String telaLista(Model model) {
		
		Reciclador r1 = new Reciclador();
		r1.setNome("Maria Silva");
		r1.setCpf("111.111.111-01");
		r1.setEmail("maria@gmail.com");		

		Reciclador r2 = new Reciclador();
		r2.setNome("João Silva");
		r2.setCpf("222.222.222-02");
		r2.setEmail("joão@gmail.com");

		Reciclador r3 = new Reciclador();
		r3.setNome("José Silva");
		r3.setCpf("333.333.333.-03");
		r3.setEmail("jose@gmail.com");
		
		List<Reciclador> reciclador = new ArrayList<Reciclador>();
		reciclador.add(r1);
		reciclador.add(r2);
		reciclador.add(r3);
		model.addAttribute("listagem", reciclador);
		
		return "reciclador/lista";
		
	}

}
