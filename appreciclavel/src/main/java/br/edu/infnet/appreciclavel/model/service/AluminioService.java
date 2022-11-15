package br.edu.infnet.appreciclavel.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appreciclavel.model.domain.Aluminio;

@Service
public class AluminioService {
	
	private static Map<Integer, Aluminio> mapa = new HashMap<Integer, Aluminio>();
	private static Integer id = 1;
	
	public void incluir(Aluminio aluminio) {
		aluminio.setId(id++);
		mapa.put(aluminio.getId(), aluminio);
	}
	 

	public Collection<Aluminio> obterLista() {
		return mapa.values();
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);		
	}

}
