package br.edu.infnet.appreciclavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;
import br.edu.infnet.appreciclavel.model.domain.Usuario;
import br.edu.infnet.appreciclavel.model.service.RecicladorService;


@Component
public class RecicladorTest implements ApplicationRunner {
	
	@Autowired
	RecicladorService recicladorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("--------Cadastro de Recicladores--------");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Reciclador r1 = new Reciclador();
		r1.setNome("MARIA SILVA");
		r1.setCpf("111.111.111-01");
		r1.setEmail("MARIA@GMAIL.COM");	
		r1.setUsuario(usuario);
		recicladorService.incluir(r1);
		System.out.println("Reciclador: " + r1);
		
		Reciclador r2 = new Reciclador();
		r2.setNome("JOÃO SILVA");
		r2.setCpf("222.222.222-02");
		r2.setEmail("JOÃO@GMAIL.COM");
		r2.setUsuario(usuario);
		recicladorService.incluir(r2);
		System.out.println("Reciclador: " + r2);
		
		Reciclador r3 = new Reciclador();
		r3.setNome("JOSÉ SILVA");
		r3.setCpf("333.333.333.-03");
		r3.setEmail("JOSE@GMAIL.COM");
		r3.setUsuario(usuario);
		recicladorService.incluir(r3);
		System.out.println("Reciclador: " + r3);
		
	}

}
