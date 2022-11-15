package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.edu.infnet.appreciclavel.model.domain.Vidro;
import br.edu.infnet.appreciclavel.model.repository.VidroRepository;

@Service
public class VidroService {
	
	@Autowired
	private VidroRepository vidroRepository;	
	public void incluir(Vidro vidro) {
		vidroRepository.save(vidro);
	}

	public Collection<Vidro> obterLista() {
		return (Collection<Vidro>) vidroRepository.findAll();
	}

	public void excluir(Integer id) {
		vidroRepository.deleteById(id);
	}

}
