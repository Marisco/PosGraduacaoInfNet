package br.edu.infnet.appreciclavel.model.domain;

public abstract class Reciclavel {
	
	protected int codigo;	
	protected boolean reutilizavel;
	protected float peso;
	protected float valor;
	
	@Override
	public String toString() {
		
		return codigo+ "; " + reutilizavel + "; " + valor; 
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
