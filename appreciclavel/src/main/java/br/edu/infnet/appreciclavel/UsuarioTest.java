package br.edu.infnet.appreciclavel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreciclavel.model.domain.Usuario;
import br.edu.infnet.appreciclavel.model.service.UsuarioService;


@Component
public class UsuarioTest implements ApplicationRunner {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("--------Cadastro de Usuarios--------");
		
		Usuario u1 = new Usuario();
		u1.setNome("MARIA SILVA");
		u1.setSenha("123456");
		u1.setEmail("MARIA@GMAIL.COM");	
		usuarioService.incluir(u1);
		System.out.println("Reciclador: " + u1);
		
		Usuario u2 = new Usuario();
		u2.setNome("JOÃO SILVA");
		u2.setSenha("456789");
		u2.setEmail("JOÃO@GMAIL.COM");
		usuarioService.incluir(u2);
		System.out.println("Reciclador: " + u2);
		
		Usuario u3 = new Usuario();
		u3.setNome("JOSÉ SILVA");
		u3.setSenha("333.333.333.-03");
		u3.setEmail("JOSE@GMAIL.COM");
		usuarioService.incluir(u3);
		System.out.println("Reciclador: " + u3);
		
	}

}
