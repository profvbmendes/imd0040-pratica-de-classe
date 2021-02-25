import modelo.CD;
import modelo.DVD;

public class ProgramaPolimorfismo {

  public static void main(String[] args) {
    DVD dvd = new DVD("O Brother, Where Art Thou?", "Joel & Ehan Coen", 106);
    CD cd = new CD("A Swingin' Affair", "Frank Sinatra", 16, 64);
    System.out.println(dvd);
    System.out.println(cd);
  }

}
