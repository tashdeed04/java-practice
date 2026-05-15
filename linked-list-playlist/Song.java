public class Song {
  public String title;
  public String artist;
  public int len;
  public Song nextSong;

  public Song(String title, String artist, int len) {
    this.title = title;
    this.artist = artist;
    this.len = len;
  }

  public void songInfo() {
    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    System.out.println("Length: " + len + " minutes");
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public int getLengthInMinutes() {
    return len;
  }

  public Song getNext() {
    return nextSong;
  }

  public void setNextSong(Song nextSong) {
    this.nextSong = nextSong;
  }
}