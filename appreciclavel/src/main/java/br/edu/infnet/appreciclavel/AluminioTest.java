package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.tipo;

@Component
public class AluminioTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Aluminio a1 = new Aluminio();
		a1.tipo =  tipo.lata473;
		a1.marca = "Heineken";
		a1.descricao = "CERVEJA";
		a1.peso = (float) 0.11;
		a1.valor = (float) 0.50;
		System.out.println("Aluminio: " + a1);
		
		Aluminio a2 = new Aluminio();
		a2.tipo =  tipo.Lata250;
		a2.marca = "Coca Cola";
		a2.descricao = "Refrigerante";
		a2.peso = (float) 0.8;
		a2.valor = (float) 0.40;
		System.out.println("Aluminio: " + a2);
		
		Aluminio a3 = new Aluminio();
		a3.tipo =  tipo.lata500;
		a3.marca = "RED BULL";
		a3.descricao = "ENERGÉTICO";
		a3.peso = (float) 0.15;
		a3.valor = (float) 0.60;
		System.out.println("Aluminio: " + a3);
		
	}

}
