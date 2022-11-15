package br.edu.infnet.appreciclavel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.domain.Reciclador;
import br.edu.infnet.appreciclavel.model.domain.Reciclavel;
import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.domain.Aluminio.TipoAluminio;
import br.edu.infnet.appreciclavel.model.domain.Plastico.TipoPlastico;
import br.edu.infnet.appreciclavel.model.domain.Vidro.TipoGarrafa;
import br.edu.infnet.appreciclavel.model.service.EntregaService;

@Component
public class EntregaTest implements ApplicationRunner {
	
	@Autowired
	private EntregaService entregaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("--------Cadastro de Entregas--------");

		Aluminio aluminio = new Aluminio();
		aluminio.setTipo(TipoAluminio.lata473);
		aluminio.setMarca("HEINEKEN");
		aluminio.setDescricao("CERVEJA");
		aluminio.setCodigo(1);
		aluminio.setReutilizavel(false);
		aluminio.setPeso((float) 0.11);
		aluminio.setValor((float) 0.05);

		Vidro vidro = new Vidro();
		vidro.setTipo(TipoGarrafa.garrafa500);
		vidro.setMarca("DON SIMON");
		vidro.setDescricao("VINHO");
		vidro.setCodigo(2);
		vidro.setReutilizavel(true);
		vidro.setPeso((float) 0.35);
		vidro.setValor((float) 0.03);

		Plastico plastico = new Plastico();
		plastico.setTipo(TipoPlastico.pet1000);
		plastico.setMarca("CAMPO LARGO");
		plastico.setDescricao("VINHO");
		plastico.setCodigo(3);
		plastico.setReutilizavel(false);
		plastico.setPeso((float) 0.03);
		plastico.setValor((float) 0.01);

		List<Reciclavel> reciclaveisPrimeiraEntrega = new ArrayList<Reciclavel>();
		reciclaveisPrimeiraEntrega.add(plastico);
		reciclaveisPrimeiraEntrega.add(vidro);

		List<Reciclavel> reciclaveisSegundaEntrega = new ArrayList<Reciclavel>();
		reciclaveisSegundaEntrega.add(aluminio);

		Reciclador r1 = new Reciclador();
		r1.setNome("MARIA SILVA");
		r1.setCpf("111.111.111-01");
		r1.setEmail("MARIA@GMAIL.COM");

		Entrega e1 = new Entrega(r1);
		e1.setWeb(true);
		e1.setDescricao("PRIMEIRA ENTREGA");
		e1.setReciclaveis(reciclaveisPrimeiraEntrega);
		entregaService.incluir(e1);
		System.out.println("=> " + e1);

		Entrega e2 = new Entrega(r1);
		e2.setWeb(false);
		e2.setDescricao("SEGUNDA ENTREGA");
		e2.setReciclaveis(reciclaveisPrimeiraEntrega);
		entregaService.incluir(e2);
		System.out.println("=> " + e2);

		Reciclador r2 = new Reciclador();
		r2.setNome("JOÃO SILVA");
		r2.setCpf("222.222.222-02");
		r2.setEmail("JOÃO@GMAIL.COM");

		Entrega e3 = new Entrega(r2);
		e3.setDescricao("TERCEIRA ENTREGA");
		e3.setReciclaveis(reciclaveisSegundaEntrega);
		entregaService.incluir(e3);
		System.out.println("=> " + e3);

	}

}
