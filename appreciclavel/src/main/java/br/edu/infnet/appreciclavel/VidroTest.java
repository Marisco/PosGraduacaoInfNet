package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;

@Component
public class VidroTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Vidro v1 = new Vidro();
		v1.tipo =  TipoGarrafa.garrafa500;
		v1.marca = "Don Simon";
		v1.descricao = "Vinho";		
		System.out.println("Vidro: " + v1);
		
		Vidro v2 = new Vidro();
		v2.tipo =  TipoGarrafa.garrafa600;
		v2.marca = "Coca-Cola";
		v2.descricao = "Refrigerante";		
		System.out.println("Vidro: " + v2);
		
		Vidro v3 = new Vidro();
		v3.tipo =  TipoGarrafa.garrafa1000;
		v3.marca = "Galo";
		v3.descricao = "Azeite";		
		System.out.println("Vidro: " + v3);
		
	}

}
