package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;

@Component
public class AluminioTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Aluminio a1 = new Aluminio();
		a1.tipo =  TipoAluminio.lata473;
		a1.marca = "Heineken";
		a1.descricao = "CERVEJA";		
		System.out.println("Aluminio: " + a1);
		
		Aluminio a2 = new Aluminio();
		a2.tipo =  TipoAluminio.Lata250;
		a2.marca = "Coca Cola";
		a2.descricao = "Refrigerante";		
		System.out.println("Aluminio: " + a2);
		
		Aluminio a3 = new Aluminio();
		a3.tipo =  TipoAluminio.lata500;
		a3.marca = "RED BULL";
		a3.descricao = "ENERGÉTICO";		
		System.out.println("Aluminio: " + a3);
		
	}

}
