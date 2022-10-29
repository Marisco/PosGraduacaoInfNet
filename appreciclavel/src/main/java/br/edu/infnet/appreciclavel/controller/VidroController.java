package br.edu.infnet.appreciclavel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VidroController {
	
	@GetMapping(value="vidro/lista")
	public String telaLista() {
		
		return "vidro/lista";
		
	}

}
