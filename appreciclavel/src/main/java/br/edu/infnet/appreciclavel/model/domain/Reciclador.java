package br.edu.infnet.appreciclavel.model.domain;

public class Reciclador {
	public String nome;
	public String cpf;
	public String email;
	
	@Override
	public String toString() {
		
		return nome + "; " + cpf + "; " + email; 
	}
}
