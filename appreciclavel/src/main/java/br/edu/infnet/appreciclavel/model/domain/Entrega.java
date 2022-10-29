package br.edu.infnet.appreciclavel.model.domain;

import java.time.LocalDateTime;

public class Entrega {
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Reciclador reciclador;

	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web + ";" +reciclador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Reciclador getReciclador() {
		return reciclador;
	}

	public void setReciclador(Reciclador reciclador) {
		this.reciclador = reciclador;
	}

	

}
