package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Plastico.TipoPlastico;

@Component
public class PlasticoTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Plastico p1 = new Plastico();
		p1.tipo =  TipoPlastico.pet1000;
		p1.marca = "Campo Largo";
		p1.descricao = "VINHO";		
		System.out.println("Plastico: " + p1);
		
		Plastico p2 = new Plastico();
		p2.tipo =  TipoPlastico.pet600;
		p2.marca = "Coca-Cola";
		p2.descricao = "Refrigerante";		
		System.out.println("Plastico: " + p2);
		
		Plastico p3 = new Plastico();
		p3.tipo =  TipoPlastico.pvc;
		p3.marca = "TIGRE";
		p3.descricao = "TUBO 10";		
		System.out.println("Plastico: " + p3);
		
	}

}
