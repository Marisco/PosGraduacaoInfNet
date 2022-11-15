package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;
import br.edu.infnet.appreciclavel.model.repository.RecicladorRepository;

@Service
public class RecicladorService {
	
	@Autowired
	private RecicladorRepository recicladorRepository;	

	public void incluir(Reciclador reciclador) {
		recicladorRepository.save(reciclador);
	}

	public Collection<Reciclador> obterLista() {
		return (Collection<Reciclador>) recicladorRepository.findAll();
	}
	
	public void excluir(Integer id) {
		recicladorRepository.deleteById(id); ;
	}

}
