package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Plastico.tipo;

@Component
public class PlasticoTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Plastico p1 = new Plastico();
		p1.tipo =  tipo.pet1000;
		p1.marca = "Campo Largo";
		p1.descricao = "VINHO";
		p1.peso = (float) 0.15;
		p1.valor = (float) 0.04;
		System.out.println("Plastico: " + p1);
		
		Plastico p2 = new Plastico();
		p2.tipo =  tipo.pet600;
		p2.marca = "Coca-Cola";
		p2.descricao = "Refrigerante";
		p2.peso = (float) 0.5;
		p2.valor = (float) 0.02;
		System.out.println("Plastico: " + p2);
		
		Plastico p3 = new Plastico();
		p3.tipo =  tipo.pvc;
		p3.marca = "TIGRE";
		p3.descricao = "TUBO 10";
		p3.peso = (float) 0.25;
		p3.valor = (float) 0.06;
		System.out.println("Plastico: " + p3);
		
	}

}
