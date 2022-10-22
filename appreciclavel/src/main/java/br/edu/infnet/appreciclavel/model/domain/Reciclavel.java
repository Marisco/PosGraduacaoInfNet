package br.edu.infnet.appreciclavel.model.domain;

public class Reciclavel {
	
	public boolean isEmBoaCondicao;
	public float peso;
	public float valor;
	
	@Override
	public String toString() {
		
		return isEmBoaCondicao+ "; " + peso + "; " + valor; 
	}
}
