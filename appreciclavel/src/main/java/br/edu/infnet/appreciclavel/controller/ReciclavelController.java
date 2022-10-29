package br.edu.infnet.appreciclavel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReciclavelController {
	
	@GetMapping(value="reciclavel/lista")
	public String telaLista() {
		
		return "reciclavel/lista";
		
	}

}
