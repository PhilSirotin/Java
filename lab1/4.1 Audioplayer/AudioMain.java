public class AudioMain {
  public static void main(String[] args){
    AudioPlayer mp3 = new MP3Player("song.mp3");
    mp3.play();
    mp3.pause();
    mp3.stop();

    AudioPlayer wav = new WAVPlayer("recording.wav");
    wav.play();
    wav.pause();
    wav.stop();
  }
}
