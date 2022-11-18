package br.edu.infnet.appreciclavel.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "treciclavel")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Reciclavel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected int codigo;
	protected boolean reutilizavel;
	protected float peso;
	protected float valor;
	
	@ManyToMany(mappedBy = "reciclaveis")
	private List<Entrega> entregas;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	

	@Override
	public String toString() {

		return  id + ";" + codigo + "; " + reutilizavel + "; " + valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
