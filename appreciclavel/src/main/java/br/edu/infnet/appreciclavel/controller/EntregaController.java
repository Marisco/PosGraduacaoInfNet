package br.edu.infnet.appreciclavel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntregaController {
	
	@GetMapping(value="entrega/lista")
	public String telaLista() {
		
		return "entrega/lista";
		
	}

}
