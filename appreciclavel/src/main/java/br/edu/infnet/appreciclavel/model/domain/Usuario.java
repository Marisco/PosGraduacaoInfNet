package br.edu.infnet.appreciclavel.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tusuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String nome;	
	protected String email;
	protected String senha;
	
	@OneToMany
	@JoinColumn(name ="idUsuario")
	private List<Reciclador> Recicladores;
	
	@OneToOne(cascade = CascadeType.PERSIST )
	@JoinColumn(name ="idEndereco")		
	private Endereco Endereco;	

	@Override
	public String toString() {

		return id + ";" + nome + "; " + email + "; " + email;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reciclador> getRecicladores() {
		return Recicladores;
	}

	public void setRecicladores(List<Reciclador> recicladores) {
		Recicladores = recicladores;
	}
	
	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}
	
}
