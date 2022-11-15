package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Reciclavel;

@Service
public class ReciclavelService {
	
	private static Map<Integer, Reciclavel> mapa = new HashMap<Integer, Reciclavel>();
	private static Integer id = 1;

	public void incluir(Reciclavel reciclavel) {
		reciclavel.setId(id++);
		mapa.put(reciclavel.getId(), reciclavel);
	}

	public Collection<Reciclavel> obterLista() {
		return mapa.values();
	}

	public void excluir(Integer id) {
		mapa.remove(id);
	}

}
