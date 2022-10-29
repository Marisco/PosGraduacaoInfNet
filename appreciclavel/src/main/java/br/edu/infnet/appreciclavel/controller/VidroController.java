package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;

@Controller
public class VidroController {
	
	@GetMapping(value="vidro/lista")
	public String telaLista(Model model) {
		
		Vidro v1 = new Vidro();
		v1.setCodigo(10);	
		v1.setReutilizavel(true);
		v1.setPeso((float) 0.35);
		v1.setValor((float) 0.03);
		v1.setTipo(TipoGarrafa.garrafa500);
		v1.setMarca("Don Simon");
		v1.setDescricao("Vinho");		
		
		Vidro v2 = new Vidro();
		v2.setCodigo(11);	
		v2.setReutilizavel(true);
		v2.setPeso((float) 0.45);
		v2.setValor((float) 0.05);
		v2.setTipo(TipoGarrafa.garrafa600);
		v2.setMarca("Coca-Cola");
		v2.setDescricao("Refrigerante");		
		
		Vidro v3 = new Vidro();
		v3.setCodigo(12);	
		v3.setReutilizavel(true);
		v3.setPeso((float) 0.55);
		v3.setValor((float) 0.07);
		v3.setTipo(TipoGarrafa.garrafa1000);
		v3.setMarca("Galo");
		v3.setDescricao("Azeite");
		
		List<Vidro> vidros = new ArrayList<Vidro>();
		vidros.add(v1);
		vidros.add(v2);
		vidros.add(v3);
		model.addAttribute("listagem", vidros);
		
		
		return "vidro/lista";
		
	}

}
