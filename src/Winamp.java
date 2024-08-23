import interfaces.AudioPlayer;

public class Winamp {

    private final AudioPlayer audioPlayer;

    public Winamp(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void play(String audioType, String filename) {
        audioPlayer.play(audioType, filename);
    }
}