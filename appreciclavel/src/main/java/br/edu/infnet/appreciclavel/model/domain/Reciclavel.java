package br.edu.infnet.appreciclavel.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "treciclavel")
public abstract class Reciclavel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected int codigo;
	protected boolean reutilizavel;
	protected float peso;
	protected float valor;

	@Override
	public String toString() {

		return  id + ";" + codigo + "; " + reutilizavel + "; " + valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isReutilizavel() {
		return reutilizavel;
	}

	public void setReutilizavel(boolean reutilizavel) {
		this.reutilizavel = reutilizavel;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
