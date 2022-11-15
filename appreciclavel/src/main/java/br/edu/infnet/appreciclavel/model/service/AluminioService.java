package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;
import br.edu.infnet.appreciclavel.model.repository.AluminioRepository;

@Service
public class AluminioService {
	
	@Autowired
	private AluminioRepository aluminioRepository;	
	
	public void incluir(Aluminio aluminio) {
		aluminioRepository.save(aluminio);
	}
	 

	public Collection<Aluminio> obterLista() {
		return (Collection<Aluminio>) aluminioRepository.findAll();
	}
	
	public void excluir(Integer id) {
		aluminioRepository.deleteById(id);		
	}

}
