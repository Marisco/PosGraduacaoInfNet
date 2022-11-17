package br.edu.infnet.appreciclavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;
import br.edu.infnet.appreciclavel.model.service.ReciclavelService;
import br.edu.infnet.appreciclavel.model.domain.Plastico.TipoPlastico;

@Order(6)
@Component
public class ReciclavelTest implements ApplicationRunner {

	@Autowired
	ReciclavelService reciclavelService;
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("--------Cadastro de Recicláveis--------");

		Aluminio a1 = new Aluminio();
		a1.setTipo(TipoAluminio.lata473);
		a1.setMarca("HEINEKEN");
		a1.setDescricao("CERVEJA");
		a1.setCodigo(1);
		a1.setReutilizavel(false);
		a1.setPeso((float) 0.11);
		a1.setValor((float) 0.05);
		reciclavelService.incluir(a1);
		System.out.println("Reciclável de Alumínio: " + a1);

		Vidro v1 = new Vidro();
		v1.setTipo(TipoGarrafa.garrafa500);
		v1.setMarca("DON SIMON");
		v1.setDescricao("VINHO");
		v1.setCodigo(2);
		v1.setReutilizavel(true);
		v1.setPeso((float) 0.35);
		v1.setValor((float) 0.03);
		reciclavelService.incluir(v1);
		System.out.println("Reciclável de Vidro: " + v1);

		Plastico p1 = new Plastico();
		p1.setTipo(TipoPlastico.pet1000);
		p1.setMarca("CAMPO LARGO");
		p1.setDescricao("VINHO");
		p1.setCodigo(3);
		p1.setReutilizavel(false);
		p1.setPeso((float) 0.03);
		p1.setValor((float) 0.01);
		reciclavelService.incluir(p1);
		System.out.println("Reciclável de Plástico: " + p1);

	}

}
