package entidades;

public class ContaPoupanca  extends ContaBancaria {

  private double taxaDeRendimento;
  
  public ContaPoupanca(Contato titular, String numeroAgencia, 
      String numeroConta, double taxaDeRendimento) {
    super(titular, numeroAgencia, numeroConta);
    this.taxaDeRendimento = taxaDeRendimento;
  }

  public void sacar(double valor) {
    if (this.saldo >= valor) {
      super.sacar(valor);
    }
  }

  public void atualizarSaldoComRendimento() {
    this.atualizaSaldoComTaxa(this.taxaDeRendimento);
  }
  
}
