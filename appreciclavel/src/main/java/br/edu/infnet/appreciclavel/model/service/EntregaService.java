package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Entrega;
import br.edu.infnet.appreciclavel.model.domain.Reciclavel;

@Service
public class EntregaService {
	
	private static Map<Integer, Entrega> mapa = new HashMap<Integer, Entrega>();
	private static Integer id = 1;
	private static Integer idReciclavel = 1;

	public void incluir(Entrega entrega) {

		entrega.setId(id++);
		List<Reciclavel> reciclaveis = entrega.getReciclaveis();
		reciclaveis.forEach(r -> r.setId(idReciclavel++));

		mapa.put(entrega.getId(), entrega);
	}

	public Collection<Entrega> obterLista() {
		return mapa.values();
	}

	public void excluir(Integer id) {
		mapa.remove(id);
	}

}
