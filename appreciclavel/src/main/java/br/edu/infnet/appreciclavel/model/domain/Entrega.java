package br.edu.infnet.appreciclavel.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Entrega {
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Reciclador reciclador;
	private List<Reciclavel> reciclaveis;

	public Entrega() {
	
		data = LocalDateTime.now();
		web = true;
	}
	
	public Entrega(Reciclador reciclador) {
		this();
		this.reciclador = reciclador;		
	}

	@Override
	public String toString() {
		return id + ";" + descricao + ";" + data + ";" + web + ";" + reciclador + ";" + reciclaveis.size();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public Reciclador getReciclador() {
		return reciclador;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public List<Reciclavel> getReciclaveis() {
		return reciclaveis;
	}

	public void setReciclaveis(List<Reciclavel> reciclaveis) {
		this.reciclaveis = reciclaveis;
	}
	
}
