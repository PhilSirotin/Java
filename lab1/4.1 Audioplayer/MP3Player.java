public class MP3Player extends AudioPlayer {
  public MP3Player(String currentTrack) {
    super(currentTrack);
  }

  @Override 
  public void play() {
    System.out.println("Воспроизводится MP3: " + currentTrack);
  }
}