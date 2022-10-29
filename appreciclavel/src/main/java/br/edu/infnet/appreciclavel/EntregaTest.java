package br.edu.infnet.appreciclavel;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.domain.Reciclador;


@Component
public class EntregaTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("--------Cadastro de Entregas--------");
		Reciclador r1 = new Reciclador();
		r1.setNome("Maria Silva");
		r1.setCpf("111.111.111-01");
		r1.setEmail("maria@gmail.com");		
		
		
		Entrega e1 = new Entrega();
		e1.setData(LocalDateTime.now());				
		e1.setWeb(false);
		e1.setDescricao("Primeira Entrega");
		e1.setReciclador(r1);
		System.out.println("=> " + e1);
		
		Entrega e2 = new Entrega();
		e2.setData(LocalDateTime.now());				
		e2.setWeb(false);
		e2.setDescricao("Segunda Entrega");		
		e2.setReciclador(r1);
		System.out.println("=> " + e2);
		
		Reciclador r2 = new Reciclador();
		r2.setNome("João Silva");
		r2.setCpf("222.222.222-02");
		r2.setEmail("joão@gmail.com");		
		
		Entrega e3 = new Entrega();
		e3.setData(LocalDateTime.now());				
		e3.setWeb(false);
		e3.setDescricao("Terceira Entrega");
		e3.setReciclador(r2);
		System.out.println("=> " + e3);
		
	}

}
