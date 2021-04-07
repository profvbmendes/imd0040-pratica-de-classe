package br.imd.modelo;

import java.math.BigDecimal;

public abstract class AbstractPessoa {

	private String nome;

	private BigDecimal saldo;
	
	public AbstractPessoa(String nome, BigDecimal saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "AbstractPessoa [nome=" + nome + ", saldo=" + saldo + "]";
	}

}
