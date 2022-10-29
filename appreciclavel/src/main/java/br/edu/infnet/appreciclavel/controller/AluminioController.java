package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;

@Controller
public class AluminioController {
	
	@GetMapping(value="aluminio/lista")
	public String telaLista(Model model) {		
		
		Aluminio a1 = new Aluminio();
		a1.setCodigo(4);				
		a1.setReutilizavel(false);
		a1.setPeso((float) 0.11);
		a1.setValor((float) 0.05);
		a1.setTipo(TipoAluminio.lata473);
		a1.setMarca("Heineken");
		a1.setDescricao("CERVEJA");		
		System.out.println("Aluminio: " + a1);
		
		Aluminio a2 = new Aluminio();
		a2.setCodigo(5);				
		a2.setReutilizavel(false);
		a2.setPeso((float) 0.06);
		a2.setValor((float) 0.04);
		a2.setTipo(TipoAluminio.Lata250);
		a2.setMarca("Coca Cola");
		a2.setDescricao("Refrigerante");		
		System.out.println("Aluminio: " + a2);
		
		Aluminio a3 = new Aluminio();
		a3.setCodigo(6);				
		a3.setReutilizavel(false);
		a3.setPeso((float) 0.08);
		a3.setValor((float) 0.03);
		a3.setTipo(TipoAluminio.lata500);
		a3.setMarca("RED BULL");
		a3.setDescricao("ENERGÉTICO");		
		System.out.println("Aluminio: " + a3);
		
		List<Aluminio> alunimios = new ArrayList<Aluminio>();
		alunimios.add(a1);
		alunimios.add(a2);
		alunimios.add(a3);
		model.addAttribute("listagem", alunimios);
		
		return "aluminio/lista";
		
	}

}
