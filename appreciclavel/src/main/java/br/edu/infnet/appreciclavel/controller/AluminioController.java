package br.edu.infnet.appreciclavel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AluminioController {
	
	@GetMapping(value="aluminio/lista")
	public String telaLista() {
		
		return "aluminio/lista";
		
	}

}
