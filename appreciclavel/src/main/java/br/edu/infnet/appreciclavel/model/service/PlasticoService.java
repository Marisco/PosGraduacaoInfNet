package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Plastico;

@Service
public class PlasticoService {
	
	private static Map<Integer, Plastico> mapa = new HashMap<Integer, Plastico>();
	private static Integer id = 1;

	public void incluir(Plastico plastico) {
		plastico.setId(id++);
		mapa.put(plastico.getId(), plastico);
	}

	public Collection<Plastico> obterLista() {
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}

}
