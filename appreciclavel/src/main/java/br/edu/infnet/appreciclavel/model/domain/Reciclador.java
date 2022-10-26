package br.edu.infnet.appreciclavel.model.domain;

public class Reciclador {
	protected String nome;
	protected String cpf;
	protected String email;
	
	@Override
	public String toString() {
		
		return nome + "; " + cpf + "; " + email; 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
