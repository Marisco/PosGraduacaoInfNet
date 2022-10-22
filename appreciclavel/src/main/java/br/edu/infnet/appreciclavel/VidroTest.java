package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Vidro.tipo;

@Component
public class VidroTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Vidro v1 = new Vidro();
		v1.tipo =  tipo.garrafa500;
		v1.marca = "Don Simon";
		v1.descricao = "VINHO";
		v1.peso = (float) 0.1;
		v1.valor = (float) 0.08;
		System.out.println("Vidro: " + v1);
		
		Vidro v2 = new Vidro();
		v2.tipo =  tipo.garrafa600;
		v2.marca = "Coca-Cola";
		v2.descricao = "Refrigerante";
		v2.peso = (float) 0.2;
		v2.valor = (float) 0.09;
		System.out.println("Vidro: " + v2);
		
		Vidro v3 = new Vidro();
		v3.tipo =  tipo.garrafa1000;
		v3.marca = "TIGRE";
		v3.descricao = "TUBO 10";
		v3.peso = (float) 0.25;
		v3.valor = (float) 0.10;
		System.out.println("Vidro: " + v3);
		
	}

}
