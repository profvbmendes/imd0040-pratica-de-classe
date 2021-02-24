package entidades;

import java.util.HashSet;
import java.util.Set;

public class Banco {
  private Set<ContaCorrente> contas;

  public Banco() {
    this.contas = new HashSet<>();
  }

  public void adicionarConta(ContaCorrente contaCorrente) {
    this.contas.add(contaCorrente);
  }

  public String toString() {
    String retorno = "";
    for (ContaCorrente conta : this.contas) {
      retorno += conta + "\n\n";
    }
    return retorno;
  }
}
