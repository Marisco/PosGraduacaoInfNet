package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;


@Component
public class RecicladorTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("--------Cadastro de Recicladores--------");
		
		Reciclador r1 = new Reciclador();
		r1.setNome("Maria Silva");
		r1.setCpf("111.111.111-01");
		r1.setEmail("maria@gmail.com");		
		System.out.println("Reciclador: " + r1);
		
		Reciclador r2 = new Reciclador();
		r2.setNome("João Silva");
		r2.setCpf("222.222.222-02");
		r2.setEmail("joão@gmail.com");
		System.out.println("Reciclador: " + r2);
		
		Reciclador r3 = new Reciclador();
		r3.setNome("José Silva");
		r3.setCpf("333.333.333.-03");
		r3.setEmail("jose@gmail.com");
		System.out.println("Reciclador: " + r3);
		
	}

}