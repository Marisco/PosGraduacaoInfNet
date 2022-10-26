package br.edu.infnet.appreciclavel.model.domain;

public class Vidro extends Reciclavel {
	
	public TipoGarrafa tipo;
	public String marca;
	public String descricao;		
	
	public enum TipoGarrafa {garrafa180, garrafa500, garrafa600, garrafa1000, garrafa2000, garrafa2500,  garrafa5000};
	
	@Override
	public String toString() {
		
		return tipo.name() + "; " + marca + "; " + descricao; 
	}

}
