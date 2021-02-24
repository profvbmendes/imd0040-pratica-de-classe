package entidades;

public class Contato {

  public String nome;
  public String telefone;

  public Contato(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String toString() {
    return this.nome;
  }
  
}
