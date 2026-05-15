public class Playlist {
  public String name; 
  
  public Playlist(String name) {
    this.name = name;
    System.out.println(name + " created.");
    


  public Song firstSong;
  public int songCount;
  
  public void addSong(Song song) {
    if (firstSong == null) {
      firstSong = song;
    } else {
      Song current = firstSong;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(song);
    }
    songCount++;
    System.out.println(song.getTitle() + " added to " + name + ".");
  }

  public void info() {
    System.out.println(name + " has the following songs:");
    if (firstSong == null) {
      System.out.println("No songs in " + name + ".");
    } else {
      Song current = firstSong;
      int songIndex = 1;
      while (current != null) {
        System.out.println("Song-" + songIndex);
        current.songInfo();
        current = current.getNext();
        songIndex++;
      }
    }
  }


  public void addSong(Song song, int index) {
    if (index < 0 || index > songCount) {
      System.out.println("Cannot add song to Index " + index + ".");
      return;
    }

    if (index == 0) {
      song.setNext(firstSong);
      firstSong = song;
    } else {
      Song current = firstSong;
      for (int i = 0; i < index - 1; i++) {
        current = current.getNext();
      }
      song.setNext(current.getNext());
      current.setNext(song);
    }
    songCount++;
    System.out.println(song.getTitle() + " added to " + name + ".");
  }

  

  public void playSong(String songTitle) {
    Song current = firstSong;
    while (current != null) {
      if (current.getTitle().equals(songTitle)) {
        System.out.println("Playing: " + current.getTitle() + " by " + current.getArtist());
        return;
      }
      current = current.getNext();
    }
    System.out.println("Song " + songTitle + " not found.");
  }


  public void playSong(int index) {
    if (index < 0 || index >= songCount) {
      System.out.println("Invalid song index.");
      return;
    }
    Song current = firstSong;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    System.out.println("Playing: " + current.getTitle() + " by " + current.getArtist());
  }

  

  public void deleteSong(String songTitle) {
    if (firstSong == null) {
      System.out.println("No songs in the playlist.");
      return;
    }
    
    if (firstSong.getTitle().equals(songTitle)) {
      firstSong = firstSong.getNext();
      songCount--;
      System.out.println(songTitle + " removed.");
      return;
    }

    Song current = firstSong;
    while (current.getNext() != null) {
      if (current.getNext().getTitle().equals(songTitle)) {
        current.setNext(current.getNext().getNext());
        songCount--;
        System.out.println(songTitle + " removed.");
        return;
      }
      current = current.getNext();
    }
    System.out.println("Song " + songTitle + " not found.");
  }



  public int totalSong() {
    return songCount;
  }



  public void merge(Playlist anotherPlaylist) {
    if (anotherPlaylist.firstSong == null) {
      System.out.println("The second playlist is empty.");
      return;
    }
    if (firstSong == null) {
      firstSong = anotherPlaylist.firstSong;
    } else {
      Song current = firstSong;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(anotherPlaylist.firstSong);
    }
    songCount += anotherPlaylist.songCount;
    System.out.println("Playlists merged.");
  }
}
