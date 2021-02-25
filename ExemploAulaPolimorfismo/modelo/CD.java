package modelo;

import java.util.Objects;

public class CD extends Item {
  
  private String artist;
  private int numberOfTracks;

  public CD(String title, String artist, int numberOfTracks, int playingTime) {
    super(title, playingTime);
    this.artist = artist;
    this.numberOfTracks = numberOfTracks;
  }

  public String getArtist() {
    return this.artist;
  }

  public int getNumberOfTracks() {
    return this.numberOfTracks;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CD)) {
            return false;
        }
        CD cd = (CD) o;
        return super.equals(o) && Objects.equals(artist, cd.artist) && numberOfTracks == cd.numberOfTracks;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), artist, numberOfTracks);
  }

}
