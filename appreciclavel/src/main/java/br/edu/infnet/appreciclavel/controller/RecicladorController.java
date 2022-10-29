package br.edu.infnet.appreciclavel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecicladorController {
	
	@GetMapping(value="reciclador/lista")
	public String telaLista() {
		
		return "reciclador/lista";
		
	}

}
