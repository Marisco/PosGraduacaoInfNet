package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;
import br.edu.infnet.appreciclavel.model.domain.Plastico.TipoPlastico;
import br.edu.infnet.appreciclavel.model.domain.Reciclavel;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;

@Controller
public class ReciclavelController {
	
	@GetMapping(value="reciclavel/lista")
	public String telaLista(Model model) {
		
		Aluminio a1 = new Aluminio();
		a1.setTipo(TipoAluminio.lata473);
		a1.setMarca("Heineken");
		a1.setDescricao("CERVEJA");
		a1.setCodigo(1);				
		a1.setReutilizavel(false);
		a1.setPeso((float) 0.11);
		a1.setValor((float) 0.05);		
		
		Vidro v1 = new Vidro();
		v1.setTipo(TipoGarrafa.garrafa500);
		v1.setMarca("Don Simon");
		v1.setDescricao("Vinho");
		v1.setCodigo(2);	
		v1.setReutilizavel(true);
		v1.setPeso((float) 0.35);
		v1.setValor((float) 0.03);		
		
		Plastico p1 = new Plastico();
		p1.setTipo(TipoPlastico.pet1000);
		p1.setMarca("Campo Largo");
		p1.setDescricao("VINHO");	
		p1.setCodigo(3);	
		p1.setReutilizavel(false);
		p1.setPeso((float) 0.03);
		p1.setValor((float) 0.01);
		
		List<Reciclavel> reciclavel = new ArrayList<Reciclavel>();
		reciclavel.add(a1);
		reciclavel.add(v1);
		reciclavel.add(p1);
		model.addAttribute("listagem", reciclavel);
		
		return "reciclavel/lista";
		
	}

}
