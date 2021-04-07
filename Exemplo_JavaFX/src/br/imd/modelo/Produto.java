package br.imd.modelo;

import java.math.BigDecimal;
import java.util.UUID;

public class Produto {

	private final UUID codigo;
	
	private final String nome;
	
	private final BigDecimal precoUnitario;
	
	public Produto(String nome, BigDecimal precoUnitario) {
		this.codigo = UUID.randomUUID(); 
		this.nome = nome;
		this.precoUnitario = precoUnitario;
	}

	public UUID getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", precoUnitario=" + precoUnitario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo.equals(other.codigo);
	}
	
}
