package entidades;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria {

  private double taxaDeJuros;
  
  public ContaCorrente(Contato titular, String numeroAgencia, 
      String numeroConta, double taxaDeJuros) {
    super(titular, numeroAgencia, numeroConta);
    this.taxaDeJuros = taxaDeJuros;
  }

  public void abaterTaxaDeJuros() {
    if(this.saldo<0) {
      this.atualizaSaldoComTaxa(this.taxaDeJuros);
    }
  }

}
