package br.edu.infnet.appreciclavel.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "taluminio")
public class Aluminio extends Reciclavel {
	
	protected String marca;
	protected String descricao;
	protected TipoAluminio tipo;
	
	public enum TipoAluminio {Lata250, Lata350, lata269, lata310, lata473,  lata500};
	
	@Override
	public String toString() {
		
		return super.toString() + "; " + tipo.name().toString() + "; " + marca + "; " + descricao; 
	}
	
	
	public TipoAluminio getTipo() {
		return tipo;
	}

	public void setTipo(TipoAluminio tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

			

}


