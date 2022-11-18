package br.edu.infnet.appreciclavel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Reciclador;
import br.edu.infnet.appreciclavel.model.domain.Reciclavel;
import br.edu.infnet.appreciclavel.model.domain.Usuario;
import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.service.EntregaService;

@Order(7)
@Component
public class EntregaTest implements ApplicationRunner {
	
	@Autowired
	private EntregaService entregaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("--------Cadastro de Entregas--------");	
		
		Usuario u1= new Usuario();
		u1.setId(1);
		
		Usuario u2= new Usuario();
		u2.setId(2);
		
		Reciclador r1 = new Reciclador();
		r1.setId(1);		
		r1.setUsuario(u1);
		
		Reciclador r2 = new Reciclador();
		r2.setId(2);		
		r2.setUsuario(u2);

		Aluminio aluminio = new Aluminio();
		aluminio.setId(1);			
		aluminio.setUsuario(u1);		

		Vidro vidro = new Vidro();
		vidro.setId(2);
		vidro.setUsuario(u1);

		Plastico plastico = new Plastico();
		plastico.setId(3);
		plastico.setUsuario(u2);		

		List<Reciclavel> reciclaveisPrimeiraEntrega = new ArrayList<Reciclavel>();		
		
		reciclaveisPrimeiraEntrega.add(plastico);
		reciclaveisPrimeiraEntrega.add(vidro);		

		List<Reciclavel> reciclaveisSegundaEntrega = new ArrayList<Reciclavel>();
		reciclaveisSegundaEntrega.add(aluminio);
		

		Entrega e1 = new Entrega();
		e1.setWeb(true);
		e1.setDescricao("PRIMEIRA ENTREGA");
		e1.setReciclaveis(reciclaveisPrimeiraEntrega);
		e1.setReciclador(r1);	
		e1.setUsuario(u1);		
		entregaService.incluir(e1);
		System.out.println("=> " + e1);

		Entrega e2 = new Entrega();
		e2.setWeb(false);
		e2.setDescricao("SEGUNDA ENTREGA");
		e2.setReciclaveis(reciclaveisPrimeiraEntrega);
		e2.setReciclador(r1);
		e2.setUsuario(u1);		
		entregaService.incluir(e2);
		System.out.println("=> " + e2);

		
		
		

		Entrega e3 = new Entrega();
		e3.setDescricao("TERCEIRA ENTREGA");
		e3.setReciclaveis(reciclaveisSegundaEntrega);
		e3.setReciclador(r2);
		e1.setUsuario(u2);
		entregaService.incluir(e3);
		System.out.println("=> " + e3);

	}

}