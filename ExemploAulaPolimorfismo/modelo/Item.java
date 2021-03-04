package modelo;

import java.util.Objects;

public class Item {

  protected String title;
  private int playingTime;
  private boolean gotIt;
  private String comment;

  public Item(String title, int playingTime) {
    this.title = title;
    this.playingTime = playingTime;
  }


  public String getTitle() {
    return this.title;
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
    return "Item:" +
      "\ttitle: " + getTitle() +
      "\n\tplayingTime: " + getPlayingTime() +
      "\n\tgotIt: " + getGotIt() +
      "\n\tcomment: " + getComment();
  }

  @Override
  public boolean equals(Object o) {
   
      if (o == this)
          return true;
      if (!(o instanceof Item)) {
          return false;
      }
      Item item = (Item) o;
      return Objects.equals(title, item.title) && playingTime == item.playingTime && gotIt == item.gotIt && Objects.equals(comment, item.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, playingTime, gotIt, comment);
  }
  
}
