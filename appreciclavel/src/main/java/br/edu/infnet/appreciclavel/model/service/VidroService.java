package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


import br.edu.infnet.appreciclavel.model.domain.Vidro;

@Service
public class VidroService {
	
	private static Map<Integer, Vidro> mapa = new HashMap<Integer, Vidro>();
	private static Integer id = 1;

	public void incluir(Vidro vidro) {
		vidro.setId(id++);
		mapa.put(vidro.getId(), vidro);
	}

	public Collection<Vidro> obterLista() {
		return mapa.values();
	}

	public void excluir(Integer id) {
		mapa.remove(id);
	}

}
