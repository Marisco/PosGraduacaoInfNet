package br.edu.infnet.appreciclavel.model.domain;

public class Aluminio extends Reciclavel {
	
	
	public TipoAluminio tipo;
	public String marca;
	public String descricao;		
	
	public enum TipoAluminio {Lata250, Lata350, lata269, lata310, lata473,  lata500};
	
	@Override
	public String toString() {
		
		return tipo.name().toString() + "; " + marca + "; " + descricao; 
	}

}


