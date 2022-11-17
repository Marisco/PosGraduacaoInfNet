package br.edu.infnet.appreciclavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;
import br.edu.infnet.appreciclavel.model.service.AluminioService;

@Order(3)
@Component
public class AluminioTest implements ApplicationRunner {

	@Autowired
	private AluminioService aluminioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("--------Cadastro de Alumínios--------");

		Aluminio a1 = new Aluminio();
		a1.setCodigo(4);
		a1.setReutilizavel(false);
		a1.setPeso((float) 0.11);
		a1.setValor((float) 0.05);
		a1.setTipo(TipoAluminio.lata473);
		a1.setMarca("HEINEKEN");
		a1.setDescricao("CERVEJA");
		aluminioService.incluir(a1);
		System.out.println("Aluminio: " + a1);

		Aluminio a2 = new Aluminio();
		a2.setCodigo(5);
		a2.setReutilizavel(false);
		a2.setPeso((float) 0.06);
		a2.setValor((float) 0.04);
		a2.setTipo(TipoAluminio.Lata250);
		a2.setMarca("COCA-COLA");
		a2.setDescricao("REFRIGERANTE");
		aluminioService.incluir(a2);
		System.out.println("Aluminio: " + a2);

		Aluminio a3 = new Aluminio();
		a3.setCodigo(6);
		a3.setReutilizavel(false);
		a3.setPeso((float) 0.08);
		a3.setValor((float) 0.03);
		a3.setTipo(TipoAluminio.lata500);
		a3.setMarca("RED BULL");
		a3.setDescricao("ENERGÉTICO");
		aluminioService.incluir(a3);
		System.out.println("Aluminio: " + a3);

	}

}
