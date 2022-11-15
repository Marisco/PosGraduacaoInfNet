package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.repository.EntregaRepository;

@Service
public class EntregaService {
	
	@Autowired
	private  EntregaRepository entregaRepository;	
	
	public void incluir(Entrega entrega) {

		entregaRepository.save(entrega);	
	}

	public Collection<Entrega> obterLista() {
		return (Collection<Entrega>) entregaRepository.findAll();
	}

	public void excluir(Integer id) {
		entregaRepository.deleteById(id);
	}

}
