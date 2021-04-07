package br.imd.modelo;

import java.math.BigDecimal;

public class Comprador extends AbstractPessoa {

	private String cpf;
	
	public Comprador(String cpf, String nome, BigDecimal saldo) {
		super(nome, saldo);
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + getCpf() + ", nome=" + getNome() + ", saldo=" + getSaldo() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getCpf().hashCode();
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
		Comprador other = (Comprador) obj;
		return getCpf().equals(other.getCpf());
	}

}
