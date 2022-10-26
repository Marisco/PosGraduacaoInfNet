package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;


@Component
public class RecicladorTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Reciclador r1 = new Reciclador();
		r1.nome =  "Maria Silva";
		r1.cpf = "111.111.111-01";
		r1.email = "maria@gmail.com";		
		System.out.println("Reciclador: " + r1);
		
		Reciclador r2 = new Reciclador();
		r2.nome =  "João Silva";
		r2.cpf = "222.222.222-02";
		r2.email = "joão@gmail.com";
		System.out.println("Reciclador: " + r2);
		
		Reciclador r3 = new Reciclador();
		r3.nome =  "José Silva";
		r3.cpf = "333.333.333.-03";
		r3.email = "jose@gmail.com";
		System.out.println("Reciclador: " + r3);
		
	}

}
