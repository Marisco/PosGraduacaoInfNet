package br.edu.infnet.appreciclavel;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Reciclavel;
import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;
import br.edu.infnet.appreciclavel.model.domain.Plastico.TipoPlastico;

@Component
public class ReciclavelTest implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Aluminio a1 = new Aluminio();
		a1.tipo =  TipoAluminio.lata473;
		a1.marca = "Heineken";
		a1.descricao = "CERVEJA";
		a1.reutilizavel =  false;
		a1.peso = (float) 0.11;;
		a1.valor= (float) 0.05;;
		System.out.println("Produto Aluminio: " + a1);
		
		Vidro v1 = new Vidro();
		v1.tipo =  TipoGarrafa.garrafa500;
		v1.marca = "Don Simon";
		v1.descricao = "Vinho";
		a1.reutilizavel =  true;
		v1.peso = (float) 0.35;
		v1.valor = (float) 0.03;
		System.out.println("Produto Vidro: " + v1);
		
		
		Plastico p1 = new Plastico();
		p1.tipo =  TipoPlastico.pet1000;
		p1.marca = "Campo Largo";
		p1.descricao = "VINHO";	
		a1.reutilizavel =  false;
		v1.peso = (float) 0.03;
		v1.valor = (float) 0.01;
		System.out.println(" Produto Plastico: " + p1);		
				
		
	}

}
