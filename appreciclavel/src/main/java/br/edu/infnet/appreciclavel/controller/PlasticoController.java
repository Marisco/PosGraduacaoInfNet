package br.edu.infnet.appreciclavel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlasticoController {
	
	@GetMapping(value="plastico/lista")
	public String telaLista() {
		
		return "plastico/lista";
		
	}

}
