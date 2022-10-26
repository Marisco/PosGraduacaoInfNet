package br.edu.infnet.appreciclavel.model.domain;

public abstract class Reciclavel {
	
	public boolean reutilizavel;
	public float peso;
	public float valor;
	
	@Override
	public String toString() {
		
		return reutilizavel+ "; " + peso + "; " + valor; 
	}
}
