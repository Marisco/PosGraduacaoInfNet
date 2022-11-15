package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Plastico;
import br.edu.infnet.appreciclavel.model.repository.PlasticoRepository;

@Service
public class PlasticoService {
	
	@Autowired
	private PlasticoRepository plasticoRepository; 

	public void incluir(Plastico plastico) {
		plasticoRepository.save(plastico);
	}

	public Collection<Plastico> obterLista() {
		return (Collection<Plastico>) plasticoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		plasticoRepository.deleteById(id);
	}

}
