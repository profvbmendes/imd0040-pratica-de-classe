package br.imd.modelo;

import java.math.BigDecimal;

public class Vendedor extends AbstractPessoa {

	private final String cnpj;
	
	public Vendedor(String cnpj, String nome, BigDecimal saldo) {
		super(nome, saldo);
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return "Cliente [cnpj=" + getCnpj() + ", nome=" + getNome() + ", saldo=" + getSaldo() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getCnpj().hashCode();
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
		Vendedor other = (Vendedor) obj;
		return getCnpj().equals(other.getCnpj());
	}

}
