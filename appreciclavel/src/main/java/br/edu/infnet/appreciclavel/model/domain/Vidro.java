package br.edu.infnet.appreciclavel.model.domain;

public class Vidro extends Reciclavel {
	
	protected TipoGarrafa tipo;
	protected String marca;
	protected String descricao;		
	
	public enum TipoGarrafa {garrafa180, garrafa500, garrafa600, garrafa1000, garrafa2000, garrafa2500,  garrafa5000};
	
	@Override
	public String toString() {
		
		return super.toString() + "; " + tipo.name() + "; " + marca + "; " + descricao; 
	}

	public TipoGarrafa getTipo() {
		return tipo;
	}

	public void setTipo(TipoGarrafa tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
