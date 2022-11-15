package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;

@Service
public class RecicladorService {
	
	private static Map<Integer, Reciclador> mapa = new HashMap<Integer, Reciclador>();
	private static Integer id = 1;

	public void incluir(Reciclador reciclador) {
		reciclador.setId(id++);
		mapa.put(reciclador.getId(), reciclador);
	}

	public Collection<Reciclador> obterLista() {
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

}
