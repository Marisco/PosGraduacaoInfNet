package br.edu.infnet.appreciclavel.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Reciclador;
import br.edu.infnet.appreciclavel.model.domain.Reciclavel;
import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;
import br.edu.infnet.appreciclavel.model.domain.Plastico.TipoPlastico;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;

@Controller
public class EntregaController {
	
	@GetMapping(value="entrega/lista")
	public String telaLista(Model model) {

		Aluminio aluminio = new Aluminio();
		aluminio.setTipo(TipoAluminio.lata473);
		aluminio.setMarca("Heineken");
		aluminio.setDescricao("CERVEJA");
		aluminio.setCodigo(1);				
		aluminio.setReutilizavel(false);
		aluminio.setPeso((float) 0.11);
		aluminio.setValor((float) 0.05);		
		
		Vidro vidro = new Vidro();
		vidro.setTipo(TipoGarrafa.garrafa500);
		vidro.setMarca("Don Simon");
		vidro.setDescricao("Vinho");
		vidro.setCodigo(2);	
		vidro.setReutilizavel(true);
		vidro.setPeso((float) 0.35);
		vidro.setValor((float) 0.03);
				
		
		Plastico plastico = new Plastico();
		plastico.setTipo(TipoPlastico.pet1000);
		plastico.setMarca("Campo Largo");
		plastico.setDescricao("VINHO");	
		plastico.setCodigo(3);	
		plastico.setReutilizavel(false);
		plastico.setPeso((float) 0.03);
		plastico.setValor((float) 0.01);
		
		List<Reciclavel> reciclaveisPrimeiraEntrega = new ArrayList<Reciclavel>();
		reciclaveisPrimeiraEntrega.add(plastico);
		reciclaveisPrimeiraEntrega.add(vidro);
		
		List<Reciclavel> reciclaveisSegundaEntrega = new ArrayList<Reciclavel>();
		reciclaveisSegundaEntrega.add(aluminio);
		
		Reciclador r1 = new Reciclador();
		r1.setNome("Maria Silva");
		r1.setCpf("111.111.111-01");
		r1.setEmail("maria@gmail.com");		
		
		Entrega e1 = new Entrega(r1);						
		e1.setWeb(true);
		e1.setDescricao("Primeira Entrega");
		e1.setReciclaveis(reciclaveisPrimeiraEntrega);
				
		Entrega e2 = new Entrega(r1);						
		e2.setWeb(false);
		e2.setDescricao("Segunda Entrega");
		e2.setReciclaveis(reciclaveisPrimeiraEntrega);
				
		Reciclador r2 = new Reciclador();
		r2.setNome("João Silva");
		r2.setCpf("222.222.222-02");
		r2.setEmail("joão@gmail.com");		
		
		Entrega e3 = new Entrega(r2);		
		e3.setDescricao("Terceira Entrega");
		e3.setReciclaveis(reciclaveisSegundaEntrega);
		
		
		List<Entrega> entregas = new ArrayList<Entrega>();
		entregas.add(e1);
		entregas.add(e2);
		entregas.add(e3);
		model.addAttribute("listagem", entregas);		
		
		return "entrega/lista";
		
	}

}
