package br.edu.infnet.appreciclavel.model.domain;

public class Aluminio extends Reciclavel {
	
	
	public tipo tipo;
	public String marca;
	public String descricao;
	public float peso;
	public float valor;	
	
	public enum tipo {Lata250, Lata350, lata269, lata310, lata473,  lata500};
	
	@Override
	public String toString() {
		
		return tipo.name() + "; " + marca + "; " + descricao + "; " + peso + "; " + valor; 
	}

}


