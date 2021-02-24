package entidades;

import java.time.LocalDate;

public class ContaBancaria {
  
  private Contato titular;

  private String numeroAgencia;
  private String numeroConta;
  protected double saldo;
  private LocalDate dataAbertura;

  public ContaBancaria(Contato titular, String numeroAgencia, 
      String numeroConta) {
    this.titular = titular;
    this.numeroAgencia = numeroAgencia;
    this.numeroConta = numeroConta;
    this.saldo = 0;
    this.dataAbertura = LocalDate.now();
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  protected void atualizaSaldoComTaxa(double taxa) {
    this.saldo = this.saldo + this.saldo*taxa;
  }

  @Override
  public String toString() {
    String retorno = "Titular: " + this.titular.toString(); // Podemos melhorar?
    retorno += "\nAgência: " + this.numeroAgencia;
    retorno += "\nConta: " + this.numeroConta;
    retorno += "\nSaldo: " + this.saldo;
    retorno += "\nData de abertura: " + this.dataAbertura;
    return retorno;
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || !other.getClass().equals(ContaCorrente.class)) {
      return false;
    }
    ContaBancaria otherContaCorrente = (ContaBancaria) other; 
    return otherContaCorrente.numeroAgencia.equals(this.numeroAgencia) 
      && otherContaCorrente.numeroConta.equals(this.numeroConta);
  }

  public int hashCode() {
    return this.numeroAgencia.hashCode() + this.numeroConta.hashCode();
  }

}
