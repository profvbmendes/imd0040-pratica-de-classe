package modelo;

import java.util.Objects;

public class CD {
  
  private String title;
  private String artist;
  private int numberOfTracks;
  private int playingTime;
  private boolean gotIt;
  private String comment;

  public CD(String title, String artist, int numberOfTracks, int playingTime) {
    this.title = title;
    this.artist = artist;
    this.numberOfTracks = numberOfTracks;
    this.playingTime = playingTime;
  }


  public String getTitle() {
    return this.title;
  }

  public String getArtist() {
    return this.artist;
  }

  public int getNumberOfTracks() {
    return this.numberOfTracks;
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
    return "CD:" +
      "\ttitle: " + getTitle() +
      "\n\tartist: " + getArtist() +
      "\n\tnumberOfTracks: " + getNumberOfTracks() +
      "\n\tplayingTime: " + getPlayingTime() +
      "\n\tgotIt: " + getGotIt() +
      "\n\tcomment: " + getComment();
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CD)) {
            return false;
        }
        CD cd = (CD) o;
        return Objects.equals(title, cd.title) && Objects.equals(artist, cd.artist) && numberOfTracks == cd.numberOfTracks && playingTime == cd.playingTime && gotIt == cd.gotIt && Objects.equals(comment, cd.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, artist, numberOfTracks, playingTime, gotIt, comment);
  }

}
