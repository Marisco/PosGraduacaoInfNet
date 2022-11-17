package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.clients.IEnderecoClient;
import br.edu.infnet.appreciclavel.model.domain.Endereco;
import br.edu.infnet.appreciclavel.model.domain.Usuario;
import br.edu.infnet.appreciclavel.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private IEnderecoClient enderecoClient;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id); ;
	}
	
	public Usuario validar(String email, String senha) {
		
		
		Usuario usuario =  usuarioRepository.findByEmail(email);
		
		if(usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}
		
		return null;
	}
	
	public Endereco buscarCep(String cep) {		
		return enderecoClient.buscarCep(cep);
	}
	

}
