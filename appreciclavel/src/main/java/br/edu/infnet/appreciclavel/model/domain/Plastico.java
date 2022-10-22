package br.edu.infnet.appreciclavel.model.domain;

public class Plastico extends Reciclavel {
	
	public tipo tipo;
	public String marca;
	public String descricao;		
	
	public enum tipo {filme, Tetra , pvc, pet500, pet600, pet1000, pet1500, pet2000, pet2500,  pet5000};
	
	@Override
	public String toString() {
		
		return tipo.name() + "; " + marca + "; " + descricao; 
	}


}
