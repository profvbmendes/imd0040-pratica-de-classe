import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import modelo.CD;
import modelo.DVD;
import modelo.Item;

public class ProgramaPolimorfismo {

  public static void main(String[] args) {
    Item dvd = new DVD("O Brother, Where Art Thou?", "Joel & Ehan Coen", 106);
    Item cdItem = new CD("A Swingin' Affair", "Frank Sinatra", 16, 64);
    if (cdItem instanceof CD) {
      System.out.println("cdItem: " + ((CD)cdItem).getArtist());
    }
    if (dvd instanceof CD) {
      System.out.println("dvd: " + ((CD)cdItem).getArtist());
    }

    Set<Item> items = new HashSet<>();
    items.add(dvd);
    items.add(cdItem);
    
    for (Item item : items) {
      System.out.println(item);
    }
  }

}
