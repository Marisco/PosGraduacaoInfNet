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
		
		System.out.println("--------Cadastro de Plásticos--------");
		
		Plastico p1 = new Plastico();
		p1.setCodigo(7);				
		p1.setReutilizavel(false);
		p1.setPeso((float) 0.1);
		p1.setValor((float) 0.05);
		p1.setTipo(TipoPlastico.pet1000);
		p1.setMarca("Campo Largo");
		p1.setDescricao("VINHO");		
		System.out.println("Plastico: " + p1);
		
		Plastico p2 = new Plastico();
		p2.setCodigo(8);				
		p2.setReutilizavel(false);
		p2.setPeso((float) 0.05);
		p2.setValor((float) 0.025);
		p2.setTipo(TipoPlastico.pet600);
		p2.setMarca("Coca-Cola");
		p2.setDescricao("Refrigerante");		
		System.out.println("Plastico: " + p2);
		
		Plastico p3 = new Plastico();
		p3.setCodigo(9);				
		p3.setReutilizavel(false);
		p3.setPeso((float) 0.15);
		p3.setValor((float) 0.085);
		p3.setTipo(TipoPlastico.pvc);
		p3.setMarca("TIGRE");
		p3.setDescricao("TUBO 10");		
		System.out.println("Plastico: " + p3);
		
	}

}