import entidades.Banco;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;
import entidades.Contato;

public class Programa {
  
  public static void main(String[] args) {
    Contato contatoJoao = new Contato("João", "(11) 1111-1111");
    Contato contatoMaria = new Contato("Maria", "(22) 2222-2222");
    ContaCorrente conta1 = new ContaCorrente(contatoJoao, "123-0", "11122-4", 0.06);
    ContaCorrente conta2 = new ContaCorrente(contatoMaria, "123-0", "11123-4", 0.06);
    conta2.sacar(1000);
    conta2.abaterTaxaDeJuros();
    //System.out.println("Rendimento: " + conta2.calculaRendimento(0.1));
    System.out.println(conta1.equals(conta2));
    Banco banco = new Banco();
    banco.adicionarConta(conta1);
    banco.adicionarConta(conta2);
    System.out.println(banco);

    ContaPoupanca contaPoupanca = new ContaPoupanca(contatoJoao, "123-0", "1011122-4", 0.005);
    contaPoupanca.depositar(1000);
    contaPoupanca.atualizarSaldoComRendimento();
    contaPoupanca.sacar(2000);
    
    System.out.println(contaPoupanca);

  }

}
