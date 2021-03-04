package modelo;

import java.util.Objects;

public class DVD extends Item{

  String director;


  public DVD(String title, String director, int playingTime) {
    super(title, playingTime);
    this.director = director;
  }

  public String getDirector() {
    return this.director;
  }

  @Override
  public String toString() {
    return "DVD:" +
      "\ttitle: " + getTitle() +
      "\n\tdirector: " + getDirector() +
      "\n\tplayingTime: " + getPlayingTime() +
      "\n\tgotIt: " + getGotIt() +
      "\n\tcomment: " + getComment();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof DVD)) {
      return false;
    }
    DVD dVD = (DVD) o;
    return super.equals(o) && Objects.equals(director, dVD.director);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), director);
  }


}
