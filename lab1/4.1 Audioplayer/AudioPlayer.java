public abstract class AudioPlayer implements Playable {
  protected String currentTrack;

  public AudioPlayer(String currentTrack) {
    this.currentTrack = currentTrack;
  }

  @Override 
  public abstract void play();

  @Override 
  public void pause() {
    System.out.println("Воспроизведение приостановлено: " + currentTrack);
  }

  @Override 
  public void stop() {
    System.out.println("Воспроизведение остановлено: " + currentTrack);
  }
}