package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Reciclavel;
import br.edu.infnet.appreciclavel.model.repository.ReciclavelRepository;

@Service
public class ReciclavelService {
	
	@Autowired
	private ReciclavelRepository reciclavelRepository;	

	public void incluir(Reciclavel reciclavel) {
		reciclavelRepository.save(reciclavel);
	}

	public Collection<Reciclavel> obterLista() {
		return (Collection<Reciclavel>) reciclavelRepository.findAll();
	}

	public void excluir(Integer id) {
		reciclavelRepository.deleteById(id);
	}

}
