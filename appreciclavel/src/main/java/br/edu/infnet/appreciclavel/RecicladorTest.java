package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.controller.RecicladorController;
import br.edu.infnet.appreciclavel.model.domain.Reciclador;


@Component
public class RecicladorTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("--------Cadastro de Recicladores--------");
		
		Reciclador r1 = new Reciclador();
		r1.setNome("MARIA SILVA");
		r1.setCpf("111.111.111-01");
		r1.setEmail("MARIA@GMAIL.COM");	
		RecicladorController.incuir(r1);
		System.out.println("Reciclador: " + r1);
		
		Reciclador r2 = new Reciclador();
		r2.setNome("JOÃO SILVA");
		r2.setCpf("222.222.222-02");
		r2.setEmail("JOÃO@GMAIL.COM");
		RecicladorController.incuir(r2);
		System.out.println("Reciclador: " + r2);
		
		Reciclador r3 = new Reciclador();
		r3.setNome("JOSÉ SILVA");
		r3.setCpf("333.333.333.-03");
		r3.setEmail("JOSE@GMAIL.COM");
		RecicladorController.incuir(r3);
		System.out.println("Reciclador: " + r3);
		
	}

}
