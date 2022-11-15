package br.edu.infnet.appreciclavel.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tplastico")
public class Plastico extends Reciclavel {
	
	protected TipoPlastico tipo;
	protected String marca;
	protected String descricao;		
	
	public enum TipoPlastico {filme, Tetra , pvc, pet500, pet600, pet1000, pet1500, pet2000, pet2500,  pet5000};
	
	@Override
	public String toString() {
		
		return super.toString() + "; " + tipo.name() + "; " + marca + "; " + descricao; 
	}

	public TipoPlastico getTipo() {
		return tipo;
	}

	public void setTipo(TipoPlastico tipo) {
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
