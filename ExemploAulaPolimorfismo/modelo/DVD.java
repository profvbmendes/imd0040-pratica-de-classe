package modelo;

import java.util.Objects;

public class DVD {

  private String title;
  private String director;
  private int playingTime;
  private boolean gotIt;
  private String comment;


  public DVD(String title, String director, int playingTime) {
    this.title = title;
    this.director = director;
    this.playingTime = playingTime;
  }

  public String getTitle() {
    return this.title;
  }


  public String getDirector() {
    return this.director;
  }


  public int getPlayingTime() {
    return this.playingTime;
  }

  public boolean getGotIt() {
    return this.gotIt;
  }

  public void setGotIt(boolean gotIt) {
    this.gotIt = gotIt;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public String toString() {
    return "DVD:" +
      "\ttitle='" + getTitle() +
      "\n\tdirector='" + getDirector() +
      "\n\tplayingTime='" + getPlayingTime() +
      "\n\tgotIt='" + getGotIt() +
      "\n\tcomment='" + getComment() +
      "}";
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DVD)) {
            return false;
        }
        DVD dVD = (DVD) o;
        return Objects.equals(title, dVD.title) && Objects.equals(director, dVD.director) && playingTime == dVD.playingTime && gotIt == dVD.gotIt && Objects.equals(comment, dVD.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, director, playingTime, gotIt, comment);
  }


}
