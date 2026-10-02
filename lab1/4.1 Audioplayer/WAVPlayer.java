public class WAVPlayer extends AudioPlayer {
  public WAVPlayer(String currentTrack) {
    super(currentTrack);
  }

  @Override 
  public void play() {
    System.out.println("Воспроизводится WAV: " + currentTrack);
  }
}